import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17171676 {
public MyHelperClass logRequest(HttpURLConnection o0, MyHelperClass o1){ return null; }
public MyHelperClass logMessage(String o0, MyHelperClass o1){ return null; }
public MyHelperClass RecordType;
	public MyHelperClass httpWebProxyPort_;
	public MyHelperClass TokenConstants;
	public MyHelperClass credentials;

    public void createMessageBuffer(String messageBufferName, MessageBufferPolicy messageBufferPolicyObj) throws AppFabricException {
        String messageBufferPolicy =(String)(Object) messageBufferPolicyObj.getMessageBufferPolicy();
        if (messageBufferPolicy == null) {
            throw new AppFabricException("MessageBufferPolicy can not be null");
        }
        MyHelperClass solutionName = new MyHelperClass();
        MessageBufferUtil msgBufferUtilObj = new MessageBufferUtil(solutionName, TokenConstants.getSimpleAuthAuthenticationType());
        String requestUri =(String)(Object) msgBufferUtilObj.getRequestUri();
        String messageBufferUri =(String)(Object) msgBufferUtilObj.getCreateMessageBufferUri(messageBufferName);
        if (messageBufferUri == null) {
            throw new AppFabricException("MessageBufferUri can not be null");
        }
        String authorizationToken = "";
        try {
            MyHelperClass httpWebProxyServer_ = new MyHelperClass();
            ACSTokenProvider tp = new ACSTokenProvider(httpWebProxyServer_, httpWebProxyPort_, this.credentials);
            authorizationToken =(String)(Object) tp.getACSToken(requestUri, messageBufferUri);
        } catch (UncheckedIOException e) {
            throw e;
        } catch (Exception e) {
            throw new AppFabricException(e.getMessage());
        }
        try {
            messageBufferUri = messageBufferUri.replaceAll("http", "https");
            URL urlConn = new URL(messageBufferUri);
            HttpURLConnection connection;
            MyHelperClass httpWebProxy_ = new MyHelperClass();
            if (httpWebProxy_ != null) connection = (HttpURLConnection) urlConn.openConnection((Proxy)(Object)httpWebProxy_); else connection = (HttpURLConnection) urlConn.openConnection();
            connection.setRequestMethod("PUT");
            MyHelperClass MessageBufferConstants = new MyHelperClass();
            connection.setRequestProperty("Content-type",(String)(Object) MessageBufferConstants.getCONTENT_TYPE_PROPERTY_FOR_ATOM_XML());
            connection.setRequestProperty("Content-Length", "" + messageBufferPolicy.length());
            MyHelperClass TokenConstants = new MyHelperClass();
            String authStr = TokenConstants.getWrapAuthenticationType() + " " + TokenConstants.getWrapAuthorizationHeaderKey() + "=\"" + authorizationToken + "\"";
            connection.setRequestProperty("Authorization", authStr);
            connection.setRequestProperty("Expect", "100-continue");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(messageBufferPolicy);
            wr.flush();
            wr.close();
            MyHelperClass LoggerUtil = new MyHelperClass();
            if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logRequest(connection, RecordType.CreateMessageBuffer_REQUEST);
            String responseCode = "<responseCode>" + connection.getResponseCode() + "</responseCode>";
//            MyHelperClass MessageBufferConstants = new MyHelperClass();
            if ((connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_ACCEPTED) || (connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_CREATED) || (connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_OK)) {
                InputStream is = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                String line;
                StringBuffer response = new StringBuffer();
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();
//                MyHelperClass LoggerUtil = new MyHelperClass();
                if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) {
                    StringBuilder responseXML = new StringBuilder();
                    responseXML.append(responseCode);
                    responseXML.append(response.toString());
                    logMessage(URLEncoder.encode(responseXML.toString(), "UTF-8"), RecordType.CreateMessageBuffer_RESPONSE);
                }
            } else {
//                MyHelperClass LoggerUtil = new MyHelperClass();
                if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logMessage(URLEncoder.encode(responseCode, "UTF-8"), RecordType.CreateMessageBuffer_RESPONSE);
                throw new AppFabricException("MessageBuffer could not be created or updated. Error. Response code:  " + connection.getResponseCode());
            }
        } catch (Exception e) {
            throw new AppFabricException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CreateMessageBuffer_REQUEST;
	public MyHelperClass HTTP_STATUS_CODE_OK;
	public MyHelperClass CreateMessageBuffer_RESPONSE;
	public MyHelperClass HTTP_STATUS_CODE_ACCEPTED;
	public MyHelperClass HTTP_STATUS_CODE_CREATED;
public MyHelperClass getWrapAuthorizationHeaderKey(){ return null; }
	public MyHelperClass getSimpleAuthAuthenticationType(){ return null; }
	public MyHelperClass getCONTENT_TYPE_PROPERTY_FOR_ATOM_XML(){ return null; }
	public MyHelperClass getIsLoggingOn(){ return null; }
	public MyHelperClass getWrapAuthenticationType(){ return null; }}

class MessageBufferPolicy {

public MyHelperClass getMessageBufferPolicy(){ return null; }}

class AppFabricException extends Exception{
	public AppFabricException(String errorMessage) { super(errorMessage); }
}

class MessageBufferUtil {

MessageBufferUtil(){}
	MessageBufferUtil(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getRequestUri(){ return null; }
	public MyHelperClass getCreateMessageBufferUri(String o0){ return null; }}

class ACSTokenProvider {

ACSTokenProvider(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	ACSTokenProvider(){}
	public MyHelperClass getACSToken(String o0, String o1){ return null; }}
