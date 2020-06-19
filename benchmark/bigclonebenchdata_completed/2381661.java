import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2381661 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass replay(MyHelperClass o0){ return null; }
	public MyHelperClass createContext(MyHelperClass o0, boolean o1){ return null; }
public MyHelperClass pipeline;
	public MyHelperClass LOCAL_SPEC_XML;
	public MyHelperClass HttpResponse;
	public MyHelperClass SPEC_URL;
	public MyHelperClass specFactory;
	public MyHelperClass createIgnoreCacheRequest(){ return null; }
	public MyHelperClass createCacheableRequest(){ return null; }

//    @Test(expected = GadgetException.class)
    public void badFetchServesCached() throws Throwable, Exception {
        HttpRequest firstRequest =(HttpRequest)(Object) createCacheableRequest();
        expect(pipeline.execute(firstRequest)).andReturn(new HttpResponse(LOCAL_SPEC_XML)).once();
        HttpRequest secondRequest =(HttpRequest)(Object) createIgnoreCacheRequest();
        expect(pipeline.execute(secondRequest)).andReturn(HttpResponse.error()).once();
        replay(pipeline);
        GadgetSpec original =(GadgetSpec)(Object) specFactory.getGadgetSpec(createContext(SPEC_URL, false));
        GadgetSpec cached =(GadgetSpec)(Object) specFactory.getGadgetSpec(createContext(SPEC_URL, true));
        assertEquals(original.getUrl(), cached.getUrl());
        assertEquals(original.getChecksum(), cached.getChecksum());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass andReturn(MyHelperClass o0){ return null; }
	public MyHelperClass once(){ return null; }
	public MyHelperClass getGadgetSpec(MyHelperClass o0){ return null; }
	public MyHelperClass andReturn(HttpResponse o0){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }
	public MyHelperClass error(){ return null; }}

class Test {

}

class HttpRequest {

}

class HttpResponse {

HttpResponse(MyHelperClass o0){}
	HttpResponse(){}}

class GadgetSpec {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getChecksum(){ return null; }}
