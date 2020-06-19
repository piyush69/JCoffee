


class c19748972 {

    public String sendSMS(String host, String port, String username, String password, String from, String to, String text, String uhd, String charset, String coding, String validity, String deferred, String dlrmask, String dlrurl, String pid, String mclass, String mwi) throws SMSPushRequestException, Exception {
        StringBuffer res = new StringBuffer();
        MyHelperClass Utils = new MyHelperClass();
        if (!(Boolean)(Object)Utils.checkNonEmptyStringAttribute(coding) || coding.equals("0")) text =(String)(Object) Utils.convertTextForGSMEncodingURLEncoded(text); else if (coding.equals("1")) text =(String)(Object) Utils.convertTextForUTFEncodingURLEncoded(text, "UTF-8"); else text =(String)(Object) Utils.convertTextForUTFEncodingURLEncoded(text, "UCS-2");
        String directives = "username=" + username;
        directives += "&password=" + password;
        MyHelperClass URLEncoder = new MyHelperClass();
        directives += "&from=" + URLEncoder.encode(from, "UTF-8");
        directives += "&to=" + to;
        directives += "&text=" + text;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(uhd)) directives += "&uhd=" + uhd;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(charset)) directives += "&charset=" + charset;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(coding)) directives += "&coding=" + coding;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(validity)) directives += "&validity=" + validity;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(deferred)) directives += "&deferred=" + deferred;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(dlrmask)) directives += "&dlrmask=" + dlrmask;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(dlrurl)) directives += "&dlrurl=" + dlrurl;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(pid)) directives += "&pid=" + pid;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(mclass)) directives += "&mclass=" + mclass;
//        MyHelperClass Utils = new MyHelperClass();
        if ((boolean)(Object)Utils.checkNonEmptyStringAttribute(mwi)) directives += "&mwi=" + mwi;
        URL url = new URL("http://" + host + ":" + port + "/cgi-bin/sendsms?" + directives);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String response;
        while ((response =(String)(Object) rd.readLine()) != null) res.append(response);
        rd.close();
        String resultCode = res.substring(0, res.indexOf(":"));
        MyHelperClass SMS_PUSH_RESPONSE_SUCCESS_CODE = new MyHelperClass();
        if (!resultCode.equals(SMS_PUSH_RESPONSE_SUCCESS_CODE)) throw new SMSPushRequestException(resultCode);
        return res.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass convertTextForUTFEncodingURLEncoded(String o0, String o1){ return null; }
	public MyHelperClass checkNonEmptyStringAttribute(String o0){ return null; }
	public MyHelperClass convertTextForGSMEncodingURLEncoded(String o0){ return null; }}

class SMSPushRequestException extends Exception{
	public SMSPushRequestException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
