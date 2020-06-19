
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19650324 {

        public void perform(Context context) {
            Long workflowIdParentProcess;
            SimpleProvider config;
            VariablesContext var;
            String xmldocument;
            Service service;
            Object[] param;
            String method;
            String wsurl;
            Object ret;
            Call call;
            URL url;
            try {
                MyHelperClass Variables = new MyHelperClass();
                var =(VariablesContext)(Object) Variables.getContext();
                if (var.get("wsurl") == null || var.get("method") == null) {
                    System.out.println("----- Need the url of the webservice and the method! -----");
                    MyHelperClass log_ = new MyHelperClass();
                    log_.error("Need the url of the webservice and the method!");
                    return;
                }
                method =(String)(Object) var.get("method");
                wsurl =(String)(Object) var.get("wsurl");
                url =(URL)(Object) new java.net.URL(wsurl);
                try {
                    url.openConnection().connect();
                } catch (UncheckedIOException ex) {
                    System.out.println("----- Could not connect to the webservice! -----");
                    MyHelperClass log_ = new MyHelperClass();
                    log_.error("Could not connect to the webservice!");
                    return;
                }
                if (var.get("param0") == null || var.get("param1") == null) {
                    System.out.println("----- Need parameters! -----");
                    MyHelperClass log_ = new MyHelperClass();
                    log_.error("Need parameters!");
                    return;
                }
                xmldocument =(String)(Object) var.get("param0");
                workflowIdParentProcess = new Long((long)(Object)var.get("param1"));
                param = new Object[] { xmldocument, workflowIdParentProcess };
                config = new SimpleProvider();
                config.deployTransport("http", new HTTPSender());
                service = new Service(config);
                call = (Call)(Call)(Object) service.createCall();
                call.setTargetEndpointAddress((URL)(Object)new java.net.URL(wsurl));
                call.setOperationName(new QName("http://schemas.xmlsoap.org/soap/encoding/", method));
                try {
                    ret = call.invoke(param);
                    MyHelperClass CTX_ANSW = new MyHelperClass();
                    context.set(CTX_ANSW, "=> notifyIhk invoked - Result: " + ret);
                    System.out.println("----- notifyIhk invoked! -----");
                    MyHelperClass log_ = new MyHelperClass();
                    log_.info("notifyIhk invoked!");
                } catch (UncheckedIOException ex) {
                    System.out.println("----- Could not invoke the method! -----");
                    MyHelperClass log_ = new MyHelperClass();
                    log_.error("Could not invoke the method!");
                }
            } catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContext(){ return null; }}

class Context {

public MyHelperClass set(MyHelperClass o0, String o1){ return null; }}

class SimpleProvider {

public MyHelperClass deployTransport(String o0, HTTPSender o1){ return null; }}

class VariablesContext {

public MyHelperClass get(String o0){ return null; }}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HTTPSender {

}

class QName {

QName(String o0, String o1){}
	QName(){}}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}
