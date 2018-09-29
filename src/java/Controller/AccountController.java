/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domain.System.BusinessEntity.Base.Users;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
   
    @RequestMapping(  value = "login.htm" ,method = RequestMethod.GET)//Metodo de una vista
    public ModelAndView login()
    {
      //ModelAndView mav =new ModelAndView( );
        //mav.setViewName("login");
        ///String txtCorreo =request.getParameter("txtCorreo");
        //String txtContrasenia=request.getParameter("txtContrasenia");
        //mav.addObject("txtCorreo", txtCorreo);
        //mav.addObject("txtContrasenia", txtContrasenia);
        return new ModelAndView("login","command", new Users("pillihuamanhz@gmail.com", null));
    }
     @RequestMapping(value = "login.htm",method = RequestMethod.POST)
    public String login(Users per, ModelMap model)
    {
         model.addAttribute("email",per.getEmail());
         model.addAttribute("password",per.getPassword());
     return "home";
    }
    
    
    @RequestMapping("logout.htm")
    public ModelAndView logout()
    {
     ModelAndView objlogout = new ModelAndView();
      objlogout.setViewName("logout");
      return objlogout;
    }
}


