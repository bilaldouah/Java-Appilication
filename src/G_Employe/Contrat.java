package G_Employe;

import java.sql.*;
import G_Abssence.connexion;


public class Contrat {
    private int  id_contrat;
    private int Type;
    private String DateDebut;
    private String DateFin;
    public  static Connection con;
    public  static ResultSet rs;
    public  static  PreparedStatement ps;
    public  static Statement stm; 
    public Contrat(int type,String DateD,String DateF)
    {
        this.Type=type;
        this.DateDebut=DateD;
        this.DateFin=DateF;
        
    }

     
      
      public  void ajouter(){
          con=connexion.connecterDB();	
          
          try {
	        String req = "insert into contrat (Date_debut, Date_fin,contrat_type) values ('"+DateDebut+"','"+DateFin+"','"+Type+"') ";
		ps = con.prepareStatement(req);					
		System.out.println(req);
		ps.execute();					
		ps.close();
                
            } 
            catch (Exception e) {
		e.printStackTrace();
		}   
}   
    
   
} 

