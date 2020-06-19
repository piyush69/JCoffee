
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20148775 {

    public static boolean update(Orgao orgao) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            String sql = "update orgao set nome = (?) where id_orgao= ?";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setString(1, orgao.getNome());
            pst.setInt(2, orgao.getCodigo());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (UncheckedIOException e) {
            try {
                c.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            System.out.println("[OrgaoDAO.update] Erro ao atualizar -> " + e.getMessage());
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

public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Orgao {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getNome(){ return null; }}

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
