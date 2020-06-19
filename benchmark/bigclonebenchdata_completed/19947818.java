
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19947818 {
public MyHelperClass conexionBD;
	public MyHelperClass populatePreparedStatement2(partida o0){ return null; }

    public boolean update(int idPartida, partida partidaModificada) {
        int intResult = 0;
        String sql = "UPDATE partida " + "SET torneo_idTorneo = ?, " + " jugador_idJugadorNegras = ?, jugador_idJugadorBlancas = ?, " + " fecha = ?, " + " resultado = ?, " + " nombreBlancas = ?, nombreNegras = ?, eloBlancas = ?, eloNegras = ?, idApertura = ? " + " WHERE idPartida = " + idPartida;
        try {
            MyHelperClass connection = new MyHelperClass();
            connection = conexionBD.getConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass ps = new MyHelperClass();
            ps = connection.prepareStatement(sql);
            populatePreparedStatement2(partidaModificada);
//            MyHelperClass ps = new MyHelperClass();
            intResult =(int)(Object) ps.executeUpdate();
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
        return (intResult > 0);
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

class partida {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
