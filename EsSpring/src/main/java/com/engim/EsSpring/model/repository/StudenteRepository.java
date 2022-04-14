package com.engim.EsSpring.model.repository;

import com.engim.EsSpring.model.Studente;


import javax.servlet.SessionTrackingMode;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/scuola";
    private static final String USER = "scuola";
    private static final String PASS = "scuola";

    /**
     * metodo che serve a selezionare tutti gli studenti presenti
     * all'interno del db
     * @return lista degli studenti
     * */
    public static List<Studente> selectStudenti() {

        try {
            List<Studente> studentList = new ArrayList<>();
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM studente");
            while (rs.next()){
                Studente st = new Studente(
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("genere")
                );
                studentList.add(st);
            }
            conn.close();
            stmt.close();
            return studentList;

        } catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return new ArrayList<>();
    }

    public static Studente insertStudente(Studente studente){
        try{
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            PreparedStatement stmt = conn.prepareStatement("" + "INSERT INTO studente (nome, cognome, genere) VALUE (?,?,?)");
            stmt.setString(1, studente.getNome());
            stmt.setString(2, studente.getCognome());
            stmt.setString(3,studente.getGenere());
            int row = stmt.executeUpdate();

            conn.close();
            stmt.close();
            return studente;
        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Studente deleteStudente(Studente studente){
        try {
            final String SQL_DELETE = "DELETE FROM studente WHERE nome=? AND cognome=? AND genere=?";
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1,studente.getNome());
            stmt.setString(2,studente.getCognome());
            stmt.setString(3,studente.getGenere());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            return studente;

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

    public static Studente updateStudente(Studente studente){
        try {
            final String SQL_DELETE = "DELETE FROM studente WHERE nome=? AND cognome=? AND genere=?";
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1,studente.getNome());
            stmt.setString(2,studente.getCognome());
            stmt.setString(3,studente.getGenere());
            int row = stmt.executeUpdate();
            conn.close();
            stmt.close();
            return studente;

        } catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }

}

