
import java.io.UncheckedIOException;


class c6644760 {
public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

//    @Override
    public void incluir(Cliente cliente) throws Exception {
        Connection connection =(Connection)(Object) criaConexao(false);
        String sql = "insert into cliente select nextval('sq_cliente') as cod_cliente, ? as nome,  ? as sexo, ?";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSexo());
            stmt.setInt(3, cliente.getCidade().getCodCidade());
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
                this.fechaConexao();
            } catch (UncheckedIOException e) {
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodCidade(){ return null; }}

class Cliente {

public MyHelperClass getNome(){ return null; }
	public MyHelperClass getCidade(){ return null; }
	public MyHelperClass getSexo(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
