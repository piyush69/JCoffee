import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6134110 {
public MyHelperClass Tools;
	public MyHelperClass IntChatDatabaseOperations;
	public MyHelperClass RuntimeParameters;
	public MyHelperClass MessageTemplates;
	public MyHelperClass insertBLOB(Connection o0, IntChatServletInputStream o1, long o2, long o3, long o4){ return null; }
	public MyHelperClass doAuth(HttpServletRequest o0, HttpServletResponse o1){ return null; }

//    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        if (doAuth(request, response)) {
            Connection conn = null;
            try {
                MyHelperClass icsm = new MyHelperClass();
                int UID = icsm.getIntChatSession(request).getUID();
//                MyHelperClass icsm = new MyHelperClass();
                conn = getJDBCConnection(icsm.getHeavyDatabaseConnectionPool(), request, response, HttpServletResponse.SC_SERVICE_UNAVAILABLE);
                if (conn == null) return;
                ResultSet rs = IntChatDatabaseOperations.executeQuery(conn, "SELECT id FROM ic_messagetypes WHERE templatename='" + MessageTemplates.IC_FILES + "' LIMIT 1");
                if (rs.next()) {
                    int fileTypeID = rs.getInt("id");
                    MyHelperClass IntChatConstants = new MyHelperClass();
                    String recipients = request.getHeader(IntChatConstants.HEADER_FILERECIPIENTS);
                    rs.getStatement().close();
                    rs = null;
                    if (recipients != null) {
                        MyHelperClass Tools = new MyHelperClass();
                        HashMap<String, String> hm = Tools.parseMultiparamLine(request.getHeader("Content-Disposition"));
                        MyHelperClass IntChatServerDefaults = new MyHelperClass();
                        String fileName = URLDecoder.decode(hm.get("filename"), IntChatServerDefaults.ENCODING);
                        long fileLength = (request.getHeader("Content-Length") != null ? Long.parseLong(request.getHeader("Content-Length")) : -1);
//                        MyHelperClass IntChatConstants = new MyHelperClass();
                        fileLength = (request.getHeader(IntChatConstants.HEADER_FILELENGTH) != null ? Long.parseLong(request.getHeader(IntChatConstants.HEADER_FILELENGTH)) : fileLength);
                        MyHelperClass ParameterNames = new MyHelperClass();
                        long maxFileSize = RuntimeParameters.getIntValue(ParameterNames.MAX_FILE_SIZE) * 1048576;
                        if (maxFileSize > 0 && fileLength > maxFileSize) {
                            request.getInputStream().close();
                            MyHelperClass HttpServletResponse = new MyHelperClass();
                            response.sendError(HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE);
                            return;
                        }
                        long now = System.currentTimeMillis();
                        MyHelperClass ic_messages_id_seq = new MyHelperClass();
                        long nextid = ic_messages_id_seq.nextval();
                        IntChatServletInputStream in = new IntChatServletInputStream(request);
                        IntChatMessage icm = null;
                        conn.setAutoCommit(false);
                        try {
                            PreparedStatement ps = conn.prepareStatement("INSERT INTO ic_messages (id, tid, mhead, mbody, mdate, sid) VALUES (?, ?, ?, ?, ?, ?)");
                            ps.setLong(1, nextid);
                            ps.setInt(2, fileTypeID);
                            ps.setString(3, fileName);
                            ps.setString(4, Long.toString(fileLength));
                            ps.setLong(5, now);
                            ps.setInt(6, UID);
                            ps.executeUpdate();
                            ps.close();
                            if (!insertBLOB(conn, in, fileLength, nextid, maxFileSize)) {
                                conn.rollback();
                                return;
                            }
                            icm = new IntChatMessage(false, fileTypeID, null, null);
                            String[] id = recipients.split(",");
                            int id1;
                            for (int i = 0; i < id.length; i++) {
                                id1 = Integer.parseInt(id[i].trim());
                                MyHelperClass IntChatDatabaseOperations = new MyHelperClass();
                                IntChatDatabaseOperations.executeUpdate(conn, "INSERT INTO ic_recipients (mid, rid) VALUES ('" + nextid + "', '" + id1 + "')");
                                icm.addTo(id1);
                            }
                            conn.commit();
                        } catch (Exception e) {
                            conn.rollback();
                            throw e;
                        } finally {
                            conn.setAutoCommit(true);
                        }
                        if (icm != null) {
                            icm.setID(nextid);
                            icm.setDate(new Timestamp(now - TimeZone.getDefault().getOffset(now)));
                            icm.setFrom(UID);
                            icm.setHeadText(fileName);
                            icm.setBodyText(Long.toString(fileLength));
//                            MyHelperClass icsm = new MyHelperClass();
                            icsm.onClientSentMessage(icm);
                        }
                        MyHelperClass HttpServletResponse = new MyHelperClass();
                        response.setStatus(HttpServletResponse.SC_OK);
                    } else {
                        MyHelperClass HttpServletResponse = new MyHelperClass();
                        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    }
                } else {
                    MyHelperClass HttpServletResponse = new MyHelperClass();
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                }
                if (rs != null) {
                    rs.getStatement().close();
                    rs = null;
                }
            } catch (RetryRequest(Throwable)(Object) rr) {
                throw(Throwable)(Object) rr;
            } catch (Exception e) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                Tools.makeErrorResponse(request, response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e);
            } finally {
                try {
                    MyHelperClass icsm = new MyHelperClass();
                    if (conn != null) icsm.getHeavyDatabaseConnectionPool().releaseConnection(conn);
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HEADER_FILERECIPIENTS;
	public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass SC_OK;
	public MyHelperClass SC_INTERNAL_SERVER_ERROR;
	public MyHelperClass ENCODING;
	public MyHelperClass HEADER_FILELENGTH;
	public MyHelperClass SC_REQUEST_ENTITY_TOO_LARGE;
	public MyHelperClass MAX_FILE_SIZE;
	public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass onClientSentMessage(IntChatMessage o0){ return null; }
	public MyHelperClass nextval(){ return null; }
	public MyHelperClass executeUpdate(Connection o0, String o1){ return null; }
	public MyHelperClass getHeavyDatabaseConnectionPool(){ return null; }
	public MyHelperClass getIntChatSession(HttpServletRequest o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_SERVICE_UNAVAILABLE;
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class ResultSet {

public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getStatement(){ return null; }
	public MyHelperClass next(){ return null; }}

class IntChatServletInputStream {

IntChatServletInputStream(HttpServletRequest o0){}
	IntChatServletInputStream(){}}

class IntChatMessage {

IntChatMessage(boolean o0, int o1, Object o2, Object o3){}
	IntChatMessage(){}
	public MyHelperClass setDate(Timestamp o0){ return null; }
	public MyHelperClass addTo(int o0){ return null; }
	public MyHelperClass setID(long o0){ return null; }
	public MyHelperClass setFrom(int o0){ return null; }
	public MyHelperClass setHeadText(String o0){ return null; }
	public MyHelperClass setBodyText(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class RetryRequest {

}
