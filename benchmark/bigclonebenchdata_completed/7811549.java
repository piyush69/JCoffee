
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7811549 {
public MyHelperClass getAudioInputStream(InputStream o0, long o1){ return null; }

    public AudioInputStream getAudioInputStream(URL url) throws UnsupportedAudioFileException, IOException {
        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("TAudioFileReader.getAudioInputStream(URL): begin");
        }
        MyHelperClass AudioSystem = new MyHelperClass();
        long lFileLengthInBytes =(long)(Object) AudioSystem.NOT_SPECIFIED;
        InputStream inputStream =(InputStream)(Object) url.openStream();
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream =(AudioInputStream)(Object) getAudioInputStream(inputStream, lFileLengthInBytes);
        } catch (UncheckedIOException e) {
            inputStream.close();
            throw e;
        } catch (ArithmeticException e) {
            inputStream.close();
            throw e;
        }
//        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("TAudioFileReader.getAudioInputStream(URL): end");
        }
        return audioInputStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TraceAudioFileReader;
	public MyHelperClass NOT_SPECIFIED;
public MyHelperClass out(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class AudioInputStream {

}

class UnsupportedAudioFileException extends Exception{
	public UnsupportedAudioFileException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
