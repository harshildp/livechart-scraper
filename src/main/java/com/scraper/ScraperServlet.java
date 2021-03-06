package com.scraper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (
    name = "livechartscraper",
    urlPatterns = "/SearchGenre"
)
public class ScraperServlet extends HttpServlet {

    private ScraperService scraper;

    public void init() throws ServletException {
        System.out.println("Initializing ScraperServlet");
        scraper = ScraperService.getInstance();
        scraper.scrape();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try {
            //scraper.getLiveChartResults(req.getParameter("genre"));
            System.out.println(scraper.getPage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("scrapeResults.jsp");

            dispatcher.forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}