/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository.System.DataAccess.Oracle;

import Domain.System.BusinessEntity.Base.Clothing;
import Domain.System.BusinessEntity.ViewStockBE;
import Infrastructure.System.Adapters.OracleAdapter;
import com.sun.mail.smtp.SMTPAddressFailedException;
import java.sql.CallableStatement;

/**
 *
 * @author zarmir
 */
public class stockClothesDA {
      public static ViewStockBE getViewStock( ViewStockBE objs)
    {
        ViewStockBE ob= new ViewStockBE();
          Clothing clo= new Clothing();
         try
         {
          String Command="{call getstock(?,?,?,?)}";
          
           CallableStatement stm= OracleAdapter.getConnection().prepareCall(Command);
           stm.setInt(1, 1);
           stm.registerOutParameter(2, java.sql.Types.VARCHAR);
           stm.registerOutParameter(3, java.sql.Types.VARCHAR);
           stm.registerOutParameter(4, java.sql.Types.INTEGER);
           stm.execute();
             clo.setName(stm.getString(2));
            clo.setDescription(stm.getString(3));
            clo.setStatus(stm.getShort(4));
            ob.setClothing(clo);
          
         }catch( Exception ex)
         {
              ex.getMessage();
         
         }
         
        
        return ob;
    }
}
