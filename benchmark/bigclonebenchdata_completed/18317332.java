import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18317332 {
public MyHelperClass m_item;
	public MyHelperClass m_itemTable;
	public MyHelperClass m_components;
	public MyHelperClass m_itemCache;
	public MyHelperClass getInsertComponentPrepStmtSql(){ return null; }

        void execute(Connection conn, Component parent, String context, final ProgressMonitor progressMonitor, ProgressWrapper progressWrapper) throws Exception {
            MyHelperClass m_components = new MyHelperClass();
            int noOfComponents = m_components.length;
            Statement statement = null;
            MyHelperClass m_update = new MyHelperClass();
            StringBuffer pmNoteBuf = new StringBuffer(m_update ? "Updating " : "Creating ");
            MyHelperClass m_itemNameAbbrev = new MyHelperClass();
            pmNoteBuf.append(m_itemNameAbbrev);
            pmNoteBuf.append(" ");
            MyHelperClass m_itemNameValue = new MyHelperClass();
            pmNoteBuf.append(m_itemNameValue);
            final String pmNote = pmNoteBuf.toString();
            progressMonitor.setNote(pmNote);
            try {
                conn.setAutoCommit(false);
                int id = -1;
                MyHelperClass m_update = new MyHelperClass();
                if (m_update) {
                    statement = conn.createStatement();
                    MyHelperClass m_id = new MyHelperClass();
                    String sql = getUpdateSql(noOfComponents, m_id);
                    statement.executeUpdate(sql);
                    MyHelperClass m_id = new MyHelperClass();
                    id = m_id;
                    MyHelperClass m_indexesChanged = new MyHelperClass();
                    if (m_indexesChanged) deleteComponents(conn, id);
                } else {
                    PreparedStatement pStmt = getInsertPrepStmt(conn, noOfComponents);
                    pStmt.executeUpdate();
                    MyHelperClass DbCommon = new MyHelperClass();
                    Integer res = DbCommon.getAutoGenId(parent, context, pStmt);
                    if (res == null) return;
                    id = res.intValue();
                }
                MyHelperClass m_update = new MyHelperClass();
                if (!m_update || m_indexesChanged) {
                    PreparedStatement insertCompPrepStmt = conn.prepareStatement(getInsertComponentPrepStmtSql());
                    for (int i = 0; i < noOfComponents; i++) {
                        createComponent(progressMonitor, m_components, pmNote, id, i, insertCompPrepStmt);
                    }
                }
                conn.commit();
                m_itemTable.getPrimaryId().setVal(m_item, id);
                m_itemCache.updateCache(m_item, id);
            } catch (SQLException ex) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                throw ex;
            } finally {
                if (statement != null) {
                    statement.close();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

}

class Component {

}

class ProgressMonitor {

}

class ProgressWrapper {

}

class Statement {

}

class PreparedStatement {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
