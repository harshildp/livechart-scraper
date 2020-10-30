package com.scraper; 

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ScraperService {

    public void getLiveChartResults(String searchGenre) {
        System.out.println("Search Genre is " + searchGenre);

        WebClient wc = new WebClient();
        wc.getOptions().setCssEnabled(false);
        wc.getOptions().setJavaScriptEnabled(false);

        try {
            String scrapeUrl = "https://www.livechart.me/";
            HtmlPage scrapedPage = wc.getPage(scrapeUrl);
            //System.out.println(scrapedPage.asXml());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}