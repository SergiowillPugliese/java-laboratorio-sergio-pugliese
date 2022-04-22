package scuola.esempio.model.repository;

import scuola.esempio.model.Studente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/scuola";
    private static final String USER = "scuola";
    private static final String PASS = "scuola";

    public static List<Studente> selezionaStudenti(){
        List<Studente> studentList = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            String query = "{CALL seleziona_studenti()}";//richiamo stored procedure con nome seleziona_studenti()
            PreparedStatement stmt = conn.prepareCall(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Studente studente = new Studente(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("indirizzoStudio")
                );
                studentList.add(studente);
            }
            conn.close();
            stmt.close();

        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return studentList;
    }
}
