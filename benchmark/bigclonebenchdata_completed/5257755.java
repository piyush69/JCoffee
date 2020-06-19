import java.io.*;
import java.lang.*;
import java.util.*;



class c5257755 {

    protected URLConnection openConnection(URL url) throws IOException {
        if (url == null) return null;
        if (!url.getProtocol().equals("nntp")) return null;
        MyHelperClass m_connection = new MyHelperClass();
        if (m_connection != null) {
//            MyHelperClass m_connection = new MyHelperClass();
            if (m_connection.getURL().getHost().equals(url.getHost()) && (m_connection.getURL().getPort() == url.getPort()) && (m_connection.getURL().getUserInfo().equals(url.getUserInfo()))) {
//                MyHelperClass m_connection = new MyHelperClass();
                return (URLConnection)(Object)m_connection;
            }
        }
//        MyHelperClass m_connection = new MyHelperClass();
        m_connection =(MyHelperClass)(Object) new NNTPConnection(url);
//        MyHelperClass m_connection = new MyHelperClass();
        return (URLConnection)(Object)m_connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getURL(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getUserInfo(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class URL {

public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getUserInfo(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class URLConnection {

}

class NNTPConnection {

NNTPConnection(URL o0){}
	NNTPConnection(){}}
