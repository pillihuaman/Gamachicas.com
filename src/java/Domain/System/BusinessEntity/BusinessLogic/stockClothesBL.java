/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity.BusinessLogic;

import Domain.System.BusinessEntity.ViewStockBE;
import Repository.System.DataAccess.Oracle.stockClothesDA;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author zarmir
 */
public class stockClothesBL {
    
    
    public  List<ViewStockBE> getViewStock( ViewStockBE objs) throws SQLException
    {
        return stockClothesDA.getViewStock(objs);
    }
    
    
}
