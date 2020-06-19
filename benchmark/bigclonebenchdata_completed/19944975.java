


class c19944975 {

    public void writeConfiguration(Writer out) throws IOException {
        MyHelperClass myResource = new MyHelperClass();
        if (myResource == null) {
            out.append("# Unable to print configuration resource\n");
        } else {
//            MyHelperClass myResource = new MyHelperClass();
            URL url =(URL)(Object) myResource.getUrl();
            InputStream in =(InputStream)(Object) url.openStream();
            if (in != null) {
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
                }
            } else {
                out.append("# Unable to print configuration resource\n");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, Writer o1){ return null; }}

class Writer {

public MyHelperClass append(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}
