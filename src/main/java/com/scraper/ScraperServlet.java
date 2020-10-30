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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ScraperService scraper = new ScraperService();

        scraper.getLiveChartResults(req.getParameter("genre"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("scrapeResults.jsp");

        dispatcher.forward(req, res);
    }
}