/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;
import G_Abssence.connexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOUAH
 */
public class  fonctionRepository {
  
    
    public static List<fonctionModel> getFonctions()
      {
          List<fonctionModel> result= new ArrayList<fonctionModel>();
          try {
         
         
             Connection con= connexion.connecterDB();
            PreparedStatement statement=con.prepareCall("{call getFonction()}");
            
            
       
           boolean  hadResults=statement.execute();
            
            while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            // process result set
                while (resultSet.next()) {
                // retrieve values of fields.
                
               int fonctionId = resultSet.getInt("id_fonction");              
               String fonctionName = resultSet.getString("nom_fonction");

              // Mycombo.addItem(fonctionName);
              
              fonctionModel fonction = new fonctionModel(fonctionId,fonctionName);
             
                result.add(fonction);
                }
            hadResults = statement.getMoreResults();
            }
        
            con.close();
        } 
         catch (Exception e) 
        {
            System.out.println(e.toString());
        }
          
          return result;
      }
    

  public static List<empModel> getAllEmp()
{ 
    List<empModel> empList= new ArrayList<empModel>();

    try {
         
             Connection con= connexion.connecterDB();
            PreparedStatement statement=con.prepareCall("{call `getAllEmp_Fonction`()}");
            
            
       
           boolean  hadResults=statement.execute();
            
            while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            // process result set
                while (resultSet.next()) {
                // retrieve values of fields.
                String CinEmp = resultSet.getString("Cin_emp");
                String nomEmp = resultSet.getString("nom_emp");
                String prenomEmp = resultSet.getString("prenom_emp");
                int fonctionEmp = resultSet.getInt("fonction");
                String serviceEmp= resultSet.getString("service");
                empModel fonction= new empModel(CinEmp,nomEmp,prenomEmp,fonctionEmp,serviceEmp);
                empList.add(fonction);
                }
            hadResults = statement.getMoreResults();
            }
        
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    return empList;
}
}

