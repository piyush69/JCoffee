


class c7891900 {

    public void writeConfiguration(Writer out) throws IOException {
        MyHelperClass myUrl = new MyHelperClass();
        if (myUrl == null) {
            out.append("# Unable to print configuration resource\n");
        } else {
//            MyHelperClass myUrl = new MyHelperClass();
            InputStream in =(InputStream)(Object) myUrl.openStream();
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

public MyHelperClass openStream(){ return null; }
	public MyHelperClass copy(InputStream o0, Writer o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class Writer {

public MyHelperClass append(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
