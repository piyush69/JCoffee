
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3167465 {

    public void excluirCliente(String cpf) {
        PreparedStatement pstmt = null;
        String sql = "delete from cliente where cpf = ?";
        try {
            MyHelperClass connection = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            pstmt.setString(1, cpf);
            pstmt.executeUpdate();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException ex1) {
                throw new RuntimeException("Erro ao exclir ciente.", ex1);
            }
            throw new RuntimeException("Erro ao excluir cliente.", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
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

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
