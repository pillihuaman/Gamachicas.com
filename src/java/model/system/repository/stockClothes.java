/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.system.repository;

import Domain.System.BusinessEntity.BusinessLogic.stockClothesBL;
import Domain.System.BusinessEntity.ViewStockBE;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.system.Abstract.IstockClothes;
import org.springframework.stereotype.Service;


/**
 *
 * @author zarmir
 */
@Service
public  class stockClothes implements IstockClothes{

    @Override
    public   List<ViewStockBE> getViewStock(ViewStockBE objs) {
        ViewStockBE ob= new ViewStockBE();
        stockClothesBL obl= new stockClothesBL();
        try {
            return  obl.getViewStock(objs);
        } catch (SQLException ex) {
            Logger.getLogger(stockClothes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
