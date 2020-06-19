


class c7811546 {
public MyHelperClass getAudioFileFormat(InputStream o0, long o1){ return null; }

    public AudioFileFormat getAudioFileFormat(URL url) throws UnsupportedAudioFileException, IOException {
        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("TAudioFileReader.getAudioFileFormat(URL): begin");
        }
        MyHelperClass AudioSystem = new MyHelperClass();
        long lFileLengthInBytes =(long)(Object) AudioSystem.NOT_SPECIFIED;
        InputStream inputStream =(InputStream)(Object) url.openStream();
        AudioFileFormat audioFileFormat = null;
        try {
            audioFileFormat =(AudioFileFormat)(Object) getAudioFileFormat(inputStream, lFileLengthInBytes);
        } finally {
            inputStream.close();
        }
//        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("TAudioFileReader.getAudioFileFormat(URL): end");
        }
        return audioFileFormat;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_SPECIFIED;
	public MyHelperClass TraceAudioFileReader;
public MyHelperClass out(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class AudioFileFormat {

}

class UnsupportedAudioFileException extends Exception{
	public UnsupportedAudioFileException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
