import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22447616 {

    public Usuario insertUsuario(IUsuario usuario) throws Throwable, SQLException {
        Connection conn = null;
        String insert = "insert into Usuario (idusuario, nome, email, telefone, cpf, login, senha) " + "values " + "(nextval('seq_usuario'), '" + usuario.getNome() + "', '" + usuario.getEmail() + "', " + "'" + usuario.getTelefone() + "', '" + usuario.getCpf() + "', '" + usuario.getLogin() + "', '" + usuario.getSenha() + "')";
        try {
            MyHelperClass connectionFactory = new MyHelperClass();
            conn =(Connection)(Object) connectionFactory.getConnection(true);
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            Integer result =(Integer)(Object) stmt.executeUpdate(insert);
            if (result == 1) {
                String sqlSelect = "select last_value from seq_usuario";
                ResultSet rs =(ResultSet)(Object) stmt.executeQuery(sqlSelect);
                while ((boolean)(Object)rs.next()) {
                    usuario.setIdUsuario(rs.getInt("last_value"));
                }
                if ((Requerente)(Object)usuario instanceof Requerente) {
                    RequerenteDAO requerenteDAO = new RequerenteDAO();
                    requerenteDAO.insertRequerente((Requerente)(Requerente)(Object) usuario, conn);
                } else if ((RecursoHumano)(Object)usuario instanceof RecursoHumano) {
                    RecursoHumanoDAO recursoHumanoDAO = new RecursoHumanoDAO();
                    recursoHumanoDAO.insertRecursoHumano((RecursoHumano)(RecursoHumano)(Object) usuario, conn);
                }
            }
            conn.commit();
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.close();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(boolean o0){ return null; }}

class IUsuario {

public MyHelperClass setIdUsuario(MyHelperClass o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getSenha(){ return null; }
	public MyHelperClass getLogin(){ return null; }
	public MyHelperClass getCpf(){ return null; }}

class Usuario {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}

class Requerente {

}

class RequerenteDAO {

public MyHelperClass insertRequerente(Requerente o0, Connection o1){ return null; }}

class RecursoHumano {

}

class RecursoHumanoDAO {

public MyHelperClass insertRecursoHumano(RecursoHumano o0, Connection o1){ return null; }}
