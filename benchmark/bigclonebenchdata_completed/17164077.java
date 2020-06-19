import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17164077 {
public MyHelperClass InputOutput;
public MyHelperClass config;
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass initParms(){ return null; }
	public MyHelperClass messagesInfo(){ return null; }
	public MyHelperClass checkMessageId(){ return null; }
	public MyHelperClass paramsInfo(){ return null; }
	public MyHelperClass initMessages(){ return null; }

    public void readConfig(String urlString) throws Exception {
        try {
            URL url = new URL(urlString);
            InputStream in = url.openStream();
            XmlDoc xml = (XmlDoc)(Object)new Parser().parse(new InputSource(in), true, true);
            MyHelperClass SCHEMA = new MyHelperClass();
            Verifier v = new Verifier(InputOutput.create(SCHEMA), null);
            v.verify(xml.getDocument());
            this.config = xml.getDocument();
        } catch (Exception e) {
            log("Can't read " + urlString + ": " + e.toString());
            throw e;
        }
        initParms();
        log("Got parameters: \n" + paramsInfo());
        initMessages();
        log("Got messages: \n" + messagesInfo());
        checkMessageId();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass create(MyHelperClass o0){ return null; }}

class XmlDoc {

public MyHelperClass getDocument(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class Parser {

public MyHelperClass parse(InputSource o0, boolean o1, boolean o2){ return null; }}

class Verifier {

Verifier(MyHelperClass o0, Object o1){}
	Verifier(){}
	public MyHelperClass verify(MyHelperClass o0){ return null; }}
