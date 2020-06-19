
import java.io.UncheckedIOException;


class c9270406 {
public MyHelperClass allocateConnection(MyHelperClass o0){ return null; }
	public MyHelperClass logError(String o0, Exception o1){ return null; }
public MyHelperClass UPDATE;
	public MyHelperClass tableName;
	public MyHelperClass DELETE;
	public MyHelperClass DBUtil;
	public MyHelperClass INSERT;
public MyHelperClass release(){ return null; }

    public void downSync(Vector v) throws SQLException {
        try {
            MyHelperClass con = new MyHelperClass();
            con = allocateConnection(tableName);
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement update =(PreparedStatement)(Object) con.prepareStatement("update cal_Event set owner=?,subject=?,text=?,place=?," + "contactperson=?,startdate=?,enddate=?,starttime=?,endtime=?,allday=?," + "syncstatus=?,dirtybits=? where OId=? and syncstatus=?");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement insert =(PreparedStatement)(Object) con.prepareStatement("insert into cal_Event (owner,subject,text,place," + "contactperson,startdate,enddate,starttime,endtime,allday,syncstatus," + "dirtybits) values(?,?,?,?,?,?,?,?,?,?,?,?)");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement insert1 =(PreparedStatement)(Object) con.prepareStatement((String)(Object)DBUtil.getQueryCurrentOID(con, "cal_Event", "newoid"));
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement delete1 =(PreparedStatement)(Object) con.prepareStatement("delete from  cal_Event_Remind where event=?");
//            MyHelperClass con = new MyHelperClass();
            PreparedStatement delete2 =(PreparedStatement)(Object) con.prepareStatement("delete from  cal_Event where OId=? " + "and (syncstatus=? or syncstatus=?)");
            for (int i = 0; i < (int)(Object)v.size(); i++) {
                try {
                    EventDO DO;// = new EventDO();
                    DO = (EventDO)(EventDO)(Object) v.elementAt(i);
//                    MyHelperClass DO = new MyHelperClass();
                    if (DO.getSyncstatus() == INSERT) {
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setBigDecimal(1, DO.getOwner());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(2, DO.getSubject());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(3, DO.getText());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(4, DO.getPlace());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setString(5, DO.getContactperson());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setDate(6, DO.getStartdate());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setDate(7, DO.getEnddate());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setTime(8, DO.getStarttime());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setTime(9, DO.getEndtime());
//                        MyHelperClass DO = new MyHelperClass();
                        insert.setBoolean(10, DO.getAllday());
                        MyHelperClass RESET = new MyHelperClass();
                        insert.setInt(11, RESET);
//                        MyHelperClass RESET = new MyHelperClass();
                        insert.setInt(12, RESET);
//                        MyHelperClass con = new MyHelperClass();
                        con.executeUpdate(insert, null);
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
                        MyHelperClass rs = new MyHelperClass();
                        rs = con.executeQuery(insert1, null);
//                        MyHelperClass rs = new MyHelperClass();
                        if ((boolean)(Object)rs.next()) DO.setOId(rs.getBigDecimal("newoid"));
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
//                    MyHelperClass DO = new MyHelperClass();
                    } else if (DO.getSyncstatus() == UPDATE) {
//                        MyHelperClass DO = new MyHelperClass();
                        update.setBigDecimal(1, DO.getOwner());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(2, DO.getSubject());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(3, DO.getText());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(4, DO.getPlace());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setString(5, DO.getContactperson());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setDate(6, DO.getStartdate());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setDate(7, DO.getEnddate());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setTime(8, DO.getStarttime());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setTime(9, DO.getEndtime());
//                        MyHelperClass DO = new MyHelperClass();
                        update.setBoolean(10, DO.getAllday());
                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(11, RESET);
//                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(12, RESET);
//                        MyHelperClass DO = new MyHelperClass();
                        update.setBigDecimal(13, DO.getOId());
//                        MyHelperClass RESET = new MyHelperClass();
                        update.setInt(14, RESET);
//                        MyHelperClass con = new MyHelperClass();
                        con.executeUpdate(update, null);
//                        MyHelperClass con = new MyHelperClass();
                        con.reset();
//                    MyHelperClass DO = new MyHelperClass();
                    } else if (DO.getSyncstatus() == DELETE) {
                        try {
//                            MyHelperClass con = new MyHelperClass();
                            con.setAutoCommit(false);
//                            MyHelperClass DO = new MyHelperClass();
                            delete1.setBigDecimal(1, DO.getOId());
//                            MyHelperClass con = new MyHelperClass();
                            con.executeUpdate(delete1, null);
//                            MyHelperClass DO = new MyHelperClass();
                            delete2.setBigDecimal(1, DO.getOId());
                            MyHelperClass RESET = new MyHelperClass();
                            delete2.setInt(2, RESET);
                            MyHelperClass DELETE = new MyHelperClass();
                            delete2.setInt(3, DELETE);
//                            MyHelperClass con = new MyHelperClass();
                            if ((int)(Object)con.executeUpdate(delete2, null) < 1) {
//                                MyHelperClass con = new MyHelperClass();
                                con.rollback();
                            } else {
//                                MyHelperClass con = new MyHelperClass();
                                con.commit();
                            }
                        } catch (Exception e) {
//                            MyHelperClass con = new MyHelperClass();
                            con.rollback();
                            throw e;
                        } finally {
//                            MyHelperClass con = new MyHelperClass();
                            con.reset();
                        }
                    }
                } catch (Exception e) {
                    MyHelperClass DO = new MyHelperClass();
                    if (DO != null) logError("Sync-EventDO.owner = " + DO.getOwner().toString() + " oid = " + (DO.getOId() != null ? DO.getOId().toString() : "NULL"), e);
                }
            }
            MyHelperClass rs = new MyHelperClass();
            if (rs != null) {
//                MyHelperClass rs = new MyHelperClass();
                rs.close();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass DEBUG = new MyHelperClass();
            if ((boolean)(Object)DEBUG) logError("", e);
            throw e;
        } finally {
            release();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass getStartdate(){ return null; }
	public MyHelperClass getPlace(){ return null; }
	public MyHelperClass executeUpdate(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass getStarttime(){ return null; }
	public MyHelperClass getEnddate(){ return null; }
	public MyHelperClass getAllday(){ return null; }
	public MyHelperClass setOId(MyHelperClass o0){ return null; }
	public MyHelperClass getSyncstatus(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getQueryCurrentOID(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getBigDecimal(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getOId(){ return null; }
	public MyHelperClass getEndtime(){ return null; }
	public MyHelperClass getContactperson(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getSubject(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(PreparedStatement o0, Object o1){ return null; }
	public MyHelperClass getOwner(){ return null; }}

class Vector {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setTime(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, MyHelperClass o1){ return null; }}

class EventDO {

public MyHelperClass getStarttime(){ return null; }
	public MyHelperClass getEnddate(){ return null; }
	public MyHelperClass getAllday(){ return null; }
	public MyHelperClass setOId(MyHelperClass o0){ return null; }
	public MyHelperClass getOId(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getEndtime(){ return null; }
	public MyHelperClass getContactperson(){ return null; }
	public MyHelperClass getSyncstatus(){ return null; }
	public MyHelperClass getStartdate(){ return null; }
	public MyHelperClass getPlace(){ return null; }
	public MyHelperClass getSubject(){ return null; }
	public MyHelperClass getOwner(){ return null; }}
