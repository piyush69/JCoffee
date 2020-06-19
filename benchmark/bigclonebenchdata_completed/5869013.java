
import java.io.UncheckedIOException;


class c5869013 {

    public Leilao insertLeilao(Leilao leilao) throws SQLException {
        Connection conn = null;
        String insert = "insert into Leilao (idleilao, atividade_idatividade, datainicio, datafim) " + "values " + "(nextval('seq_leilao'), " + leilao.getAtividade().getIdAtividade() + ", '" + leilao.getDataInicio() + "', '" + leilao.getDataFim() + "')";
        try {
            MyHelperClass connectionFactory = new MyHelperClass();
            conn =(Connection)(Object) connectionFactory.getConnection(true);
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            Integer result =(Integer)(Object) stmt.executeUpdate(insert);
            if (result == 1) {
                String sqlSelect = "select last_value from seq_leilao";
                ResultSet rs =(ResultSet)(Object) stmt.executeQuery(sqlSelect);
                while ((boolean)(Object)rs.next()) {
                    leilao.setIdLeilao(rs.getInt("last_value"));
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
	public MyHelperClass getIdAtividade(){ return null; }}

class Leilao {

public MyHelperClass getDataFim(){ return null; }
	public MyHelperClass setIdLeilao(MyHelperClass o0){ return null; }
	public MyHelperClass getAtividade(){ return null; }
	public MyHelperClass getDataInicio(){ return null; }}

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
