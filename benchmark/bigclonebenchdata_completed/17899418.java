import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17899418 {
public MyHelperClass MimeTypes;
	public MyHelperClass IOUtils;
	public MyHelperClass ParseUtil;

    private void processBody(HttpMethod request) throws Throwable, IOException {
        InputStream in =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) request.getResponseBodyAsStream();
        if (in == null) return;
        MyHelperClass HttpHeaders = new MyHelperClass();
        Header contentTypeHdr =(Header)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) request.getResponseHeader(HttpHeaders.CONTENT_TYPE);
        MyHelperClass _resultContentType = new MyHelperClass();
        _resultContentType = (contentTypeHdr != null) ? contentTypeHdr.getValue() : "";
        MyHelperClass _out = new MyHelperClass();
        if (_out != null) {
//            MyHelperClass _out = new MyHelperClass();
            IOUtils.copy(in, _out);
//            MyHelperClass _out = new MyHelperClass();
            _out.flush();
        MyHelperClass MimeTypes = new MyHelperClass();
        } else if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)_resultContentType.startsWith(MimeTypes.TEXT)) {
            MyHelperClass _result = new MyHelperClass();
            _result = IOUtils.toString(in, "UTF-8");
        MyHelperClass MimeTypes = new MyHelperClass();
        } else if (_resultContentType.startsWith(MimeTypes.XML) ||(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (Boolean)(Object)_resultContentType.startsWith(MimeTypes.DEPRECATED_XML)) {
            MyHelperClass _result = new MyHelperClass();
            _result = ParseUtil.parse(new InputSource(in));
        } else {
            MyHelperClass _result = new MyHelperClass();
            _result = IOUtils.toByteArray(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEPRECATED_XML;
	public MyHelperClass XML;
	public MyHelperClass CONTENT_TYPE;
	public MyHelperClass TEXT;
public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass toByteArray(InputStream o0){ return null; }
	public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class HttpMethod {

public MyHelperClass getResponseHeader(MyHelperClass o0){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class Object {

public MyHelperClass toString(InputStream o0, String o1){ return null; }}
