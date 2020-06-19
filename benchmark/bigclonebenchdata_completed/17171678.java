import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17171678 {
public MyHelperClass logMessage(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass logRequest(HttpURLConnection o0, MyHelperClass o1){ return null; }
public MyHelperClass RecordType;
public MyHelperClass httpWebProxyPort_;
	public MyHelperClass TokenConstants;
	public MyHelperClass credentials;

    public void deleteMessageBuffer(String messageBufferName) throws AppFabricException {
        MyHelperClass solutionName = new MyHelperClass();
        MessageBufferUtil msgBufferUtilObj = new MessageBufferUtil(solutionName, TokenConstants.getSimpleAuthAuthenticationType());
        String requestUri =(String)(Object) msgBufferUtilObj.getRequestUri();
        String messageBufferUri =(String)(Object) msgBufferUtilObj.getCreateMessageBufferUri(messageBufferName);
        String authorizationToken = "";
        try {
            MyHelperClass httpWebProxyServer_ = new MyHelperClass();
            ACSTokenProvider tp = new ACSTokenProvider(httpWebProxyServer_, httpWebProxyPort_, this.credentials);
            authorizationToken =(String)(Object) tp.getACSToken(requestUri, messageBufferUri);
        } catch (Exception e) {
            throw new AppFabricException(e.getMessage());
        }
        try {
            messageBufferUri = messageBufferUri.replaceAll("http", "https");
            URL urlConn = new URL(messageBufferUri);
            HttpURLConnection connection;
            MyHelperClass httpWebProxy_ = new MyHelperClass();
            if (httpWebProxy_ != null) connection = (HttpURLConnection) urlConn.openConnection((Proxy)(Object)httpWebProxy_); else connection = (HttpURLConnection) urlConn.openConnection();
            connection.setRequestMethod("DELETE");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            MyHelperClass MessageBufferConstants = new MyHelperClass();
            connection.setRequestProperty("Content-type",(String)(Object) MessageBufferConstants.getCONTENT_TYPE_PROPERTY_FOR_ATOM_XML());
            MyHelperClass TokenConstants = new MyHelperClass();
            String authStr = TokenConstants.getWrapAuthenticationType() + " " + TokenConstants.getWrapAuthorizationHeaderKey() + "=\"" + authorizationToken + "\"";
            connection.setRequestProperty("Authorization", authStr);
            MyHelperClass LoggerUtil = new MyHelperClass();
            if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logRequest(connection, RecordType.DeleteMessageBuffer_REQUEST);
            String responseCode = "<responseCode>" + connection.getResponseCode() + "</responseCode>";
//            MyHelperClass MessageBufferConstants = new MyHelperClass();
            if ((connection.getResponseCode() == (int)(Object)MessageBufferConstants.HTTP_STATUS_CODE_OK)) {
                InputStream is = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                String line;
                StringBuffer response = new StringBuffer();
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();
            } else {
                throw new AppFabricException("MessageBuffer could not be deleted.Error...Response code:  " + connection.getResponseCode());
            }
//            MyHelperClass LoggerUtil = new MyHelperClass();
            if ((boolean)(Object)LoggerUtil.getIsLoggingOn()) logMessage(URLEncoder.encode(responseCode, "UTF-8"), RecordType.DeleteMessageBuffer_RESPONSE);
        } catch (Exception e) {
            throw new AppFabricException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DeleteMessageBuffer_REQUEST;
	public MyHelperClass DeleteMessageBuffer_RESPONSE;
	public MyHelperClass HTTP_STATUS_CODE_OK;
public MyHelperClass getWrapAuthorizationHeaderKey(){ return null; }
	public MyHelperClass getSimpleAuthAuthenticationType(){ return null; }
	public MyHelperClass getCONTENT_TYPE_PROPERTY_FOR_ATOM_XML(){ return null; }
	public MyHelperClass getIsLoggingOn(){ return null; }
	public MyHelperClass getWrapAuthenticationType(){ return null; }}

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
