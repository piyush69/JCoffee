import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5198625 {

    public static Pedido insert(Pedido objPedido) {
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        int result;
        if (c == null) {
            return null;
        }
        try {
            c.setAutoCommit(false);
            String sql = "";
            int idPedido;
            MyHelperClass PedidoDAO = new MyHelperClass();
            idPedido =(int)(Object) PedidoDAO.getLastCodigo();
            if (idPedido < 1) {
                return null;
            }
            sql = "insert into pedido " + "(id_pedido, id_funcionario,data_pedido,valor) " + "values(?,?,now(),truncate(?,2))";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, idPedido);
            pst.setInt(2,(int)(Object) objPedido.getFuncionario().getCodigo());
            pst.setString(3, (String)(Object)new DecimalFormat("#0.00").format(objPedido.getValor()));
            result =(int)(Object) pst.executeUpdate();
            pst = null;
            if (result > 0) {
                Iterator<ItemPedido> itItemPedido =(Iterator<ItemPedido>)(Object) (objPedido.getItemPedido()).iterator();
                while ((itItemPedido != null) && (itItemPedido.hasNext())) {
                    ItemPedido objItemPedido = (ItemPedido) itItemPedido.next();
                    sql = "";
                    sql = "insert into item_pedido " + "(id_pedido,id_produto,quantidade,subtotal) " + "values (?,?,?,truncate(?,2))";
                    pst =(PreparedStatement)(Object) c.prepareStatement(sql);
                    pst.setInt(1, idPedido);
                    pst.setInt(2,(int)(Object) (objItemPedido.getProduto()).getCodigo());
                    pst.setInt(3,(int)(Object) objItemPedido.getQuantidade());
                    pst.setString(4, (String)(Object)new DecimalFormat("#0.00").format(objItemPedido.getSubtotal()));
                    result =(int)(Object) pst.executeUpdate();
                }
            }
            pst = null;
            sql = "";
            sql = "insert into pedido_situacao " + "(id_pedido,id_situacao, em, observacao, id_funcionario) " + "values (?,?,now(), ?, ?)";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, idPedido);
            pst.setInt(2, 1);
            pst.setString(3, "Inclus�o de pedido");
            pst.setInt(4,(int)(Object) objPedido.getFuncionario().getCodigo());
            result =(int)(Object) pst.executeUpdate();
            pst = null;
            sql = "";
            sql = "insert into tramitacao " + "(data_tramitacao, id_pedido, id_dep_origem, id_dep_destino) " + "values (now(),?,?, ?)";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, idPedido);
            pst.setInt(2, 6);
            pst.setInt(3, 2);
            result =(int)(Object) pst.executeUpdate();
            c.commit();
            objPedido.setCodigo(idPedido);
        } catch (final Exception e) {
            try {
                c.rollback();
            } catch (final Exception e1) {
                System.out.println("[PedidoDAO.insert] Erro ao inserir -> " + e1.getMessage());
            }
            System.out.println("[PedidoDAO.insert] Erro ao inserir -> " + e.getMessage());
        } finally {
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closePreparedStatement(pst);
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closeConnection(c);
        }
        return objPedido;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getLastCodigo(){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }}

class Pedido {

public MyHelperClass getValor(){ return null; }
	public MyHelperClass getItemPedido(){ return null; }
	public MyHelperClass getFuncionario(){ return null; }
	public MyHelperClass setCodigo(int o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}

class ItemPedido {

public MyHelperClass getProduto(){ return null; }
	public MyHelperClass getQuantidade(){ return null; }
	public MyHelperClass getSubtotal(){ return null; }}
