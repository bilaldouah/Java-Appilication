/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;

/**
 *
 * @author DOUAH
 */
import java.sql.Date; 
public class serviceModel {
    public int id_service;
    public String nom_service;
    public Date date_creation_service; 
    public int count;
    public serviceModel(int id_service)
    {
        this.id_service=id_service;
        
        
    }
   

    public int getId_service() {
        return id_service;
    }
    public serviceModel(int id , String nom, Date creationDate,int countServices)
    {
        this.id_service=id;
        this.nom_service=nom;
        this.date_creation_service=creationDate;
        this.count=countServices;
    }
    
    
    
}
