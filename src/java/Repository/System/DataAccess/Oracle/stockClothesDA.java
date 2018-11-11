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
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author zarmir
 */
public class stockClothesDA {
    
  
	   public static   List<ViewStockBE>  getViewStock( ViewStockBE objs)
			throws SQLException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;
		ResultSet rs = null;
            List<ViewStockBE> lst =new ArrayList<ViewStockBE>();
		String getDBUSERCursorSql = "{call getlitsas(?,?)}";

		try {
			dbConnection = OracleAdapter.getConnection();
			callableStatement = dbConnection.prepareCall(getDBUSERCursorSql);

			callableStatement.setInt(1, 5);
			callableStatement.registerOutParameter(2, OracleTypes.CURSOR);

			// execute getDBUSERCursor store procedure
			callableStatement.executeUpdate();

			// get cursor and cast it to ResultSet
			rs = (ResultSet) callableStatement.getObject(2);

			while (rs.next()) {
                         ViewStockBE ob= new ViewStockBE();
                          Clothing clo= new Clothing();
                            clo.setIdclothing(rs.getBigDecimal("idclothing"));
                              clo.setName(rs.getString("name"));
                              clo.setDescription(rs.getString("description"));
                              ob.setClothing(clo);
			       lst.add(ob);   
//				
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (rs != null) {
				rs.close();
			}

			if (callableStatement != null) {
				callableStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
 return lst;
	}

}

//      public static ViewStockBE getViewStock( ViewStockBE objs)
//    {
//        
//       List<ViewStockBE> lst =new ArrayList<ViewStockBE>();
//        ViewStockBE ob= new ViewStockBE();
//          Clothing clo= new Clothing();
//         try
//         {
//             
//             
////             etDBUSERCursor is a stored procedure
////String getDBUSERCursorSql = "{call getDBUSERCursor(?,?)}";
////callableStatement = dbConnection.prepareCall(getDBUSERCursorSql);
////callableStatement.setString(1, "mkyong");
////callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
////
////// execute getDBUSERCursor store procedure
////callableStatement.executeUpdate();
////
////// get cursor and cast it to ResultSet
////rs = (ResultSet) callableStatement.getObject(2);
////
////// loop it like normal
////while (rs.next()) {
////	String userid = rs.getString("USER_ID");
////	String userName = rs.getString("USERNAME");
////}	
//
//
//
//
//
//          String Command="{call getlitsas(?)";
//          
//    CallableStatement  smt =OracleAdapter.getConnection().prepareCall(Command);
////           CallableStatement stm = OracleAdapter.getConnection().prepareCall("BEGIN getlitsas(?); END;");
////           
////           //stm.setInt(1, 1);
////           //stm.registerOutParameter(1, java.sql.Types.VARCHAR);
//           smt.registerOutParameter(1,OracleTypes.CURSOR);
//            smt.executeUpdate();
//            ResultSet rs=(ResultSet)smt.getObject(1;
//   
//            while (rs.next()) {
//	String userid = rs.getString("idclothing");
//	String userName = rs.getString("name");
//}
////              ob.setClothing(clo);
////            lst.add(ob);
////           
////    name.close();
////    smt.close();
////    OracleAdapter.getConnection().close();
//
////           //stm.setString(2, "idclothing");
////            stm.execute();
////             ResultSet rset = (ResultSet)stm.getObject (1);
////                // Dump the cursor
////    while (rset.next ())
////   
////  clo.setName(rset.getString ("name"));
////  clo.setIdclothing(rset.getBigDecimal("idclothing"));
//  
// //clo.setIdclothing(rset.getBigDecimal("idclothing"));
//    // Close all the resources
//    
//
//           //stm.registerOutParameter(4, java.sql.Types.INTEGER);
//         
//      
//       //    while (statement) 
//     //      {
//             //ResultSet rs = stm.getResultSet();
////               ResultSet rs = ((OracleCallableStatement)stm).getCursor(2);
////   
//    //hasResults = stmt.getMoreResults();
// // while (rs.next()){
//           
////          clo.setIdclothing(rs.getBigDecimal(1));
////         clo.setDescription(rs.getString(2));
////            lo.setStatus(stm.getShort(4));
////            ob.setClothing(clo);
////            lst.add(ob);
//  //}
//         //  }
//         }catch( Exception ex)
//         {
//              ex.getMessage();
//         
//         }
//         
//        
//        return ob;
//    }
//}
