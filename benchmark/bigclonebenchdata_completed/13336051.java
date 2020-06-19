


class c13336051 {

    protected static String getFileContentAsString(URL url, String encoding) throws IOException {
        InputStream input = null;
        StringWriter sw = new StringWriter();
        try {
            System.out.println("Free mem :" + Runtime.getRuntime().freeMemory());
            input =(InputStream)(Object) url.openStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, sw, encoding);
            System.out.println("Free mem :" + Runtime.getRuntime().freeMemory());
        } finally {
            if (input != null) {
                input.close();
                System.gc();
                input = null;
                System.out.println("Free mem :" + Runtime.getRuntime().freeMemory());
            }
        }
        return sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

}
