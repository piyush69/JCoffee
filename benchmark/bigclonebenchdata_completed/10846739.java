


class c10846739 {
public MyHelperClass IOUtils;

                public void run() {
                    GZIPInputStream gzipInputStream = null;
                    try {
                        MyHelperClass pipedInputStream = new MyHelperClass();
                        gzipInputStream = new GZIPInputStream(pipedInputStream);
                        MyHelperClass outputStream = new MyHelperClass();
                        IOUtils.copy(gzipInputStream, outputStream);
                    } catch (Throwable t) {
                        MyHelperClass ungzipThreadThrowableList = new MyHelperClass();
                        ungzipThreadThrowableList.add(t);
                    } finally {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(gzipInputStream);
                        MyHelperClass pipedInputStream = new MyHelperClass();
                        IOUtils.closeQuietly(pipedInputStream);
                    }
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(GZIPInputStream o0){ return null; }
	public MyHelperClass closeQuietly(MyHelperClass o0){ return null; }
	public MyHelperClass add(Throwable o0){ return null; }
	public MyHelperClass copy(GZIPInputStream o0, MyHelperClass o1){ return null; }}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}
