
import java.io.UncheckedIOException;


class c22366505 {
public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

//    @Override
    public void incluir(Igreja igreja) throws Exception {
        Connection connection =(Connection)(Object) criaConexao(false);
        String sql = "insert into igreja ? as idlocal, ? as possui_salao;";
        String sql2 = "SELECT MAX(idlocal) FROM Local";
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        try {
            stmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            stmt2 =(PreparedStatement)(Object) connection.prepareStatement(sql2);
            rs =(ResultSet)(Object) stmt2.executeQuery();
            stmt.setInt(1, rs.getInt("max"));
            stmt.setBoolean(2, igreja.getPossuiSalao());
            int retorno =(int)(Object) stmt.executeUpdate();
            if (retorno == 0) {
                connection.rollback();
                throw new SQLException("Ocorreu um erro inesperado no momento de inserir dados de cliente no banco!");
            }
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            try {
                stmt.close();
                stmt2.close();
                rs.close();
                this.fechaConexao();
            } catch (UncheckedIOException e) {
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Igreja {

public MyHelperClass getPossuiSalao(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
