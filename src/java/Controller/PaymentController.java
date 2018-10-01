/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



import Domain.System.BusinessEntity.ViewStockBE;
import java.lang.annotation.Annotation;
import model.system.Abstract.IstockClothes;
import model.system.repository.stockClothes;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
/**
 *
 * @author zarmir
 */


@Controller 
@Service
//@RequestMapping(value = "/Payment")
public class PaymentController  implements Controller{
//    private  stockClothes stockClothes;
    
    
    @RequestMapping(value = "/Payment/getpay.htm",method = RequestMethod.GET)
    public ModelAndView GetPay()
    {
//          ViewStockBE va=  getIstockClothes().getViewStock();
        
          ModelAndView objpay= new ModelAndView();
          objpay.setViewName("getpay");  
     return  new ModelAndView();
    
    }
 
    @RequestMapping(value = "getpay.html",method = RequestMethod.POST)
    public JSONObject  postPay()
    {
    
         return null;
    }

    @Override
    public String value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the stockClothes
     */
//    public stockClothes getStockClothes() {
//        return stockClothes;
//    }
//
//    /**
//     * @param stockClothes the stockClothes to set
//     */
//    public void setStockClothes(stockClothes stockClothes) {
//        this.stockClothes = stockClothes;
//    }

  
    
}
