
package G_Employe;

import G_Abssence.connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rh.fonction;
import rh.service;
import rh.serviceModel;

public class Employer {
private String Cin;
private String Prenom;
private String Nom;
private String Stituation_familial;
private String Login;
private String Password;

private String Email;
private int Numero_tel;
private Diplome d;
private  Ville  v;
private serviceModel s;

private Contrat  c;


private String CIN_emp;
public static String id_employer_static;
   
/*----------------------------------*/
public  static Connection con=connexion.connecterDB();;
  public  static ResultSet rs;
  public  static  PreparedStatement ps;
  public  static Statement stm; 
  
  
     public Employer(String CIN_emp) {
        this.CIN_emp = CIN_emp;

    }
     public Employer(int tele,String Email) {
        this.Numero_tel=tele;
        this.Email=Email;

    }
public Employer(String CIN,String prenom,String Nom,String sf,String login ,String password, String email,int tele,String NomDiplome,String ecole,int idV,String ville,serviceModel s,Contrat c ){
    this.Cin=CIN;
    this.Prenom=prenom;
    this.Nom=Nom;
    this.Stituation_familial=sf;
    this.Login=login;
    this.Password=password;
    this.Email=email;
    this.Numero_tel=tele;
    v=new Ville(idV, ville);
    d=new Diplome(NomDiplome,ecole);
    this.s=s;
    this.c=c;
    
}

    public Employer() {
    }
public void calcule_salaire(){}
public int Age(Date date_naiss){int Age=0;
return Age;}
  
   
public  void ajouterEmployer(int nbr,int id){
          con=connexion.connecterDB();
          d.ajouter();
          //c.ajouter();
          
          try {
	        String req = "insert into employer (Cin_emp,prenom_emp ,nom_emp, situation_f_emp,telephone_emp,login_emp,password_emp,email_emp,annés_experience_emp,id_service,id_diplome,id_ville,id_contrat) values (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		 ps = con.prepareStatement(req);					
		ps.setString(1,Cin);
               
                ps.setString(2, Prenom);
		ps.setString(3, Nom);
		ps.setString(4, Stituation_familial);
                ps.setString(6, Login);
                ps.setString(7, Password);
                ps.setString(8, Email);
                ps.setInt(5, Numero_tel);
                ps.setInt(9, nbr);
                ps.setInt(10, s.getId_service());
                ps.setInt(11, d.getid());
                ps.setInt(12,v.idvill);
                
                ps.setInt(13, id);
		ps.execute();			
		JOptionPane.showMessageDialog(null, "Data Saved");					
		ps.close();					
	} catch (Exception e) {
            
		e.printStackTrace();
		}   
}
public  void modifier(String id){
    	try {
                String query="Update employer set email_emp='"+Email+"',telephone_emp="+Numero_tel+" where Cin_emp='"+id+ "'";
                PreparedStatement ps = con.prepareStatement(query);									
		ps.execute();				
		JOptionPane.showMessageDialog(null, "Data Updated");	
		ps.close();
			} catch (Exception e) {
				e.printStackTrace();
                                
			}
}
public static void supprimer(String index){
   
  	   try {
               
               String query = "delete from employer where Cin_emp = '"+index+"' ";         
               PreparedStatement ps = con.prepareStatement(query);
               ps.execute();
               JOptionPane.showMessageDialog(null, "Data Deleted");
	       ps.close();	
		} catch (Exception e) {
		      e.printStackTrace();
			}
}
public int authentification(String login_,String mdp_)
    {
         int Resultat=0;
    try {
       
        stm=con.createStatement();
        rs=stm.executeQuery("SELECT * FROM employer where login_emp='"+login_+"' and  password_emp='"+mdp_+"'");
        if(rs.next())
        {
            Resultat=rs.getInt("id_fonction_");
            System.out.println(Resultat);
            id_employer_static=rs.getString("Cin_emp");
           
        }
       
    } catch (SQLException ex) {
        Logger.getLogger(Employer.class.getName()).log(Level.SEVERE, null, ex);
    }
     return Resultat;
    }
     public static  String verifier_mdp(){
        String Resultat="";
      try {
       
        stm=con.createStatement();
        rs=stm.executeQuery("SELECT password_emp FROM employer where Cin_emp='"+id_employer_static+"'");
        if(rs.next())
        {
            Resultat=rs.getString("password_emp");
        }
       
        } catch (SQLException ex) {
            Logger.getLogger(Employer.class.getName()).log(Level.SEVERE, null, ex);
        }
      return Resultat;
     }
     public static void update_mdp(String Mdp_emp)
    {
        try {
           
            String Query="update   employer set password_emp  ='"+Mdp_emp+"' WHERE Cin_emp ='"+id_employer_static+"'";
            con=connexion.connecterDB();
            stm=con.createStatement();
            stm.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Modification avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(Employer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getCin(){
        return CIN_emp;
    }  
    
}

        