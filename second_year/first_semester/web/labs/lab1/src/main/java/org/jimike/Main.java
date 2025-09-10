package org.jimike;
import com.fastcgi.FCGIInterface;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (new FCGIInterface().FCGIaccept() >= 0) {
            count++;
            System.out.println("Content-type: text/html\n\n");
            System.out.println("<html>");
            System.out.println(
                    "<head><TITLE>FAST CGI!</TITLE></head>"
            );
            System.out.println("<body>");
            System.out.println("<h3>Hello, world!</h3>");
            System.out.println("request number " + count + " running on host " + System.getProperty("SERVER_NAME"));
            System.out.println("</body>");
            System.out.println("</html>");
        }
    }
}