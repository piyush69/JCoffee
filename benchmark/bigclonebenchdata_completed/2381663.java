import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2381663 {
public MyHelperClass expect(MyHelperClass o0){ return null; }
public MyHelperClass replay(MyHelperClass o0){ return null; }
	public MyHelperClass createContext(MyHelperClass o0, boolean o1){ return null; }
public MyHelperClass pipeline;
	public MyHelperClass SPEC_URL;
	public MyHelperClass specFactory;
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass createCacheableRequest(){ return null; }

//    @Test(expected = GadgetException.class)
    public void malformedGadgetSpecIsCachedAndThrows() throws Throwable, Exception {
        HttpRequest request =(HttpRequest)(Object) createCacheableRequest();
        expect(pipeline.execute(request)).andReturn(new HttpResponse("malformed junk")).once();
        replay(pipeline);
        try {
            specFactory.getGadgetSpec(createContext(SPEC_URL, false));
            fail("No exception thrown on bad parse");
        } catch (ArithmeticException e) {
        }
        specFactory.getGadgetSpec(createContext(SPEC_URL, false));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass andReturn(HttpResponse o0){ return null; }
	public MyHelperClass getGadgetSpec(MyHelperClass o0){ return null; }
	public MyHelperClass once(){ return null; }
	public MyHelperClass execute(HttpRequest o0){ return null; }}

class Test {

}

class HttpRequest {

}

class HttpResponse {

HttpResponse(String o0){}
	HttpResponse(){}}

class GadgetException extends Exception{
	public GadgetException(String errorMessage) { super(errorMessage); }
}
