import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20696809 {

    public static boolean insereLicao(final Connection con, Licao lic, Autor aut, Descricao desc)  throws Throwable {
        try {
            con.setAutoCommit(false);
            Statement smt =(Statement)(Object) con.createStatement();
            if ((int)(Object)aut.getCodAutor() == 0) {
                MyHelperClass GeraID = new MyHelperClass();
                GeraID.gerarCodAutor(con, aut);
                smt.executeUpdate("INSERT INTO autor VALUES(" + aut.getCodAutor() + ",'" + aut.getNome() + "','" + aut.getEmail() + "')");
            }
            MyHelperClass GeraID = new MyHelperClass();
            GeraID.gerarCodDescricao(con, desc);
//            MyHelperClass GeraID = new MyHelperClass();
            GeraID.gerarCodLicao(con, lic);
            String titulo =(String)(Object) lic.getTitulo().replaceAll("['\"]", "");
            String coment =(String)(Object) lic.getComentario().replaceAll("[']", "\"");
            String texto =(String)(Object) desc.getTexto().replaceAll("[']", "\"");
            smt.executeUpdate("INSERT INTO descricao VALUES(" + desc.getCodDesc() + ",'" + texto + "')");
            smt.executeUpdate("INSERT INTO licao VALUES(" + lic.getCodigo() + ",'" + titulo + "','" + coment + "'," + desc.getCodDesc() + ")");
            smt.executeUpdate("INSERT INTO lic_aut VALUES(" + lic.getCodigo() + "," + aut.getCodAutor() + ")");
            con.commit();
            return (true);
        } catch (SQLException e) {
            try {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Rolling back transaction", "LICAO: Database error", JOptionPane.ERROR_MESSAGE);
                con.rollback();
            } catch (SQLException e1) {
                System.err.print(e1.getSQLState());
            }
            return (false);
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException e2) {
                System.err.print(e2.getSQLState());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass gerarCodLicao(Connection o0, Licao o1){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass gerarCodDescricao(Connection o0, Descricao o1){ return null; }
	public MyHelperClass gerarCodAutor(Connection o0, Autor o1){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Licao {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getComentario(){ return null; }
	public MyHelperClass getTitulo(){ return null; }}

class Autor {

public MyHelperClass getNome(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getCodAutor(){ return null; }}

class Descricao {

public MyHelperClass getCodDesc(){ return null; }
	public MyHelperClass getTexto(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
