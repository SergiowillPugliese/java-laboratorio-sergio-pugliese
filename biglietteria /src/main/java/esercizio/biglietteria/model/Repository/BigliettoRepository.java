package esercizio.biglietteria.model.Repository;

import esercizio.biglietteria.constant.DBconfig;
import esercizio.biglietteria.model.Biglietteria;
import esercizio.biglietteria.model.Biglietto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BigliettoRepository {
    public static List<Biglietto> selectBiglietto(){
        List<Biglietto> biglietteriaList = new ArrayList<>();
        String query = "SELECT * FROM biglietto";
        try {
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Biglietto biglietto = new Biglietto(
                        rs.getInt("id_biglietteria"),
                        rs.getString("data_biglietteria"),
                        rs.getDouble("costo"),
                        rs.getString("categoria")
                );
                biglietteriaList.add(biglietto);
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

    public static Biglietto insertBiglietto (Biglietto biglietto){
        try{
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement("" + "INSERT INTO biglietto (id_biglietto, data_evento, costo, categoria) VALUE (?,?,?,?)");
            stmt.setInt(1, biglietto.getIdBiglietto());
            stmt.setString(2, biglietto.getDataEvento());
            stmt.setDouble(3,biglietto.getCosto());
            stmt.setString(4, biglietto.getCategoria());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            System.out.println(row);
            return biglietto;
        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Biglietto deleteBiglietto(int biglietto){
        try {
            final String SQL_DELETE = "DELETE FROM biglietto WHERE id_biglietto=?";
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, biglietto);
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

    public static Biglietto updateBiglietto(Biglietto biglietto){
        try {
            final String SQL_UPDATE = "UPDATE biglietto SET data_evento=?, costo=?, categoria=? WHERE id_biglietto = ?" ;
            Connection conn = DriverManager.getConnection(DBconfig.URL,DBconfig.USER,DBconfig.PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, biglietto.getDataEvento());
            stmt.setDouble(2, biglietto.getCosto());
            stmt.setString(3, biglietto.getCategoria());
            stmt.setInt(4, biglietto.getIdBiglietto());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            System.out.println(row);
            return biglietto;

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }
}
