
import java.io.UncheckedIOException;


class c987675 {

    public void run() throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("#run enter");
        MyHelperClass lineId = new MyHelperClass();
        logger.debug("#run lineId : " + lineId);
        MyHelperClass quantityNew = new MyHelperClass();
        logger.debug("#run quantityNew : " + quantityNew);
        MyHelperClass priceNew = new MyHelperClass();
        logger.debug("#run priceNew : " + priceNew);
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            Integer itemId = null;
            Integer quantity = null;
            MyHelperClass SQL_SELECT_ORDER_LINE = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_SELECT_ORDER_LINE);
//            MyHelperClass lineId = new MyHelperClass();
            ps.setInt(1, lineId);
            rs =(ResultSet)(Object) ps.executeQuery();
            while ((boolean)(Object)rs.next()) {
                itemId =(Integer)(Object) rs.getInt("ITEM_ID");
                quantity =(Integer)(Object) rs.getInt("QUANTITY");
            }
            rs.close();
            ps.close();
            MyHelperClass SQL_UPDATE_ITEM_BALANCE = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_UPDATE_ITEM_BALANCE);
//            MyHelperClass quantityNew = new MyHelperClass();
            ps.setInt(1,(Integer)(Object) quantityNew - quantity);
            ps.setInt(2, itemId);
            ps.executeUpdate();
            MyHelperClass SQL_UPDATE_ORDER_LINE = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_UPDATE_ORDER_LINE);
//            MyHelperClass priceNew = new MyHelperClass();
            ps.setDouble(1, priceNew);
//            MyHelperClass quantityNew = new MyHelperClass();
            ps.setInt(2, quantityNew);
//            MyHelperClass lineId = new MyHelperClass();
            ps.setInt(3, lineId);
            ps.executeUpdate();
            ps.close();
            ps.close();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("SQLException",(SQLException)(Object) ex);
            MyHelperClass connection = new MyHelperClass();
            connection.rollback();
            throw new Exception("Не удалось обновить позицию в заказе. Ошибка : " + ex.getMessage());
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
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
