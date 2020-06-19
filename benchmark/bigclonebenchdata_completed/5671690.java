import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5671690 {
public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass DriverManager;
public MyHelperClass applicationContext;
	public MyHelperClass stripRelationTablePattern;
	public MyHelperClass TimeUtil;
	public MyHelperClass logger;
	public MyHelperClass normalizePattern;
	public MyHelperClass getCondition(){ return null; }
	public MyHelperClass getDestination(){ return null; }
	public MyHelperClass getHours(){ return null; }
	public MyHelperClass getOrigin(){ return null; }

//    @Override
    public void backup()  throws Throwable {
        Connection connection = null;
        PreparedStatement prestm = null;
        try {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("backup table " + getOrigin() + " start...");
            MyHelperClass driver = new MyHelperClass();
            Class.forName((String)(Object)driver);
            MyHelperClass url = new MyHelperClass();
            connection =(Connection)(Object) DriverManager.getConnection(url, username, password);
            String tableExistsResult = "";
            MyHelperClass schema = new MyHelperClass();
            prestm =(PreparedStatement)(Object) connection.prepareStatement("show tables from " + schema + " like '" + getDestination() + "';");
            ResultSet rs =(ResultSet)(Object) prestm.executeQuery();
            if ((boolean)(Object)rs.next()) tableExistsResult =(String)(Object) rs.getString(1);
            rs.close();
            prestm.close();
            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isBlank(tableExistsResult)) {
                String createTableSql = "";
                prestm =(PreparedStatement)(Object) connection.prepareStatement("show create table " + getOrigin() + ";");
                rs =(ResultSet)(Object) prestm.executeQuery();
                if ((boolean)(Object)rs.next()) createTableSql =(String)(Object) rs.getString(2);
                rs.close();
                prestm.close();
                createTableSql = createTableSql.replaceAll("`" + getOrigin() + "`", "`" + getDestination() + "`");
                createTableSql = createTableSql.replaceAll("auto_increment", "");
                createTableSql = createTableSql.replaceAll("AUTO_INCREMENT", "");
                Matcher matcher =(Matcher)(Object) stripRelationTablePattern.matcher(createTableSql);
                if ((boolean)(Object)matcher.find()) createTableSql =(String)(Object) matcher.replaceAll("");
                matcher =(Matcher)(Object) normalizePattern.matcher(createTableSql);
                if ((boolean)(Object)matcher.find()) createTableSql =(String)(Object) matcher.replaceAll("\n )");
                Statement stm =(Statement)(Object) connection.createStatement();
                stm.execute(createTableSql);
                if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("table '" + getDestination() + "' created!");
            } else if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("table '" + getDestination() + "' already exists");
            Date date = new Date();
            date.setTime(TimeUtil.addHours(date, -getHours()).getTimeInMillis());
            date.setTime((long)(Object)TimeUtil.getTodayAtMidnight().getTimeInMillis());
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("backuping records before: " + date);
            long currentRows = 0L;
            prestm =(PreparedStatement)(Object) connection.prepareStatement("select count(*) from " + getOrigin() + " where " + getCondition() + "");
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            prestm.setDate(1, sqlDate);
            rs =(ResultSet)(Object) prestm.executeQuery();
            if ((boolean)(Object)rs.next()) currentRows =(long)(Object) rs.getLong(1);
            rs.close();
            prestm.close();
            if (currentRows > 0) {
                connection.setAutoCommit(false);
                prestm =(PreparedStatement)(Object) connection.prepareStatement("INSERT INTO " + getDestination() + " SELECT * FROM " + getOrigin() + " WHERE " + getCondition());
                prestm.setDate(1, sqlDate);
                int rows =(int)(Object) prestm.executeUpdate();
                prestm.close();
                if ((boolean)(Object)logger.isInfoEnabled()) logger.info(rows + " rows backupped");
                prestm =(PreparedStatement)(Object) connection.prepareStatement("DELETE FROM " + getOrigin() + " WHERE " + getCondition());
                prestm.setDate(1, sqlDate);
                rows =(int)(Object) prestm.executeUpdate();
                prestm.close();
                connection.commit();
                if ((boolean)(Object)logger.isInfoEnabled()) logger.info(rows + " rows deleted");
            } else if ((boolean)(Object)logger.isInfoEnabled()) logger.info("no backup need");
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("backup table " + getOrigin() + " end");
        } catch (SQLException e) {
            logger.error(e, e);
            if (applicationContext != null) applicationContext.publishEvent(new TrapEvent(this, "dbcon", "Errore SQL durante il backup dei dati della tabella " + getOrigin(), e));
            try {
                connection.rollback();
            } catch (SQLException e1) {
            }
        } catch (Throwable e) {
            logger.error(e, e);
            if (applicationContext != null) applicationContext.publishEvent(new TrapEvent(this, "generic", "Errore generico durante il backup dei dati della tabella " + getOrigin(), e));
            try {
                connection.rollback();
            } catch (SQLException e1) {
            }
        } finally {
            try {
                if (prestm != null) prestm.close();
            } catch (SQLException e) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int date;
public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass publishEvent(TrapEvent o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getTimeInMillis(){ return null; }
	public MyHelperClass error(Throwable o0, Throwable o1){ return null; }
	public MyHelperClass error(SQLException o0, SQLException o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getTodayAtMidnight(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setDate(int o0, Date o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Matcher {

public MyHelperClass replaceAll(String o0){ return null; }
	public MyHelperClass find(){ return null; }}

class Statement {

public MyHelperClass execute(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class TrapEvent {

TrapEvent(c5671690 o0, String o1, String o2, Throwable o3){}
	TrapEvent(c5671690 o0, String o1, String o2, SQLException o3){}
	TrapEvent(){}}
