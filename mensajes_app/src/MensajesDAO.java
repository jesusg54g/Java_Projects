import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajesDB(Mensajes mensajes) {
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
               String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
               ps = connection.prepareStatement(query);
               ps.setString(1, mensajes.getMensaje());
               ps.setString(2, mensajes.getAutor_mensaje());
               ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente!");
            }catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMensajesDB() {
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            //rs.next() se utiliza para establecer una condicion del while que
            //valida que mientras la variable rs tenga datos se ejecute el ciclo.
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void borrarMensajesDB(int id_mensaje) {
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado");

            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensajes) {
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, mensajes.getMensaje());
                ps.setInt(2, mensajes.getId_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje se actualizo correctamente");

            } catch (SQLException ex) {
                System.out.println(ex);
                System.out.println("No se pudo actualizar el mensaje");

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
