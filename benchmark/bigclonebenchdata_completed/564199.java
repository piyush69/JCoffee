
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c564199 {
public MyHelperClass student;
	public MyHelperClass dbMan;
	public MyHelperClass settings;
	public MyHelperClass DBSettings;
	public MyHelperClass strPOSPrefix;
	public MyHelperClass hasStudentCredit(){ return null; }
	public MyHelperClass round2Places(Double o0){ return null; }
	public MyHelperClass getHostName(){ return null; }

    private boolean doStudentCreditUpdate(Double dblCAmnt, String stuID) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Boolean blOk = false;
        String strMessage = "";
        try {
            MyHelperClass dbMan = new MyHelperClass();
            conn =(Connection)(Object) dbMan.getPOSConnection();
            conn.setAutoCommit(false);
            stmt =(Statement)(Object) conn.createStatement();
            String host =(String)(Object) getHostName();
            String stuId =(String)(Object) student.getStudentNumber();
            String building =(String)(Object) settings.get(DBSettings.MAIN_BUILDING);
            String cashier =(String)(Object) dbMan.getPOSUser();
            if ((boolean)(Object)hasStudentCredit()) {
                stmt =(Statement)(Object) conn.createStatement();
                if ((int)(Object)stmt.executeUpdate("UPDATE " + strPOSPrefix + "studentcredit set credit_amount = credit_amount + " + round2Places(dblCAmnt) + " WHERE credit_active = '1' and credit_studentid = '" + stuId + "'") == 1) {
                    stmt.close();
                    stmt =(Statement)(Object) conn.createStatement();
                    if ((int)(Object)stmt.executeUpdate("UPDATE " + strPOSPrefix + "studentcredit set credit_lastused = NOW() where credit_active = '1' and credit_studentid = '" + stuId + "'") == 1) {
                        stmt.close();
                        stmt =(Statement)(Object) conn.createStatement();
                        if ((int)(Object)stmt.executeUpdate("INSERT into " + strPOSPrefix + "studentcredit_log ( scl_studentid, scl_action, scl_datetime ) values( '" + stuId + "', '" + round2Places(dblCAmnt) + "', NOW() )") == 1) {
                            stmt.close();
                            blOk = true;
                        } else {
                            strMessage = "Unable to update student credit log.";
                            blOk = false;
                        }
                    } else {
                        strMessage = "Unable to update student credit account.";
                        blOk = false;
                    }
                } else {
                    strMessage = "Unable to update student credit account.";
                    blOk = false;
                }
            } else {
                stmt =(Statement)(Object) conn.createStatement();
                if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "studentcredit (credit_amount,credit_active,credit_studentid,credit_lastused) values('" + round2Places(dblCAmnt) + "','1','" + stuId + "', NOW())") == 1) {
                    stmt.close();
                    stmt =(Statement)(Object) conn.createStatement();
                    if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "studentcredit_log ( scl_studentid, scl_action, scl_datetime ) values( '" + stuId + "', '" + round2Places(dblCAmnt) + "', NOW() )") == 1) {
                        stmt.close();
                        blOk = true;
                    } else {
                        strMessage = "Unable to update student credit log.";
                        blOk = false;
                    }
                } else {
                    strMessage = "Unable to create new student credit account.";
                    blOk = false;
                }
            }
            if (blOk) {
                stmt =(Statement)(Object) conn.createStatement();
                if ((int)(Object)stmt.executeUpdate("insert into " + strPOSPrefix + "creditTrans ( ctStudentNumber, ctCreditAction, ctBuilding, ctRegister, ctUser, ctDateTime ) values( '" + stuId + "', '" + round2Places(dblCAmnt) + "', '" + building + "', '" + host + "', '" + cashier + "', NOW() )") == 1) {
                    stmt.close();
                    blOk = true;
                } else blOk = false;
            }
            if (blOk) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                throw new Exception("Error detected during credit adjustment!  " + strMessage);
            }
        } catch (Exception exp) {
            try {
                conn.rollback();
            } catch (UncheckedIOException sqlEx2) {
                System.err.println("Rollback failed: " + sqlEx2.getMessage());
                return false;
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (UncheckedIOException sqlEx) {
                        rs = null;
                    }
                    if (stmt != null) {
                        try {
                            stmt.close();
                        } catch (UncheckedIOException sqlEx) {
                            stmt = null;
                        } catch (Exception e) {
                            System.err.println("Exception: " + e.getMessage());
                            System.err.println(e);
                        }
                    }
                }
            }
            exp.printStackTrace();
            throw new Exception("Error detected during credit adjustment: " + exp.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MAIN_BUILDING;
public MyHelperClass getStudentNumber(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass getPOSConnection(){ return null; }
	public MyHelperClass getPOSUser(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
