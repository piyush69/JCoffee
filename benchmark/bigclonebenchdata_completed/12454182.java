
import java.io.UncheckedIOException;


class c12454182 {

    public void excluirTopico(Integer idDisciplina) throws Exception {
        String sql = "DELETE from topico WHERE id_disciplina = ?";
        PreparedStatement stmt = null;
        try {
            MyHelperClass conexao = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conexao.prepareStatement(sql);
            stmt.setInt(1, idDisciplina);
            stmt.executeUpdate();
//            MyHelperClass conexao = new MyHelperClass();
            conexao.commit();
        } catch (UncheckedIOException e) {
            MyHelperClass conexao = new MyHelperClass();
            conexao.rollback();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
