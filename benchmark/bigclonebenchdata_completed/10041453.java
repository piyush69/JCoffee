


class c10041453 {

    public static void printResource(OutputStream os, String resourceName) throws IOException {
        InputStream is = null;
        try {
            MyHelperClass ResourceLoader = new MyHelperClass();
            is =(InputStream)(Object) ResourceLoader.loadResource(resourceName);
            if (is == null) {
                throw new IOException("Given resource not found!");
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass loadResource(String o0){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
