
import java.io.UncheckedIOException;


class c1141875 {
public static MyHelperClass conexion;
	public static MyHelperClass getConexion(){ return null; }
//public MyHelperClass conexion;
//	public MyHelperClass getConexion(){ return null; }

    public static boolean ejecutarDMLTransaccion(List tirasSQL) throws Exception {
        boolean ok = true;
        try {
            getConexion();
            conexion.setAutoCommit(false);
            Statement st =(Statement)(Object) conexion.createStatement();
            for (String cadenaSQL :(String[])(Object) (Object[])(Object)tirasSQL) {
                if ((int)(Object)st.executeUpdate(cadenaSQL) < 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) conexion.commit(); else conexion.rollback();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (UncheckedIOException e) {
            if (conexion != null && !(Boolean)(Object)conexion.isClosed()) {
                conexion.rollback();
            }
            throw new Exception("Error en Transaccion");
        } catch (Exception e) {
            throw new Exception("Error en Transaccion");
        }
        return ok;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class List {

}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
