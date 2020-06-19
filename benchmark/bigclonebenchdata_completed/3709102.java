
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3709102 {
public MyHelperClass connection;
	public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

    public void removerTopicos(Topicos topicos) throws ClassNotFoundException, SQLException {
        this.criaConexao(false);
        String sql = "DELETE FROM \"Topicos\"    " + "      WHERE \"id_Topicos\" =  ?";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            stmt.setString(1, topicos.getIdTopicos());
            stmt.executeUpdate();
            connection.commit();
        } catch (UncheckedIOException e) {
            connection.rollback();
            throw e;
        } finally {
            try {
                stmt.close();
                this.fechaConexao();
            } catch (UncheckedIOException e) {
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Topicos {

public MyHelperClass getIdTopicos(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
