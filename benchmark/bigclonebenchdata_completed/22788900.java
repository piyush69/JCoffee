import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22788900 {
public MyHelperClass INFO_VALUE;
	public MyHelperClass INSERT_NODE;
	public MyHelperClass INSERT_INFO;
	public MyHelperClass LOGGER;
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass closeConnection(){ return null; }

//    @Override
    public void saveStructure(long userId, TreeStructureInfo info, List<TreeStructureNode> structure) throws Throwable, DatabaseException {
        if (info == null) throw new NullPointerException("info");
        if (structure == null) throw new NullPointerException("structure");
        try {
            getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            LOGGER.warn("Unable to set autocommit off", e);
        }
        PreparedStatement insertInfoSt = null, insSt = null;
        try {
            insertInfoSt =(PreparedStatement)(Object) getConnection().prepareStatement(INSERT_INFO);
            insertInfoSt.setLong(1, userId);
            insertInfoSt.setString(2, info.getDescription() != null ? info.getDescription() : "");
            insertInfoSt.setString(3, info.getBarcode());
            insertInfoSt.setString(4, info.getName());
            insertInfoSt.setString(5, info.getInputPath());
            insertInfoSt.setString(6, info.getModel());
            insertInfoSt.executeUpdate();
            PreparedStatement seqSt =(PreparedStatement)(Object) getConnection().prepareStatement(INFO_VALUE);
            ResultSet rs =(ResultSet)(Object) seqSt.executeQuery();
            int key = -1;
            while ((boolean)(Object)rs.next()) {
                key =(int)(Object) rs.getInt(1);
            }
            if (key == -1) {
                getConnection().rollback();
                throw new DatabaseException("Unable to obtain new id from DB when executing query: " + insertInfoSt);
            }
            int total = 0;
            for (TreeStructureNode node : structure) {
                insSt =(PreparedStatement)(Object) getConnection().prepareStatement(INSERT_NODE);
                insSt.setLong(1, key);
                insSt.setString(2, node.getPropId());
                insSt.setString(3, node.getPropParent());
                insSt.setString(4, node.getPropName());
                insSt.setString(5, node.getPropPicture());
                insSt.setString(6, node.getPropType());
                insSt.setString(7, node.getPropTypeId());
                insSt.setString(8, node.getPropPageType());
                insSt.setString(9, node.getPropDateIssued());
                insSt.setString(10, node.getPropAltoPath());
                insSt.setString(11, node.getPropOcrPath());
                insSt.setBoolean(12, node.getPropExist());
                total += (int)(Object)insSt.executeUpdate();
            }
            if (total != structure.size()) {
                getConnection().rollback();
                throw new DatabaseException("Unable to insert _ALL_ nodes: " + total + " nodes were inserted of " + structure.size());
            }
            getConnection().commit();
        } catch (SQLException e) {
            LOGGER.error("Queries: \"" + insertInfoSt + "\" and \"" + insSt + "\"", e);
        } finally {
            closeConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass warn(String o0, SQLException o1){ return null; }}

class TreeStructureInfo {

public MyHelperClass getModel(){ return null; }
	public MyHelperClass getInputPath(){ return null; }
	public MyHelperClass getBarcode(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class TreeStructureNode {

public MyHelperClass getPropTypeId(){ return null; }
	public MyHelperClass getPropParent(){ return null; }
	public MyHelperClass getPropPicture(){ return null; }
	public MyHelperClass getPropAltoPath(){ return null; }
	public MyHelperClass getPropExist(){ return null; }
	public MyHelperClass getPropDateIssued(){ return null; }
	public MyHelperClass getPropId(){ return null; }
	public MyHelperClass getPropOcrPath(){ return null; }
	public MyHelperClass getPropType(){ return null; }
	public MyHelperClass getPropName(){ return null; }
	public MyHelperClass getPropPageType(){ return null; }}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
