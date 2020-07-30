package april.pattern.behavioral.delegate.mvcdemo;

import april.pattern.behavioral.delegate.mvcdemo.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yanzx
 */
public class DispatcherServlet extends HttpServlet {

    private final Map<String, Method> handlerMapping = new HashMap<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String requestURI = req.getRequestURI();
        if (!handlerMapping.containsKey(requestURI)) {
            System.out.println("无此uri映射！" + requestURI);
        }

        // handlerMapping.get(requestURI).invoke(null,null);
    }

    @Override
    public void init() throws ServletException {
        try {
            handlerMapping.put("/web/getMemberById.json",
                    MemberController.class.getMethod("getMemberById", String.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
