
import java.io.UncheckedIOException;


class c21092152 {

    public static boolean update(ItemNotaFiscal objINF) {
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        int result;
        CelulaFinanceira objCF = null;
        if (c == null) {
            return false;
        }
        if (objINF == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            String sql = "";
            sql = "update item_nota_fiscal " + "set id_item_pedido = ? " + "where id_item_nota_fiscal = ?";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, objINF.getItemPedido().getCodigo());
            pst.setInt(2, objINF.getCodigo());
            result =(int)(Object) pst.executeUpdate();
            if (result > 0) {
                if (objINF.getItemPedido().getCelulaFinanceira() != null) {
                    objCF =(CelulaFinanceira)(Object) objINF.getItemPedido().getCelulaFinanceira();
                    objCF.atualizaGastoReal(objINF.getSubtotal());
                    MyHelperClass CelulaFinanceiraDAO = new MyHelperClass();
                    if ((boolean)(Object)CelulaFinanceiraDAO.update(objCF)) {
                    }
                }
            }
            c.commit();
        } catch (final UncheckedIOException e) {
            try {
                c.rollback();
            } catch (final Exception e1) {
                System.out.println("[ItemNotaFiscalDAO.update.rollback] Erro ao inserir -> " + e1.getMessage());
            }
            System.out.println("[ItemNotaFiscalDAO.update.insert] Erro ao inserir -> " + e.getMessage());
            result = 0;
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

public MyHelperClass getCelulaFinanceira(){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass update(CelulaFinanceira o0){ return null; }
	public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class ItemNotaFiscal {

public MyHelperClass getSubtotal(){ return null; }
	public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getItemPedido(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class CelulaFinanceira {

public MyHelperClass atualizaGastoReal(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
