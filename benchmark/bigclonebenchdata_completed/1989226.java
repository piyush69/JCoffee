
import java.io.UncheckedIOException;


class c1989226 {
public MyHelperClass dateF;

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
            MyHelperClass fechaOficio = new MyHelperClass();
            if (fechaOficio != null && !fechaOficio.equals("")) {
//                MyHelperClass fechaOficio = new MyHelperClass();
                if ((boolean)(Object)fechaOficio.matches("\\d{8}")) {
//                    MyHelperClass fechaOficio = new MyHelperClass();
                    ms.setInt(1, Integer.parseInt((String)(Object)fechaOficio));
                } else {
                    int fzafent = 0;
                    try {
                        MyHelperClass fechaTest = new MyHelperClass();
                        fechaTest = dateF.parse(fechaOficio);
                        MyHelperClass Calendar = new MyHelperClass();
                        Calendar cal =(Calendar)(Object) Calendar.getInstance();
//                        MyHelperClass fechaTest = new MyHelperClass();
                        cal.setTime(fechaTest);
                        DateFormat date1 =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
//                        MyHelperClass fechaTest = new MyHelperClass();
                        fzafent = Integer.parseInt((String)(Object)date1.format(fechaTest));
                    } catch (Exception e) {
                    }
                    ms.setInt(1, fzafent);
                }
            } else {
                ms.setInt(1, 0);
            }
            MyHelperClass descripcion = new MyHelperClass();
            ms.setString(2, descripcion);
            MyHelperClass anoSalida = new MyHelperClass();
            ms.setInt(3, Integer.parseInt((String)(Object)anoSalida));
            MyHelperClass oficinaSalida = new MyHelperClass();
            ms.setInt(4, Integer.parseInt((String)(Object)oficinaSalida));
            MyHelperClass numeroSalida = new MyHelperClass();
            ms.setInt(5, Integer.parseInt((String)(Object)numeroSalida));
            MyHelperClass nulo = new MyHelperClass();
            ms.setString(6, nulo);
            MyHelperClass motivosNulo = new MyHelperClass();
            ms.setString(7, motivosNulo);
            MyHelperClass usuarioNulo = new MyHelperClass();
            ms.setString(8, usuarioNulo);
            MyHelperClass fechaNulo = new MyHelperClass();
            if (fechaNulo != null && !fechaNulo.equals("")) {
                int fzafent = 0;
                try {
                    MyHelperClass fechaTest = new MyHelperClass();
                    fechaTest = dateF.parse(fechaNulo);
                    MyHelperClass Calendar = new MyHelperClass();
                    Calendar cal =(Calendar)(Object) Calendar.getInstance();
//                    MyHelperClass fechaTest = new MyHelperClass();
                    cal.setTime(fechaTest);
                    DateFormat date1 =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
//                    MyHelperClass fechaTest = new MyHelperClass();
                    fzafent = Integer.parseInt((String)(Object)date1.format(fechaTest));
                } catch (Exception e) {
                }
                ms.setInt(9, fzafent);
            } else {
                ms.setInt(9, 0);
            }
            MyHelperClass fechaEntrada = new MyHelperClass();
            if (fechaEntrada != null && !fechaEntrada.equals("")) {
                int fzafent = 0;
                try {
                    MyHelperClass fechaTest = new MyHelperClass();
                    fechaTest = dateF.parse(fechaEntrada);
                    MyHelperClass Calendar = new MyHelperClass();
                    Calendar cal =(Calendar)(Object) Calendar.getInstance();
//                    MyHelperClass fechaTest = new MyHelperClass();
                    cal.setTime(fechaTest);
                    DateFormat date1 =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
//                    MyHelperClass fechaTest = new MyHelperClass();
                    fzafent = Integer.parseInt((String)(Object)date1.format(fechaTest));
                } catch (Exception e) {
                }
                ms.setInt(10, fzafent);
            } else {
                ms.setInt(10, 0);
            }
            MyHelperClass descartadoEntrada = new MyHelperClass();
            ms.setString(11, descartadoEntrada);
            MyHelperClass usuarioEntrada = new MyHelperClass();
            ms.setString(12, usuarioEntrada);
            MyHelperClass motivosDescarteEntrada = new MyHelperClass();
            ms.setString(13, motivosDescarteEntrada);
            MyHelperClass anoEntrada = new MyHelperClass();
            ms.setInt(14, anoEntrada != null ? Integer.parseInt((String)(Object)anoEntrada) : 0);
            MyHelperClass oficinaEntrada = new MyHelperClass();
            ms.setInt(15, oficinaEntrada != null ? Integer.parseInt((String)(Object)oficinaEntrada) : 0);
            MyHelperClass numeroEntrada = new MyHelperClass();
            ms.setInt(16, numeroEntrada != null ? Integer.parseInt((String)(Object)numeroEntrada) : 0);
            MyHelperClass anoOficio = new MyHelperClass();
            ms.setInt(17, anoOficio != null ? Integer.parseInt((String)(Object)anoOficio) : 0);
            MyHelperClass oficinaOficio = new MyHelperClass();
            ms.setInt(18, oficinaOficio != null ? Integer.parseInt((String)(Object)oficinaOficio) : 0);
            MyHelperClass numeroOficio = new MyHelperClass();
            ms.setInt(19, numeroOficio != null ? Integer.parseInt((String)(Object)numeroOficio) : 0);
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
            throw new RemoteException("Error inesperat, no s'ha actualitzat la taula de gestió dels ofici de remissió.", ex);
        } finally {
            MyHelperClass ToolsBD = new MyHelperClass();
            ToolsBD.closeConn(conn, ms, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass matches(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getConn(){ return null; }
	public MyHelperClass closeConn(Connection o0, PreparedStatement o1, Object o2){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Date {

}

class DateFormat {

public MyHelperClass format(MyHelperClass o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class Calendar {

public MyHelperClass setTime(MyHelperClass o0){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
	RemoteException(){}
	RemoteException(String o0, Exception o1){}
	RemoteException(String o0, SQLException o1){}
}
