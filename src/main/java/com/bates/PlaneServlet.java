package com.bates;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PlaneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("planeId");

        if (id.equals("N9341C")) {req.setAttribute("plane", archer);}
        if (id.equals("N40045")) {req.setAttribute("plane", warrior);}
        if (id.equals("N5152S")) {req.setAttribute("plane", cherokee);}

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/plane.jsp");
        dispatcher.forward(req, resp);
    }

    //Hard code data for now. Database comes later
    private SpeedProfile archerSpeeds = new SpeedProfile("kts", 55,64,76,85,75,65,49,55);
    private Plane archer = new Plane("Piper", "Archer PA28-181", "N9341C", archerSpeeds);

    private SpeedProfile warriorSpeeds = new SpeedProfile("kts", 55,64,76,85,75,65,49,55);
    private Plane warrior = new Plane("Piper", "Warrior PA28-161", "N40045", warriorSpeeds);

    private SpeedProfile cherokeeSpeeds = new SpeedProfile("mph",65,74,85,100,90,80,57,67);
    private Plane cherokee = new Plane("Piper", "Cherokee PA28-180", "N5152S", cherokeeSpeeds);

}
