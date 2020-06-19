
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19963744 {

    public void atualizarLivro(LivroBean livro) {
        PreparedStatement pstmt = null;
        String sql = "update livro " + "set " + "isbn = ?, " + "autor = ?, " + "editora = ?, " + "edicao = ?, " + "titulo = ? " + "where " + "isbn = ?";
        try {
            MyHelperClass connection = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            pstmt.setString(1, livro.getISBN());
            pstmt.setString(2, livro.getAutor());
            pstmt.setString(3, livro.getEditora());
            pstmt.setString(4, livro.getEdicao());
            pstmt.setString(5, livro.getTitulo());
            pstmt.executeUpdate();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException ex1) {
                throw new RuntimeException("Erro ao tentar atualizar livro.", ex1);
            }
            throw new RuntimeException("Erro ao tentar atualizar livro.", ex);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                MyHelperClass connection = new MyHelperClass();
                if (connection != null) {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.close();
                }
            } catch (UncheckedIOException ex) {
                throw new RuntimeException("Erro ao tentar atualizar livro.", ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class LivroBean {

public MyHelperClass getISBN(){ return null; }
	public MyHelperClass getEdicao(){ return null; }
	public MyHelperClass getEditora(){ return null; }
	public MyHelperClass getTitulo(){ return null; }
	public MyHelperClass getAutor(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
