/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



import Domain.System.BusinessEntity.Base.Clothing;
import Domain.System.BusinessEntity.Base.Users;
import Domain.System.BusinessEntity.ViewStockBE;
import java.lang.annotation.Annotation;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.system.Abstract.IstockClothes;
import model.system.repository.stockClothes;
import oracle.sql.ARRAY;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author zarmir
 */


@Controller 

public class PaymentController {
//    private  stockClothes stockClothes;
    
 
    @RequestMapping(  value = "/Payment/getstock.htm" ,method = RequestMethod.GET)//Metodo de una vista
    public ModelAndView getstock()
    {
        stockClothes obj= new stockClothes();
        ViewStockBE obview= new ViewStockBE();
     
//        Clothing.name
         List<ViewStockBE> ob =null;
           ob=(List<ViewStockBE>) obj.getViewStock(obview);
         
ViewStockBE objs= new ViewStockBE();
//////for (Iterator<ViewStockBE> i = ob.iterator(); i.hasNext();) {
////// 
//////  System.out.print(i);
//////   
//////}
//   List<Clothing> lst = new ArrayList<>();
////           String odb = "Hola";
//        for (int i = 0; i < 10; i++) {
//            Clothing obclothing = new Clothing();
//              obclothing.setDescription("Casaca negra"+i);
//              obclothing.setName("Casaca"+i);
//             ;
//              
//            lst.add(obclothing); 
//        }

              
            
             
              
//              lst.add("hola");
//              lst.add("mundo");
//               lst.add("zarmir");
//                lst.add("pillihuaman");
              
          return new ModelAndView("/Payment/getstock", "lstStok",ob);
//        
//       ModelAndView mav =new ModelAndView( );
//        mav.setViewName("getstock");
//        ///String txtCorreo =request.getParameter("txtCorreo");
//        //String txtContrasenia=request.getParameter("txtContrasenia");
//        //mav.addObject("txtCorreo", txtCorreo);
//         //String car="hola";
//           mav.addObject("lstStok", "hola");
//     //return new ModelAndView("getstock","objlist", ob);
//      return  mav;
       

    }
//    public ModelAndView getPay()
//    {
//        
//          ModelAndView objpay= new ModelAndView();
//         objpay.setViewName("getPay");  
//     return  new ModelAndView();
//    
//    }
// 
//    @RequestMapping(value = "postPay.htm"  ,method = RequestMethod.POST)
//    public JSONObject  postPay()
//    {
//    
//         return null;
//    }
//

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
