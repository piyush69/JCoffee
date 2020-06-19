
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21224967 {
public MyHelperClass conexionBD;
	public MyHelperClass populatePreparedStatement(MyHelperClass o0){ return null; }

    public boolean crear() {
        int result = 0;
        String sql = "insert into jugador" + "(apellidoPaterno, apellidoMaterno, nombres, fechaNacimiento, pais, rating, sexo)" + "values (?, ?, ?, ?, ?, ?, ?)";
        try {
            MyHelperClass connection = new MyHelperClass();
            connection = conexionBD.getConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass ps = new MyHelperClass();
            ps = connection.prepareStatement(sql);
            MyHelperClass elJugador = new MyHelperClass();
            populatePreparedStatement(elJugador);
//            MyHelperClass ps = new MyHelperClass();
            result =(int)(Object) ps.executeUpdate();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException exe) {
                exe.printStackTrace();
            }
        } finally {
            MyHelperClass ps = new MyHelperClass();
            conexionBD.close(ps);
            MyHelperClass connection = new MyHelperClass();
            conexionBD.close(connection);
        }
        return (result > 0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(MyHelperClass o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
