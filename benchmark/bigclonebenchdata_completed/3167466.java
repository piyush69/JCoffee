
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3167466 {

    public void alterarCliente(ClienteBean cliente, String cpf) {
        PreparedStatement pstmt = null;
        String sql = "UPDATE cliente SET nome = ?," + "cpf = ?," + "telefone = ?," + "cursoCargo = ?," + "bloqueado = ?," + "ativo = ?," + "tipo = ? WHERE cpf = ?";
        try {
            MyHelperClass connection = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            pstmt.setString(1,(String)(Object) cliente.getNome());
            pstmt.setString(2,(String)(Object) cliente.getCPF());
            pstmt.setString(3,(String)(Object) cliente.getTelefone());
            pstmt.setString(4,(String)(Object) cliente.getCursoCargo());
            pstmt.setString(5,(String)(Object) cliente.getBloqueado());
            pstmt.setString(6,(String)(Object) cliente.getAtivo());
            pstmt.setString(7,(String)(Object) cliente.getTipo());
            pstmt.setString(8, cpf);
            pstmt.executeUpdate();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException ex1) {
                throw new RuntimeException("Erro ao atualizar cliente.", ex1);
            }
            throw new RuntimeException("Erro ao atualizar cliente.", ex);
        } finally {
            try {
                if (pstmt != null) pstmt.close();
            } catch (UncheckedIOException ex) {
                throw new RuntimeException("Ocorreu um erro no banco de dados.", ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class ClienteBean {

public MyHelperClass getTipo(){ return null; }
	public MyHelperClass getCursoCargo(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getBloqueado(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getAtivo(){ return null; }
	public MyHelperClass getCPF(){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
