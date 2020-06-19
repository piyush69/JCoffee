
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9846843 {

    public byte[] getResponse() {
        MyHelperClass request = new MyHelperClass();
        final ByteArrayInputStream bais = new ByteArrayInputStream(request);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MyHelperClass Collections = new MyHelperClass();
        List lines =(List)(Object) Collections.emptyList();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            @SuppressWarnings("unchecked") List dl =(List)(Object) IOUtils.readLines(bais);
            lines = dl;
        } catch (UncheckedIOException ioex) {
            throw new AssertionError(ioex);
        }
        String resource = null;
        for (String line :(String[])(Object) (Object[])(Object)lines) {
            if (line.startsWith("GET ")) {
                int endIndex = line.lastIndexOf(' ');
                resource = line.substring(4, endIndex);
            }
        }
        final PrintStream printStream = new PrintStream(baos);
        if (resource == null) {
            printStream.println("HTTP/1.1 400 Bad Request");
        } else {
            final InputStream inputStream =(InputStream)(Object) getClass().getResourceAsStream(resource);
            if (inputStream == null) {
                printStream.println("HTTP/1.1 404 Not Found");
                printStream.println();
            } else {
                printStream.println("HTTP/1.1 200 OK");
                printStream.println();
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(inputStream, printStream);
                } catch (UncheckedIOException ioex) {
                    throw new AssertionError(ioex);
                }
            }
        }
        printStream.flush();
        printStream.close();
        return(byte[])(Object) baos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLines(ByteArrayInputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, PrintStream o1){ return null; }
	public MyHelperClass emptyList(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class List {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

PrintStream(){}
	PrintStream(ByteArrayOutputStream o0){}
	public MyHelperClass println(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}
