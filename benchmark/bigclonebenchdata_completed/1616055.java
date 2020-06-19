
import java.io.UncheckedIOException;


class c1616055 {
public MyHelperClass connection;

    public void run() throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("#run enter");
        PreparedStatement psNextId = null;
        ResultSet rsNextId = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass COUNT_ACTIVE_ORDERS = new MyHelperClass();
            PreparedStatement psCount =(PreparedStatement)(Object) connection.prepareStatement(COUNT_ACTIVE_ORDERS);
            MyHelperClass login = new MyHelperClass();
            psCount.setString(1, login);
            ResultSet rsCount =(ResultSet)(Object) psCount.executeQuery();
            if ((boolean)(Object)rsCount.next()) {
                Integer count =(Integer)(Object) rsCount.getInt(1);
                if (count > 0) {
                    MyHelperClass DBHelper = new MyHelperClass();
                    DBHelper.closeAll(null, rsCount, psCount);
                    throw new RuntimeException("У вас уже есть один активный заказ. Вы не можете создать второй.");
                }
            }
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass NEXT_ORDER = new MyHelperClass();
            psNextId =(PreparedStatement)(Object) connection.prepareStatement(NEXT_ORDER);
            rsNextId =(ResultSet)(Object) psNextId.executeQuery();
            if ((boolean)(Object)rsNextId.next()) {
                MyHelperClass orderId = new MyHelperClass();
                orderId = rsNextId.getInt(1);
            }
            rsNextId.close();
            psNextId.close();
            MyHelperClass orderId = new MyHelperClass();
            logger.info("#run orderId  = " + orderId);
            MyHelperClass INSERT_ORDER = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(INSERT_ORDER);
//            MyHelperClass orderId = new MyHelperClass();
            ps.setInt(1, orderId);
            MyHelperClass order = new MyHelperClass();
            if (order.getCustomerId() != null) {
//                MyHelperClass order = new MyHelperClass();
                ps.setInt(2, order.getCustomerId());
            } else {
                MyHelperClass Types = new MyHelperClass();
                ps.setNull(2, Types.INTEGER);
            }
//            MyHelperClass order = new MyHelperClass();
            ps.setString(3, order.getSellerLogin());
            ps.executeUpdate();
            ps.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.info("#run order insert OK");
//            MyHelperClass order = new MyHelperClass();
            Iterator lines =(Iterator)(Object) order.getLines().iterator();
            while ((boolean)(Object)lines.hasNext()) {
                OrderLine line =(OrderLine)(Object) lines.next();
                CreateOrderLineAction action = new CreateOrderLineAction();
//                MyHelperClass connection = new MyHelperClass();
                action.execute(connection, orderId, line);
            }
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("SQLException",(SQLException)(Object) ex);
            MyHelperClass connection = new MyHelperClass();
            connection.rollback();
            throw new Exception("Не удалось создать заказ. Ошибка : " + ex.getMessage());
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
public MyHelperClass INTEGER;
public MyHelperClass getCustomerId(){ return null; }
	public MyHelperClass getSellerLogin(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getLines(){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass closeAll(Object o0, ResultSet o1, PreparedStatement o2){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class OrderLine {

}

class CreateOrderLineAction {

public MyHelperClass execute(MyHelperClass o0, MyHelperClass o1, OrderLine o2){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
