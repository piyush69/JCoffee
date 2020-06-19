
import java.io.UncheckedIOException;


class c12454178 {
public MyHelperClass excluirTopico(MyHelperClass o0){ return null; }
public MyHelperClass criarTopico(Topico o0, int o1){ return null; }

//    @Override
    public void alterar(Disciplina t) throws Exception {
        PreparedStatement stmt = null;
        String sql = "UPDATE disciplina SET nm_disciplina = ?, cod_disciplina = ? WHERE id_disciplina = ?";
        try {
            MyHelperClass conexao = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conexao.prepareStatement(sql);
            stmt.setString(1, t.getNomeDisciplina());
            stmt.setString(2, t.getCodDisciplina());
            stmt.setInt(3, t.getIdDisciplina());
            stmt.executeUpdate();
//            MyHelperClass conexao = new MyHelperClass();
            conexao.commit();
            int id_disciplina =(int)(Object) t.getIdDisciplina();
            excluirTopico(t.getIdDisciplina());
            for (Topico item :(Topico[])(Object) (Object[])(Object)t.getTopicos()) {
                criarTopico(item, id_disciplina);
            }
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

class Disciplina {

public MyHelperClass getNomeDisciplina(){ return null; }
	public MyHelperClass getCodDisciplina(){ return null; }
	public MyHelperClass getIdDisciplina(){ return null; }
	public MyHelperClass getTopicos(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Topico {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
