/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.system.Abstract;

import Domain.System.BusinessEntity.ViewStockBE;
import java.util.List;

/**
 *
 * @author zarmir
 */
public  interface IstockClothes {
    
     List<ViewStockBE>  getViewStock(ViewStockBE objs);
}
