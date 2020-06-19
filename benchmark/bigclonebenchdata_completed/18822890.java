import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18822890 {
public MyHelperClass ToolsBD;
	public MyHelperClass comentario;
	public MyHelperClass NULL;
	public MyHelperClass comentarioNuevo;
	public MyHelperClass convierteEntidadCastellano(MyHelperClass o0, Connection o1){ return null; }
public MyHelperClass datasalida;
	public MyHelperClass errores;
	public MyHelperClass dateF;
	public MyHelperClass horaF;
	public MyHelperClass data;
	public MyHelperClass hora;
	public MyHelperClass validar(){ return null; }

    public void actualizar() throws Throwable, SQLException, ClassNotFoundException, Exception {
        Connection conn = null;
        PreparedStatement ms = null;
        MyHelperClass validado = new MyHelperClass();
        if (!(Boolean)(Object)validado) {
//            MyHelperClass validado = new MyHelperClass();
            validado = validar();
        }
//        MyHelperClass validado = new MyHelperClass();
        if (!(Boolean)(Object)validado) {
            throw new Exception("No s'ha realitzat la validació de les dades del registre ");
        }
        boolean registroActualizado =(boolean)(Object) NULL; //new boolean();
        registroActualizado = false;
        try {
            int fzaanoe;
            String campo;
            MyHelperClass fechaTest = new MyHelperClass();
            fechaTest = dateF.parse(datasalida);
            Calendar cal = Calendar.getInstance();
//            MyHelperClass fechaTest = new MyHelperClass();
            cal.setTime((Date)(Object)fechaTest);
            DateFormat date1 =(DateFormat)(Object) new SimpleDateFormat("yyyyMMdd");
            MyHelperClass anoSalida = new MyHelperClass();
            fzaanoe = Integer.parseInt((String)(Object)anoSalida);
//            MyHelperClass fechaTest = new MyHelperClass();
            int fzafent = Integer.parseInt((String)(Object)date1.format(fechaTest));
            MyHelperClass ToolsBD = new MyHelperClass();
            conn =(Connection)(Object) ToolsBD.getConn();
            conn.setAutoCommit(false);
            MyHelperClass numeroSalida = new MyHelperClass();
            int fzanume = Integer.parseInt((String)(Object)numeroSalida);
            MyHelperClass oficina = new MyHelperClass();
            int fzacagc = Integer.parseInt((String)(Object)oficina);
            int off_codi = 0;
            try {
                MyHelperClass oficinafisica = new MyHelperClass();
                off_codi = Integer.parseInt((String)(Object)oficinafisica);
            } catch (Exception e) {
            }
//            MyHelperClass fechaTest = new MyHelperClass();
            fechaTest = dateF.parse(data);
//            MyHelperClass fechaTest = new MyHelperClass();
            cal.setTime((Date)(Object)fechaTest);
//            MyHelperClass fechaTest = new MyHelperClass();
            int fzafdoc = Integer.parseInt((String)(Object)date1.format(fechaTest));
            String fzacone, fzacone2;
            MyHelperClass idioex = new MyHelperClass();
            if (idioex.equals("1")) {
                MyHelperClass comentario = new MyHelperClass();
                fzacone =(String)(Object) comentario;
                fzacone2 = "";
            } else {
                fzacone = "";
                MyHelperClass comentario = new MyHelperClass();
                fzacone2 =(String)(Object) comentario;
            }
            String fzaproce;
            int fzactagg, fzacagge;
            MyHelperClass fora = new MyHelperClass();
            if (fora.equals("")) {
                fzactagg = 90;
                MyHelperClass balears = new MyHelperClass();
                fzacagge = Integer.parseInt((String)(Object)balears);
                fzaproce = "";
            } else {
//                MyHelperClass fora = new MyHelperClass();
                fzaproce =(String)(Object) fora;
                fzactagg = 0;
                fzacagge = 0;
            }
            int ceros = 0;
            MyHelperClass remitent = new MyHelperClass();
            int fzacorg = Integer.parseInt((String)(Object)remitent);
            int fzanent;
            String fzacent;
            MyHelperClass altres = new MyHelperClass();
            if (altres.equals("")) {
//                MyHelperClass altres = new MyHelperClass();
                altres =(MyHelperClass)(Object) "";
                MyHelperClass entidad2 = new MyHelperClass();
                fzanent = Integer.parseInt((String)(Object)entidad2);
                MyHelperClass entidadCastellano = new MyHelperClass();
                fzacent =(String)(Object) entidadCastellano;
            } else {
                fzanent = 0;
                fzacent = "";
            }
//            MyHelperClass idioex = new MyHelperClass();
            int fzacidi = Integer.parseInt((String)(Object)idioex);
            MyHelperClass horaTest = new MyHelperClass();
            horaTest = horaF.parse(hora);
//            MyHelperClass horaTest = new MyHelperClass();
            cal.setTime((Date)(Object)horaTest);
            DateFormat hhmm =(DateFormat)(Object) new SimpleDateFormat("HHmm");
//            MyHelperClass horaTest = new MyHelperClass();
            int fzahora = Integer.parseInt((String)(Object)hhmm.format(horaTest));
            MyHelperClass entrada1 = new MyHelperClass();
            if (entrada1.equals("")) {
//                MyHelperClass entrada1 = new MyHelperClass();
                entrada1 =(MyHelperClass)(Object) "0";
            }
            MyHelperClass entrada2 = new MyHelperClass();
            if (entrada2.equals("")) {
//                MyHelperClass entrada2 = new MyHelperClass();
                entrada2 =(MyHelperClass)(Object) "0";
            }
//            MyHelperClass entrada1 = new MyHelperClass();
            int fzanloc = Integer.parseInt((String)(Object)entrada1);
//            MyHelperClass entrada2 = new MyHelperClass();
            int fzaaloc = Integer.parseInt((String)(Object)entrada2);
            MyHelperClass disquet = new MyHelperClass();
            if (disquet.equals("")) {
//                MyHelperClass disquet = new MyHelperClass();
                disquet =(MyHelperClass)(Object) "0";
            }
//            MyHelperClass disquet = new MyHelperClass();
            int fzandis = Integer.parseInt((String)(Object)disquet);
            if (fzandis > 0) {
//                MyHelperClass oficina = new MyHelperClass();
                ToolsBD.actualizaDisqueteEntrada(conn, fzandis, oficina, anoSalida, errores);
            }
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
            MyHelperClass correo = new MyHelperClass();
            if (correo != null) {
                String insertBZNCORR = "INSERT INTO BZNCORR (FZPCENSA, FZPCAGCO, FZPANOEN, FZPNUMEN, FZPNCORR)" + "VALUES (?,?,?,?,?)";
                String updateBZNCORR = "UPDATE BZNCORR SET FZPNCORR=? WHERE FZPCENSA=? AND FZPCAGCO=? AND FZPANOEN=? AND FZPNUMEN=?";
                String deleteBZNCORR = "DELETE FROM BZNCORR WHERE FZPCENSA=? AND FZPCAGCO=? AND FZPANOEN=? AND FZPNUMEN=?";
                int actualizados = 0;
//                MyHelperClass correo = new MyHelperClass();
                if (!correo.trim().equals("")) {
                    ms =(PreparedStatement)(Object) conn.prepareStatement(updateBZNCORR);
//                    MyHelperClass correo = new MyHelperClass();
                    ms.setString(1, correo);
                    ms.setString(2, "S");
                    ms.setInt(3, fzacagc);
                    ms.setInt(4, fzaanoe);
                    ms.setInt(5, fzanume);
                    actualizados =(int)(Object) ms.executeUpdate();
                    ms.close();
                    if (actualizados == 0) {
                        ms =(PreparedStatement)(Object) conn.prepareStatement(insertBZNCORR);
                        ms.setString(1, "S");
                        ms.setInt(2, fzacagc);
                        ms.setInt(3, fzaanoe);
                        ms.setInt(4, fzanume);
//                        MyHelperClass correo = new MyHelperClass();
                        ms.setString(5, correo);
                        ms.execute();
                        ms.close();
                    }
                } else {
                    ms =(PreparedStatement)(Object) conn.prepareStatement(deleteBZNCORR);
                    ms.setString(1, "S");
                    ms.setInt(2, fzacagc);
                    ms.setInt(3, fzaanoe);
                    ms.setInt(4, fzanume);
                    ms.execute();
                }
            }
            String deleteOfifis = "DELETE FROM BZSALOFF WHERE FOSANOEN=? AND FOSNUMEN=? AND FOSCAGCO=?";
            ms =(PreparedStatement)(Object) conn.prepareStatement(deleteOfifis);
            ms.setInt(1, fzaanoe);
            ms.setInt(2, fzanume);
            ms.setInt(3, fzacagc);
            ms.execute();
            ms.close();
            String insertOfifis = "INSERT INTO BZSALOFF (FOSANOEN, FOSNUMEN, FOSCAGCO, OFS_CODI)" + "VALUES (?,?,?,?)";
            ms =(PreparedStatement)(Object) conn.prepareStatement(insertOfifis);
            ms.setInt(1, fzaanoe);
            ms.setInt(2, fzanume);
            ms.setInt(3, fzacagc);
            ms.setInt(4, off_codi);
            ms.execute();
            ms.close();
            ms =(PreparedStatement)(Object) conn.prepareStatement("UPDATE BZSALIDA SET FZSFDOCU=?, FZSREMIT=?, FZSCONEN=?, FZSCTIPE=?, " + "FZSCEDIE=?, FZSENULA=?, FZSPROCE=?, FZSFENTR=?, FZSCTAGG=?, FZSCAGGE=?, FZSCORGA=?, " + "FZSCENTI=?, FZSNENTI=?, FZSHORA=?, FZSCIDIO=?, FZSCONE2=?, FZSNLOC=?, FZSALOC=?, FZSNDIS=?, " + "FZSCUSU=?, FZSCIDI=? WHERE FZSANOEN=? AND FZSNUMEN=? AND FZSCAGCO=? ");
            ms.setInt(1, fzafdoc);
//            MyHelperClass altres = new MyHelperClass();
            ms.setString(2, ((int)(Object)altres.length() > 30) ? altres.substring(0, 30) : altres);
            ms.setString(3, (fzacone.length() > 160) ? fzacone.substring(0, 160) : fzacone);
            MyHelperClass tipo = new MyHelperClass();
            ms.setString(4, ((int)(Object)tipo.length() > 2) ? tipo.substring(0, 1) : tipo);
            ms.setString(5, "N");
            MyHelperClass registroAnulado = new MyHelperClass();
            ms.setString(6, ((int)(Object)registroAnulado.length() > 1) ? registroAnulado.substring(0, 1) : registroAnulado);
            ms.setString(7, (fzaproce.length() > 25) ? fzaproce.substring(0, 25) : fzaproce);
            ms.setInt(8, fzafent);
            ms.setInt(9, fzactagg);
            ms.setInt(10, fzacagge);
            ms.setInt(11, fzacorg);
            ms.setString(12, (fzacent.length() > 7) ? fzacent.substring(0, 8) : fzacent);
            ms.setInt(13, fzanent);
            ms.setInt(14, fzahora);
            ms.setInt(15, fzacidi);
            ms.setString(16, (fzacone2.length() > 160) ? fzacone2.substring(0, 160) : fzacone2);
            ms.setInt(17, fzanloc);
            ms.setInt(18, fzaaloc);
            ms.setInt(19, fzandis);
            MyHelperClass usuario = new MyHelperClass();
            ms.setString(20, ((int)(Object)usuario.toUpperCase().length() > 10) ? usuario.toUpperCase().substring(0, 10) : usuario.toUpperCase());
            MyHelperClass idioma = new MyHelperClass();
            ms.setString(21, idioma);
            ms.setInt(22, fzaanoe);
            ms.setInt(23, fzanume);
            ms.setInt(24, fzacagc);
            boolean modificado = false;
            MyHelperClass motivo = new MyHelperClass();
            if (!motivo.equals("")) {
                javax.naming.InitialContext contexto = new javax.naming.InitialContext();
                Object ref = contexto.lookup("es.caib.regweb.RegistroModificadoSalidaHome");
                RegistroModificadoSalidaHome home = (RegistroModificadoSalidaHome) javax.rmi.PortableRemoteObject.narrow(ref, RegistroModificadoSalidaHome.class);
                RegistroModificadoSalida registroModificado =(RegistroModificadoSalida)(Object) home.create();
                registroModificado.setAnoSalida(fzaanoe);
                registroModificado.setOficina(fzacagc);
                MyHelperClass entidad1Nuevo = new MyHelperClass();
                if (!entidad1Nuevo.trim().equals("")) {
                    MyHelperClass entidad2Nuevo = new MyHelperClass();
                    if (entidad2Nuevo.equals("")) {
//                        MyHelperClass entidad2Nuevo = new MyHelperClass();
                        entidad2Nuevo =(MyHelperClass)(Object) "0";
                    }
                }
                int fzanentNuevo;
                String fzacentNuevo;
                MyHelperClass altresNuevo = new MyHelperClass();
                if (altresNuevo.trim().equals("")) {
//                    MyHelperClass altresNuevo = new MyHelperClass();
                    altresNuevo =(MyHelperClass)(Object) "";
                    MyHelperClass entidad2Nuevo = new MyHelperClass();
                    fzanentNuevo = Integer.parseInt((String)(Object)entidad2Nuevo);
//                    MyHelperClass entidad1Nuevo = new MyHelperClass();
                    fzacentNuevo =(String)(Object) convierteEntidadCastellano(entidad1Nuevo, conn);
                } else {
                    fzanentNuevo = 0;
                    fzacentNuevo = "";
                }
                if (!fzacentNuevo.equals(fzacent) || fzanentNuevo != fzanent) {
                    registroModificado.setEntidad2(fzanentNuevo);
                    registroModificado.setEntidad1(fzacentNuevo);
                } else {
                    registroModificado.setEntidad2(0);
                    registroModificado.setEntidad1("");
                }
                MyHelperClass comentario = new MyHelperClass();
                if (!comentarioNuevo.trim().equals(comentario.trim())) {
                    MyHelperClass comentarioNuevo = new MyHelperClass();
                    registroModificado.setExtracto(comentarioNuevo);
                } else {
                    registroModificado.setExtracto("");
                }
//                MyHelperClass usuario = new MyHelperClass();
                registroModificado.setUsuarioModificacion(usuario.toUpperCase());
                registroModificado.setNumeroRegistro(fzanume);
//                MyHelperClass altres = new MyHelperClass();
                if (altresNuevo.equals(altres)) {
                    registroModificado.setRemitente("");
                } else {
//                    MyHelperClass altresNuevo = new MyHelperClass();
                    registroModificado.setRemitente(altresNuevo);
                }
//                MyHelperClass motivo = new MyHelperClass();
                registroModificado.setMotivo(motivo);
                modificado =(boolean)(Object) registroModificado.generarModificacion(conn);
                registroModificado.remove();
            }
            if ((modificado && !motivo.equals("")) || motivo.equals("")) {
                int afectados =(int)(Object) ms.executeUpdate();
                if (afectados > 0) {
                    registroActualizado = true;
                } else {
                    registroActualizado = false;
                }
                String remitente = "";
                if (!altres.trim().equals("")) {
                    remitente =(String)(Object) altres;
                } else {
                    javax.naming.InitialContext contexto = new javax.naming.InitialContext();
                    Object ref = contexto.lookup("es.caib.regweb.ValoresHome");
                    ValoresHome home = (ValoresHome) javax.rmi.PortableRemoteObject.narrow(ref, ValoresHome.class);
                    Valores valor =(Valores)(Object) home.create();
                    remitente =(String)(Object) valor.recuperaRemitenteCastellano(fzacent, fzanent + "");
                    valor.remove();
                }
                try {
                    Class t = Class.forName("es.caib.regweb.module.PluginHook");
                    Class[] partypes = { String.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class, Integer.class, String.class };
                    Object[] params = { "M", new Integer(fzaanoe), new Integer(fzanume), new Integer(fzacagc), new Integer(fzafdoc), remitente, comentario, tipo, new Integer(fzafent), new Integer(fzacagge), fzaproce, new Integer(fzacorg), idioma };
                    java.lang.reflect.Method metodo = t.getMethod("salida", partypes);
                    metodo.invoke(null, params);
                } catch (IllegalAccessException iae) {
                } catch (IllegalArgumentException iae) {
                } catch (InvocationTargetException ite) {
                } catch (NullPointerException npe) {
                } catch (ExceptionInInitializerError eiie) {
                } catch (NoSuchMethodException nsme) {
                } catch (SecurityException se) {
                } catch (LinkageError le) {
                } catch (ClassNotFoundException le) {
                }
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
                logLopdBZSALIDA("UPDATE", ((int)(Object)usuario.toUpperCase().length() > 10) ? usuario.toUpperCase().substring(0, 10) : usuario.toUpperCase(), fzahsis, horamili, fzanume, fzaanoe, fzacagc);
                conn.commit();
            } else {
                registroActualizado = false;
                errores.put("", "Error inesperat, no s'ha modificat el registre");
                throw new RemoteException("Error inesperat, no s'ha modifcat el registre");
            }
        } catch (Exception ex) {
            System.out.println("Error inesperat " + ex.getMessage());
            ex.printStackTrace();
            registroActualizado = false;
            errores.put("", "Error inesperat, no s'ha modificat el registre" + ": " + ex.getClass() + "->" + ex.getMessage());
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException sqle) {
                throw new RemoteException("S'ha produ\357t un error i no s'han pogut tornar enrere els canvis efectuats", sqle);
            }
            throw new RemoteException("Error inesperat, no s'ha modifcat el registre", ex);
        } finally {
            ToolsBD.closeConn(conn, ms, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass closeConn(Connection o0, PreparedStatement o1, Object o2){ return null; }
	public MyHelperClass getConn(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass toUpperCase(){ return null; }
	public MyHelperClass actualizaDisqueteEntrada(Connection o0, int o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class DateFormat {

public MyHelperClass format(MyHelperClass o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}}

class RegistroModificadoSalidaHome {

public MyHelperClass create(){ return null; }}

class RegistroModificadoSalida {

public MyHelperClass setEntidad2(int o0){ return null; }
	public MyHelperClass setEntidad1(String o0){ return null; }
	public MyHelperClass generarModificacion(Connection o0){ return null; }
	public MyHelperClass remove(){ return null; }
	public MyHelperClass setUsuarioModificacion(MyHelperClass o0){ return null; }
	public MyHelperClass setRemitente(MyHelperClass o0){ return null; }
	public MyHelperClass setRemitente(String o0){ return null; }
	public MyHelperClass setOficina(int o0){ return null; }
	public MyHelperClass setNumeroRegistro(int o0){ return null; }
	public MyHelperClass setMotivo(MyHelperClass o0){ return null; }
	public MyHelperClass setExtracto(MyHelperClass o0){ return null; }
	public MyHelperClass setAnoSalida(int o0){ return null; }
	public MyHelperClass setExtracto(String o0){ return null; }}

class ValoresHome {

public MyHelperClass create(){ return null; }}

class Valores {

public MyHelperClass remove(){ return null; }
	public MyHelperClass recuperaRemitenteCastellano(String o0, String o1){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
	RemoteException(String o0, Exception o1){}
	RemoteException(String o0, SQLException o1){}
	RemoteException(){}
}
