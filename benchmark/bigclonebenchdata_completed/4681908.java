
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4681908 {
public MyHelperClass SimpleXMLParser;

    private void callbackWS(String xmlControl, String ws_results, long docId) {
        SimpleProvider config;
        Service service;
        Object ret;
        Call call;
        Object[] parameter;
        String method;
        String wsurl;
        URL url;
        NodeList delegateNodes;
        Node actualNode;
        InputSource xmlcontrolstream;
        try {
            xmlcontrolstream = new InputSource(new StringReader(xmlControl));
            MyHelperClass AgentBehaviour = new MyHelperClass();
            delegateNodes =(NodeList)(Object) SimpleXMLParser.parseDocument(xmlcontrolstream, AgentBehaviour.XML_CALLBACK);
            actualNode =(Node)(Object) delegateNodes.item(0);
//            MyHelperClass AgentBehaviour = new MyHelperClass();
            wsurl =(String)(Object) SimpleXMLParser.findChildEntry(actualNode, AgentBehaviour.XML_URL);
//            MyHelperClass AgentBehaviour = new MyHelperClass();
            method =(String)(Object) SimpleXMLParser.findChildEntry(actualNode, AgentBehaviour.XML_METHOD);
            if (wsurl == null || method == null) {
                System.out.println("----- Did not get method or wsurl from the properties! -----");
                return;
            }
            url =(URL)(Object) new java.net.URL(wsurl);
            try {
                url.openConnection().connect();
            } catch (UncheckedIOException ex) {
                System.out.println("----- Could not connect to the webservice! -----");
            }
            Vector v_param = new Vector();
            v_param.add(ws_results);
            v_param.add(new Long(docId));
            parameter =(Object[])(Object) v_param.toArray();
            config = new SimpleProvider();
            config.deployTransport("http", new HTTPSender());
            service = new Service(config);
            call = (Call)(Call)(Object) service.createCall();
            call.setTargetEndpointAddress(url);
            call.setOperationName(new QName("http://schemas.xmlsoap.org/soap/encoding/", method));
            try {
                ret = call.invoke(parameter);
                if (ret == null) {
                    ret = new String("No response from callback function!");
                }
                System.out.println("Callback function returned: " + ret);
            } catch (UncheckedIOException ex) {
                System.out.println("----- Could not invoke the method! -----");
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XML_CALLBACK;
	public MyHelperClass XML_URL;
	public MyHelperClass XML_METHOD;
public MyHelperClass parseDocument(InputSource o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass findChildEntry(Node o0, MyHelperClass o1){ return null; }}

class SimpleProvider {

public MyHelperClass deployTransport(String o0, HTTPSender o1){ return null; }}

class Service {

Service(){}
	Service(SimpleProvider o0){}
	public MyHelperClass createCall(){ return null; }}

class Call {

public MyHelperClass setTargetEndpointAddress(URL o0){ return null; }
	public MyHelperClass setOperationName(QName o0){ return null; }
	public MyHelperClass invoke(Object[] o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }}

class Node {

}

class InputSource {

InputSource(StringReader o0){}
	InputSource(){}}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Vector {

public MyHelperClass add(Long o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass toArray(){ return null; }}

class HTTPSender {

}

class QName {

QName(String o0, String o1){}
	QName(){}}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}
