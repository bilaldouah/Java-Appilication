package G_Employe;
import G_Abssence.connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Diplome {
    private String NomDiplome;    
    private String Ecole;
  /*******************************/
  public  static Connection con;
  public  static ResultSet rs;
  public  static  PreparedStatement ps;
  public  static Statement stm; 
    
    public Diplome(String Nom,String Ecole)
    {
        this.NomDiplome=Nom;
        
        this.Ecole=Ecole;
    }

    public int getid() {
        int id_s=0;
         try 
            {
                stm=con.createStatement();
                rs=stm.executeQuery("select id_diplome from diplome where nom='"+NomDiplome+"'"); 
                while(rs.next())
                {
                     id_s=rs.getInt("id_diplome");
                }
            } catch (Exception e) 
            {
            }
         return id_s;
    }
    
 public  void ajouter(){
          con=connexion.connecterDB();	
          try {
	        String req = "insert into Diplome (nom, ecole) values (?,?) ";
		ps = con.prepareStatement(req);					
		ps.setString(1,NomDiplome);
                
		ps.setString(2, Ecole);
		ps.execute();					
		ps.close();					
	} catch (Exception e) {
		e.printStackTrace();
		}   
}   
    
    
    
    
}
