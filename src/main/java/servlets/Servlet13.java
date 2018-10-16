package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

@WebServlet(name = "Servlet13", urlPatterns = {"/Servlet13"})
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Writer wr = response.getWriter();
        try {
            File file = new File("/home/ruin/Pulpit/kurs/Homework_02/src/main/resources/oop.txt"); // /home/ruin/Pulpit/kurs/Homework_02/src/main/resources/oop.txt
            Scanner scan = new Scanner((file));

        while (scan.hasNextLine()) {
            wr.append(scan.nextLine()+"\n");
        }

        }catch (Exception e){
            System.out.println(e);
        }
    }
 }
//Zadanie 3
//W projekcie stwórz servlet Servlet13, dostępny pod adresem /Servlet13,
//Servlet wczyta zawartość pliku oop.txt, a następnie wyświetli jego zawartość na stronie. Jest to lista języków programowania, które wzorują się na paradygmacie obiektowym pobrana z Wikipedii.
