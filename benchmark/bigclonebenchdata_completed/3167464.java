
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3167464 {
public MyHelperClass connection;

    public void adicionaCliente(ClienteBean cliente) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "insert into cliente(nome,cpf,telefone,cursoCargo,bloqueado,ativo,tipo) values(?,?,?,?,?,?,?)";
        try {
            MyHelperClass Statement = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCPF());
            pstmt.setString(3, cliente.getTelefone());
            pstmt.setString(4, cliente.getCursoCargo());
            pstmt.setString(5, cliente.getBloqueado());
            pstmt.setString(6, cliente.getAtivo());
            pstmt.setString(7, cliente.getTipo());
            pstmt.executeUpdate();
            rs =(ResultSet)(Object) pstmt.getGeneratedKeys();
            if ((boolean)(Object)rs.next()) {
                cliente.setIdCliente(rs.getLong(1));
            }
            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException ex1) {
                throw new RuntimeException("Erro ao inserir cliente.", ex1);
            }
            throw new RuntimeException("Erro ao inserir cliente.", ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (UncheckedIOException ex) {
                throw new RuntimeException("Ocorreu um erro no banco de dados.", ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RETURN_GENERATED_KEYS;
public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass rollback(){ return null; }}

class ClienteBean {

public MyHelperClass getTipo(){ return null; }
	public MyHelperClass getCursoCargo(){ return null; }
	public MyHelperClass setIdCliente(MyHelperClass o0){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getBloqueado(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getAtivo(){ return null; }
	public MyHelperClass getCPF(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
