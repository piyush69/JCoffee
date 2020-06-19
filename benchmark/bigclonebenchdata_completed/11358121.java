


class c11358121 {
public MyHelperClass putEvent(DebugEvent o0){ return null; }

        public void run() {
            try {
                putEvent(new DebugEvent("about to place HTTP request"));
                MyHelperClass requestURL = new MyHelperClass();
                HttpGet req = new HttpGet(requestURL);
                req.addHeader("Connection", "close");
                MyHelperClass httpClient = new MyHelperClass();
                HttpResponse httpResponse =(HttpResponse)(Object) httpClient.execute(req);
                putEvent(new DebugEvent("got response to HTTP request"));
                MyHelperClass nonSipPort = new MyHelperClass();
                nonSipPort.input(new Integer((int)(Object)httpResponse.getStatusLine().getStatusCode()));
                HttpEntity entity =(HttpEntity)(Object) httpResponse.getEntity();
                if (entity != null) {
                    InputStream in =(InputStream)(Object) entity.getContent();
                    if (in != null) in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass input(Integer o0){ return null; }}

class DebugEvent {

DebugEvent(){}
	DebugEvent(String o0){}}

class HttpGet {

HttpGet(){}
	HttpGet(MyHelperClass o0){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
