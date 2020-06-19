


class c16347457 {

    public void start(OutputStream bytes, Target target) throws IOException {
        MyHelperClass url = new MyHelperClass();
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        InputStream fis =(InputStream)(Object) conn.getInputStream();
        byte[] buf = new byte[4096];
        while (true) {
            int bytesRead =(int)(Object) fis.read(buf);
            if (bytesRead < 1) break;
            bytes.write(buf, 0, bytesRead);
        }
        fis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class Target {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
