import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5859133 {
public MyHelperClass MD5;
public MyHelperClass StringEscapeUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass getSummary(){ return null; }
	public MyHelperClass getWikiPrefix(){ return null; }
	public MyHelperClass getNonNullParameter(String o0){ return null; }
	public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getHttpClient(){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass getArticleContent(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getSession(){ return null; }

    protected int sendData(String submitName, String submitValue) throws Throwable, HttpException, IOException, SAXException {
        PostMethod postMethod = null;
        try {
            postMethod = new PostMethod(getDocumentBase().toString());
            postMethod.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
            postMethod.addRequestHeader("Cookie", getWikiPrefix() + "_session=" + getSession() + "; " + getWikiPrefix() + "UserID=" + getUserId() + "; " + getWikiPrefix() + "UserName=" + getUserName() + "; ");
            List<Part> parts = new ArrayList<Part>();
            for (String s : new String[] { "wpSection", "wpEdittime", "wpScrolltop", "wpStarttime", "wpEditToken" }) {
                parts.add((Part)(Object)new StringPart(s, StringEscapeUtils.unescapeJava(getNonNullParameter(s))));
            }
            parts.add((Part)(Object)new StringPart("action", "edit"));
            parts.add((Part)(Object)new StringPart("wpTextbox1", getArticleContent()));
            parts.add((Part)(Object)new StringPart("wpSummary", getSummary()));
            parts.add((Part)(Object)new StringPart("wpAutoSummary", MD5.isImplemented() ? MD5.encrypt(getSummary()) : ""));
            parts.add((Part)(Object)new StringPart(submitName, submitValue));
            MultipartRequestEntity requestEntity = new MultipartRequestEntity(parts.toArray(new Part[parts.size()]), postMethod.getParams());
            postMethod.setRequestEntity(requestEntity);
            int status =(int)(Object) getHttpClient().executeMethod(postMethod);
            IOUtils.copyTo(postMethod.getResponseBodyAsStream(), System.err);
            return status;
        } catch (HttpException err) {
            throw err;
        } catch (IOException err) {
            throw err;
        } finally {
            if (postMethod != null) postMethod.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(MyHelperClass o0, PrintStream o1){ return null; }
	public MyHelperClass encrypt(MyHelperClass o0){ return null; }
	public MyHelperClass executeMethod(PostMethod o0){ return null; }
	public MyHelperClass unescapeJava(MyHelperClass o0){ return null; }
	public MyHelperClass isImplemented(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class PostMethod {

PostMethod(){}
	PostMethod(String o0){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestEntity(MultipartRequestEntity o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class Part {

}

class StringPart {

StringPart(String o0, String o1){}
	StringPart(String o0, MyHelperClass o1){}
	StringPart(){}}

class MultipartRequestEntity {

MultipartRequestEntity(Part[] o0, MyHelperClass o1){}
	MultipartRequestEntity(){}}
