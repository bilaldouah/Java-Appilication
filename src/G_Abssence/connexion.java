package G_Abssence;
import java.sql.*;

public class connexion {
  
    public static Connection connecterDB(){
    Connection con=null;
    try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrh", "root","");
                        System.out.println("Bien");
    } catch (Exception e) {
        System.out.println("erooor");
    }
    return con;
    }
}

