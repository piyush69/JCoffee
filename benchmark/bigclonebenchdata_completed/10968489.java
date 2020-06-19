
import java.io.UncheckedIOException;


class c10968489 {
public MyHelperClass deleteFieldContent(Object o0, Connection o1){ return null; }
	public MyHelperClass setTextField(Content o0, Object o1, String o2, Connection o3){ return null; }
public MyHelperClass sqlConstants;
	public MyHelperClass Types;
	public MyHelperClass TRANSACTIONS_ENABLED;
	public MyHelperClass StructureItem;
	public MyHelperClass getDatabase(){ return null; }

    private void storeFieldMap(Content c, Connection conn) throws SQLException {
        SQLDialect dialect =(SQLDialect)(Object) getDatabase().getSQLDialect();
        if ((boolean)(Object)TRANSACTIONS_ENABLED) {
            conn.setAutoCommit(false);
        }
        try {
            Object thisKey = c.getPrimaryKey();
            deleteFieldContent(thisKey, conn);
            PreparedStatement ps = null;
            StructureItem nextItem;
            Map fieldMap =(Map)(Object) c.getFieldMap();
            String type;
            Object value, siKey;
            for (Iterator i =(Iterator)(Object) c.getStructure().getStructureItems().iterator();(boolean)(Object) i.hasNext(); ) {
                nextItem = (StructureItem)(StructureItem)(Object) i.next();
                type =(String)(Object) nextItem.getDataType().toUpperCase();
                siKey = nextItem.getPrimaryKey();
                value = fieldMap.get(nextItem.getName());
                if (type.equals(StructureItem.DATE)) {
                    ps =(PreparedStatement)(Object) conn.prepareStatement(sqlConstants.get("INSERT_DATE_FIELD"));
                    ps.setObject(1, thisKey);
                    ps.setObject(2, siKey);
                    dialect.setDate(ps, 3,(Date)(Object) (java.util.Date) value);
                    ps.executeUpdate();
                } else if (type.equals(StructureItem.INT) || type.equals(StructureItem.FLOAT) || type.equals(StructureItem.VARCHAR)) {
                    ps =(PreparedStatement)(Object) conn.prepareStatement(sqlConstants.get("INSERT_" + type + "_FIELD"));
                    ps.setObject(1, thisKey);
                    ps.setObject(2, siKey);
                    if (value != null) {
                        ps.setObject(3, value);
                    } else {
                        int sqlType =(int)(Object) Types.INTEGER;
                        if (type.equals(StructureItem.FLOAT)) {
                            sqlType =(int)(Object) Types.FLOAT;
                        } else if (type.equals(StructureItem.VARCHAR)) {
                            sqlType =(int)(Object) Types.VARCHAR;
                        }
                        ps.setNull(3, sqlType);
                    }
                    ps.executeUpdate();
                } else if (type.equals(StructureItem.TEXT)) {
                    setTextField(c, siKey, (String) value, conn);
                }
                if (ps != null) {
                    ps.close();
                    ps = null;
                }
            }
            if ((boolean)(Object)TRANSACTIONS_ENABLED) {
                conn.commit();
            }
        } catch (UncheckedIOException e) {
            if ((boolean)(Object)TRANSACTIONS_ENABLED) {
                conn.rollback();
            }
            throw e;
        } finally {
            if ((boolean)(Object)TRANSACTIONS_ENABLED) {
                conn.setAutoCommit(true);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INT;
	public MyHelperClass VARCHAR;
	public MyHelperClass DATE;
	public MyHelperClass FLOAT;
	public MyHelperClass TEXT;
	public MyHelperClass INTEGER;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getStructureItems(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getSQLDialect(){ return null; }
	public MyHelperClass toUpperCase(){ return null; }}

class Content {

public MyHelperClass getStructure(){ return null; }
	public MyHelperClass getFieldMap(){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class SQLDialect {

public MyHelperClass setDate(PreparedStatement o0, int o1, Date o2){ return null; }}

class PreparedStatement {

public MyHelperClass setObject(int o0, Object o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class StructureItem {

public MyHelperClass getDataType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }}

class Map {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Date {

}
