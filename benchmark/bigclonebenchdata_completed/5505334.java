
import java.io.UncheckedIOException;


class c5505334 {

    public void candidatarAtividade(Atividade atividade) throws SQLException {
        Connection conn = null;
        String insert = "insert into Atividade_has_recurso_humano " + "(atividade_idatividade, usuario_idusuario, ativo) " + "values " + "(" + atividade.getIdAtividade() + ", " + "" + atividade.getRecursoHumano().getIdUsuario() + ", " + "'false')";
        try {
            MyHelperClass connectionFactory = new MyHelperClass();
            conn =(Connection)(Object) connectionFactory.getConnection(true);
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            Integer result =(Integer)(Object) stmt.executeUpdate(insert);
            conn.commit();
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getIdUsuario(){ return null; }
	public MyHelperClass getConnection(boolean o0){ return null; }}

class Atividade {

public MyHelperClass getRecursoHumano(){ return null; }
	public MyHelperClass getIdAtividade(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
