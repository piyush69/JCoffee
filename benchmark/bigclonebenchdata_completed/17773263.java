import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17773263 {
public MyHelperClass idioma;
	public MyHelperClass destinatario;
	public MyHelperClass tipoDocumento;
	public MyHelperClass fora;
	public MyHelperClass fzacagge;
	public MyHelperClass fechaDocumento;
	public MyHelperClass fechaRegistro;
	public MyHelperClass logLopdBZMODIF(String o0, MyHelperClass o1, int o2, int o3, char o4, MyHelperClass o5, MyHelperClass o6, MyHelperClass o7, int o8, int o9){ return null; }
public MyHelperClass generarBZVISAD(Connection o0, int o1, int o2){ return null; }
public MyHelperClass hayVisadoRemitente;
public MyHelperClass entidad2;
	public MyHelperClass entidad2Old;
	public MyHelperClass actualizarBZSALIDA(Connection o0){ return null; }

    public boolean visar() throws Throwable, SQLException, ClassNotFoundException, Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        Date fechaSystem = new Date();
        DateFormat aaaammdd =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
        DateFormat hhmmss =(DateFormat)(Object) new SimpleDateFormat("HHmmss");
        DateFormat sss =(DateFormat)(Object) new SimpleDateFormat("S");
        String ss =(String)(Object) sss.format(fechaSystem);
        if (ss.length() > 2) {
            ss = ss.substring(0, 2);
        }
        boolean visado = false;
        try {
            MyHelperClass ToolsBD = new MyHelperClass();
            conn =(Connection)(Object) ToolsBD.getConn();
            conn.setAutoCommit(false);
            MyHelperClass hayVisadoExtracto = new MyHelperClass();
            String sentenciaSql = "UPDATE BZMODIF SET FZJCUSVI=?, FZJFVISA=?, FZJHVISA=?" + (((boolean)(Object)hayVisadoExtracto) ? ", FZJIEXTR=?" : "") + (((boolean)(Object)hayVisadoRemitente) ? ", FZJIREMI=?" : "") + " WHERE FZJCENSA='S' AND FZJCAGCO=? AND FZJNUMEN=? AND FZJANOEN=? AND FZJFMODI=? AND FZJHMODI=?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sentenciaSql);
            MyHelperClass usuarioVisado = new MyHelperClass();
            ps.setString(1, usuarioVisado);
            ps.setInt(2,(MyHelperClass)(Object) Integer.parseInt((String)(Object)aaaammdd.format(fechaSystem)));
            ps.setInt(3,(MyHelperClass)(Object) Integer.parseInt(hhmmss.format(fechaSystem) + ss));
            int contador = 4;
//            MyHelperClass hayVisadoExtracto = new MyHelperClass();
            if ((boolean)(Object)hayVisadoExtracto) {
                ps.setString(contador++, "X");
            }
            MyHelperClass hayVisadoRemitente = new MyHelperClass();
            if ((boolean)(Object)hayVisadoRemitente) {
                ps.setString(contador++, "X");
            }
            MyHelperClass oficina = new MyHelperClass();
            ps.setInt(contador++, oficina);
            MyHelperClass numeroRegistro = new MyHelperClass();
            ps.setInt(contador++, numeroRegistro);
            MyHelperClass anoSalida = new MyHelperClass();
            ps.setInt(contador++, anoSalida);
            MyHelperClass fechaModificacion = new MyHelperClass();
            ps.setString(contador++, fechaModificacion);
            MyHelperClass horaModificacion = new MyHelperClass();
            ps.setString(contador++, horaModificacion);
            int registrosAfectados =(int)(Object) ps.executeUpdate();
//            MyHelperClass hayVisadoExtracto = new MyHelperClass();
            if (registrosAfectados > 0 && !(Boolean)(Object)hayVisadoExtracto && !(Boolean)(Object)hayVisadoRemitente) {
                visado = true;
            }
//            MyHelperClass hayVisadoExtracto = new MyHelperClass();
            if (registrosAfectados > 0 && ((Boolean)(Object)hayVisadoExtracto || (Boolean)(Object)hayVisadoRemitente)) {
                boolean generado =(boolean)(Object) generarBZVISAD(conn, Integer.parseInt((String)(Object)aaaammdd.format(fechaSystem)), Integer.parseInt(hhmmss.format(fechaSystem) + ss));
                if (generado) {
                    visado =(boolean)(Object) actualizarBZSALIDA(conn);
                }
                String rem = "";
                String com = "";
//                MyHelperClass hayVisadoRemitente = new MyHelperClass();
                if ((boolean)(Object)hayVisadoRemitente) {
                    MyHelperClass remitente = new MyHelperClass();
                    if (!remitente.trim().equals("")) {
//                        MyHelperClass remitente = new MyHelperClass();
                        rem =(String)(Object) remitente;
                    } else {
                        javax.naming.InitialContext contexto = new javax.naming.InitialContext();
                        Object ref = contexto.lookup("es.caib.regweb.ValoresHome");
                        ValoresHome home = (ValoresHome) javax.rmi.PortableRemoteObject.narrow(ref, ValoresHome.class);
                        Valores valor =(Valores)(Object) home.create();
                        MyHelperClass entidad1 = new MyHelperClass();
                        rem =(String)(Object) valor.recuperaRemitenteCastellano(entidad1, entidad2 + "");
                        valor.remove();
                    }
                } else {
                    MyHelperClass altres = new MyHelperClass();
                    if (!altres.trim().equals("")) {
                        MyHelperClass remitente = new MyHelperClass();
                        rem =(String)(Object) remitente;
                    } else {
                        javax.naming.InitialContext contexto = new javax.naming.InitialContext();
                        Object ref = contexto.lookup("es.caib.regweb.ValoresHome");
                        ValoresHome home = (ValoresHome) javax.rmi.PortableRemoteObject.narrow(ref, ValoresHome.class);
                        Valores valor =(Valores)(Object) home.create();
                        MyHelperClass entidad1Old = new MyHelperClass();
                        rem =(String)(Object) valor.recuperaRemitenteCastellano(entidad1Old, entidad2Old + "");
                        valor.remove();
                    }
                }
//                MyHelperClass hayVisadoExtracto = new MyHelperClass();
                if ((boolean)(Object)hayVisadoExtracto) {
                    MyHelperClass extracto = new MyHelperClass();
                    com =(String)(Object) extracto;
                } else {
                    MyHelperClass comentario = new MyHelperClass();
                    com =(String)(Object) comentario;
                }
                try {
                    Class t = Class.forName("es.caib.regweb.module.PluginHook");
                    Class[] partypes = { String.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class, Integer.class, String.class };
//                    MyHelperClass anoSalida = new MyHelperClass();
                    Object[] params = { "V", new Integer((int)(Object)anoSalida), new Integer((int)(Object)numeroRegistro), new Integer((int)(Object)oficina), new Integer((int)(Object)fechaDocumento), rem, com, tipoDocumento, new Integer((int)(Object)fechaRegistro), new Integer((int)(Object)fzacagge), fora, new Integer((int)(Object)destinatario), idioma };
                    java.lang.reflect.Method metodo = t.getMethod("salida", partypes);
                    metodo.invoke(null, params);
                } catch (IllegalAccessException iae) {
                } catch (IllegalArgumentException iae) {
                } catch (ArithmeticException ite) {
                } catch (NullPointerException npe) {
                } catch (ExceptionInInitializerError eiie) {
                } catch (NoSuchMethodException nsme) {
                } catch (SecurityException se) {
                } catch (LinkageError le) {
                } catch (ClassNotFoundException le) {
                }
            }
            conn.commit();
            int fzahsis = Integer.parseInt(hhmmss.format(fechaSystem) + ss);
            String Stringsss =(String)(Object) sss.format(fechaSystem);
            switch(Stringsss.length()) {
                case (1):
                    Stringsss = "00" + Stringsss;
                    break;
                case (2):
                    Stringsss = "0" + Stringsss;
                    break;
            }
            int horamili = Integer.parseInt(hhmmss.format(fechaSystem) + Stringsss);
            int fzafsis = Integer.parseInt((String)(Object)aaaammdd.format(fechaSystem));
            MyHelperClass sessioEjb = new MyHelperClass();
            logLopdBZMODIF("UPDATE", sessioEjb.getCallerPrincipal().getName().toUpperCase(), fzafsis, horamili, 'S', numeroRegistro, anoSalida, oficina, Integer.parseInt((String)(Object)fechaModificacion), Integer.parseInt((String)(Object)horaModificacion));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            visado = false;
            try {
                if (conn != null) conn.rollback(); else System.out.println("ERROR: No es pot fer rollback sense connexió!");
            } catch (Exception ex) {
                System.out.println("Error: " + e.getMessage());
                ex.printStackTrace();
            }
        } finally {
            MyHelperClass ToolsBD = new MyHelperClass();
            ToolsBD.closeConn(conn, ps, null);
        }
        return visado;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeConn(Connection o0, PreparedStatement o1, Object o2){ return null; }
	public MyHelperClass getCallerPrincipal(){ return null; }
	public MyHelperClass getConn(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DateFormat {

public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class ValoresHome {

public MyHelperClass create(){ return null; }}

class Valores {

public MyHelperClass recuperaRemitenteCastellano(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass remove(){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}
