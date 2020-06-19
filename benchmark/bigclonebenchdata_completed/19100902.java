


class c19100902 {

    public static void saveURL(URL url, Writer writer) throws IOException {
        BufferedInputStream in = new BufferedInputStream(url.openStream());
        for (int c =(int)(Object) in.read(); c != -1; c =(int)(Object) in.read()) {
            writer.write(c);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Writer {

public MyHelperClass write(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}
