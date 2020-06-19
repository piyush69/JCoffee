
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19875962 {
public MyHelperClass Level;
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

//    @Override
    public void create(DisciplinaDTO disciplina) {
        try {
            this.criaConexao(false);
        } catch (UncheckedIOException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        } catch (ArithmeticException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        }
        String sql = "insert into Disciplina select nextval('sq_Disciplina') as id, ? as nome";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) this.getConnection().prepareStatement(sql);
            stmt.setString(1, disciplina.getNome());
            int retorno =(int)(Object) stmt.executeUpdate();
            if (retorno == 0) {
                this.getConnection().rollback();
                throw new SQLException("Ocorreu um erro inesperado no momento de inserir dados de Disciplina no banco!");
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

class DisciplinaDTO {

public MyHelperClass getNome(){ return null; }}

class PostgresqlDisciplinaDAO {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Level {

}
