
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3210232 {
public MyHelperClass Funcoes;

    private void transferir() {
        PreparedStatement ps = null;
        StringBuilder sql = new StringBuilder();
        boolean problema = false;
        String idFk = "";
        try {
            MyHelperClass tabelas = new MyHelperClass();
            for (String tabela :(String[])(Object) (Object[])(Object)tabelas) {
                MyHelperClass mapaTabelas = new MyHelperClass();
                idFk =(String)(Object) mapaTabelas.get(tabela);
                sql.delete(0, sql.length());
                sql.append("UPDATE ");
                sql.append(tabela);
                sql.append(" SET");
                sql.append(" CODEMP" + idFk + "=?,");
                sql.append(" CODFILIAL" + idFk + "=?,");
                sql.append(" CODPLAN=?");
                sql.append(" WHERE");
                sql.append(" CODEMP" + idFk + "=? AND");
                sql.append(" CODFILIAL" + idFk + "=? AND");
                sql.append(" CODPLAN=?");
                try {
                    MyHelperClass status = new MyHelperClass();
                    status.setText("Atulizando tabela " + tabela);
                    MyHelperClass con = new MyHelperClass();
                    ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
                    MyHelperClass Aplicativo = new MyHelperClass();
                    ps.setInt(1, Aplicativo.iCodEmp);
                    MyHelperClass lcPlanDest = new MyHelperClass();
                    ps.setInt(2, lcPlanDest.getCodFilial());
                    MyHelperClass txtCodPlanDest = new MyHelperClass();
                    ps.setString(3, txtCodPlanDest.getVlrString());
//                    MyHelperClass Aplicativo = new MyHelperClass();
                    ps.setInt(4, Aplicativo.iCodEmp);
                    MyHelperClass lcPlanOrig = new MyHelperClass();
                    ps.setInt(5, lcPlanOrig.getCodFilial());
                    MyHelperClass txtCodPlanOrig = new MyHelperClass();
                    ps.setString(6, txtCodPlanOrig.getVlrString());
                    ps.executeUpdate();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    problema = true;
                    MyHelperClass con = new MyHelperClass();
                    Funcoes.mensagemErro(this, "Erro ao atualizar planejamento de destino.\n" + e.getMessage(), true, con,(SQLException)(Object) e);
                    MyHelperClass status = new MyHelperClass();
                    status.setText("");
                    break;
                }
            }
        } finally {
            try {
                if (problema) {
                    MyHelperClass con = new MyHelperClass();
                    con.rollback();
                } else {
                    sql.delete(0, sql.length());
                    sql.append("DELETE FROM FNSALDOLANCA ");
                    sql.append("WHERE CODEMPPN=? AND CODFILIALPN=? AND CODPLAN=?");
                    MyHelperClass con = new MyHelperClass();
                    ps =(PreparedStatement)(Object) con.prepareStatement(sql.toString());
                    MyHelperClass Aplicativo = new MyHelperClass();
                    ps.setInt(1, Aplicativo.iCodEmp);
                    MyHelperClass lcPlanOrig = new MyHelperClass();
                    ps.setInt(2, lcPlanOrig.getCodFilial());
                    MyHelperClass txtCodPlanOrig = new MyHelperClass();
                    ps.setString(3, txtCodPlanOrig.getVlrString());
                    ps.executeUpdate();
//                    MyHelperClass con = new MyHelperClass();
                    con.commit();
                    MyHelperClass btTransferir = new MyHelperClass();
                    btTransferir.setEnabled(false);
                    MyHelperClass status = new MyHelperClass();
                    status.setText("Transfer�ncia completada.");
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass iCodEmp;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass mensagemErro(c3210232 o0, String o1, boolean o2, MyHelperClass o3, SQLException o4){ return null; }
	public MyHelperClass getVlrString(){ return null; }
	public MyHelperClass getCodFilial(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
