
package G_Employe;
import G_Abssence.connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Ville {
public int idvill;

private  String  NomVille;
/*----------------------------------*/
public  static Connection con;
  public  static ResultSet res;
  public  static  PreparedStatement ps;
  public  static Statement stm; 
public Ville(int idV,String nomv)
{
    this.idvill=idV;
    this.NomVille=nomv;
}
 public  void ajouter(){
          con=connexion.connecterDB();	
          try {
	        String req = "insert into Ville (nomVille) values (?) ";
		ps = con.prepareStatement(req);					
		ps.setString(1,NomVille);  
		ps.execute();					
	        JOptionPane.showMessageDialog(null, "Data Saved");					
		ps.close();					
	} catch (Exception e) {
		e.printStackTrace();
		}   
}   
public  String getNom()
{
    return NomVille;
}

    
}
