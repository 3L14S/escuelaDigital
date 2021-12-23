
package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AlumnosDAO {
    Connection conexion;
    public AlumnosDAO(){
        Conexion con = new Conexion();
        conexion = con.getConection();
    }
    public List<Alumnos> listarAlumnos(){
        PreparedStatement ps;
        ResultSet rs;
        List<Alumnos> lista = new ArrayList<>();
        /*List es abstracta*/
        try {
            ps = conexion.prepareStatement("SELECT * from participantes");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                Alumnos alumnos = new Alumnos(id, nombre, apellido, email, telefono);
                lista.add(alumnos);
            }
            return lista;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public Alumnos mostrarAlumno(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Alumnos alumno = null;
        try {
            ps = conexion.prepareStatement("SELECT * from participantes WHERE id=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                alumno = new Alumnos(id, nombre,apellido,email,telefono);
            }
            return alumno;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    public boolean insertarAlumno(Alumnos alumno){
        PreparedStatement ps;        
        try {
            ps = conexion.prepareStatement("INSERT INTO participantes (nombre, apellido,email,telefono) values(?,?,?,?)");
            ps.setInt(4, alumno.getTelefono());
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    public  boolean ActualizarAlumno(Alumnos alumno){
        PreparedStatement ps;        
        try {
            ps = conexion.prepareStatement("UPDATE participantes SET nombre=?, apellido=?, email=?, telefono=? where id=?");
                        
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.setInt(4, alumno.getTelefono());
            ps.setInt(5, alumno.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    public boolean eliminarAlumno(int _id){
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("DELETE FROM `participantes` WHERE id=?");
            ps.setInt(1, _id);
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean ingresarUsuario (String email, String pass){
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conexion.prepareStatement("SELECT * FROM usuarios where email=?");
            ps.setString(1, email);            
            rs = ps.executeQuery();
            while(rs.next()){
            return email.equals(rs.getString("email"))&& pass.equals(rs.getString("password"));
            }
            return false;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
