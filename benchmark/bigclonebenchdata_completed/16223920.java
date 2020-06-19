


class c16223920 {
public MyHelperClass getFMT(InputStream o0, boolean o1){ return null; }

    public AudioFileFormat getAudioFileFormat(URL url) throws UnsupportedAudioFileException, IOException {
        InputStream urlStream =(InputStream)(Object) url.openStream();
        AudioFileFormat fileFormat = null;
        try {
            fileFormat =(AudioFileFormat)(Object) getFMT(urlStream, false);
        } finally {
            urlStream.close();
        }
        return fileFormat;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
