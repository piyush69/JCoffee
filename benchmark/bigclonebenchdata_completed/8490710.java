
import java.io.UncheckedIOException;


class c8490710 {

    public void actualizar() throws SQLException, ClassNotFoundException, Exception {
        Connection conn = null;
        PreparedStatement ms = null;
        boolean registroActualizado;// = new boolean();
        registroActualizado = false;
        try {
            MyHelperClass ToolsBD = new MyHelperClass();
            conn =(Connection)(Object) ToolsBD.getConn();
            conn.setAutoCommit(false);
            Date fechaSystem = new Date();
            DateFormat aaaammdd =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
            int fzafsis = Integer.parseInt((String)(Object)aaaammdd.format(fechaSystem));
            DateFormat hhmmss =(DateFormat)(Object) new SimpleDateFormat("HHmmss");
            DateFormat sss =(DateFormat)(Object) new SimpleDateFormat("S");
            String ss =(String)(Object) sss.format(fechaSystem);
            if (ss.length() > 2) {
                ss = ss.substring(0, 2);
            }
            int fzahsis = Integer.parseInt(hhmmss.format(fechaSystem) + ss);
            MyHelperClass SENTENCIA_UPDATE = new MyHelperClass();
            ms =(PreparedStatement)(Object) conn.prepareStatement(SENTENCIA_UPDATE);
            MyHelperClass descartadoEntrada = new MyHelperClass();
            ms.setString(1, descartadoEntrada);
            MyHelperClass usuarioEntrada = new MyHelperClass();
            ms.setString(2, usuarioEntrada);
            MyHelperClass motivosDescarteEntrada = new MyHelperClass();
            ms.setString(3, motivosDescarteEntrada);
            MyHelperClass anoOficio = new MyHelperClass();
            ms.setInt(4, Integer.parseInt((String)(Object)anoOficio));
            MyHelperClass oficinaOficio = new MyHelperClass();
            ms.setInt(5, Integer.parseInt((String)(Object)oficinaOficio));
            MyHelperClass numeroOficio = new MyHelperClass();
            ms.setInt(6, Integer.parseInt((String)(Object)numeroOficio));
            MyHelperClass anoEntrada = new MyHelperClass();
            ms.setInt(7, anoEntrada != null ? Integer.parseInt((String)(Object)anoEntrada) : 0);
            MyHelperClass oficinaEntrada = new MyHelperClass();
            ms.setInt(8, oficinaEntrada != null ? Integer.parseInt((String)(Object)oficinaEntrada) : 0);
            MyHelperClass numeroEntrada = new MyHelperClass();
            ms.setInt(9, numeroEntrada != null ? Integer.parseInt((String)(Object)numeroEntrada) : 0);
            int afectados =(int)(Object) ms.executeUpdate();
            if (afectados > 0) {
//                MyHelperClass registroActualizado = new MyHelperClass();
                registroActualizado = true;
            } else {
//                MyHelperClass registroActualizado = new MyHelperClass();
                registroActualizado = false;
            }
            conn.commit();
        } catch (Exception ex) {
            System.out.println("Error inesperat, no s'ha desat el registre: " + ex.getMessage());
            ex.printStackTrace();
//            MyHelperClass registroActualizado = new MyHelperClass();
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
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Date {

}

class DateFormat {

public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
	RemoteException(){}
	RemoteException(String o0, Exception o1){}
	RemoteException(String o0, SQLException o1){}
}
