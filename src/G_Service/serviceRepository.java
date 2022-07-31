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
import java.util.List;

import java.util.*;


/**
 *
 * @author DOUAH
 */

public  class serviceRepository {
    public static void AjoutezService(String nom_service)
    {
         try {
         
            Connection con= connexion.connecterDB();
            PreparedStatement statment=con.prepareCall("{call addNewService(?)}");
            statment.setString(1, nom_service);
            System.out.println(nom_service);
            statment.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
public static List<serviceModel> GetAllServices()
{  List<serviceModel> servicesList= new ArrayList<serviceModel>();

    try {
         
             Connection con= connexion.connecterDB();
            PreparedStatement statement=con.prepareCall("{call getService()}");
            
            
       
           boolean  hadResults=statement.execute();
            
            while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            // process result set
                while (resultSet.next()) {
                // retrieve values of fields.
                int serviceId = resultSet.getInt("id_service");
                String serviceName = resultSet.getString("nom_service");
                Date creationDate = resultSet.getDate("date_creation_service");
                int countEmployees = resultSet.getInt("count");
                
                serviceModel service= new serviceModel(serviceId,serviceName,creationDate,countEmployees);
                servicesList.add(service);
                }
            hadResults = statement.getMoreResults();
            }
        
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    return servicesList;
}
public static List<serviceModel> FindService(String nom_service)
{
    List<serviceModel> servicesList= new ArrayList<serviceModel>();
    
     try {
           
            Connection con= connexion.connecterDB();
            PreparedStatement statement=con.prepareCall("{call `rechercherService`(?)}");
            statement.setString(1, nom_service);
            
             boolean  hadResults=statement.execute();
            
            while (hadResults) {
            ResultSet resultSet = statement.getResultSet();
            // process result set
                while (resultSet.next()) {
                // retrieve values of fields
                
                int serviceId = resultSet.getInt("id_service");
                String serviceName = resultSet.getString("nom_service");
                Date creationDate = resultSet.getDate("date_creation_service");
                 int countEmployees = resultSet.getInt("count");
                
                serviceModel service= new serviceModel(serviceId,serviceName,creationDate,countEmployees);
                servicesList.add(service);
                }
              hadResults = statement.getMoreResults();
                  //hadResults = false;
            }
            con.close();
        } 
     catch (Exception e) 
     {
            System.out.println(e.toString());
      }
   return servicesList;
}
public static void deleteService(int id)
{
try {
         
            Connection con= connexion.connecterDB();
            PreparedStatement statment=con.prepareCall("{call `supprimerService`(?)}");
            statment.setInt(1, id);         
            statment.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
}
public static void UpdateService(String name, int id)
{
    try {
         
            Connection con= connexion.connecterDB();
            PreparedStatement statment=con.prepareCall("{call `updateService`(?,?)}");
            statment.setString(1, name);    
            statment.setInt(2, id);
            statment.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
}
}
