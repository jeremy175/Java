package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {
    private static final String  SQl_SELECT="SELECT idClientes, Nombre,Desayunos,Almuerzos,Cenas FROM clientes";
    private static final String  SQL_INSERT ="INSERT INTO clientes(Nombre,Desayunos,Almuerzos,Cenas) VALUES(?,?,?,?)";
    
    public List<Persona> seleccionar(){
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs= null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            con = getConnection();
            stmt = con.prepareStatement(SQl_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                int idClientes = rs.getInt("idClientes");
                String nombre = rs.getString("Nombre");
                String desayunos = rs.getString("Desayunos");
                String almuerzos = rs.getString("Almuerzos");
                String cenas = rs.getString("Cenas");
                
                persona= new Persona(idClientes, nombre, desayunos, almuerzos, cenas);
                personas.add(persona);
                
                
            }
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Close(rs);
                Close(stmt);
                Close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
            return personas;
    }
    
    
    public int insertar(Persona persona){
         Connection con =null;
         PreparedStatement stmt = null;
         int registros = 0;
        try {
           
            con = getConnection();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getDesayunos());
            stmt.setString(3, persona.getAlmuerzos());
            stmt.setString(4, persona.getCenas());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
             try {
                 Close(stmt);
             } catch (SQLException ex) {
                ex.printStackTrace(System.out);
             }
             try {
                 Close(con);
             } catch (SQLException ex) {
                ex.printStackTrace(System.out);
             }
        }
        return registros;
    }
}