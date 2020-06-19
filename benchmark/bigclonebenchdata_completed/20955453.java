
import java.io.UncheckedIOException;


class c20955453 {
public MyHelperClass alterarQuestaoMultiplaEscolha(QuestaoMultiplaEscolha o0){ return null; }

//    @Override
    public void alterar(QuestaoMultiplaEscolha q) throws Exception {
        PreparedStatement stmt = null;
        String sql = "UPDATE questao SET id_disciplina=?, enunciado=?, grau_dificuldade=? WHERE id_questao=?";
        try {
            MyHelperClass conexao = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conexao.prepareStatement(sql);
            stmt.setInt(1, q.getDisciplina().getIdDisciplina());
            stmt.setString(2, q.getEnunciado());
            stmt.setString(3, q.getDificuldade().name());
            stmt.setInt(4, q.getIdQuestao());
            stmt.executeUpdate();
//            MyHelperClass conexao = new MyHelperClass();
            conexao.commit();
            alterarQuestaoMultiplaEscolha(q);
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
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getIdDisciplina(){ return null; }
	public MyHelperClass name(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class QuestaoMultiplaEscolha {

public MyHelperClass getEnunciado(){ return null; }
	public MyHelperClass getIdQuestao(){ return null; }
	public MyHelperClass getDisciplina(){ return null; }
	public MyHelperClass getDificuldade(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
