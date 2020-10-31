package com.scraper; 

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import java.util.List;

public final class ScraperService {

    private static ScraperService instance;

    private static HtmlPage page;

    private ScraperService(){}

    public static ScraperService getInstance() {
        if (instance == null) {
            instance = new ScraperService();
        }

        return instance;
    }

    public void scrape() {
        System.out.println("Scraping");

        WebClient wc = new WebClient();
        wc.getOptions().setCssEnabled(false);
        wc.getOptions().setJavaScriptEnabled(false);

        try {
            String scrapeUrl = "https://www.livechart.me/";
            page = wc.getPage(scrapeUrl);

            HtmlElement header = page.getFirstByXPath("//div[@class='page-header-box__content']");
            HtmlElement title = header.getFirstByXPath(".//h1");
            System.out.println("Scraped page title " + title.asText());

            List<HtmlElement> animeList = page.getByXPath("//article[@class='anime']");

            Anime a = new Anime();
            a.setTitle("Bakuman");
            a.setSource("Manga");

            System.out.println("Anime List Size is " + animeList.size());
            System.out.println(a.toString());

            //System.out.println(scrapedPage.asXml());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HtmlPage getPage() {
        return page;
    }
}