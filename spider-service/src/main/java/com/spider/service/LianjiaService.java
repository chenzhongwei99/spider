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

    private Site site = Site.me().setRetryTimes(3);

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