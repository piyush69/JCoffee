


class c13279978 {
public MyHelperClass isAllowedClient;
	public MyHelperClass LOGGER;

//    @Override
    public void sendContent(OutputStream out, Range range, Map params, String contentType) throws IOException {
        MyHelperClass realFile = new MyHelperClass();
        LOGGER.debug("DOWNLOAD - Send content: " + realFile.getAbsolutePath());
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.debug("Output stream: " + out.toString());
        MyHelperClass ServerConfiguration = new MyHelperClass();
        if ((boolean)(Object)ServerConfiguration.isDynamicSEL()) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("IS DINAMIC SEL????");
        } else {
        }
//        MyHelperClass realFile = new MyHelperClass();
        if (".tokens".equals(realFile.getName()) || ".response".equals(realFile.getName()) || ".request".equals(realFile.getName()) || (boolean)(Object)isAllowedClient) {
            FileInputStream in = null;
            try {
//                MyHelperClass realFile = new MyHelperClass();
                in = new FileInputStream(realFile);
                MyHelperClass IOUtils = new MyHelperClass();
                int bytes =(int)(Object) IOUtils.copy(in, out);
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.debug("System resource or Allowed Client wrote bytes:  " + bytes);
                out.flush();
            } catch (Exception e) {
//                MyHelperClass realFile = new MyHelperClass();
                LOGGER.error("Error while uploading over encryption system " + realFile.getName() + " file", e);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(in);
            }
        } else {
            FileInputStream in = null;
            try {
//                MyHelperClass realFile = new MyHelperClass();
                in = new FileInputStream(realFile);
                MyHelperClass IOUtils = new MyHelperClass();
                int bytes =(int)(Object) IOUtils.copy(in, out);
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.debug("System resource or Allowed Client wrote bytes:  " + bytes);
                out.flush();
            } catch (Exception e) {
//                MyHelperClass realFile = new MyHelperClass();
                LOGGER.error("Error while uploading over encryption system " + realFile.getName() + " file", e);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(in);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass isDynamicSEL(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class Range {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
