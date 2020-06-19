


class c18785060 {

    public static NotaFiscal insert(NotaFiscal objNF) {
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        int result;
        if (c == null) {
            return null;
        }
        if (objNF == null) {
            return null;
        }
        try {
            c.setAutoCommit(false);
            String sql = "";
            int idNotaFiscal;
            MyHelperClass NotaFiscalDAO = new MyHelperClass();
            idNotaFiscal =(int)(Object) NotaFiscalDAO.getLastCodigo();
            if (idNotaFiscal < 1) {
                return null;
            }
            sql = "INSERT INTO nota_fiscal " + "(id_nota_fiscal, id_fornecedor, total, data_emissao, data_cadastro, numero) " + "VALUES(?, ?, TRUNCATE(?,2), STR_TO_DATE(?,'%d/%m/%Y'), now(), ?) ";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setInt(1, idNotaFiscal);
            pst.setLong(2, objNF.getFornecedor().getCodigo());
            pst.setString(3, new DecimalFormat("#0.00").format(objNF.getValor()));
            pst.setString(4, objNF.getDataEmissaoFormatada());
            pst.setString(5, objNF.getNumero());
            result =(int)(Object) pst.executeUpdate();
            pst = null;
            if (result > 0) {
                Iterator itINF =(Iterator)(Object) (objNF.getItemNotaFiscal()).iterator();
                while ((itINF != null) && (boolean)(Object)(itINF.hasNext())) {
                    ItemNotaFiscal objINF = (ItemNotaFiscal)(ItemNotaFiscal)(Object) itINF.next();
                    sql = "";
                    sql = "INSERT INTO item_nota_fiscal " + "(id_nota_fiscal, id_produto, quantidade, subtotal) " + "VALUES(?, ?, ?, TRUNCATE(?,2))";
                    pst =(PreparedStatement)(Object) c.prepareStatement(sql);
                    pst.setInt(1, idNotaFiscal);
                    pst.setInt(2,(int)(Object) objINF.getProduto().getCodigo());
                    pst.setInt(3,(int)(Object) objINF.getQuantidade());
                    pst.setString(4, new DecimalFormat("#0.00").format(objINF.getSubtotal()));
                    result =(int)(Object) pst.executeUpdate();
                }
            }
            c.commit();
            objNF.setCodigo(idNotaFiscal);
        } catch (final Exception e) {
            try {
                c.rollback();
            } catch (final Exception e1) {
                System.out.println("[NotaFiscalDAO.insert.rollback] Erro ao inserir -> " + e1.getMessage());
            }
            System.out.println("[NotaFiscalDAO.insert] Erro ao inserir -> " + e.getMessage());
            objNF = null;
        } finally {
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closePreparedStatement(pst);
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closeConnection(c);
        }
        return objNF;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getLastCodigo(){ return null; }
	public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class NotaFiscal {

public MyHelperClass getValor(){ return null; }
	public MyHelperClass getItemNotaFiscal(){ return null; }
	public MyHelperClass setCodigo(int o0){ return null; }
	public MyHelperClass getFornecedor(){ return null; }
	public MyHelperClass getNumero(){ return null; }
	public MyHelperClass getDataEmissaoFormatada(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class ItemNotaFiscal {

public MyHelperClass getSubtotal(){ return null; }
	public MyHelperClass getQuantidade(){ return null; }
	public MyHelperClass getProduto(){ return null; }}
