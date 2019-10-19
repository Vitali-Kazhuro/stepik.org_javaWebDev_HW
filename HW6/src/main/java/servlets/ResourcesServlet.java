package servlets;

import resourceServer.ResourceServerI;
import resources.TestResource;
import sax.ReadXMLFileSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ResourcesServlet extends HttpServlet {
    public static final String PAGE_URL = "/resources";
    private final ResourceServerI resourceServer;

    public ResourcesServlet(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        String path = request.getParameter("path");

        resourceServer.setTestResource((TestResource) ReadXMLFileSAX.readXML(path));

    }
}
