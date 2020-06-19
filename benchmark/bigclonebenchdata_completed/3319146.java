import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3319146 {
public MyHelperClass NAME;
	public MyHelperClass CHECK_KEYWORDS;
	public MyHelperClass TABLE;
	public MyHelperClass ORM2DLL_POLICY;
	public MyHelperClass COLUMNS;
	public MyHelperClass COMMENT_POLICY;
	public MyHelperClass close(Object o0, PreparedStatement o1, ResultSet o2, boolean o3){ return null; }
	public MyHelperClass isModelChanged(Connection o0, List<MetaTable,List<MetaColumn,List<MetaIndex o1){ return null; }
	public MyHelperClass executeUpdate(Appendable o0, Statement o1){ return null; }
	public MyHelperClass createTableComments(List<MetaTable o0, Statement o1, StringBuilder o2){ return null; }
	public MyHelperClass getSchemas(List<MetaTable o0){ return null; }
public MyHelperClass FOR_NEW_OBJECT;
	public MyHelperClass LOGGER;
	public MyHelperClass MessageFormat;
	public MyHelperClass Level;
	public MyHelperClass ALWAYS;
	public MyHelperClass EXCEPTION;
	public MyHelperClass WARNING;
	public MyHelperClass NEVER;
	public MyHelperClass SqlDialect;
	public MyHelperClass VALIDATE;
	public MyHelperClass DO_NOTHING;
	public MyHelperClass CREATE_OR_UPDATE_DDL;
	public MyHelperClass CREATE_DDL;
	public MyHelperClass TABLES;
	public MyHelperClass Session;
	public MyHelperClass ormHandler;
	public MyHelperClass ON_ANY_CHANGE;
	public MyHelperClass isUsable(Appendable o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass findFirstSequencer(){ return null; }
	public MyHelperClass getTableTotalCount(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass isSequenceTableRequired(){ return null; }
	public MyHelperClass getDialect(){ return null; }

    public void create(Session session)  throws Throwable {
        Connection conn = session.getConnection(this);
        Statement stat = null;
        StringBuilder out = new StringBuilder(256);
        Appendable sql = out;
        List<MetaTable> tables = new ArrayList<MetaTable>();
        List<MetaColumn> newColumns = new ArrayList<MetaColumn>();
        List<MetaColumn> foreignColumns = new ArrayList<MetaColumn>();
        List<MetaIndex> indexes = new ArrayList<MetaIndex>();
        boolean createSequenceTable = false;
        int tableTotalCount =(int)(Object) getTableTotalCount();
        try {
            stat = conn.createStatement();
            if ((boolean)(Object)isSequenceTableRequired()) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                Throwable exception = null;
                String logMsg = "";
                try {
                    sql = getDialect().printSequenceCurrentValue(findFirstSequencer(), out);
                    ps = conn.prepareStatement(sql.toString());
                    ps.setString(1, "-");
                    rs = ps.executeQuery();
                } catch (Throwable e) {
                    exception = e;
                }
                if (exception != null) {
                    switch(ORM2DLL_POLICY.of(ormHandler.getParameters())) {
                        case VALIDATE:
                            throw new IllegalStateException(logMsg, exception);
                        case CREATE_DDL:
                        case CREATE_OR_UPDATE_DDL:
                            createSequenceTable = true;
                    }
                }
                if (LOGGER.isLoggable(Level.INFO)) {
                    logMsg = "Table '" + SqlDialect.COMMON_SEQ_TABLE_NAME + "' {0} available on the database '{1}'.";
                    logMsg = MessageFormat.format(logMsg, exception != null ? "is not" : "is", getId());
                    LOGGER.log(Level.INFO, logMsg);
                }
                try {
                    if (exception != null) {
                        conn.rollback();
                    }
                } finally {
                    close(null, ps, rs, false);
                }
            }
            boolean ddlOnly = false;
            switch(ORM2DLL_POLICY.of(ormHandler.getParameters())) {
                case CREATE_DDL:
                    ddlOnly = true;
                case CREATE_OR_UPDATE_DDL:
                case VALIDATE:
                    boolean change = isModelChanged(conn, tables, newColumns, indexes);
                    if (change && ddlOnly) {
                        if (tables.size() < tableTotalCount) {
                            return;
                        }
                    }
                    break;
                case DO_NOTHING:
                default:
                    return;
            }
            switch(CHECK_KEYWORDS.of(getParams())) {
                case WARNING:
                case EXCEPTION:
                    Set<String> keywords = getDialect().getKeywordSet(conn);
                    for (MetaTable table : tables) {
                        if (table.isTable()) {
                            checkKeyWord(NAME.of(table), table, keywords);
                            for (MetaColumn column : COLUMNS.of(table)) {
                                checkKeyWord(NAME.of(column), table, keywords);
                            }
                        }
                    }
                    for (MetaColumn column : newColumns) {
                        checkKeyWord(NAME.of(column), column.getTable(), keywords);
                    }
                    for (MetaIndex index : indexes) {
                        checkKeyWord(NAME.of(index), TABLE.of(index), keywords);
                    }
            }
            if (tableTotalCount == tables.size()) for (String schema : getSchemas(tables)) {
                out.setLength(0);
                sql = getDialect().printCreateSchema(schema, out);
                if ((boolean)(Object)isUsable(sql)) {
                    try {
                        stat.executeUpdate(sql.toString());
                    } catch (SQLException e) {
                        LOGGER.log(Level.INFO, "{0}: {1}; {2}", new Object[] { e.getClass().getName(), sql.toString(), e.getMessage() });
                        conn.rollback();
                    }
                }
            }
            int tableCount = 0;
            for (MetaTable table : tables) {
                if (table.isTable()) {
                    tableCount++;
                    out.setLength(0);
                    sql = getDialect().printTable(table, out);
                    executeUpdate(sql, stat);
                    foreignColumns.addAll(table.getForeignColumns());
                }
            }
            for (MetaColumn column : newColumns) {
                out.setLength(0);
                sql = getDialect().printAlterTable(column, out);
                executeUpdate(sql, stat);
                if (column.isForeignKey()) {
                    foreignColumns.add(column);
                }
            }
            for (MetaIndex index : indexes) {
                out.setLength(0);
                sql = getDialect().printIndex(index, out);
                executeUpdate(sql, stat);
            }
            for (MetaColumn column : foreignColumns) {
                if (column.isForeignKey()) {
                    out.setLength(0);
                    MetaTable table = TABLE.of(column);
                    sql = getDialect().printForeignKey(column, table, out);
                    executeUpdate(sql, stat);
                }
            }
            if (createSequenceTable) {
                out.setLength(0);
                sql = getDialect().printSequenceTable(this, out);
                executeUpdate(sql, stat);
            }
            List<MetaTable> cTables = null;
            switch(COMMENT_POLICY.of(ormHandler.getParameters())) {
                case FOR_NEW_OBJECT:
                    cTables = tables;
                    break;
                case ALWAYS:
                case ON_ANY_CHANGE:
                    cTables = TABLES.getList(this);
                    break;
                case NEVER:
                    cTables = Collections.emptyList();
                    break;
                default:
                    throw new IllegalStateException("Unsupported parameter");
            }
            if (!cTables.isEmpty()) {
                sql = out;
                createTableComments(cTables, stat, out);
            }
            conn.commit();
        } catch (Throwable e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                LOGGER.log(Level.WARNING, "Can't rollback DB" + getId(), ex);
            }
            throw new IllegalArgumentException(Session.SQL_ILLEGAL + sql, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass COMMON_SEQ_TABLE_NAME;
	public MyHelperClass WARNING;
	public MyHelperClass SQL_ILLEGAL;
public MyHelperClass printIndex(MetaIndex o0, StringBuilder o1){ return null; }
	public MyHelperClass printSequenceCurrentValue(MyHelperClass o0, StringBuilder o1){ return null; }
	public MyHelperClass printForeignKey(MetaColumn o0, MetaTable o1, StringBuilder o2){ return null; }
	public MyHelperClass printSequenceTable(c3319146 o0, StringBuilder o1){ return null; }
	public MyHelperClass getParameters(){ return null; }
	public MyHelperClass getKeywordSet(Connection o0){ return null; }
	public MyHelperClass getList(c3319146 o0){ return null; }
	public MyHelperClass printAlterTable(MetaColumn o0, StringBuilder o1){ return null; }
	public MyHelperClass printCreateSchema(String o0, StringBuilder o1){ return null; }
	public MyHelperClass printTable(MetaTable o0, StringBuilder o1){ return null; }}

class Session {

public MyHelperClass getConnection(c3319146 o0){ return null; }}

class Connection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class MetaTable {

public MyHelperClass getForeignColumns(){ return null; }
	public MyHelperClass isTable(){ return null; }}

class MetaColumn {

public MyHelperClass getTable(){ return null; }
	public MyHelperClass isForeignKey(){ return null; }}

class MetaIndex {

}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
