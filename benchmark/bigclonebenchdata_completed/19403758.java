


class c19403758 {
public MyHelperClass IOUtils;
	public MyHelperClass log;
	public MyHelperClass getContentServiceSpring(){ return null; }

//    @Override
    protected void handleCreateEditionForExport(File outputFile, int viewComponentIdWithUnit) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.info("createEditionForExport ");
        InputStream edition = null;
        if (viewComponentIdWithUnit <= 0) {
            edition =(InputStream)(Object) getContentServiceSpring().exportEditionFull();
        } else {
            edition =(InputStream)(Object) getContentServiceSpring().exportEditionUnit(Integer.valueOf(viewComponentIdWithUnit));
        }
        log.info("got answer... ");
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("tmpFile " + outputFile.getName());
        FileOutputStream fos = new FileOutputStream(outputFile);
        IOUtils.copyLarge(edition, fos);
        IOUtils.closeQuietly(edition);
        IOUtils.closeQuietly(fos);
        outputFile = null;
        System.gc();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exportEditionUnit(Integer o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass exportEditionFull(){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
