package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import domain.model.GuessGame;

@WebServlet("/Guess")
public class Servlet extends HttpServlet {
    private GuessGame game = new GuessGame();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String guessFromParameter = request.getParameter("guess");
        int guessedNumber = Integer.parseInt(guessFromParameter);
        String resultMessage = game.guess(guessedNumber);

        //Wij kunnen zelf géén extra parameters toevoegen aan onze request!
        //We kunnen wel extra attributen meegeven met de methode setAttribute().
        request.setAttribute("result", resultMessage);

        // https://www.javatpoint.com/requestdispatcher-in-servlet
        // https://www.studytonight.com/servlet/request-dispatcher.php#
        // https://way2java.com/servlets/what-is-requestdispatcher-in-servlets-explain-with-example/
        // De RequestDispatcher-interface van het javax.servlet-pakket wordt gebruikt om te communiceren
        // tussen twee Servlets. Het wordt geleverd met twee methoden: include () en forward ().

        //RequestDispatcher wordt gebruikt om waardekenmerken over te dragen naar een andere bron op de server.
        //RequestDispatcher wordt gebruikt om het clientverzoek op te nemen of door te sturen naar een andere bron.

        // De RequestDispatcher-interface biedt de mogelijkheid om het verzoek naar een
        // andere bron te verzenden. Dit kan html, servlet of jsp zijn.

        RequestDispatcher view = request.getRequestDispatcher("/guess.jsp");
        // Stuurt een verzoek van een servlet door naar een andere bron
        // (servlet, JSP-bestand of HTML-bestand) op de server.
        view.forward(request, response);
    }
}
