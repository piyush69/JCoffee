


class c924033 {

    public static void main(String[] args) throws Exception {
        InputStream in = null;
        try {
            in =(InputStream)(Object) (new URL(args[0]).openStream());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyBytes(in,(PrintStream)(Object) System.out, 4096, false);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeStream(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass copyBytes(InputStream o0, PrintStream o1, int o2, boolean o3){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class PrintStream {

}
