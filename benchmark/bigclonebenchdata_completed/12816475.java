


class c12816475 {
public MyHelperClass doETagStripWeakMarker(MyHelperClass o0){ return null; }
public MyHelperClass ETAG;

    protected void writePage(final CacheItem entry, final TranslationResponse response, ModifyTimes times) throws IOException {
        if (entry == null) {
            return;
        }
        Set headers =(Set)(Object) new TreeSet();
        for (ResponseHeader h :(ResponseHeader[])(Object) (Object[])(Object)entry.getHeaders()) {
            if (ETAG.equals(h.getName())) {
                if (!(Boolean)(Object)times.isFileLastModifiedKnown()) {
                    headers.add((ResponseHeader)(Object)new ResponseHeaderImpl(h.getName(), doETagStripWeakMarker(h.getValues())));
                }
            } else {
                headers.add(h);
            }
        }
        response.addHeaders(headers);
        if (!(Boolean)(Object)times.isFileLastModifiedKnown()) {
            response.setLastModified(entry.getLastModified());
        }
        response.setTranslationCount(entry.getTranslationCount());
        response.setFailCount(entry.getFailCount());
        OutputStream output =(OutputStream)(Object) response.getOutputStream();
        try {
            InputStream input =(InputStream)(Object) entry.getContentAsStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                input.close();
            }
        } finally {
            MyHelperClass ResponseStateOk = new MyHelperClass();
            response.setEndState(ResponseStateOk.getInstance());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class CacheItem {

public MyHelperClass getContentAsStream(){ return null; }
	public MyHelperClass getTranslationCount(){ return null; }
	public MyHelperClass getFailCount(){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class TranslationResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeaders(Set o0){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass setEndState(MyHelperClass o0){ return null; }
	public MyHelperClass setFailCount(MyHelperClass o0){ return null; }
	public MyHelperClass setTranslationCount(MyHelperClass o0){ return null; }}

class ModifyTimes {

public MyHelperClass isFileLastModifiedKnown(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Set {

public MyHelperClass add(ResponseHeader o0){ return null; }}

class ResponseHeader {

public MyHelperClass getValues(){ return null; }
	public MyHelperClass getName(){ return null; }}

class TreeSet {

}

class ResponseHeaderImpl {

ResponseHeaderImpl(MyHelperClass o0, MyHelperClass o1){}
	ResponseHeaderImpl(){}}

class OutputStream {

}

class InputStream {

public MyHelperClass close(){ return null; }}
