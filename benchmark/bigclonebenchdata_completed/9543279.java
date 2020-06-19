
import java.io.UncheckedIOException;


class c9543279 {
public MyHelperClass logger;

//    @Override
    protected void write(InputStream in, OutputStream out, javax.sound.sampled.AudioFormat javaSoundFormat) throws IOException {
        MyHelperClass USE_JAVASOUND = new MyHelperClass();
        if ((boolean)(Object)USE_JAVASOUND) {
            this.write(in, out, javaSoundFormat);
        } else {
            try {
                MyHelperClass JavaSoundCodec = new MyHelperClass();
                byte[] header =(byte[])(Object) JavaSoundCodec.createWavHeader((AudioFormat)(Object)javaSoundFormat);
                if (header == null) throw new IOException("Unable to create wav header");
                out.write(header);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyStream(in, out);
            } catch (UncheckedIOException e) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.FINE, "" + e,(InterruptedIOException)(Object) e);
                throw e;
            } catch (IOException e) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.WARNING, "" + e, e);
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass FINE;
public MyHelperClass log(MyHelperClass o0, String o1, InterruptedIOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass createWavHeader(AudioFormat o0){ return null; }}

class InputStream {

}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InterruptedIOException extends Exception{
	public InterruptedIOException(String errorMessage) { super(errorMessage); }
}

class AudioFormat {

}
