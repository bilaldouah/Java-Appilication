package G_Abssence;
import G_Employe.Employer;
import static G_Employe.Employer.con;
import static G_Employe.Employer.id_employer_static;
import static G_Employe.Employer.rs;
import static G_Employe.Employer.stm;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class Abssence {
    
    
    public static Statement  stm;
    public static ResultSet rs;
    
    public static Connection con=connexion.connecterDB();
   
    protected int id_abs;
     protected String Date_etablir;
    protected String Date_deb;
    protected String Date_fin;
    protected Employer emp;
    protected String statut;
       
    public Abssence( String Date_etablir, String Date_deb,String Date_fin, Employer emp) {

        this.Date_etablir = Date_etablir;
        this.Date_deb = Date_deb;
        this.Date_fin = Date_fin;
        this.emp = emp;
    }
    public Abssence(int id_abs,String Date_etablir,String Date_deb, String Date_fin,Employer emp, String statut )
      {
          this.id_abs=id_abs;
          this.Date_etablir=Date_etablir;
          this.Date_deb=Date_deb;
          this.Date_fin=Date_fin;
          this.emp = emp;
          this.statut=statut;
          
      }
    
    public  void demande()
    {
        int Resultat=0;
        try {
        stm=con.createStatement();
        rs=stm.executeQuery("SELECT id_fonction_ FROM employer where Cin_emp ='"+Employer.id_employer_static+"'");
        if(rs.next())
        {
            Resultat=rs.getInt("id_fonction_");
           
        }
        }
        catch(SQLException ex){}
       
        if(Resultat ==1){
        try {
            
            String Query="insert into `absence`(id_abs,Date_etablir_titre_abssence,Date_debut_abssence,Date_fin_abssence,Cin_emp,statut) values(NULL,'"+Date_etablir+"','"+Date_deb+"','"+Date_fin+"','"+emp.getCin()+"','accepter')";
            stm=con.createStatement();
            stm.executeUpdate(Query);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        }
        else{
             try {
            
            String Query="insert into `absence`(id_abs,Date_etablir_titre_abssence,Date_debut_abssence,Date_fin_abssence,Cin_emp) values(NULL,'"+Date_etablir+"','"+Date_deb+"','"+Date_fin+"','"+emp.getCin()+"')";
            stm=con.createStatement();
            stm.executeUpdate(Query);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        }
    }
   
   
    public static List<Abssence> getAbsence()
    {
        
    List<Abssence> abssenceList= new ArrayList<Abssence>();
      try 
        {
            stm=con.createStatement();
            rs=stm.executeQuery("SELECT * FROM `absence`");
            while(rs.next()){
               int id_abs=rs.getInt("id_abs");
               String dateEtablir= rs.getString("Date_etablir_titre_abssence");
               String dateDebut= rs.getString("Date_debut_abssence");
               String dateFin= rs.getString("Date_fin_abssence");
               String cin=rs.getString("Cin_emp");
               String statut= rs.getString("statut");
               Employer emp=new Employer(cin);
               
               Abssence abss= new Abssence(id_abs,dateEtablir,dateDebut,dateFin,emp,statut);
               abssenceList.add(abss);
                  
            }
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
      return abssenceList;
}
    public static void accepter(int id)
    {
         try 
        {
            stm=con.createStatement();
            stm.executeUpdate("UPDATE absence SET statut = 'accepter' WHERE id_abs="+id);
           
           
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
    public static void refuser(int id)
    {
         try 
        {
            stm=con.createStatement();
            stm.executeUpdate("UPDATE absence SET statut = 'refuser' WHERE id_abs="+id);
           
           
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
    
    public static void Suprimer(int id)
    {
         try 
        {
            stm=con.createStatement();
            stm.executeUpdate("DELETE from absence where id_abs="+id);
           
           
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
}