


class c8056910 {
public MyHelperClass get_TrxName(){ return null; }
public MyHelperClass DB;
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }

//    @Override
    protected String doIt() throws Exception {
        PreparedStatement insertStmt = null;
        try {
            MyHelperClass year = new MyHelperClass();
            insertStmt =(PreparedStatement)(Object) DB.prepareStatement("INSERT INTO AD_Sequence_No(AD_SEQUENCE_ID, CALENDARYEAR, " + "AD_CLIENT_ID, AD_ORG_ID, ISACTIVE, CREATED, CREATEDBY, " + "UPDATED, UPDATEDBY, CURRENTNEXT) " + "(SELECT AD_Sequence_ID, '" + year + "', " + "AD_Client_ID, AD_Org_ID, IsActive, Created, CreatedBy, " + "Updated, UpdatedBy, StartNo " + "FROM AD_Sequence a " + "WHERE StartNewYear = 'Y' AND NOT EXISTS ( " + "SELECT AD_Sequence_ID " + "FROM AD_Sequence_No b " + "WHERE a.AD_Sequence_ID = b.AD_Sequence_ID " + "AND CalendarYear = ?)) ", get_TrxName());
//            MyHelperClass year = new MyHelperClass();
            insertStmt.setString(1, year);
            insertStmt.executeUpdate();
            commit();
        } catch (Exception ex) {
            rollback();
            throw ex;
        } finally {
            DB.close(insertStmt);
        }
        return "Sequence No updated successfully";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass prepareStatement(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(PreparedStatement o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
