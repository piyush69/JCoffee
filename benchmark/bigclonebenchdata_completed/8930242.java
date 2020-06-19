import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8930242 {

                public HttpRequest createHttpRequest()  throws Throwable {
                    return new HttpRequest() {

                        private byte[] bytes;

                        private Vector<ReadyStateChangeListener> readyStateChangeListeners = new Vector<ReadyStateChangeListener>();

                        public void abort() {
                        }

                        public void addReadyStateChangeListener(ReadyStateChangeListener readyStateChangeListener) {
                            readyStateChangeListeners.add(readyStateChangeListener);
                        }

                        public String getAllResponseHeaders() {
                            return null;
                        }

                        public int getReadyState() {
                            MyHelperClass STATE_COMPLETE = new MyHelperClass();
                            MyHelperClass STATE_UNINITIALIZED = new MyHelperClass();
                            return bytes != null ? STATE_COMPLETE : STATE_UNINITIALIZED;
                        }

                        public byte[] getResponseBytes() {
                            return bytes;
                        }

                        public String getResponseHeader(String arg0) {
                            return null;
                        }

                        public Image getResponseImage() {
                            MyHelperClass Toolkit = new MyHelperClass();
                            return bytes != null ? Toolkit.getDefaultToolkit().createImage(bytes) : null;
                        }

                        public String getResponseText() {
                            return new String(bytes);
                        }

                        public Document getResponseXML() {
                            return null;
                        }

                        public int getStatus() {
                            return 200;
                        }

                        public String getStatusText() {
                            return "OK";
                        }

                        public void open(String method, String url) {
                            open(method, url, false);
                        }

                        public void open(String method, URL url) {
                            open(method, url, false);
                        }

                        public void open(String mehod, URL url, boolean async) {
                            try {
                                URLConnection connection = url.openConnection();
                                bytes = new byte[connection.getContentLength()];
                                InputStream inputStream = connection.getInputStream();
                                inputStream.read(bytes);
                                inputStream.close();
                                for (ReadyStateChangeListener readyStateChangeListener : readyStateChangeListeners) {
                                    readyStateChangeListener.readyStateChanged();
                                }
                            } catch (IOException e) {
                            }
                        }

                        public void open(String method, String url, boolean async) {
                            MyHelperClass URLHelper = new MyHelperClass();
                            open(method,(URL)(Object) URLHelper.createURL(url), async);
                        }

                        public void open(String method, String url, boolean async, String arg3) {
                            MyHelperClass URLHelper = new MyHelperClass();
                            open(method,(URL)(Object) URLHelper.createURL(url), async);
                        }

                        public void open(String method, String url, boolean async, String arg3, String arg4) {
                            MyHelperClass URLHelper = new MyHelperClass();
                            open(method,(URL)(Object) URLHelper.createURL(url), async);
                        }
                    };
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createURL(String o0){ return null; }
	public MyHelperClass createImage(byte[] o0){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }}

class HttpRequest {

}

class ReadyStateChangeListener {

public MyHelperClass readyStateChanged(){ return null; }}

class Image {

}

class Document {

}
