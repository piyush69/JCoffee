
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c793434 {
public MyHelperClass currentApplet;

    byte[] loadUrlByteArray(String szName, int offset, int size) {
        byte[] baBuffer = new byte[size];
        try {
            URL url = new URL(currentApplet.getCodeBase(), szName);
            try {
                InputStream file =(InputStream)(Object) url.openStream();
                if (size == 0) {
                    int n =(int)(Object) file.available();
                    baBuffer = new byte[n - offset];
                }
                DataInputStream dataFile = new DataInputStream(file);
                try {
                    dataFile.skip(offset);
                    dataFile.readFully(baBuffer);
                } catch (UncheckedIOException e) {
                    System.err.print(e.getMessage());
                }
                file.close();
            } catch (UncheckedIOException e) {
                System.err.print(e.getMessage());
            }
        } catch (UncheckedIOException e) {
            System.err.print(e.getMessage());
        }
        return baBuffer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodeBase(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class DataInputStream {

DataInputStream(InputStream o0){}
	DataInputStream(){}
	public MyHelperClass skip(int o0){ return null; }
	public MyHelperClass readFully(byte[] o0){ return null; }}

class EOFException extends Exception{
	public EOFException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
