/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.system.repository;

import Domain.System.BusinessEntity.ViewStockBE;
import model.system.Abstract.IstockClothes;
import org.springframework.stereotype.Service;


/**
 *
 * @author zarmir
 */
@Service
public class stockClothes implements IstockClothes{

    @Override
    public ViewStockBE getViewStock() {
      return null;
    }
    
}
