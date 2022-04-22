package esercizio.biglietteria.model.Repository;

import esercizio.biglietteria.constant.DBconfig;
import esercizio.biglietteria.model.Biglietteria;

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
                        rs.getLong("id_biglietteria"),
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
}
