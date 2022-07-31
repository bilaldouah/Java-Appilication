package G_Abssence;
import java.sql.*;
public class types_conges{
    public static Statement  stm;
    public static ResultSet rs;
    public static Connection con=connexion.connecterDB();;
    private String type;

    public types_conges(String type)
    {
        this.type = type;
    }

    public void insertion()
    {
        try {
            
            String Query="insert into type_conge values(NULL,"+type+")";
            stm=con.createStatement();
            stm.executeUpdate(Query);
           System.out.println("5dmat");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}