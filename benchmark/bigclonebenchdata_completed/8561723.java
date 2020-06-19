
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8561723 {
public MyHelperClass conexionBD;
	public MyHelperClass connection;
	public MyHelperClass ps;
	public MyHelperClass populatePreparedStatement(){ return null; }

    public boolean crear() {
        int result = 0;
        String sql = "insert into divisionxTorneo" + "(torneo_idTorneo, tipoTorneo_idTipoTorneo, nombreDivision, descripcion, numJugadores, numFechas, terminado, tipoDesempate, rondaActual, ptosxbye)" + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            MyHelperClass connection = new MyHelperClass();
            connection = conexionBD.getConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass ps = new MyHelperClass();
            ps = connection.prepareStatement(sql);
            populatePreparedStatement();
            result =(int)(Object) ps.executeUpdate();
            connection.commit();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            try {
                connection.rollback();
            } catch (UncheckedIOException exe) {
                exe.printStackTrace();
            }
        } finally {
            conexionBD.close(ps);
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
