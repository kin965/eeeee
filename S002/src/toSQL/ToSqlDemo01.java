package toSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToSqlDemo01 {

    //ロード
    Connection conn = null;
    //駆動
    Statement stmt = null;
    //結果回収
    ResultSet rs = null;
    

    String DB_URL = "jdbc:postgresql://localhost:5432/kin";
    String USER = "postgres";
    String PASS = "postgres";

    public Connection getDbcom() throws ClassNotFoundException {
        if (conn == null) {
            Class.forName("org.postgresql.Driver");
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();
            } catch (SQLException ex) {
            }
        }
        return conn;
    }
//検索の方法
     public void editProductService(String edit) throws SQLException {
        stmt.executeUpdate(edit);
    }
     //新規の方法
    public void addProduct(String sql) throws SQLException {
        System.out.println(sql);
        stmt.executeUpdate(sql);
        
    }
    

   /* public List<Product> selectProductAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "select*from product";

        rs = stmt.executeQuery(sql);
        if (rs != null) {
            while (rs.next()) {
                Product product = new Product();
                product.setPid(rs.getString(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getShort(3));
                list.add(product);
            }
        }
        for (Product p : list) {
            System.out.println(p.getPid() + ":" + p.getName());
        }
        return list;
    }
*/
    public void closeDbcom() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
//注意１
}
