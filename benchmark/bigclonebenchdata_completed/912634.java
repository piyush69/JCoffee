


class c912634 {
public MyHelperClass getCodeBase(){ return null; }
public MyHelperClass readline(InputStream o0){ return null; }

    String fetch_m3u(String m3u) {
        InputStream pstream = null;
        if (m3u.startsWith("http://")) {
            try {
                URL url = null;
                MyHelperClass running_as_applet = new MyHelperClass();
                if ((boolean)(Object)running_as_applet) url = new URL(getCodeBase(), m3u); else url = new URL(m3u);
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                pstream =(InputStream)(Object) urlc.getInputStream();
            } catch (Exception ee) {
                System.err.println(ee);
                return null;
            }
        }
        MyHelperClass running_as_applet = new MyHelperClass();
        if (pstream == null && !(Boolean)(Object)running_as_applet) {
            try {
                pstream =(InputStream)(Object) new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + m3u);
            } catch (Exception ee) {
                System.err.println(ee);
                return null;
            }
        }
        String line = null;
        while (true) {
            try {
                line =(String)(Object) readline(pstream);
            } catch (Exception e) {
            }
            if (line == null) break;
            return line;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(String o0){}}
