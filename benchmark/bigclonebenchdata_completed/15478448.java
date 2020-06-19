
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15478448 {
public MyHelperClass username;
	public MyHelperClass DriverManager;
	public MyHelperClass password;
public MyHelperClass applicationContext;
	public MyHelperClass normalizePattern;
	public MyHelperClass origin;
	public MyHelperClass destination;
	public MyHelperClass stripRelationTablePattern;
	public MyHelperClass logger;
	public MyHelperClass getDestination(){ return null; }
	public MyHelperClass getOrigin(){ return null; }

//    @Override
    public void aggregate() {
        Connection connection = null;
        PreparedStatement prestm = null;
        try {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("aggregate table <" + origin + "> start...");
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
            long currentRows = 0L;
            prestm =(PreparedStatement)(Object) connection.prepareStatement("select count(*) from " + origin);
            rs =(ResultSet)(Object) prestm.executeQuery();
            if ((boolean)(Object)rs.next()) currentRows =(long)(Object) rs.getLong(1);
            rs.close();
            prestm.close();
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("found " + currentRows + " record");
            prestm =(PreparedStatement)(Object) connection.prepareStatement("select max(d_insDate) from " + destination);
            rs =(ResultSet)(Object) prestm.executeQuery();
            Date from = null;
            if ((boolean)(Object)rs.next()) from =(Date)(Object) rs.getTimestamp(1);
            rs.close();
            prestm.close();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fromStr = null;
            if (from != null) fromStr =(String)(Object) sdf.format(from);
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("last record date:" + fromStr);
            if (currentRows > 0) {
                connection.setAutoCommit(false);
                if (from != null && fromStr != null) {
                    prestm =(PreparedStatement)(Object) connection.prepareStatement("INSERT INTO " + destination + " SELECT * FROM " + origin + " WHERE d_insDate > '" + fromStr + "'");
                    if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Query: INSERT INTO " + destination + " SELECT * FROM " + origin + " WHERE d_insDate > '" + fromStr + "'");
                } else {
                    prestm =(PreparedStatement)(Object) connection.prepareStatement("INSERT INTO " + destination + " SELECT * FROM " + origin);
                    if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Query: INSERT INTO " + destination + " SELECT * FROM " + origin);
                }
                int rows =(int)(Object) prestm.executeUpdate();
                prestm.close();
                if ((boolean)(Object)logger.isInfoEnabled()) logger.info(" > " + rows + " rows aggregated");
                connection.commit();
            } else if ((boolean)(Object)logger.isInfoEnabled()) logger.info("no aggregation need");
            if ((boolean)(Object)logger.isInfoEnabled()) logger.info("aggregate table " + origin + " end");
        } catch (UncheckedIOException e) {
            logger.error(e, e);
            if (applicationContext != null) applicationContext.publishEvent(new TrapEvent(this, "dbcon", "Errore SQL durante l'aggregazione dei dati della tabella " + origin, e));
            try {
                connection.rollback();
            } catch (UncheckedIOException e1) {
            }
        } catch (Throwable e) {
            logger.error(e, e);
            if (applicationContext != null) applicationContext.publishEvent(new TrapEvent(this, "generic", "Errore generico durante l'aggregazione dei dati della tabella " + origin, e));
            try {
                connection.rollback();
            } catch (UncheckedIOException e1) {
            }
        } finally {
            try {
                if (prestm != null) prestm.close();
            } catch (UncheckedIOException e) {
            }
            try {
                if (connection != null) connection.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass error(Throwable o0, Throwable o1){ return null; }
	public MyHelperClass publishEvent(TrapEvent o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(SQLException o0, SQLException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getTimestamp(int o0){ return null; }
	public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass replaceAll(String o0){ return null; }}

class Statement {

public MyHelperClass execute(String o0){ return null; }}

class Date {

}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class TrapEvent {

TrapEvent(){}
	TrapEvent(c15478448 o0, String o1, String o2, SQLException o3){}
	TrapEvent(c15478448 o0, String o1, String o2, Throwable o3){}}
