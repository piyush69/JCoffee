import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18899334 {

    public static void parseSinaGGTJ(ArrayList<String> dataSource, final ArrayList<SinaGGTJBean> sinaGGTJBeanList) throws Throwable, IOReactorException, InterruptedException {
        HttpAsyncClient httpclient =(HttpAsyncClient)(Object) new DefaultHttpAsyncClient();
        httpclient.start();
        if (dataSource != null && dataSource.size() > 0) {
            final CountDownLatch latch = new CountDownLatch(dataSource.size());
            for (int i = 0; i < dataSource.size(); i++) {
                final HttpGet request = new HttpGet(dataSource.get(i));
                httpclient.execute(request, new FutureCallback() {

                    public void completed(final HttpResponse response) {
                        MyHelperClass count = new MyHelperClass();
                        System.out.println(" Request completed " + count + " " + request.getRequestLine() + " " + response.getStatusLine());
                        try {
                            HttpEntity he =(HttpEntity)(Object) response.getEntity();
                            try {
                                MyHelperClass EntityUtils = new MyHelperClass();
                                String resp = EntityUtils.toString(he, "gb2312");
                                if (resp != null && resp.length() > 0) {
                                    MyHelperClass SinaGGTJPostProcess = new MyHelperClass();
                                    SinaGGTJBean ggtjBean = SinaGGTJPostProcess.postSinaGGTJBeanProcess(resp);
                                    sinaGGTJBeanList.add(ggtjBean);
                                }
//                                MyHelperClass count = new MyHelperClass();
                                count++;
                            } catch (ParseException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            latch.countDown();
                        } catch (RuntimeException re) {
                            latch.countDown();
                        }
                    }

                    public void failed(final Exception ex) {
                        latch.countDown();
                    }

                    public void cancelled() {
                        latch.countDown();
                    }
                });
            }
            latch.await();
            System.out.println("done");
        }
        if (httpclient != null) {
            httpclient.shutdown();
        }
        System.out.println(sinaGGTJBeanList.size());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int count;
public MyHelperClass postSinaGGTJBeanProcess(String o0){ return null; }}

class SinaGGTJBean {

}

class IOReactorException extends Exception{
	public IOReactorException(String errorMessage) { super(errorMessage); }
}

class HttpAsyncClient {

public MyHelperClass execute(HttpGet o0, <anonymous FutureCallback> o1){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass shutdown(){ return null; }}

class DefaultHttpAsyncClient {

}

class CountDownLatch {

CountDownLatch(int o0){}
	CountDownLatch(){}
	public MyHelperClass await(){ return null; }
	public MyHelperClass countDown(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass getRequestLine(){ return null; }}

class FutureCallback {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(HttpEntity o0, String o1){ return null; }}
