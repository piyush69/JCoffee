
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19947814 {
public MyHelperClass conexionBD;
	public MyHelperClass populatePreparedStatement(MyHelperClass o0){ return null; }

    public boolean crear() {
        int result = 0;
        String sql = "insert into partida" + "(torneo_idTorneo, jugador_idJugadorNegras, jugador_idJugadorBlancas, registrado, fecha," + " movs, resultado, nombreBlancas, nombreNegras, eloBlancas, eloNegras, idApertura)" + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            MyHelperClass connection = new MyHelperClass();
            connection = conexionBD.getConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass ps = new MyHelperClass();
            ps = connection.prepareStatement(sql);
            MyHelperClass unaPartida = new MyHelperClass();
            populatePreparedStatement(unaPartida);
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
