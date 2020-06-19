
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20050668 {

    public static boolean insert(final PedidoSituacao pedidoSituacao) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            final String sql = "insert into pedido_situacao (id_pedido, id_situacao, em, observacao, id_funcionario) " + "values (?, ? , now(), ?, ?) ";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, pedidoSituacao.getPedido().getCodigo());
            pst.setInt(2, pedidoSituacao.getSituacao().getCodigo());
            pst.setString(3, pedidoSituacao.getObservacao());
            pst.setInt(4, pedidoSituacao.getFuncionario().getCodigo());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (final UncheckedIOException e) {
            try {
                c.rollback();
            } catch (final UncheckedIOException e1) {
                e1.printStackTrace();
            }
            System.out.println("[PedidoSituacaoDAO.insert] Erro ao inserir -> " + e.getMessage());
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

class PedidoSituacao {

public MyHelperClass getObservacao(){ return null; }
	public MyHelperClass getPedido(){ return null; }
	public MyHelperClass getSituacao(){ return null; }
	public MyHelperClass getFuncionario(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
