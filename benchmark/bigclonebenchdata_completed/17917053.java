import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17917053 {
public MyHelperClass NAME;
	public MyHelperClass CHECK_KEYWORDS;
	public MyHelperClass TABLE;
	public MyHelperClass cTables;
	public MyHelperClass COLUMNS;
	public MyHelperClass COMMENT_POLICY;
	public MyHelperClass close(Object o0, PreparedStatement o1, ResultSet o2, boolean o3){ return null; }
	public MyHelperClass isModelChanged(Connection o0, List<MetaTable,List<MetaColumn,List<MetaIndex o1){ return null; }
	public MyHelperClass executeUpdate(Appendable o0, Statement o1, MetaTable o2){ return null; }
	public MyHelperClass getSchemas(List<MetaTable o0){ return null; }
public MyHelperClass FOR_NEW_OBJECT;
	public MyHelperClass LOGGER;
	public MyHelperClass MessageFormat;
	public MyHelperClass Level;
	public MyHelperClass ALWAYS;
	public MyHelperClass EXCEPTION;
	public MyHelperClass WARNING;
	public MyHelperClass NEVER;
	public MyHelperClass VALIDATE;
	public MyHelperClass DO_NOTHING;
	public MyHelperClass CREATE_OR_UPDATE_DDL;
	public MyHelperClass CREATE_DDL;
	public MyHelperClass TABLES;
	public MyHelperClass Session;
	public MyHelperClass ormHandler;
	public MyHelperClass ORM2DLL_POLICY;
	public MyHelperClass INHERITED;
	public MyHelperClass ON_ANY_CHANGE;
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass findFirstSequencer(){ return null; }
	public MyHelperClass isFilled(Appendable o0){ return null; }
	public MyHelperClass getTableTotalCount(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass isSequenceTableRequired(){ return null; }
	public MyHelperClass getDialect(){ return null; }

    public void create(Session session)  throws Throwable {
        Connection conn = session.getConnection(this, true);
        Statement stat = null;
        StringBuilder out = new StringBuilder(256);
        Appendable sql = out;
        List<MetaTable> tables = new ArrayList<MetaTable>();
        List<MetaColumn> newColumns = new ArrayList<MetaColumn>();
        List<MetaColumn> foreignColumns = new ArrayList<MetaColumn>();
        List<MetaIndex> indexes = new ArrayList<MetaIndex>();
        boolean createSequenceTable = false;
        int tableTotalCount =(int)(Object) getTableTotalCount();
        boolean anyChange = false;
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
                    switch(ORM2DLL_POLICY.of(this)) {
                        case VALIDATE:
                        case WARNING:
                            throw new IllegalStateException(logMsg, exception);
                        case CREATE_DDL:
                        case CREATE_OR_UPDATE_DDL:
                        case INHERITED:
                            createSequenceTable = true;
                    }
                }
                if (LOGGER.isLoggable(Level.INFO)) {
                    logMsg = "Table ''{0}'' {1} available on the database ''{2}''.";
                    logMsg = MessageFormat.format(logMsg, getDialect().getSeqTableModel().getTableName(), exception != null ? "is not" : "is", getId());
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
            switch(ORM2DLL_POLICY.of(this)) {
                case CREATE_DDL:
                    ddlOnly = true;
                case CREATE_OR_UPDATE_DDL:
                case VALIDATE:
                case WARNING:
                case INHERITED:
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
                if ((boolean)(Object)isFilled(sql)) {
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
                    executeUpdate(sql, stat, table);
                    foreignColumns.addAll(table.getForeignColumns());
                    anyChange = true;
                }
            }
            for (MetaColumn column : newColumns) {
                out.setLength(0);
                sql = getDialect().printAlterTable(column, out);
                executeUpdate(sql, stat, column.getTable());
                anyChange = true;
                if (column.isForeignKey()) {
                    foreignColumns.add(column);
                }
            }
            for (MetaIndex index : indexes) {
                out.setLength(0);
                sql = getDialect().printIndex(index, out);
                executeUpdate(sql, stat, TABLE.of(index));
                anyChange = true;
            }
            for (MetaColumn column : foreignColumns) {
                if (column.isForeignKey()) {
                    out.setLength(0);
                    MetaTable table = TABLE.of(column);
                    sql = getDialect().printForeignKey(column, table, out);
                    executeUpdate(sql, stat, column.getTable());
                    anyChange = true;
                }
            }
            if (createSequenceTable) {
                out.setLength(0);
                sql = getDialect().printSequenceTable(this, out);
                final MetaTable table = new MetaTable();
                MetaTable.ORM2DLL_POLICY.setValue(table, ORM2DLL_POLICY.getDefault());
                executeUpdate(sql, stat, table);
            }
//            @SuppressWarnings("unchecked") final List<MetaTable> cTables;
            switch(COMMENT_POLICY.of(ormHandler.getParameters())) {
                case FOR_NEW_OBJECT:
                    cTables = tables;
                    break;
                case ALWAYS:
                    cTables = TABLES.getList(this);
                    break;
                case ON_ANY_CHANGE:
                    cTables = anyChange ? TABLES.getList(this) : (List) Collections.emptyList();
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
	public MyHelperClass WARNING;
	public MyHelperClass SQL_ILLEGAL;
public MyHelperClass printSequenceTable(c17917053 o0, StringBuilder o1){ return null; }
	public MyHelperClass printIndex(MetaIndex o0, StringBuilder o1){ return null; }
	public MyHelperClass printSequenceCurrentValue(MyHelperClass o0, StringBuilder o1){ return null; }
	public MyHelperClass printForeignKey(MetaColumn o0, MetaTable o1, StringBuilder o2){ return null; }
	public MyHelperClass getParameters(){ return null; }
	public MyHelperClass getKeywordSet(Connection o0){ return null; }
	public MyHelperClass printAlterTable(MetaColumn o0, StringBuilder o1){ return null; }
	public MyHelperClass printCreateSchema(String o0, StringBuilder o1){ return null; }
	public MyHelperClass of(c17917053 o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass printTable(MetaTable o0, StringBuilder o1){ return null; }
	public MyHelperClass getList(c17917053 o0){ return null; }
	public MyHelperClass getSeqTableModel(){ return null; }}

class Session {

public MyHelperClass getConnection(c17917053 o0, boolean o1){ return null; }}

class Connection {

public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class MetaTable {
public MyHelperClass ORM2DLL_POLICY;
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
