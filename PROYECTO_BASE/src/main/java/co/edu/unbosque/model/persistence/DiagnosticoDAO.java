package co.edu.unbosque.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.LinkedList;

import co.edu.unbosque.controller.DBConnection;
import co.edu.unbosque.model.DiagnosticoDTO;

public class DiagnosticoDAO {
    
    private DBConnection dbcon;
    private LinkedList<DiagnosticoDTO> diagnosticos;

    public DiagnosticoDAO() {
        dbcon = new DBConnection();
        diagnosticos = loadDiagnosticos();
    }

    public int create(DiagnosticoDTO object) {
        DiagnosticoDTO newDiagnostico = object;
        dbcon.initConnection();
        try {
            dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement("INSERT INTO Diagnostico (rapPaciente, prestacion, idDocumento, estudio, fechaEstudio, edadFechaEstudio, sexo, nodulos, morfologiaNodulos, margenesNodulos, densidadNodulos, presenciaMicrocalcificaciones, calcifiTipBenig, calcifiMorSos, distriCalcifi, presenciaAsimetrias, tipoAsimetria, hallasgosAsociados, lateralidadHallasgo, BIRADS, irapPaciente, edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS));
            dbcon.getPreparedstatement().setInt(1, newDiagnostico.getRapPaciente());
            dbcon.getPreparedstatement().setString(2, newDiagnostico.getPrestacion());
            dbcon.getPreparedstatement().setString(3, newDiagnostico.getIdDocumento()); // Cambia según la necesidad
            dbcon.getPreparedstatement().setString(4, newDiagnostico.getEstudio());
            dbcon.getPreparedstatement().setDate(5, java.sql.Date.valueOf(newDiagnostico.getFechaEstudio()));
            dbcon.getPreparedstatement().setInt(6, newDiagnostico.getEdadFechaEstudio());
            dbcon.getPreparedstatement().setString(7, String.valueOf(newDiagnostico.getSexo()));
            dbcon.getPreparedstatement().setBoolean(8, newDiagnostico.getNodulos());
            dbcon.getPreparedstatement().setString(9, newDiagnostico.getMorfologiaNodulos());
            dbcon.getPreparedstatement().setString(10, newDiagnostico.getMargenesNodulos());
            dbcon.getPreparedstatement().setString(11, newDiagnostico.getDensidadNodulos());
            dbcon.getPreparedstatement().setBoolean(12, newDiagnostico.getPresenciaMicrocalcificaciones());
            dbcon.getPreparedstatement().setString(13, newDiagnostico.getCalcifiTipBenig());
            dbcon.getPreparedstatement().setString(14, newDiagnostico.getCalcifiMorSos());
            dbcon.getPreparedstatement().setString(15, newDiagnostico.getDistriCalcifi());
            dbcon.getPreparedstatement().setBoolean(16, newDiagnostico.getPresenciaAsimetrias());
            dbcon.getPreparedstatement().setString(17, newDiagnostico.getTipoAsimetria());
            dbcon.getPreparedstatement().setString(18, newDiagnostico.getHallasgosAsociados());
            dbcon.getPreparedstatement().setString(19, newDiagnostico.getLateralidadHallasgo());
            dbcon.getPreparedstatement().setInt(20, newDiagnostico.getBIRADS());
            dbcon.getPreparedstatement().setInt(21, newDiagnostico.getIrapPaciente());
            dbcon.getPreparedstatement().setInt(22, newDiagnostico.getEdad());

            dbcon.getPreparedstatement().executeUpdate();
            ResultSet key = dbcon.getPreparedstatement().getGeneratedKeys();
            if (key.next()) {
                // Si deseas manejar el ID generado, aquí puedes hacerlo
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbcon.close();
        diagnosticos.add(newDiagnostico);
        return 0;
    }

    public int update(int id, DiagnosticoDTO object) {
        DiagnosticoDTO updateDiagnostico = object;
        dbcon.initConnection();
        // Aquí deberías agregar lógica para encontrar el índice o manejar el ID
        try {
            dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement("UPDATE Diagnostico SET rapPaciente=?, prestacion=?, idDocumento=?, estudio=?, fechaEstudio=?, edadFechaEstudio=?, sexo=?, nodulos=?, morfologiaNodulos=?, margenesNodulos=?, densidadNodulos=?, presenciaMicrocalcificaciones=?, calcifiTipBenig=?, calcifiMorSos=?, distriCalcifi=?, presenciaAsimetrias=?, tipoAsimetria=?, hallasgosAsociados=?, lateralidadHallasgo=?, BIRADS=?, irapPaciente=?, edad=? WHERE idDiagnostico=?"));
            dbcon.getPreparedstatement().setInt(1, updateDiagnostico.getRapPaciente());
            dbcon.getPreparedstatement().setString(2, updateDiagnostico.getPrestacion());
            dbcon.getPreparedstatement().setString(3, updateDiagnostico.getIdDocumento()); // Cambia según la necesidad
            dbcon.getPreparedstatement().setString(4, updateDiagnostico.getEstudio());
            dbcon.getPreparedstatement().setDate(5, java.sql.Date.valueOf(updateDiagnostico.getFechaEstudio()));
            dbcon.getPreparedstatement().setInt(6, updateDiagnostico.getEdadFechaEstudio());
            dbcon.getPreparedstatement().setString(7, String.valueOf(updateDiagnostico.getSexo()));
            dbcon.getPreparedstatement().setBoolean(8, updateDiagnostico.getNodulos());
            dbcon.getPreparedstatement().setString(9, updateDiagnostico.getMorfologiaNodulos());
            dbcon.getPreparedstatement().setString(10, updateDiagnostico.getMargenesNodulos());
            dbcon.getPreparedstatement().setString(11, updateDiagnostico.getDensidadNodulos());
            dbcon.getPreparedstatement().setBoolean(12, updateDiagnostico.getPresenciaMicrocalcificaciones());
            dbcon.getPreparedstatement().setString(13, updateDiagnostico.getCalcifiTipBenig());
            dbcon.getPreparedstatement().setString(14, updateDiagnostico.getCalcifiMorSos());
            dbcon.getPreparedstatement().setString(15, updateDiagnostico.getDistriCalcifi());
            dbcon.getPreparedstatement().setBoolean(16, updateDiagnostico.getPresenciaAsimetrias());
            dbcon.getPreparedstatement().setString(17, updateDiagnostico.getTipoAsimetria());
            dbcon.getPreparedstatement().setString(18, updateDiagnostico.getHallasgosAsociados());
            dbcon.getPreparedstatement().setString(19, updateDiagnostico.getLateralidadHallasgo());
            dbcon.getPreparedstatement().setInt(20, updateDiagnostico.getBIRADS());
            dbcon.getPreparedstatement().setInt(21, updateDiagnostico.getIrapPaciente());
            dbcon.getPreparedstatement().setInt(22, updateDiagnostico.getEdad());
            dbcon.getPreparedstatement().setInt(23, id); // Asegúrate de que este ID esté correcto

            dbcon.getPreparedstatement().executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbcon.close();
        return 0;
    }

    public int delete(int id) {
        dbcon.initConnection();
        try {
            dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement("DELETE FROM Diagnostico WHERE idDiagnostico=?;"));
            dbcon.getPreparedstatement().setInt(1, id);
            dbcon.getPreparedstatement().executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbcon.close();
        return 0;
    }
    
    public LinkedList<DiagnosticoDTO> loadDiagnosticos() {
        LinkedList<DiagnosticoDTO> data = new LinkedList<>();
        dbcon.initConnection();
        try {
            dbcon.setStatement(dbcon.getConnect().createStatement());
            dbcon.setResultset(dbcon.getStatement().executeQuery("SELECT * FROM Diagnostico;"));
            while (dbcon.getResultset().next()) {
                int rapPaciente = dbcon.getResultset().getInt("rapPaciente");
                String prestacion = dbcon.getResultset().getString("prestacion");
                String idDocumento = dbcon.getResultset().getString("idDocumento");
                String estudio = dbcon.getResultset().getString("estudio");
                LocalDate fechaEstudio = dbcon.getResultset().getDate("fechaEstudio").toLocalDate();
                int edadFechaEstudio = dbcon.getResultset().getInt("edadFechaEstudio");
                char sexo = dbcon.getResultset().getString("sexo").charAt(0);
                boolean nodulos = dbcon.getResultset().getBoolean("nodulos");
                String morfologiaNodulos = dbcon.getResultset().getString("morfologiaNodulos");
                String margenesNodulos = dbcon.getResultset().getString("margenesNodulos");
                String densidadNodulos = dbcon.getResultset().getString("densidadNodulos");
                boolean presenciaMicrocalcificaciones = dbcon.getResultset().getBoolean("presenciaMicrocalcificaciones");
                String calcifiTipBenig = dbcon.getResultset().getString("calcifiTipBenig");
                String calcifiMorSos = dbcon.getResultset().getString("calcifiMorSos");
                String distriCalcifi = dbcon.getResultset().getString("distriCalcifi");
                boolean presenciaAsimetrias = dbcon.getResultset().getBoolean("presenciaAsimetrias");
                String tipoAsimetria = dbcon.getResultset().getString("tipoAsimetria");
                String hallasgosAsociados = dbcon.getResultset().getString("hallasgosAsociados");
                String lateralidadHallasgo = dbcon.getResultset().getString("lateralidadHallasgo");
                int BIRADS = dbcon.getResultset().getInt("BIRADS");
                int irapPaciente = dbcon.getResultset().getInt("irapPaciente");
                int edad = dbcon.getResultset().getInt("edad");

                data.add(new DiagnosticoDTO(rapPaciente, prestacion, idDocumento, estudio, fechaEstudio, edadFechaEstudio, sexo, nodulos, morfologiaNodulos, margenesNodulos, densidadNodulos, presenciaMicrocalcificaciones, calcifiTipBenig, calcifiMorSos, distriCalcifi, presenciaAsimetrias, tipoAsimetria, hallasgosAsociados, lateralidadHallasgo, BIRADS, irapPaciente, edad));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbcon.close();
        return data;
    }

    public String showAll() {
        StringBuilder result = new StringBuilder();
        for (DiagnosticoDTO aux : diagnosticos) {
            result.append(aux.toString()).append("\n");
        }
        return result.toString();
    }
}
