
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19875964 {
public MyHelperClass LOG;
	public MyHelperClass Level;
	public MyHelperClass fechaConexao(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass criaConexao(boolean o0){ return null; }

//    @Override
    public void update(DisciplinaDTO disciplina) {
        try {
            this.criaConexao(false);
        } catch (UncheckedIOException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        } catch (ArithmeticException ex) {
            java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
        }
        LOG.debug("Criou a conex�o!");
        String sql = "update Disciplina set nome = ? where id = ?";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) this.getConnection().prepareStatement(sql);
            LOG.debug("PreparedStatement criado com sucesso!");
            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getId());
            int retorno =(int)(Object) stmt.executeUpdate();
            if (retorno == 0) {
                this.getConnection().rollback();
                throw new SQLException("Ocorreu um erro inesperado no momento de alterar dados de Revendedor no banco!");
            }
            LOG.debug("Confirmando as altera��es no banco.");
            this.getConnection().commit();
        } catch (SQLException e) {
            LOG.debug("Desfazendo as altera��es no banco.");
            try {
                this.getConnection().rollback();
            } catch (UncheckedIOException ex) {
                java.util.logging.Logger.getLogger(PostgresqlDisciplinaDAO.class.getName()).log((java.util.logging.Level)(Object)(Level)(Object)Level.SEVERE, null, ex);
            }
            LOG.debug("Lan�ando a exce��o da camada de persist�ncia.");
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
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class DisciplinaDTO {

public MyHelperClass getNome(){ return null; }
	public MyHelperClass getId(){ return null; }}

class PostgresqlDisciplinaDAO {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class Level {

}
