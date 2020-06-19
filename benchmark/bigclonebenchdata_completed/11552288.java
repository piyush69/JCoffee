import java.io.*;
import java.lang.*;
import java.util.*;



class c11552288 {
public MyHelperClass m_shouldBeRunning;
	public MyHelperClass m_mostRecentKnownLine;
	public MyHelperClass m_source;
	public MyHelperClass SLEEP_TIME;
	public MyHelperClass stripTags(String o0){ return null; }
	public MyHelperClass getURL(){ return null; }

    public void run() {
        Thread.currentThread().setName("zhongwen.com watcher");
        String url =(String)(Object) getURL();
        try {
            while ((boolean)(Object)m_shouldBeRunning) {
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)new URL(url).openStream(), "ISO8859_1"));
                    String line;
                    Vector chatLines = new Vector();
                    boolean startGrabbing = false;
                    while ((line = reader.readLine()) != null) {
                        if (line.indexOf("</style>") >= 0) {
                            startGrabbing = true;
                        } else if (startGrabbing) {
                            if (line.equals(m_mostRecentKnownLine)) {
                                break;
                            }
                            chatLines.addElement(line);
                        }
                    }
                    reader.close();
                    for (int i = chatLines.size() - 1; i >= 0; --i) {
                        String chatLine = (String) chatLines.elementAt(i);
                        m_mostRecentKnownLine =(MyHelperClass)(Object) chatLine;
                        if (chatLine.indexOf(":") >= 0) {
                            String from = chatLine.substring(0, chatLine.indexOf(":"));
                            String message =(String)(Object) stripTags(chatLine.substring(chatLine.indexOf(":")));
                            m_source.pushMessage(new ZhongWenMessage(m_source, from, message));
                        } else {
                            m_source.pushMessage(new ZhongWenMessage(m_source, null, stripTags(chatLine)));
                        }
                    }
                    Thread.sleep((long)(Object)SLEEP_TIME);
                } catch (InterruptedIOException e) {
                } catch (InterruptedException e) {
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            m_source.disconnect();
            throw e;
        } catch (Error e) {
            m_source.disconnect();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass pushMessage(ZhongWenMessage o0){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class ZhongWenMessage {

ZhongWenMessage(){}
	ZhongWenMessage(MyHelperClass o0, Object o1, MyHelperClass o2){}
	ZhongWenMessage(MyHelperClass o0, String o1, String o2){}}
