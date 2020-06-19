
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1039796 {

    public static void insert(Connection c, MLPApprox net, int azioneId, String descrizione, int[] indiciID, int output, Date from, Date to) throws SQLException {
        try {
            MyHelperClass insertNet = new MyHelperClass();
            PreparedStatement ps =(PreparedStatement)(Object) c.prepareStatement(insertNet, PreparedStatement.RETURN_GENERATED_KEYS);
            ArrayList indexes = new ArrayList(indiciID.length);
            for (int i = 0; i < indiciID.length; i++) indexes.add(indiciID[i]);
            ps.setObject(1, net);
            ps.setInt(2, azioneId);
            ps.setObject(3,(MLPApprox)(Object) indexes);
            ps.setInt(4, output);
            ps.setDate(5, from);
            ps.setDate(6, to);
            ps.setString(7, descrizione);
            ps.executeUpdate();
            ResultSet key =(ResultSet)(Object) ps.getGeneratedKeys();
            if ((boolean)(Object)key.next()) {
                int id =(int)(Object) key.getInt(1);
                for (int i = 0; i < indiciID.length; i++) {
                    MyHelperClass insertNetIndex = new MyHelperClass();
                    PreparedStatement psIndex =(PreparedStatement)(Object) c.prepareStatement(insertNetIndex);
                    psIndex.setInt(1, indiciID[i]);
                    psIndex.setInt(2, id);
                    psIndex.executeUpdate();
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            try {
                c.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
                throw e1;
            }
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass rollback(){ return null; }}

class MLPApprox {

}

class Date {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {
public static MyHelperClass RETURN_GENERATED_KEYS;
public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setObject(int o0, MLPApprox o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ArrayList {

ArrayList(int o0){}
	ArrayList(){}
	public MyHelperClass add(int o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
