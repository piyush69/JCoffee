


class c16223923 {
public MyHelperClass getFMT(InputStream o0, boolean o1){ return null; }

    public AudioInputStream getAudioInputStream(URL url) throws UnsupportedAudioFileException, IOException {
        InputStream urlStream =(InputStream)(Object) url.openStream();
        AudioFileFormat fileFormat = null;
        try {
            fileFormat =(AudioFileFormat)(Object) getFMT(urlStream, false);
        } finally {
            if (fileFormat == null) {
                urlStream.close();
            }
        }
        return new AudioInputStream(urlStream, fileFormat.getFormat(), fileFormat.getFrameLength());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class AudioInputStream {

AudioInputStream(InputStream o0, MyHelperClass o1, MyHelperClass o2){}
	AudioInputStream(){}}

class UnsupportedAudioFileException extends Exception{
	public UnsupportedAudioFileException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class AudioFileFormat {

public MyHelperClass getFrameLength(){ return null; }
	public MyHelperClass getFormat(){ return null; }}
