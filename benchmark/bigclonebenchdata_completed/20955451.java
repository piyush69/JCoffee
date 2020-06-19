
import java.io.UncheckedIOException;


class c20955451 {

    public void criarTopicoQuestao(Questao q, Integer idTopico) throws SQLException {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO questao_topico (id_questao, id_disciplina, id_topico) VALUES (?,?,?)";
        try {
            MyHelperClass conexao = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conexao.prepareStatement(sql);
            stmt.setInt(1,(Integer)(Object) q.getIdQuestao());
            stmt.setInt(2,(Integer)(Object) q.getDisciplina().getIdDisciplina());
            stmt.setInt(3, idTopico);
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

public MyHelperClass getIdDisciplina(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Questao {

public MyHelperClass getIdQuestao(){ return null; }
	public MyHelperClass getDisciplina(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
