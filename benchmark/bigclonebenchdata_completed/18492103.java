


class c18492103 {
public MyHelperClass IOUtils;
	public MyHelperClass fileSystem;
	public MyHelperClass OutputMode;
	public MyHelperClass _(String o0){ return null; }

    public void shouldAllowClosingInputStreamTwice() throws IOException {
        OutputStream outputStream =(OutputStream)(Object) fileSystem.createOutputStream(_("hello"), OutputMode.OVERWRITE);
        outputStream.write(new byte[] { 1, 2, 3 });
        outputStream.close();
        InputStream inputStream =(InputStream)(Object) fileSystem.createInputStream(_("hello"));
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, buffer);
        inputStream.close();
        inputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OVERWRITE;
public MyHelperClass createOutputStream(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass createInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

}
