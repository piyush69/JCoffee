


class c11477906 {

    private static void loadDefaultSettings(final String configFileName) {
        InputStream in = null;
        OutputStream out = null;
        try {
            MyHelperClass META_INF_DEFAULT_CONFIG_PROPERTIES = new MyHelperClass();
            in =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream((String)(Object)META_INF_DEFAULT_CONFIG_PROPERTIES);
            out =(OutputStream)(Object) new FileOutputStream(configFileName);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
        } catch (final Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Unable to pull out the default.", e);
            throw new RuntimeException(e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
