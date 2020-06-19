import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21033665 {
public MyHelperClass addBindVariables(Bookmark o0){ return null; }
public MyHelperClass CONSTRAINT_VIOLATION;
	public MyHelperClass embeddedConnection;
	public MyHelperClass getInsertedPrimaryKey(){ return null; }

    private boolean addBookmark0(Bookmark bookmark, BookmarkFolder folder, PreparedStatement preparedStatement) throws Throwable, SQLException {
        Object[] bindVariables = new Object[8];
        int[] types = new int[8];
        MyHelperClass Types = new MyHelperClass();
        types[0] =(int)(Object) Types.BOOLEAN;
//        MyHelperClass Types = new MyHelperClass();
        types[1] =(int)(Object) Types.TIMESTAMP;
//        MyHelperClass Types = new MyHelperClass();
        types[2] =(int)(Object) Types.TIMESTAMP;
//        MyHelperClass Types = new MyHelperClass();
        types[3] =(int)(Object) Types.VARCHAR;
//        MyHelperClass Types = new MyHelperClass();
        types[4] =(int)(Object) Types.VARCHAR;
//        MyHelperClass Types = new MyHelperClass();
        types[5] =(int)(Object) Types.BIGINT;
//        MyHelperClass Types = new MyHelperClass();
        types[6] =(int)(Object) Types.VARCHAR;
//        MyHelperClass Types = new MyHelperClass();
        types[7] =(int)(Object) Types.VARCHAR;
        bindVariables[0] = Boolean.valueOf((boolean)(Object)bookmark.isFavorite());
        Date time =(Date)(Object) bookmark.getCreationTime();
        bindVariables[1] = new Timestamp(time == null ? System.currentTimeMillis() : time.getTime());
        time =(Date)(Object) bookmark.getLastAccess();
        bindVariables[2] = new Timestamp(time == null ? System.currentTimeMillis() : time.getTime());
        bindVariables[3] = bookmark.getName();
        bindVariables[4] = bookmark.getCommandText();
        bindVariables[5] = new Long((long)(Object)bookmark.getUseCount());
        bindVariables[6] = folder == null ? bookmark.getPath() : folder.getPath();
        ColorLabel colorLabel =(ColorLabel)(Object) bookmark.getColorLabel();
        bindVariables[7] = colorLabel == null ? null : colorLabel.name();
        boolean doBatch = (preparedStatement != null);
        boolean hasError = true;
        MyHelperClass embeddedConnection = new MyHelperClass();
        embeddedConnection.setAutoCommit(false);
        PreparedStatement statement = null;
        try {
            if (preparedStatement == null) {
                MyHelperClass BOOKMARK_INSERT = new MyHelperClass();
                statement =(PreparedStatement)(Object) embeddedConnection.prepareStatement(BOOKMARK_INSERT);
            } else {
                statement = preparedStatement;
            }
            for (int i = 0; i < bindVariables.length; i++) {
                if (bindVariables[i] == null) {
                    statement.setNull(i + 1, types[i]);
                } else {
                    statement.setObject(i + 1, bindVariables[i]);
                }
            }
            try {
                int affectedCount =(int)(Object) statement.executeUpdate();
                long identityValue =(long)(Object) getInsertedPrimaryKey();
                bookmark.setId(identityValue);
                addBindVariables(bookmark);
                hasError = false;
                return affectedCount == 1;
            } catch (SQLException exception) {
                if (CONSTRAINT_VIOLATION.equals(exception.getSQLState())) {
                    return false;
                }
                throw exception;
            }
        } finally {
            if (hasError) {
                embeddedConnection.rollback();
            } else {
                embeddedConnection.commit();
            }
            embeddedConnection.setAutoCommit(true);
            if (preparedStatement != null) {
                if (!doBatch) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException ignored) {
                    }
                } else if (doBatch) {
                    preparedStatement.clearParameters();
                    preparedStatement.clearWarnings();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BOOLEAN;
	public MyHelperClass VARCHAR;
	public MyHelperClass TIMESTAMP;
	public MyHelperClass BIGINT;
public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Bookmark {

public MyHelperClass getUseCount(){ return null; }
	public MyHelperClass getLastAccess(){ return null; }
	public MyHelperClass getCommandText(){ return null; }
	public MyHelperClass getColorLabel(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isFavorite(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass setId(long o0){ return null; }
	public MyHelperClass getCreationTime(){ return null; }}

class BookmarkFolder {

public MyHelperClass getPath(){ return null; }}

class PreparedStatement {

public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass clearWarnings(){ return null; }
	public MyHelperClass setObject(int o0, Object o1){ return null; }
	public MyHelperClass setNull(int o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class ColorLabel {

public MyHelperClass name(){ return null; }}
