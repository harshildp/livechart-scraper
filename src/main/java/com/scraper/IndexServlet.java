package com.scraper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (
    name = "livechartindex",
    urlPatterns = "/"
)
public class IndexServlet extends HttpServlet {

    private ScraperService scraper;

    public void init() throws ServletException {
        System.out.println("Initializing IndexServlet");
        // scraper = ScraperService.getInstance();
        // scraper.scrape();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try {
            //scraper.getLiveChartResults(req.getParameter("genre"));
            // System.out.println(scraper.getPage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");

            dispatcher.forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}