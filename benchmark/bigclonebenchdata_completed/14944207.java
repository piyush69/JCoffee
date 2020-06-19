import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14944207 {
public MyHelperClass h;
	public MyHelperClass CommonParams;
	public MyHelperClass IOUtils;
	public MyHelperClass parser;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testStreamURL() throws Throwable, Exception {
        boolean ok = false;
        String url = "http://www.apache.org/dist/lucene/solr/";
        String txt = null;
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            txt = IOUtils.toString(new URL(url).openStream());
        } catch (Exception ex) {
            fail("this test only works if you have a network connection.");
            return;
        }
        SolrCore core =(SolrCore)(Object) h.getCore();
        Map<String, String[]> args = new HashMap<String, String[]>();
        args.put((String)(Object)CommonParams.STREAM_URL, new String[] { url });
        List<ContentStream> streams = new ArrayList<ContentStream>();
        parser.buildRequestFrom(core, new MultiMapSolrParams(args), streams);
        assertEquals(1, streams.size());
        assertEquals(txt, IOUtils.toString(streams.get(0).getStream()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STREAM_URL;
public MyHelperClass getCore(){ return null; }
	public MyHelperClass buildRequestFrom(SolrCore o0, MultiMapSolrParams o1, List<ContentStream o2){ return null; }}

class SolrCore {

}

class ContentStream {

public MyHelperClass getStream(){ return null; }}

class MultiMapSolrParams {

MultiMapSolrParams(Map<String,String[]> o0){}
	MultiMapSolrParams(){}}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }
	public MyHelperClass toString(MyHelperClass o0){ return null; }}
