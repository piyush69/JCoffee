


class c20490347 {

    public void run() throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("#run enter");
        PreparedStatement ps = null;
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass SQL_UPDATE_ITEM_MIN_QTTY = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_UPDATE_ITEM_MIN_QTTY);
            MyHelperClass deliveryId = new MyHelperClass();
            ps.setInt(1, deliveryId);
//            MyHelperClass deliveryId = new MyHelperClass();
            ps.setInt(2, deliveryId);
            ps.executeUpdate();
            ps.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("#run update STORE.ITEM ok");
            MyHelperClass SQL_DELETE_DELIVERY_LINE = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_DELETE_DELIVERY_LINE);
//            MyHelperClass deliveryId = new MyHelperClass();
            ps.setInt(1, deliveryId);
            ps.executeUpdate();
            ps.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("#run delete STORE.DELIVERY_LINE ok");
            MyHelperClass SQL_DELETE_DELIVERY = new MyHelperClass();
            ps =(PreparedStatement)(Object) connection.prepareStatement(SQL_DELETE_DELIVERY);
//            MyHelperClass deliveryId = new MyHelperClass();
            ps.setInt(1, deliveryId);
            ps.executeUpdate();
            ps.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("#run delete STORE.DELIVERY ok");
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (Exception ex) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("#run Transaction roll back ", ex);
            MyHelperClass connection = new MyHelperClass();
            connection.rollback();
            throw new Exception("#run Не удалось загрузить в БД информацию об обновлении склада. Ошибка : " + ex.getMessage());
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

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
