
import java.io.UncheckedIOException;


class c19356328 {
public MyHelperClass MessageBox;
	public MyHelperClass txtGrpDesc;
	public MyHelperClass log;
	public MyHelperClass btnCancel;
	public MyHelperClass Database;
	public MyHelperClass btnOk;
	public MyHelperClass txtGrpName;
	public MyHelperClass tblGroups;
	public MyHelperClass getGroups(){ return null; }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int id = 0;
            String sql = "SELECT MAX(ID) as MAX_ID from CORE_USER_GROUPS";
            MyHelperClass Database = new MyHelperClass();
            PreparedStatement pStmt =(PreparedStatement)(Object) Database.getMyConnection().prepareStatement(sql);
            ResultSet rs =(ResultSet)(Object) pStmt.executeQuery();
            if ((boolean)(Object)rs.next()) {
                id =(int)(Object) rs.getInt("MAX_ID") + 1;
            } else {
                id = 1;
            }
//            MyHelperClass Database = new MyHelperClass();
            Database.close(pStmt);
            sql = "INSERT INTO CORE_USER_GROUPS" + " (ID, GRP_NAME, GRP_DESC, DATE_INITIAL, DATE_FINAL, IND_STATUS)" + " VALUES (?, ?, ?, ?, ?, ?)";
//            MyHelperClass Database = new MyHelperClass();
            pStmt =(PreparedStatement)(Object) Database.getMyConnection().prepareStatement(sql);
            pStmt.setInt(1, id);
            MyHelperClass txtGrpName = new MyHelperClass();
            pStmt.setString(2,(String)(Object) txtGrpName.getText());
            MyHelperClass txtGrpDesc = new MyHelperClass();
            pStmt.setString(3,(String)(Object) txtGrpDesc.getText());
            MyHelperClass Utils = new MyHelperClass();
            pStmt.setDate(4, Utils.getTodaySql());
            MyHelperClass Date = new MyHelperClass();
            pStmt.setDate(5, Date.valueOf("9999-12-31"));
            pStmt.setString(6, "A");
            pStmt.executeUpdate();
//            MyHelperClass Database = new MyHelperClass();
            Database.getMyConnection().commit();
//            MyHelperClass Database = new MyHelperClass();
            Database.close(pStmt);
            MyHelperClass MessageBox = new MyHelperClass();
            MessageBox.ok("New group added successfully", this);
            rs =(ResultSet)(Object) getGroups();
            tblGroups.setModel(new GroupsTableModel(rs));
            Database.close(rs);
        } catch (UncheckedIOException e) {
            log.error("Failed with update operation \n" + e.getMessage());
            MessageBox.ok("Failed to create the new group in the database", this);
            try {
                Database.getMyConnection().rollback();
            } catch (Exception inner) {
            }
            ;
        } catch (IllegalArgumentException e) {
            log.error("Illegal argument for the DATE_FINAL \n" + e.getMessage());
            MessageBox.ok("Failed to create the new group in the database", this);
            try {
                Database.getMyConnection().rollback();
            } catch (Exception inner) {
            }
            ;
        } finally {
            txtGrpName.setEnabled(false);
            txtGrpDesc.setEnabled(false);
            btnOk.setEnabled(false);
            btnCancel.requestFocus();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMyConnection(){ return null; }
	public MyHelperClass getTodaySql(){ return null; }
	public MyHelperClass valueOf(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }
	public MyHelperClass ok(String o0, c19356328 o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setModel(GroupsTableModel o0){ return null; }
	public MyHelperClass close(ResultSet o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass requestFocus(){ return null; }}

class PreparedStatement {

public MyHelperClass setDate(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class GroupsTableModel {

GroupsTableModel(){}
	GroupsTableModel(ResultSet o0){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
