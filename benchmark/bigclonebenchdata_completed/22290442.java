
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22290442 {
public static MyHelperClass getMaxCSOCode(String o0, Connection o1, PreparedStatement o2, ResultSet o3){ return null; }
	public static MyHelperClass getiSOsID(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
	public static MyHelperClass getMaxID(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
public static MyHelperClass Logger;
	public static MyHelperClass DateUtil;
	public static MyHelperClass Level;
//	public MyHelperClass getiSOsID(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
	public static MyHelperClass getCSOCode(String o0, long o1){ return null; }
//	public MyHelperClass getMaxID(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
//	public MyHelperClass getMaxCSOCode(String o0, Connection o1, PreparedStatement o2, ResultSet o3){ return null; }
//public MyHelperClass Logger;
	public MyHelperClass DBUtils;
//	public MyHelperClass Level;
//	public MyHelperClass DateUtil;
//	public MyHelperClass getCSOCode(String o0, long o1){ return null; }

    public static void batchInsertOrder(Order o) throws AppException {
        MyHelperClass DBUtils = new MyHelperClass();
        Connection conn =(Connection)(Object) DBUtils.getDataConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sqlOrder = null;
        String sqlDetail = null;
        try {
            conn.setAutoCommit(false);
            sqlOrder = "insert into SO_SOMain (ID,cSOCode,dDate," + "cBusType,cCusCode,cCusName," + "cDepCode,cSTCode," + "iVTid,cMaker,cMemo) values (?,?,?,?,?,?,?,?,?,?,?)";
            sqlDetail = "insert into SO_SODetails (ID,cSOCode,cInvCode,cInvName," + "iNum,iQuantity,iTaxUnitPrice,iSum,dPreDate,iSOsID,cFree1,cUnitID) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sqlOrder);
            long maxId =(long)(Object) getMaxID(conn, pstmt, rs);
            maxId++;
            pstmt.setLong(1, maxId);
            Long l = maxId;
            o.setId(l.intValue());
            String code =(String)(Object) o.getCode();
            long maxCSOCode =(long)(Object) getMaxCSOCode(code, conn, pstmt, rs);
            String csOCode =(String)(Object) getCSOCode(code, maxCSOCode);
            o.setCode(csOCode);
            pstmt.setString(2, csOCode);
            pstmt.setDate(3, DateUtil.getSqlDateFormUtilDate(o.getOrderDate()));
            pstmt.setString(4,(String)(Object) o.getBusinessType());
            pstmt.setString(5,(String)(Object) o.getC().getId());
            pstmt.setString(6,(String)(Object) o.getC().getName());
            pstmt.setString(7,(String)(Object) o.getP().getDept().getId());
            pstmt.setString(8,(String)(Object) o.getSaleType().getId());
            pstmt.setInt(9, o.getiVtid());
            pstmt.setString(10,(String)(Object) o.getP().getName());
            pstmt.setString(11,(String)(Object) o.getRemark());
            pstmt.executeUpdate();
            pstmt.clearParameters();
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sqlDetail);
            ArrayList ods =(ArrayList)(Object) o.getOds();
            long iSOsID =(long)(Object) getiSOsID(conn, pstmt, rs);
            for (OrderDetail od :(OrderDetail[])(Object) (Object[])(Object)ods) {
                pstmt.setLong(1, maxId);
                pstmt.setString(2, csOCode);
                pstmt.setString(3,(String)(Object) od.getInventory().getId());
                pstmt.setString(4,(String)(Object) od.getInventory().getName());
                pstmt.setInt(5, od.getPiece());
                pstmt.setBigDecimal(6, od.getCount());
                pstmt.setBigDecimal(7, od.getPrice());
                pstmt.setBigDecimal(8, od.getSum());
                pstmt.setDate(9, DateUtil.getSqlDateFormUtilDate(od.getSendDate()));
                pstmt.setLong(10, ++iSOsID);
                pstmt.setString(11,(String)(Object) od.getPacking().getcValue());
                pstmt.setString(12,(String)(Object) od.getInventory().getSAComUnitCode());
                pstmt.executeUpdate();
                pstmt.clearParameters();
            }
            conn.commit();
        } catch (UncheckedIOException sqle) {
            try {
                conn.rollback();
                throw new AppException(sqle.getMessage());
            } catch (UncheckedIOException ex) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null,(SQLException)(Object) ex);
                throw new AppException(ex.getMessage());
            }
        } finally {
            DBUtils.closeAll(rs, pstmt, conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getDataConnection(){ return null; }
	public MyHelperClass getSqlDateFormUtilDate(MyHelperClass o0){ return null; }
	public MyHelperClass closeAll(ResultSet o0, PreparedStatement o1, Connection o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, SQLException o2){ return null; }
	public MyHelperClass getcValue(){ return null; }
	public MyHelperClass getSAComUnitCode(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass getDept(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getId(){ return null; }}

class Order {

public MyHelperClass getOds(){ return null; }
	public MyHelperClass setCode(String o0){ return null; }
	public MyHelperClass setId(int o0){ return null; }
	public MyHelperClass getRemark(){ return null; }
	public MyHelperClass getP(){ return null; }
	public MyHelperClass getC(){ return null; }
	public MyHelperClass getCode(){ return null; }
	public MyHelperClass getBusinessType(){ return null; }
	public MyHelperClass getiVtid(){ return null; }
	public MyHelperClass getOrderDate(){ return null; }
	public MyHelperClass getSaleType(){ return null; }}

class AppException extends Exception{
	public AppException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

}

class ArrayList {

}

class OrderDetail {

public MyHelperClass getPiece(){ return null; }
	public MyHelperClass getSum(){ return null; }
	public MyHelperClass getSendDate(){ return null; }
	public MyHelperClass getPacking(){ return null; }
	public MyHelperClass getCount(){ return null; }
	public MyHelperClass getInventory(){ return null; }
	public MyHelperClass getPrice(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class OrderDAO {

}
