


class c15262411 {
public MyHelperClass readline(InputStream o0){ return null; }
public MyHelperClass running_as_applet;
	public MyHelperClass getCodeBase(){ return null; }

    String fetch_pls(String pls) {
        InputStream pstream = null;
        if (pls.startsWith("http://")) {
            try {
                URL url = null;
                MyHelperClass running_as_applet = new MyHelperClass();
                if ((boolean)(Object)running_as_applet) {
                    url = new URL(getCodeBase(), pls);
                } else {
                    url = new URL(pls);
                }
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                pstream =(InputStream)(Object) urlc.getInputStream();
            } catch (Exception ee) {
                System.err.println(ee);
                return null;
            }
        }
        if (pstream == null && !(Boolean)(Object)running_as_applet) {
            try {
                pstream =(InputStream)(Object) new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + pls);
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
            if (line == null) {
                break;
            }
            if (line.startsWith("File1=")) {
                byte[] foo = line.getBytes();
                int i = 6;
                for (; i < foo.length; i++) {
                    if (foo[i] == 0x0d) {
                        break;
                    }
                }
                return line.substring(6, i);
            }
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

FileInputStream(String o0){}
	FileInputStream(){}}
