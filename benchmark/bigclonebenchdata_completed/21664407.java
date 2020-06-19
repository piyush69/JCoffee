
import java.io.UncheckedIOException;


class c21664407 {

    public void reset(int currentPilot) {
        try {
            MyHelperClass jdbc = new MyHelperClass();
            PreparedStatement psta =(PreparedStatement)(Object) jdbc.prepareStatement("DELETE FROM component_prop " + "WHERE pilot_id = ? ");
            psta.setInt(1, currentPilot);
            psta.executeUpdate();
//            MyHelperClass jdbc = new MyHelperClass();
            jdbc.commit();
        } catch (UncheckedIOException e) {
            MyHelperClass jdbc = new MyHelperClass();
            jdbc.rollback();
            MyHelperClass log = new MyHelperClass();
            log.debug((SQLException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass debug(SQLException o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
