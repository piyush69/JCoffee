
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c54417 {

    public static void main(final String... args) {
        int returnCode = 0;
        if (args.length == 0) {
            System.err.println("Usage: JWGet url...");
            returnCode++;
        }
        final byte[] buf = new byte[8192];
        for (final String arg : args) {
            try {
                final URL url = new URL(arg);
                OutputStream out = null;
                InputStream in = null;
                try {
                    final URLConnection con =(URLConnection)(Object) url.openConnection();
                    in =(InputStream)(Object) con.getInputStream();
                    final String location =(String)(Object) con.getHeaderField("Content-Location");
                    final String outputFilename =(String)(Object) (new File((location != null ? new URL(url, location) : url).getFile()).getName());
                    System.err.println(outputFilename);
                    out =(OutputStream)(Object) new FileOutputStream(outputFilename);
                    for (int bytesRead; (bytesRead =(int)(Object) in.read(buf)) != -1; out.write(buf, 0, bytesRead)) ;
                } catch (final UncheckedIOException e) {
                    System.err.println(e);
                    returnCode++;
                } finally {
                    try {
                        in.close();
                    } catch (final Exception ignore) {
                    }
                    try {
                        out.close();
                    } catch (final Exception ignore) {
                    }
                }
            } catch (final UncheckedIOException e) {
                System.err.println(e);
                returnCode++;
            }
        }
        System.exit(returnCode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(URL o0, String o1){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
