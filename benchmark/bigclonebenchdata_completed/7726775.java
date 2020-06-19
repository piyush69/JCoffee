


class c7726775 {

    public void write(URL exportUrl, OutputStream output) throws Exception {
        if (exportUrl == null || output == null) {
            throw new DocumentListException("null passed in for required parameters");
        }
        MediaContent mc = new MediaContent();
        mc.setUri(exportUrl.toString());
        MyHelperClass service = new MyHelperClass();
        MediaSource ms =(MediaSource)(Object) service.getMedia(mc);
        InputStream input =(InputStream)(Object) ms.getInputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getMedia(MediaContent o0){ return null; }}

class URL {

}

class OutputStream {

}

class DocumentListException extends Exception{
	public DocumentListException(String errorMessage) { super(errorMessage); }
}

class MediaContent {

public MyHelperClass setUri(String o0){ return null; }}

class MediaSource {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}
