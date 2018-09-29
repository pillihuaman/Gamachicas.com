/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author zarmir
 */


@Controller 
@RequestMapping(value = "/Payment")
public class PaymentController {
    
    @RequestMapping(value = "getpay.htm",method = RequestMethod.GET)
    public ModelAndView GetPay1()
    {
         ModelAndView objpay= new ModelAndView();
          objpay.setViewName("getpay");
         
     return  new ModelAndView();
    
    }
    
}
