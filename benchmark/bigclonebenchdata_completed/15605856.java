
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15605856 {
public MyHelperClass validFaxUser(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass Service;
	public MyHelperClass logger;
	public MyHelperClass getJdbcTemplate(){ return null; }
	public MyHelperClass getSegquence(String o0){ return null; }

    public EFaxResult sendFax(SendFaxWrapper parameters) {
        EFaxResult efr = new EFaxResult();
        if (!(Boolean)(Object)validFaxUser(parameters.getUserID(), parameters.getPassWord())) {
            efr.setResultCode(211);
            return efr;
        }
        Connection conn = null;
        String faxKey = getSegquence("t_fax_send") + "";
        String sql = "insert into t_fax_send(faxKey,userID,appcode,sendername," + "sendernumber,sendercompany,sendtime,accountId, userId2, PID, moduleId, CDRType) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Fax fax =(Fax)(Object) parameters.getFax();
        FaxContactor sender =(FaxContactor)(Object) fax.getSender();
        FaxContactor[] receiver =(FaxContactor[])(Object) fax.getReceiver();
        try {
            conn =(Connection)(Object) this.getJdbcTemplate().getDataSource().getConnection();
            conn.setAutoCommit(false);
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setString(1, faxKey);
            pstmt.setString(2,(String)(Object) parameters.getUserID());
            pstmt.setString(3,(String)(Object) parameters.getAppCode());
            pstmt.setString(4,(String)(Object) sender.getContactor());
            pstmt.setString(5,(String)(Object) sender.getFaxNumber());
            pstmt.setString(6,(String)(Object) sender.getCompany());
            pstmt.setString(7,(String)(Object) fax.getSendTime());
            pstmt.setString(8,(String)(Object) parameters.getAccountId());
            pstmt.setString(9,(String)(Object) parameters.getUserId());
            pstmt.setString(10,(String)(Object) parameters.getPID());
            pstmt.setInt(11, parameters.getModuleId());
            pstmt.setInt(12, parameters.getCDRType());
            pstmt.executeUpdate();
            sql = "insert into t_fax_contactor(faxKey,contactorID,contactor,faxnumber,company) values(?,?,?,?,?)";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            for (int k = 0; k < receiver.length; k++) {
                pstmt.setString(1, faxKey);
                pstmt.setString(2,(String)(Object) receiver[k].getContactorID());
                pstmt.setString(3,(String)(Object) receiver[k].getContactor());
                pstmt.setString(4,(String)(Object) receiver[k].getFaxNumber());
                pstmt.setString(5,(String)(Object) receiver[k].getCompany());
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            sql = "insert into t_fax_file(faxKey,fileID,filename,filetype,fileurl,faxpages) values(?,?,?,?,?,?)";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            FaxFile[] files =(FaxFile[])(Object) fax.getFiles();
            for (int h = 0; h < files.length; h++) {
                String fileID = getSegquence("t_Fax_file") + "";
                pstmt.setString(1, faxKey);
                pstmt.setString(2, fileID);
                pstmt.setString(3,(String)(Object) files[h].getFileName());
                pstmt.setString(4,(String)(Object) files[h].getFileType());
                pstmt.setString(5,(String)(Object) files[h].getFileURL());
                pstmt.setInt(6, files[h].getFaxPages());
                Service.writeByteFile(files[h].getFile(), fileID);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            conn.commit();
            efr.setResultCode(100);
            efr.setResultInfo(faxKey);
        } catch (UncheckedIOException e) {
            efr.setResultCode(200);
            try {
                conn.rollback();
            } catch (Exception e1) {
                logger.error("Error validFaxUser", e1);
            }
            logger.error("Error validFaxUser", e);
        } catch (ArithmeticException e) {
            efr.setResultCode(200);
            logger.error("Error write file on sendfax", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    logger.error("Error sendFax on close conn", e);
                }
            }
        }
        return efr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeByteFile(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getDataSource(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class EFaxResult {

public MyHelperClass setResultInfo(String o0){ return null; }
	public MyHelperClass setResultCode(int o0){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Fax {

public MyHelperClass getSendTime(){ return null; }
	public MyHelperClass getSender(){ return null; }
	public MyHelperClass getReceiver(){ return null; }
	public MyHelperClass getFiles(){ return null; }}

class FaxContactor {

public MyHelperClass getFaxNumber(){ return null; }
	public MyHelperClass getCompany(){ return null; }
	public MyHelperClass getContactorID(){ return null; }
	public MyHelperClass getContactor(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeBatch(){ return null; }}

class FaxFile {

public MyHelperClass getFileType(){ return null; }
	public MyHelperClass getFaxPages(){ return null; }
	public MyHelperClass getFileURL(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SendFaxWrapper {

public MyHelperClass getAccountId(){ return null; }
	public MyHelperClass getUserID(){ return null; }
	public MyHelperClass getCDRType(){ return null; }
	public MyHelperClass getAppCode(){ return null; }
	public MyHelperClass getModuleId(){ return null; }
	public MyHelperClass getPID(){ return null; }
	public MyHelperClass getFax(){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getPassWord(){ return null; }}
