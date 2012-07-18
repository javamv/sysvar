package javamv.sysvar.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: VMoskalenko
 * Date: 17.07.12
 * Time: 23:39
 */
@Controller
public class SysvarController {

    Log logger = LogFactory.getLog(SysvarController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "sysvar_home";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public String verify(HttpServletRequest request) {
        String systemVariable = System.getenv(request.getParameter("systemVariable"));
        logger.debug("You just searched variable: " + systemVariable);
        request.setAttribute("sysvarValue", systemVariable);
        return "sysvar_home";
    }

}
