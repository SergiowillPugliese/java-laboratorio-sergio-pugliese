package esercizio.biglietteria.model.Repository;

import esercizio.biglietteria.constant.DBconfig;
import esercizio.biglietteria.model.Biglietteria;
import esercizio.biglietteria.payload.BiglietteriaPayload;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BiglietteriaRepository{

    public static List<Biglietteria> selectBiglietteria(){
        List<Biglietteria> biglietteriaList = new ArrayList<>();
        String query = "SELECT * FROM biglietteria";
        try {
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Biglietteria biglietteria = new Biglietteria(
                        rs.getInt("id_biglietteria"),
                        rs.getString("nome_biglietteria"),
                        rs.getString("indirizzo")
                );
                biglietteriaList.add(biglietteria);
            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return biglietteriaList;
    }

    public static Biglietteria insertBiglietteria (Biglietteria biglietteria){
        try{
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement("" + "INSERT INTO biglietteria (id_biglietteria, nome_biglietteria, indirizzo) VALUE (?,?,?)");
            stmt.setInt(1, biglietteria.getIdBiglietteria());
            stmt.setString(2, biglietteria.getNomeBiglietteria());
            stmt.setString(3,biglietteria.getIndirizzo());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            System.out.println(row);
            return biglietteria;
        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Biglietteria deleteBiglietteria(int biglietteria){
        try {
            final String SQL_DELETE = "DELETE FROM biglietteria WHERE id_biglietteria=?";
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,biglietteria);
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            System.out.println(row);

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Biglietteria updateBiglietteria(Biglietteria biglietteria){
        try {
            final String SQL_UPDATE = "UPDATE biglietteria SET nome_biglietteria=?, indirizzo=? WHERE id_biglietteria = ?" ;
            Connection conn = DriverManager.getConnection(DBconfig.URL,DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, biglietteria.getNomeBiglietteria());
            stmt.setString(2, biglietteria.getIndirizzo());
            stmt.setInt(3,biglietteria.getIdBiglietteria());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            System.out.println(row);
            return biglietteria;

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }
}
