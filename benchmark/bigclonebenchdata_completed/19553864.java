import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19553864 {
public MyHelperClass EXTERNALNOTIFICATION_ERROR_LIMIT_REACHED_IN_SMS_GATEWAY;
	public MyHelperClass EXTERNALNOTIFICATION_ERROR_UNDEFINED_ERROR_IN_SMS_GATEWAY;
	public MyHelperClass EXTERNALNOTIFICATION_ERROR_SENDING_ERROR_IN_SMS_GATEWAY;
	public MyHelperClass EXTERNALNOTIFICATION_ERROR_PARAMETER_ERROR_IN_SMS_GATEWAY;
	public MyHelperClass EXTERNALNOTIFICATION_ERROR_RESPONSE_FROM_SMS_GATEWAY;
	public MyHelperClass EXTERNALNOTIFICATION_OK;
	public MyHelperClass EXTERNALNOTIFICATION_ERROR_SYSTEM_ERROR_IN_SMS_GATEWAY;
public MyHelperClass smsGW;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass logger;

    private void processHTTPRequest(Status status) {
        String httpRequest = null;
        Document xmlDoc = null;
        httpRequest =(String)(Object) this.smsGW.getUrl();
        if (this.smsGW.getFrom() != null) httpRequest += "from=" + this.smsGW.getFrom();
        if (this.smsGW.getTo() != null) httpRequest += "&to=" + this.smsGW.getTo();
        if (this.smsGW.getTxt() != null) httpRequest += "&txt=" + this.smsGW.getTxt();
        httpRequest += "&id=" + this.smsGW.getId() + "&pwd=" + this.smsGW.getPwd();
        if (this.smsGW.getFlash() != null) httpRequest += "&flash=" + this.smsGW.getFlash();
        if (this.smsGW.getRoute() != null) httpRequest += "&route=" + this.smsGW.getRoute();
        if (this.smsGW.getAutoroute() != null) httpRequest += "&autoroute=" + this.smsGW.getAutoroute();
        if (this.smsGW.getStatus() != null) httpRequest += "&status=" + this.smsGW.getStatus();
        if (this.smsGW.getSim() != null) httpRequest += "&sim=" + this.smsGW.getSim();
        if (this.smsGW.getTyp() != null) httpRequest += "&typ=" + this.smsGW.getTyp();
        if (this.smsGW.getUser() != null) httpRequest += "&user=" + this.smsGW.getUser();
        logger.debug("HTTP2SMS request: " + httpRequest);
        InputStream is = null;
        try {
            URL url = new URL(httpRequest);
            is = url.openStream();
            logger.debug("HTTP request sent!");
            xmlDoc =(Document)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
        } catch (Exception ex2) {
            logger.error("Exception Message: " + ex2.toString());
            status.setErrorCause("Exception Message: " + ex2.toString());
            status.setResult(EXTERNALNOTIFICATION_ERROR_RESPONSE_FROM_SMS_GATEWAY.ordinal());
        } finally {
            if (is != null) try {
                is.close();
            } catch (IOException ex3) {
                logger.error("Exception Message: " + ex3.toString());
            }
        }
        NodeList nl =(NodeList)(Object) xmlDoc.getElementsByTagName("response");
        Node nd =(Node)(Object) nl.item(0);
        NodeList nl2 =(NodeList)(Object) nd.getChildNodes();
        String responseResult =(String)(Object) nl2.item(1).getTextContent();
        String responseDesc =(String)(Object) nl2.item(3).getTextContent();
        String responseId =(String)(Object) nl2.item(5).getTextContent();
        int responseRes = Integer.parseInt(responseResult);
        if (responseRes == 0) {
            logger.debug("HTTP2SMS response: result: " + responseResult + "; desc: " + responseDesc + "; ID: " + responseId);
        } else {
            logger.error("HTTP2SMS response: result: " + responseResult + "; desc: " + responseDesc + "; ID: " + responseId);
        }
        if (responseRes == 0) {
            logger.info("SMS with id " + responseId + " successfully sent to number " + this.smsGW.getTo());
            status.setErrorCause("SMS with id " + responseId + " successfully sent to number " + this.smsGW.getTo());
            status.setResult(EXTERNALNOTIFICATION_OK.ordinal());
        } else if (responseRes == 1) {
            logger.error("System error in external SMS gateway! HTTP request: " + httpRequest);
            status.setErrorCause("System error in external SMS gateway! HTTP request: " + httpRequest);
            status.setResult(EXTERNALNOTIFICATION_ERROR_SYSTEM_ERROR_IN_SMS_GATEWAY.ordinal());
        } else if (responseRes == 2) {
            logger.error("Sending error in external SMS gateway! HTTP request: " + httpRequest);
            logger.error("SMS2HTTP Gateway Response: ResultCode:" + responseResult + "; ErrorDescription:" + responseDesc + "; TransactionID:" + responseId);
            status.setErrorCause("Sending error in external SMS gateway! ErrorDescription:" + responseDesc);
            status.setResult(EXTERNALNOTIFICATION_ERROR_SENDING_ERROR_IN_SMS_GATEWAY.ordinal());
        } else if (responseRes >= 10 && responseRes <= 19) {
            logger.error("SMS gateway says: Parameter error in HTTP request: " + httpRequest);
            logger.error("SMS2HTTP Gateway Response: ResultCode:" + responseResult + "; ErrorDescription:" + responseDesc + "; TransactionID:" + responseId);
            status.setErrorCause("SMS gateway says: Parameter error in HTTP request! ErrorDescription:" + responseDesc);
            status.setResult(EXTERNALNOTIFICATION_ERROR_PARAMETER_ERROR_IN_SMS_GATEWAY.ordinal());
        } else if (responseRes >= 20 && responseRes <= 29) {
            logger.error("Limit reached at external SMS gateway!");
            logger.error("SMS2HTTP Gateway Response: ResultCode:" + responseResult + "; ErrorDescription:" + responseDesc + "; TransactionID:" + responseId);
            status.setErrorCause("Limit reached at external SMS gateway!");
            status.setResult(EXTERNALNOTIFICATION_ERROR_LIMIT_REACHED_IN_SMS_GATEWAY.ordinal());
        } else {
            logger.error("Undefined error from external SMS gateway!");
            logger.error("SMS2HTTP Gateway Response: ResultCode:" + responseResult + "; ErrorDescription:" + responseDesc + "; TransactionID:" + responseId);
            status.setErrorCause("Undefined error from external SMS gateway! ErrorDescription:" + responseDesc);
            status.setResult(EXTERNALNOTIFICATION_ERROR_UNDEFINED_ERROR_IN_SMS_GATEWAY.ordinal());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass ordinal(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getTxt(){ return null; }
	public MyHelperClass getAutoroute(){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass getPwd(){ return null; }
	public MyHelperClass getRoute(){ return null; }
	public MyHelperClass getSim(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getTyp(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getUser(){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass getFrom(){ return null; }
	public MyHelperClass getFlash(){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass getTo(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getTextContent(){ return null; }}

class Status {

public MyHelperClass setResult(MyHelperClass o0){ return null; }
	public MyHelperClass setErrorCause(String o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

class Node {

public MyHelperClass getChildNodes(){ return null; }}
