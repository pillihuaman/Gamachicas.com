/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author zarmir
 */
@Controller
public class HomeController {
    
    @RequestMapping("layout.htm")
    public ModelAndView home(ModelMap model)
    {
        ModelAndView objhome= new ModelAndView();
        objhome.setViewName("home/layout");
               //<link rel="stylesheet"  href="${pageContext.request.contextPath}/resources/css/Styles.css" />
         return objhome;
    }
    
}
