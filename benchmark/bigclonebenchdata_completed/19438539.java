
import java.io.UncheckedIOException;


class c19438539 {

    public void run() throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("#run enter");
        MyHelperClass orderId = new MyHelperClass();
        logger.debug("#run orderId = " + orderId);
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass SQL_SELECT_ORDER_LINE = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_SELECT_ORDER_LINE);
//            MyHelperClass orderId = new MyHelperClass();
            ps.setInt(1, orderId);
            rs =(ResultSet)(Object) ps.executeQuery();
            DeleteOrderLineAction action = new DeleteOrderLineAction();
            while ((boolean)(Object)rs.next()) {
                Integer lineId =(Integer)(Object) rs.getInt("ID");
                Integer itemId =(Integer)(Object) rs.getInt("ITEM_ID");
                Integer quantity =(Integer)(Object) rs.getInt("QUANTITY");
//                MyHelperClass connection = new MyHelperClass();
                action.execute(connection, lineId, itemId, quantity);
            }
            rs.close();
            ps.close();
            MyHelperClass SQL_DELETE_ORDER = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_DELETE_ORDER);
//            MyHelperClass orderId = new MyHelperClass();
            ps.setInt(1, orderId);
            ps.executeUpdate();
            ps.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.info("#run order delete OK");
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("SQLException",(SQLException)(Object) ex);
            MyHelperClass connection = new MyHelperClass();
            connection.rollback();
            throw new Exception("Не удалось удалить заказ. Ошибка : " + ex.getMessage());
        } finally {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(true);
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("#run exit");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DeleteOrderLineAction {

public MyHelperClass execute(MyHelperClass o0, Integer o1, Integer o2, Integer o3){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
