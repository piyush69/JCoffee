


class c8544627 {
public MyHelperClass setResponseData(MyHelperClass o0){ return null; }
public MyHelperClass LOADER;

//        @Override
        protected void copyContent(String filename) throws IOException {
            InputStream in = null;
            try {
                MyHelperClass RES_PKG = new MyHelperClass();
                in =(InputStream)(Object) LOADER.getResourceAsStream(RES_PKG + filename);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                setResponseData(out.toByteArray());
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
