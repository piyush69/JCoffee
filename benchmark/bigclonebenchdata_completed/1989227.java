
import java.io.UncheckedIOException;


class c1989227 {

    public void anular() throws SQLException, ClassNotFoundException, Exception {
        Connection conn = null;
        PreparedStatement ms = null;
        try {
            MyHelperClass ToolsBD = new MyHelperClass();
            conn =(Connection)(Object) ToolsBD.getConn();
            conn.setAutoCommit(false);
            String sentencia_delete = "DELETE FROM BZOFRENT " + " WHERE REN_OFANY=? AND REN_OFOFI=? AND REN_OFNUM=?";
            ms =(PreparedStatement)(Object) conn.prepareStatement(sentencia_delete);
            MyHelperClass anoOficio = new MyHelperClass();
            ms.setInt(1, anoOficio != null ? Integer.parseInt((String)(Object)anoOficio) : 0);
            MyHelperClass oficinaOficio = new MyHelperClass();
            ms.setInt(2, oficinaOficio != null ? Integer.parseInt((String)(Object)oficinaOficio) : 0);
            MyHelperClass numeroOficio = new MyHelperClass();
            ms.setInt(3, numeroOficio != null ? Integer.parseInt((String)(Object)numeroOficio) : 0);
            int afectados =(int)(Object) ms.executeUpdate();
            if (afectados > 0) {
                boolean registroActualizado;// = new boolean();
                registroActualizado = true;
            } else {
                boolean registroActualizado;// = new boolean();
                registroActualizado = false;
            }
            conn.commit();
        } catch (Exception ex) {
            System.out.println("Error inesperat, no s'ha desat el registre: " + ex.getMessage());
            ex.printStackTrace();
            boolean registroActualizado;// = new boolean();
            registroActualizado = false;
            MyHelperClass errores = new MyHelperClass();
            errores.put("", "Error inesperat, no s'ha desat el registre" + ": " + ex.getClass() + "->" + ex.getMessage());
            try {
                if (conn != null) conn.rollback();
            } catch (UncheckedIOException sqle) {
                throw new RemoteException("S'ha produït un error i no s'han pogut tornar enrere els canvis efectuats", sqle);
            }
            throw new RemoteException("Error inesperat, no s'ha modifcat el registre", ex);
        } finally {
            MyHelperClass ToolsBD = new MyHelperClass();
            ToolsBD.closeConn(conn, ms, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConn(){ return null; }
	public MyHelperClass closeConn(Connection o0, PreparedStatement o1, Object o2){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
	RemoteException(){}
	RemoteException(String o0, Exception o1){}
	RemoteException(String o0, SQLException o1){}
}
