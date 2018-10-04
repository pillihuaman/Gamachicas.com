/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.BusinessLogic;

import Domain.System.BusinessEntity.ViewStockBE;
import Repository.System.DataAccess.Oracle.stockClothesDA;

/**
 *
 * @author zarmir
 */
public class stockClothesBL {
    
    
    public ViewStockBE getViewStock( ViewStockBE objs)
    {
        return stockClothesDA.getViewStock(objs);
    }
    
    
}
