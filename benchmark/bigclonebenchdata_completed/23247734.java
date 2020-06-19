


class c23247734 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        InputStream in = null;
        try {
            in =(InputStream)(Object) (new URL("hdfs://localhost:8020/user/leeing/maxtemp/sample.txt").openStream());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyBytes(in,(PrintStream)(Object) System.out, 8192, false);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeStream(in);
            System.out.println("\nend.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass copyBytes(InputStream o0, PrintStream o1, int o2, boolean o3){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class PrintStream {

}
