package socket;


import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "ChatSocketServlet", urlPatterns = {"/chat"})
public class ChatSocketServlet extends WebSocketServlet {
    private final static int LOGOUT_TIME = 1*60*1000;
    private ChatSocket chatSocket = new ChatSocket();

    @Override
    public void configure(WebSocketServletFactory webSocketServletFactory) {
        webSocketServletFactory.getPolicy().setIdleTimeout(LOGOUT_TIME);
        webSocketServletFactory.setCreator((req, resp) -> chatSocket);
    }
}
