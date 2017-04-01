package com.spider.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.time.StopWatch;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.ArrayList;
import java.util.List;

/**
 * 链家爬虫service
 *
 * @author chenzhongwei
 * @create 2017-04-01 13:56
 **/
public class LianjiaService implements PageProcessor {

    private static final String ER_SHOU_FANG_URL = "http://bj.lianjia.com/ershoufang/pg";

    private static final String BEIJING_ER_SHOU_FANG_URL = "http://bj.lianjia.com/ershoufang";

    private static final String BEIJING_ER_SHOU_FANG_DETAIL_URL = "http://bj.lianjia.com/ershoufang/%s.html?totalPrice=%s&unitPrice=%s&subwayName=%s";

    private static final String SUBWAY_KEYWORD_NUM = "号线";

    private static final String SUBWAY_KEYWORD_STATION = "站";

    private Site site = Site.me().setRetryTimes(3)
            .addCookie("bj.lianjia.com", "CNZZDATA1253477573", "2122442859-1490746942-%7C1491038664")
            .addCookie("bj.lianjia.com", "CNZZDATA1254525948", "1631992813-1490748367-%7C1491039969")
            .addCookie("bj.lianjia.com", "CNZZDATA1255604082", "1494567664-1490746958-%7C1491038580")
            .addCookie("bj.lianjia.com", "CNZZDATA1255633284", "1553573335-1490748126-%7C1491036818")
            .addCookie("bj.lianjia.com", "UM_distinctid", "15b17bc22722fa-088b4cdbd-66121479-1fa400-15b17bc22736f4")
            .addCookie("bj.lianjia.com", "_jzqa", "1.1703213170706477300.1490752432.1491037514.1491040093.6")
            .addCookie("bj.lianjia.com", "_jzqb", "1.1.10.1491040093.1")
            .addCookie("bj.lianjia.com", "_jzqc", "1")
            .addCookie("bj.lianjia.com","_jzqckmp","1")
            .addCookie("bj.lianjia.com", "_jzqx", "1.1490752432.1491040093.4.jzqsr=dl%2Elianjia%2Ecom|jzqct=/chengjiao/shahekou/.jzqsr=captcha%2Elianjia%2Ecom|jzqct=/")
            .addCookie("bj.lianjia.com", "_jzqy", "1.1490752560.1490752560.1.jzqsr=baidu|jzqct=%E9%93%BE%E5%AE%B6.-")
            .addCookie("bj.lianjia.com", "_qzja", "1.610799423.1491026251652.1491037514245.1491040093003.1491037569086.1491040093003.0.0.0.9.3")
            .addCookie("bj.lianjia.com","_qzjb", "1.1491040093003.1.0.0.0")
            .addCookie("bj.lianjia.com", "_qzjc", "1")
            .addCookie("bj.lianjia.com","_qzjto", "9.3.0")
            .addCookie("bj.lianjia.com","_smt_uid","58db117a.1ce252b0")
            .addCookie("bj.lianjia.com", "all-lj","5ce010dbdb86da2c0bba3b0cda32eb3e")
            .addCookie("bj.lianjia.com", "gr_user_id", "52b3e717-2c51-4492-93b0-b8b66fd3bfde")
            .addCookie("bj.lianjia.com", "lianjia_ssid", "3bc3cbaa-b7b9-0daa-31a1-3da4aa0b65f7")
            .addCookie("bj.lianjia.com","lianjia_uuid","22a7e75e-c5d1-4b05-890b-d98f97042a4f")
            .addCookie("bj.lianjia.com","select_city","110000")
            .addCookie("bj.lianjia.com","select_nation","1");
    public void process(Page page) {
        Html html = page.getHtml();
        String url = page.getRequest().getUrl();
        if (BEIJING_ER_SHOU_FANG_URL.equals(url)) {
            List<String> pageUrlList = new ArrayList<String>();
            String totalPageJSON = html.xpath("/html/body/div[4]/div[1]/div[7]/div[2]/div/@page-data").toString();
            JSONObject totalPageJSONObject = JSONObject.parseObject(totalPageJSON);
            Integer totalPage = Integer.valueOf(totalPageJSONObject.get("totalPage").toString());
            pageUrlList.add(url);
            for (int i = 2; i < totalPage + 1; i++) {
                pageUrlList.add(ER_SHOU_FANG_URL + i);
            }
            page.addTargetRequests(pageUrlList);
        } else if (url.contains(ER_SHOU_FANG_URL)) {
            Document document = html.getDocument();
            Elements sellListContentElements = document.getElementsByClass("sellListContent");
            String totalPrice = html.xpath("/html/body/div[4]/div[1]/ul/li[2]/div[1]/div[6]/div[1]/span/text()").toString();
            String unitPrice = html.xpath("/html/body/div[4]/div[1]/ul/li[1]/div[1]/div[6]/div[2]/@data-price").toString();
            String subwayName = html.xpath("/html/body/div[4]/div[1]/ul/li[2]/div[1]/div[5]/span[1]/text()").toString();
            if (!subwayName.contains(SUBWAY_KEYWORD_NUM) || !subwayName.contains(SUBWAY_KEYWORD_STATION)) {
                subwayName = "";
            }
            String detailUrl = String.format(BEIJING_ER_SHOU_FANG_DETAIL_URL, totalPrice, unitPrice, subwayName);
            page.addTargetRequest(detailUrl);
        }
    }

    public Site getSite() {
        return site;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        LianjiaService lianjiaService = new LianjiaService();
        Spider spider = Spider.create(lianjiaService);
        spider.addUrl(BEIJING_ER_SHOU_FANG_URL);
        spider.thread(50).run();
        stopWatch.stop();
        System.out.println("链家二手房源花费时间----------------------------------- " + stopWatch.getTime());
    }
}