


class c20109527 {

    private void writeMessage(ChannelBuffer buffer, File dst) throws IOException {
        ChannelBufferInputStream is = new ChannelBufferInputStream(buffer);
        OutputStream os = null;
        try {
            os =(OutputStream)(Object) new FileOutputStream(dst);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(is, os);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(os);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(ChannelBufferInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }}

class ChannelBuffer {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ChannelBufferInputStream {

ChannelBufferInputStream(){}
	ChannelBufferInputStream(ChannelBuffer o0){}}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
