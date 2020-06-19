
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23548072 {

    public static boolean insert(final Cargo cargo) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        final Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            final String sql = "insert into cargo (nome) values (?)";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setString(1, cargo.getNome());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (final UncheckedIOException e) {
            try {
                c.rollback();
            } catch (final UncheckedIOException e1) {
                e1.printStackTrace();
            }
            System.out.println("[CargoDAO.insert] Erro ao inserir -> " + e.getMessage());
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

class Cargo {

public MyHelperClass getNome(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
