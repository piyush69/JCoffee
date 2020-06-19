import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13438575 {

    private static void serveHTML() throws Throwable, Exception {
        MyHelperClass BusFactory = new MyHelperClass();
        Bus bus =(Bus)(Object) BusFactory.getDefaultBus();
        DestinationFactoryManager dfm =(DestinationFactoryManager)(Object) bus.getExtension((DestinationFactoryManager)(Object)DestinationFactoryManager.class);
        DestinationFactory df =(DestinationFactory)(Object) dfm.getDestinationFactory("http://cxf.apache.org/transports/http/configuration");
        EndpointInfo ei = new EndpointInfo();
        ei.setAddress("http://localhost:8080/test.html");
        Destination d =(Destination)(Object) df.getDestination(ei);
        d.setMessageObserver(new MessageObserver() {

            public void onMessage(Message message) {
                try {
                    ExchangeImpl ex = new ExchangeImpl();
                    ex.setInMessage(message);
                    Conduit backChannel =(Conduit)(Object) message.getDestination().getBackChannel(message, null, null);
                    MessageImpl res = new MessageImpl();
                    MyHelperClass Message = new MyHelperClass();
                    res.put(Message.CONTENT_TYPE, "text/html");
                    backChannel.prepare(res);
                    OutputStream out =(OutputStream)(Object) res.getContent((OutputStream)(Object)OutputStream.class);
                    FileInputStream is = new FileInputStream("test.html");
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(is, out, 2048);
                    out.flush();
                    out.close();
                    is.close();
                    backChannel.close(res);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_TYPE;
public MyHelperClass getBackChannel(Message o0, Object o1, Object o2){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1, int o2){ return null; }
	public MyHelperClass getDefaultBus(){ return null; }}

class Bus {

public MyHelperClass getExtension(DestinationFactoryManager o0){ return null; }}

class DestinationFactoryManager {

public MyHelperClass getDestinationFactory(String o0){ return null; }}

class DestinationFactory {

public MyHelperClass getDestination(EndpointInfo o0){ return null; }}

class EndpointInfo {

public MyHelperClass setAddress(String o0){ return null; }}

class Destination {

public MyHelperClass setMessageObserver(){ return null; }
	public MyHelperClass setMessageObserver( MessageObserver o0){ return null; }}

class MessageObserver {

}

class Message {

public MyHelperClass getDestination(){ return null; }}

class ExchangeImpl {

public MyHelperClass setInMessage(Message o0){ return null; }}

class Conduit {

public MyHelperClass close(MessageImpl o0){ return null; }
	public MyHelperClass prepare(MessageImpl o0){ return null; }}

class MessageImpl {

public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getContent(OutputStream o0){ return null; }}
