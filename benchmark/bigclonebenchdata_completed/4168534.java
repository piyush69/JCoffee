


class c4168534 {
public MyHelperClass getNextId(Connection o0){ return null; }

    public String insertSmsInf(Sms sms) throws Exception {
        String smsId = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        StringBuffer buffer = new StringBuffer();
        try {
            buffer.append("INSERT INTO COMTNSMS\n");
            buffer.append("  (SMS_ID, TRNSMIS_TELNO, TRNSMIS_CN,\n");
            buffer.append("   FRST_REGISTER_ID, FRST_REGIST_PNTTM )\n");
            buffer.append("VALUES\n");
            buffer.append("(?, ?, ?, ?, SYSDATE())");
            MyHelperClass SmsBasicDBUtil = new MyHelperClass();
            conn =(Connection)(Object) SmsBasicDBUtil.getConnection();
            conn.setAutoCommit(false);
            smsId =(String)(Object) getNextId(conn);
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(buffer.toString());
            int index = 0;
            pstmt.setString(++index, smsId);
            pstmt.setString(++index,(String)(Object) sms.getTrnsmitTelno());
            pstmt.setString(++index,(String)(Object) sms.getTrnsmitCn());
            pstmt.setString(++index,(String)(Object) sms.getFrstRegisterId());
            pstmt.executeUpdate();
            conn.commit();
            return smsId;
        } catch (Exception ex) {
            if (conn != null) {
                conn.rollback();
            }
            throw ex;
        } finally {
            MyHelperClass SmsBasicDBUtil = new MyHelperClass();
            SmsBasicDBUtil.close(null, pstmt, conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }
	public MyHelperClass close(Object o0, PreparedStatement o1, Connection o2){ return null; }}

class Sms {

public MyHelperClass getFrstRegisterId(){ return null; }
	public MyHelperClass getTrnsmitCn(){ return null; }
	public MyHelperClass getTrnsmitTelno(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
