


class c15194834 {

//    @Override
    public AudioFileFormat getAudioFileFormat(URL url) throws UnsupportedAudioFileException, IOException {
        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("getAudioFileFormat(URL url)");
        }
        InputStream inputStream =(InputStream)(Object) url.openStream();
        try {
            return getAudioFileFormat((URL)(Object)inputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
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
