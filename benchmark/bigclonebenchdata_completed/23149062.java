
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23149062 {

    public static boolean insert(final CelulaFinanceira objCelulaFinanceira) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            final String sql = "insert into celula_financeira " + "(descricao, id_orgao, id_gestao, " + "id_natureza_despesa, id_programa_trabalho, " + "id_unidade_orcamentaria, id_fonte_recursos, " + "valor_provisionado, gasto_previsto, gasto_real, " + "saldo_previsto, saldo_real)" + " values (?, ?, ?, ?, ?, ?, ?, TRUNCATE(?,2), TRUNCATE(?,2), TRUNCATE(?,2), TRUNCATE(?,2), TRUNCATE(?,2))";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setString(1, objCelulaFinanceira.getDescricao());
            pst.setLong(2, (objCelulaFinanceira.getOrgao()).getCodigo());
            pst.setString(3, (objCelulaFinanceira.getGestao()).getCodigo());
            pst.setString(4, (objCelulaFinanceira.getNaturezaDespesa()).getCodigo());
            pst.setString(5, (objCelulaFinanceira.getProgramaTrabalho()).getCodigo());
            pst.setString(6, (objCelulaFinanceira.getUnidadeOrcamentaria()).getCodigo());
            pst.setString(7, (objCelulaFinanceira.getFonteRecursos()).getCodigo());
            pst.setDouble(8, objCelulaFinanceira.getValorProvisionado());
            pst.setDouble(9, objCelulaFinanceira.getGastoPrevisto());
            pst.setDouble(10, objCelulaFinanceira.getGastoReal());
            pst.setDouble(11, objCelulaFinanceira.getSaldoPrevisto());
            pst.setDouble(12, objCelulaFinanceira.getSaldoReal());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (final UncheckedIOException e) {
            try {
                c.rollback();
            } catch (final UncheckedIOException e1) {
                System.out.println("[CelulaFinanceiraDAO.insert] Erro ao inserir -> " + e1.getMessage());
            }
            System.out.println("[CelulaFinanceiraDAO.insert] Erro ao inserir -> " + e.getMessage());
        } finally {
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closePreparedStatement(pst);
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closeConnection(c);
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class CelulaFinanceira {

public MyHelperClass getGestao(){ return null; }
	public MyHelperClass getValorProvisionado(){ return null; }
	public MyHelperClass getNaturezaDespesa(){ return null; }
	public MyHelperClass getDescricao(){ return null; }
	public MyHelperClass getUnidadeOrcamentaria(){ return null; }
	public MyHelperClass getFonteRecursos(){ return null; }
	public MyHelperClass getSaldoReal(){ return null; }
	public MyHelperClass getSaldoPrevisto(){ return null; }
	public MyHelperClass getProgramaTrabalho(){ return null; }
	public MyHelperClass getGastoPrevisto(){ return null; }
	public MyHelperClass getOrgao(){ return null; }
	public MyHelperClass getGastoReal(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
