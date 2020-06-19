
import java.io.UncheckedIOException;


class c21664404 {

    public void store(Component component, String componentName, int currentPilot) {
        try {
            MyHelperClass jdbc = new MyHelperClass();
            PreparedStatement psta =(PreparedStatement)(Object) jdbc.prepareStatement("UPDATE component_prop " + "SET size_height = ?, size_width = ?, pos_x = ?, pos_y = ? " + "WHERE pilot_id = ? " + "AND component_name = ?");
            psta.setInt(1,(int)(Object) component.getHeight());
            psta.setInt(2,(int)(Object) component.getWidth());
            Point point =(Point)(Object) component.getLocation();
            psta.setInt(3,(int)(Object) point.x);
            psta.setInt(4,(int)(Object) point.y);
            psta.setInt(5, currentPilot);
            psta.setString(6, componentName);
            int update =(int)(Object) psta.executeUpdate();
            if (update == 0) {
//                MyHelperClass jdbc = new MyHelperClass();
                psta =(PreparedStatement)(Object) jdbc.prepareStatement("INSERT INTO component_prop " + "(size_height, size_width, pos_x, pos_y, pilot_id, component_name) " + "VALUES (?,?,?,?,?,?)");
                psta.setInt(1,(int)(Object) component.getHeight());
                psta.setInt(2,(int)(Object) component.getWidth());
                psta.setInt(3,(int)(Object) point.x);
                psta.setInt(4,(int)(Object) point.y);
                psta.setInt(5, currentPilot);
                psta.setString(6, componentName);
                psta.executeUpdate();
            }
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

class Component {

public MyHelperClass getLocation(){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Point {
public MyHelperClass y;
	public MyHelperClass x;
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
