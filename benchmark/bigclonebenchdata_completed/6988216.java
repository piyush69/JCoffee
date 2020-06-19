import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6988216 {
public MyHelperClass resolveSource(String o0){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass BASE_URL;
	public MyHelperClass assertNotNull(OutputStream o0){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

    public void testSimpleQuery() throws Throwable, Exception {
        MyHelperClass BASE_URL = new MyHelperClass();
        JCRNodeSource dummySource = (JCRNodeSource)(JCRNodeSource)(Object) resolveSource(BASE_URL + "users/alexander.klimetschek");
        assertNotNull((OutputStream)(Object)dummySource);
        OutputStream os =(OutputStream)(Object) ((ModifiableSource)(ModifiableSource)(Object) dummySource).getOutputStream();
        assertNotNull(os);
        String dummyContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><user><id>alexander</id><teamspace>cyclr</teamspace><teamspace>mindquarryTooLong</teamspace></user>";
        os.write(dummyContent.getBytes());
        os.flush();
        os.close();
        JCRNodeSource source = (JCRNodeSource)(JCRNodeSource)(Object) resolveSource(BASE_URL + "users/bastian");
        assertNotNull((OutputStream)(Object)source);
        os =(OutputStream)(Object) ((ModifiableSource)(ModifiableSource)(Object) source).getOutputStream();
        assertNotNull(os);
        String content = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><user><id>bastian</id><teamspace>mindquarry</teamspace></user>";
        os.write(content.getBytes());
        os.flush();
        os.close();
        QueryResultSource qResult = (QueryResultSource)(QueryResultSource)(Object) resolveSource(BASE_URL + "users?/*[.//user/teamspace='mindquarry']");
        assertNotNull((OutputStream)(Object)qResult);
        Collection results =(Collection)(Object) qResult.getChildren();
        assertEquals(1, results.size());
        Iterator it = results.iterator();
        JCRNodeSource rSrc = (JCRNodeSource) it.next();
        InputStream rSrcIn =(InputStream)(Object) rSrc.getInputStream();
        ByteArrayOutputStream actualOut = new ByteArrayOutputStream();
        IOUtils.copy(rSrcIn, actualOut);
        rSrcIn.close();
        assertEquals(content, actualOut.toString());
        actualOut.close();
        rSrc.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class JCRNodeSource {

public MyHelperClass delete(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ModifiableSource {

public MyHelperClass getOutputStream(){ return null; }}

class QueryResultSource {

public MyHelperClass getChildren(){ return null; }}
