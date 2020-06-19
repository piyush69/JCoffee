
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1293656 {
public MyHelperClass FidoDataSource;
	public MyHelperClass getCurrentId(Statement o0){ return null; }
	public MyHelperClass contains(Statement o0, int o1){ return null; }

    public int addDecisionInstruction(int condition, String frameSlot, String linkName, int objectId, String attribute, int positive, int negative) throws FidoDatabaseException, ObjectNotFoundException, InstructionNotFoundException {
        try {
            Connection conn = null;
            Statement stmt = null;
            try {
                MyHelperClass ConditionalOperatorTable = new MyHelperClass();
                if ((condition == (int)(Object)ConditionalOperatorTable.CONTAINS_LINK) || (condition == (int)(Object)ConditionalOperatorTable.NOT_CONTAINS_LINK)) {
                    ObjectTable ot = new ObjectTable();
                    if ((boolean)(Object)ot.contains(objectId) == false) throw new ObjectNotFoundException((String)(Object)objectId);
                }
                conn =(Connection)(Object) FidoDataSource.getConnection();
                conn.setAutoCommit(false);
                stmt =(Statement)(Object) conn.createStatement();
                if ((boolean)(Object)contains(stmt, positive) == false) throw new InstructionNotFoundException((String)(Object)positive);
                if ((boolean)(Object)contains(stmt, negative) == false) throw new InstructionNotFoundException((String)(Object)negative);
                String sql = "insert into Instructions (Type, Operator, FrameSlot, LinkName, ObjectId, AttributeName) " + "values (2, " + condition + ", '" + frameSlot + "', '" + linkName + "', " + objectId + ", '" + attribute + "')";
                stmt.executeUpdate(sql);
                int id =(int)(Object) getCurrentId(stmt);
                InstructionGroupTable groupTable = new InstructionGroupTable();
                groupTable.deleteInstruction(stmt, id);
                if (positive != -1) groupTable.addInstructionAt(stmt, id, 1, positive);
                if (negative != -1) groupTable.addInstructionAt(stmt, id, 2, negative);
                conn.commit();
                return id;
            } catch (UncheckedIOException e) {
                if (conn != null) conn.rollback();
                throw e;
            } finally {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        } catch (UncheckedIOException e) {
            throw new FidoDatabaseException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_CONTAINS_LINK;
	public MyHelperClass CONTAINS_LINK;
public MyHelperClass getConnection(){ return null; }}

class FidoDatabaseException extends Exception{
	public FidoDatabaseException(String errorMessage) { super(errorMessage); }
}

class ObjectNotFoundException extends Exception{
	public ObjectNotFoundException(String errorMessage) { super(errorMessage); }
}

class InstructionNotFoundException extends Exception{
	public InstructionNotFoundException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ObjectTable {

public MyHelperClass contains(int o0){ return null; }}

class InstructionGroupTable {

public MyHelperClass deleteInstruction(Statement o0, int o1){ return null; }
	public MyHelperClass addInstructionAt(Statement o0, int o1, int o2, int o3){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
