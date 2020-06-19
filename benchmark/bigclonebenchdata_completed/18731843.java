


class c18731843 {
public MyHelperClass loadData(JWebLiteRequestWrapper o0){ return null; }

    public void doBody(JWebLiteRequestWrapper req, JWebLiteResponseWrapper resp) throws SkipException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(this.loadData(req)));
            bos = new BufferedOutputStream(resp.getOutputStream());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(bis, bos);
            bos.flush();
        } catch (Exception e) {
            MyHelperClass _cat = new MyHelperClass();
            _cat.warn("Write data failed!", e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(bis);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(bos);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(BufferedInputStream o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }
	public MyHelperClass warn(String o0, Exception o1){ return null; }}

class JWebLiteRequestWrapper {

}

class JWebLiteResponseWrapper {

public MyHelperClass getOutputStream(){ return null; }}

class SkipException extends Exception{
	public SkipException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
