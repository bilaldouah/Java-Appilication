package G_Abssence;
import G_Employe.Employer;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class Conges extends Abssence{
    
    
    public static Statement  stm;
    public static ResultSet rs;
    
    public static Connection con=connexion.connecterDB();
   
   public int id_type;
    
    public Conges( String Date_etablir, String Date_deb,String Date_fin, Employer emp,int id_type) {

        super( Date_etablir,  Date_deb, Date_fin,  emp);
        this.id_type=id_type;
    }
    public Conges(int id_abs,String Date_etablir,String Date_deb, String Date_fin,Employer emp, String statut,int id )
      {
          super( id_abs, Date_etablir, Date_deb,  Date_fin, emp,  statut);
          this.id_type=id;
          
      }
    public  void demande()
    {   int Resultat=0;
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
            
            String Query="insert into `conge`(id_conge,Date_etablir_titre_abssence,Date_debut_abssence,Date_fin_abssence,Cin_emp,id_type,statut) values(NULL,'"+Date_etablir+"','"+Date_deb+"','"+Date_fin+"','"+emp.getCin()+"','"+id_type+"','accepter')";
            stm=con.createStatement();
            stm.executeUpdate(Query);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        }
        else{
            try {
            
            String Query="insert into `conge`(id_conge,Date_etablir_titre_abssence,Date_debut_abssence,Date_fin_abssence,Cin_emp,id_type) values(NULL,'"+Date_etablir+"','"+Date_deb+"','"+Date_fin+"','"+emp.getCin()+"','"+id_type+"')";
            stm=con.createStatement();
            stm.executeUpdate(Query);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        }
    }

   
   
    public static List<Conges> getconge()
    {
        
    List<Conges> CongesList= new ArrayList<Conges>();
      try 
        {
            stm=con.createStatement();
            rs=stm.executeQuery("SELECT * FROM `conge`");
            while(rs.next()){
               int id_abs=rs.getInt("id_conge");
               String dateEtablir= rs.getString("Date_etablir_titre_abssence");
               String dateDebut= rs.getString("Date_debut_abssence");
               String dateFin= rs.getString("Date_fin_abssence");
               String cin=rs.getString("Cin_emp");
               String statut= rs.getString("statut");
               int id=rs.getInt("id_type");
               Employer emp=new Employer(cin);
               Conges abss= new Conges(id_abs,dateEtablir,dateDebut,dateFin,emp,statut,id);
               CongesList.add(abss);
               
                  
            }
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
      return CongesList;
}
    public static void accepter(int id)
    {
         try 
        {
            stm=con.createStatement();
            stm.executeUpdate("UPDATE Conge SET statut = 'accepter' WHERE id_conge="+id);
           
           
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
            stm.executeUpdate("UPDATE conge SET statut = 'refuser' WHERE id_conge="+id);
           
           
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
            stm.executeUpdate("DELETE from conge where id_conge="+id);
           
           
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
}