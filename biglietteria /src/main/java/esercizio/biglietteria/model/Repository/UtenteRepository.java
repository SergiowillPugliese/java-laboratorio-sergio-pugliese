package esercizio.biglietteria.model.Repository;

import esercizio.biglietteria.constant.DBconfig;
import esercizio.biglietteria.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository {
    public static List<Utente> selezionaUtenti() {
        List<Utente> utenteList = new ArrayList<>();
        String query = "SELECT * FROM utente";
        try {
            Connection conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Utente utente = new Utente(
                        rs.getLong("id_utente"),
                        rs.getString("nome"),
                        rs.getString("cognome")
                );
                utenteList.add(utente);
            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return utenteList;
    }
}
