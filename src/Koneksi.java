import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
    
    public static Connection con;
    public static Statement stm;
    
    public static Connection config() {
        
       try{
           String url = "jdbc:mysql://localhost/xiirpl101";
           String user = "root";
           String pass = "";
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           stm = con.createStatement();
           System.out.println("koneksi berhasil!");
       }catch(Exception ex){
           System.out.println("koneksi gagal " + ex.getMessage());
       }
       return con;
    }
    
}
//String sql = "INSERT INTO brg_masuk (kd_brg, nama_brg, jenis_brg, jumlah, tgl_masuk) VALUES ('VHO3', 'LAPTOP', 'ELEKTRONIK', '23', '2020-09-02');";