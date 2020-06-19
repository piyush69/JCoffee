import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2381662 {
public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass replay(MyHelperClass o0){ return null; }
	public MyHelperClass createContext(MyHelperClass o0, boolean o1){ return null; }
public MyHelperClass specFactory;
	public MyHelperClass pipeline;
	public MyHelperClass SPEC_URL;
	public MyHelperClass createIgnoreCacheRequest(){ return null; }

//    @Test(expected = GadgetException.class)
    public void malformedGadgetSpecThrows() throws Throwable, Exception {
        HttpRequest request =(HttpRequest)(Object) createIgnoreCacheRequest();
        expect(pipeline.execute(request)).andReturn(new HttpResponse("malformed junk"));
        replay(pipeline);
        specFactory.getGadgetSpec(createContext(SPEC_URL, true));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass andReturn(HttpResponse o0){ return null; }
	public MyHelperClass getGadgetSpec(MyHelperClass o0){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }}

class Test {

}

class HttpRequest {

}

class HttpResponse {

HttpResponse(String o0){}
	HttpResponse(){}}
