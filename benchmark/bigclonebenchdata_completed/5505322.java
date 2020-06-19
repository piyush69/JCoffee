
import java.io.UncheckedIOException;


class c5505322 {

    public Atividade insertAtividade(Atividade atividade) throws SQLException {
        Connection conn = null;
        String insert = "insert into Atividade (idatividade, requerente_idrequerente, datacriacao, datatermino, valor, tipoatividade, descricao, fase_idfase, estado) " + "values " + "(nextval('seq_atividade'), " + atividade.getRequerente().getIdRequerente() + ", " + "'" + atividade.getDataCriacao() + "', '" + atividade.getDataTermino() + "', '" + atividade.getValor() + "', '" + atividade.getTipoAtividade().getIdTipoAtividade() + "', '" + atividade.getDescricao() + "', " + atividade.getFaseIdFase() + ", " + atividade.getEstado() + ")";
        try {
            MyHelperClass connectionFactory = new MyHelperClass();
            conn =(Connection)(Object) connectionFactory.getConnection(true);
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            Integer result =(Integer)(Object) stmt.executeUpdate(insert);
            if (result == 1) {
                String sqlSelect = "select last_value from seq_atividade";
                ResultSet rs =(ResultSet)(Object) stmt.executeQuery(sqlSelect);
                while ((boolean)(Object)rs.next()) {
                    atividade.setIdAtividade(rs.getInt("last_value"));
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

public MyHelperClass getConnection(boolean o0){ return null; }
	public MyHelperClass getIdTipoAtividade(){ return null; }
	public MyHelperClass getIdRequerente(){ return null; }}

class Atividade {

public MyHelperClass getFaseIdFase(){ return null; }
	public MyHelperClass getDataTermino(){ return null; }
	public MyHelperClass getDescricao(){ return null; }
	public MyHelperClass getTipoAtividade(){ return null; }
	public MyHelperClass getEstado(){ return null; }
	public MyHelperClass setIdAtividade(MyHelperClass o0){ return null; }
	public MyHelperClass getDataCriacao(){ return null; }
	public MyHelperClass getValor(){ return null; }
	public MyHelperClass getRequerente(){ return null; }}

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

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}
