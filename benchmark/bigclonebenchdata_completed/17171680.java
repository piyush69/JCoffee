import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17171680 {
public MyHelperClass logMessage(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass logRequest(HttpURLConnection o0, MyHelperClass o1){ return null; }
public MyHelperClass RecordType;
public MyHelperClass httpWebProxyPort_;
	public MyHelperClass TokenConstants;
	public MyHelperClass credentials;

    public void sendMessage(String messageBufferName, String messageStr, String timeout) throws AppFabricException {
        MyHelperClass solutionName = new MyHelperClass();
        MessageBufferUtil msgBufferUtilObj = new MessageBufferUtil(solutionName, TokenConstants.getSimpleAuthAuthenticationType());
        String requestUri =(String)(Object) msgBufferUtilObj.getRequestUri();
        MyHelperClass MessageBufferConstants = new MyHelperClass();
        String sendPath =(String)(Object) MessageBufferConstants.getPATH_FOR_SEND_MESSAGE();
//        MyHelperClass MessageBufferConstants = new MyHelperClass();
        String timeOutParameter =(String)(Object) MessageBufferConstants.getTIMEOUTPARAMETER();
        String messageBufferUri =(String)(Object) msgBufferUtilObj.getMessageUri(messageBufferName, sendPath);
        String message =(String)(Object) msgBufferUtilObj.getFormattedMessage(messageStr);
        String authorizationToken = "";
        try {
            MyHelperClass httpWebProxyServer_ = new MyHelperClass();
            ACSTokenProvider tp = new ACSTokenProvider(httpWebProxyServer_, httpWebProxyPort_, this.credentials);
            authorizationToken =(String)(Object) tp.getACSToken(requestUri, messageBufferUri);
            messageBufferUri = messageBufferUri.replaceAll("http", "https");
            String sendUri = messageBufferUri + "?" + timeOutParameter + "=" + timeout;
            URL urlConn = new URL(sendUri);
            HttpURLConnection connection;
            MyHelperClass httpWebProxy_ = new MyHelperClass();
            if (httpWebProxy_ != null) connection = (HttpURLConnection) urlConn.openConnection((Proxy)(Object)httpWebProxy_); else connection = (HttpURLConnection) urlConn.openConnection();
            connection.setRequestMethod("POST");
//            MyHelperClass MessageBufferConstants = new MyHelperClass();
            connection.setRequestProperty("Content-type",(String)(Object) MessageBufferConstants.getCONTENT_TYPE_PROPERTY_FOR_TEXT());
            connection.setRequestProperty("Content-Length", "" + message.length());
            connection.setRequestProperty("Expect", "100-continue");
            connection.setRequestProperty("Accept", "*/*");
            MyHelperClass TokenConstants = new MyHelperClass();
            String authStr = TokenConstants.getWrapAuthenticationType() + " " + TokenConstants.getWrapAuthorizationHeaderKey() + "=\"" + authorizationToken + "\"";
            connection.setRequestProperty("Authorization", authStr);
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(message);
            wr.flush();
            wr.close();
            MyHelperClass LoggerUtil = new MyHelperClass();
            if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logRequest(connection, RecordType.SendMessage_REQUEST);
            String responseCode = "<responseCode>" + connection.getResponseCode() + "</responseCode>";
//            MyHelperClass MessageBufferConstants = new MyHelperClass();
            if (!((connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_ACCEPTED) || (connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_CREATED) || (connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_OK))) {
                throw new AppFabricException("Message could not be sent. Error.Response code: " + connection.getResponseCode());
            }
//            MyHelperClass LoggerUtil = new MyHelperClass();
            if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logMessage(URLEncoder.encode(responseCode, "UTF-8"), RecordType.SendMessage_RESPONSE);
        } catch (Exception e) {
            throw new AppFabricException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_STATUS_CODE_OK;
	public MyHelperClass SendMessage_RESPONSE;
	public MyHelperClass SendMessage_REQUEST;
	public MyHelperClass HTTP_STATUS_CODE_ACCEPTED;
	public MyHelperClass HTTP_STATUS_CODE_CREATED;
public MyHelperClass getWrapAuthorizationHeaderKey(){ return null; }
	public MyHelperClass getPATH_FOR_SEND_MESSAGE(){ return null; }
	public MyHelperClass getSimpleAuthAuthenticationType(){ return null; }
	public MyHelperClass getTIMEOUTPARAMETER(){ return null; }
	public MyHelperClass getIsLoggingOn(){ return null; }
	public MyHelperClass getWrapAuthenticationType(){ return null; }
	public MyHelperClass getCONTENT_TYPE_PROPERTY_FOR_TEXT(){ return null; }}

class AppFabricException extends Exception{
	public AppFabricException(String errorMessage) { super(errorMessage); }
}

class MessageBufferUtil {

MessageBufferUtil(){}
	MessageBufferUtil(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getRequestUri(){ return null; }
	public MyHelperClass getMessageUri(String o0, String o1){ return null; }
	public MyHelperClass getFormattedMessage(String o0){ return null; }}

class ACSTokenProvider {

ACSTokenProvider(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	ACSTokenProvider(){}
	public MyHelperClass getACSToken(String o0, String o1){ return null; }}
