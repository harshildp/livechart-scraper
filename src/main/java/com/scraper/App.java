package com.scraper;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        WebClient wc = new WebClient();
        wc.getOptions().setCssEnabled(false);
        wc.getOptions().setJavaScriptEnabled(false);
        try {
        String searchUrl = "https://www.livechart.me/";
        HtmlPage page = wc.getPage(searchUrl);
        System.out.println(page);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
