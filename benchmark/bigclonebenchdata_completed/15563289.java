import java.io.*;
import java.lang.*;
import java.util.*;



class c15563289 {

    public AudioInputStream getAudioInputStream(URL url) throws UnsupportedAudioFileException, IOException {
        InputStream urlStream = null;
        BufferedInputStream bis = null;
        AudioFileFormat fileFormat = null;
        urlStream =(InputStream)(Object) url.openStream();
        AudioInputStream result = null;
        try {
            MyHelperClass bisBufferSize = new MyHelperClass();
            bis = new BufferedInputStream(urlStream,(int)(Object) bisBufferSize);
            result = getAudioInputStream((URL)(Object)(InputStream) bis);
        } finally {
            if (result == null) {
                urlStream.close();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class AudioInputStream {

}

class UnsupportedAudioFileException extends Exception{
	public UnsupportedAudioFileException(String errorMessage) { super(errorMessage); }
}

class AudioFileFormat {

}
