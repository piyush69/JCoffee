import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22926731 {
public MyHelperClass assertTrue(boolean o0){ return null; }

    public void testDelegateUsage() throws Throwable, IOException {
        MyHelperClass MockControl = new MyHelperClass();
        MockControl elementParserControl =(MockControl)(Object) MockControl.createControl((ElementParser)(Object)ElementParser.class);
        ElementParser elementParser = (ElementParser)(ElementParser)(Object) elementParserControl.getMock();
        elementParserControl.replay();
        URL url = getClass().getResource("/net/sf/ngrease/core/ast/simple-element.ngr");
        ElementSource source =(ElementSource)(Object) new ElementSourceUrlImpl(url, elementParser);
        elementParserControl.verify();
        elementParserControl.reset();
        Element element =(Element)(Object) new ElementDefaultImpl("");
        elementParser.parse(url.openStream());
        elementParserControl.setMatcher(new ArgumentsMatcher() {

            public boolean matches(Object[] arg0, Object[] arg1) {
                if (!arg0[0].getClass().equals(arg1[0].getClass())) {
                    return false;
                }
                return true;
            }

            public String toString(Object[] arg0) {
                return Arrays.asList(arg0).toString();
            }
        });
        elementParserControl.setReturnValue(element, 1);
        elementParserControl.replay();
        Element elementAgain =(Element)(Object) source.getElement();
        elementParserControl.verify();
        assertTrue(element == elementAgain);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createControl(ElementParser o0){ return null; }}

class MockControl {

public MyHelperClass verify(){ return null; }
	public MyHelperClass setReturnValue(Element o0, int o1){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass getMock(){ return null; }
	public MyHelperClass setMatcher( ArgumentsMatcher o0){ return null; }
	public MyHelperClass replay(){ return null; }
	public MyHelperClass setMatcher(){ return null; }}

class ElementParser {

public MyHelperClass parse(InputStream o0){ return null; }}

class ElementSource {

public MyHelperClass getElement(){ return null; }}

class ElementSourceUrlImpl {

ElementSourceUrlImpl(URL o0, ElementParser o1){}
	ElementSourceUrlImpl(){}}

class Element {

}

class ElementDefaultImpl {

ElementDefaultImpl(String o0){}
	ElementDefaultImpl(){}}

class ArgumentsMatcher {

}
