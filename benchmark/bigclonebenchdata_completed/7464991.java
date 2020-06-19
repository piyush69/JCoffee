
import java.io.UncheckedIOException;


class c7464991 {

    public void criarQuestaoDiscursiva(QuestaoDiscursiva q) throws SQLException {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO discursiva (id_questao,gabarito) VALUES (?,?)";
        try {
            MyHelperClass conexao = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conexao.prepareStatement(sql);
            stmt.setInt(1, q.getIdQuestao());
            stmt.setString(2, q.getGabarito());
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

class QuestaoDiscursiva {

public MyHelperClass getGabarito(){ return null; }
	public MyHelperClass getIdQuestao(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
