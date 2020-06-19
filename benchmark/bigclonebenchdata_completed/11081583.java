


class c11081583 {
public MyHelperClass doUnlockTopic(Connection o0, String o1, String o2){ return null; }
	public MyHelperClass doRenameAllVersions(Connection o0, String o1, String o2, String o3){ return null; }

    public void rename(String virtualWiki, String oldTopicName, String newTopicName) throws Exception {
        MyHelperClass DatabaseConnection = new MyHelperClass();
        Connection conn =(Connection)(Object) DatabaseConnection.getConnection();
        try {
            boolean commit = false;
            conn.setAutoCommit(false);
            try {
                MyHelperClass STATEMENT_RENAME = new MyHelperClass();
                PreparedStatement pstm =(PreparedStatement)(Object) conn.prepareStatement(STATEMENT_RENAME);
                try {
                    pstm.setString(1, newTopicName);
                    pstm.setString(2, oldTopicName);
                    pstm.setString(3, virtualWiki);
                    if ((int)(Object)pstm.executeUpdate() == 0) throw new SQLException("Unable to rename topic " + oldTopicName + " on wiki " + virtualWiki);
                } finally {
                    pstm.close();
                }
                doUnlockTopic(conn, virtualWiki, oldTopicName);
                doRenameAllVersions(conn, virtualWiki, oldTopicName, newTopicName);
                commit = true;
            } finally {
                if (commit) conn.commit(); else conn.rollback();
            }
        } finally {
            conn.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
