
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19875963 {
public MyHelperClass Level;
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

//    @Override
    public void remove(int disciplinaId) {
        try {
            this.criaConexao(false);
        } catch (UncheckedIOException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        } catch (ArithmeticException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        }
        String sql = "delete from Disciplina where id = ?";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) this.getConnection().prepareStatement(sql);
            stmt.setInt(1, disciplinaId);
            int retorno =(int)(Object) stmt.executeUpdate();
            if (retorno == 0) {
                this.getConnection().rollback();
                throw new SQLException("Ocorreu um erro inesperado no momento de remover dados de Revendedor no banco!");
            }
            this.getConnection().commit();
        } catch (SQLException e) {
            try {
                this.getConnection().rollback();
            } catch (UncheckedIOException ex) {
                java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
            }
            try {
                throw e;
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
            }
        } finally {
            try {
                stmt.close();
                this.fechaConexao();
            } catch (UncheckedIOException e) {
                try {
                    throw e;
                } catch (UncheckedIOException ex) {
                    java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PostgresqlDisciplinaDAO {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Level {

}
