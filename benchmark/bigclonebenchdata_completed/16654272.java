


class c16654272 {

    public AudioInputStream getAudioInputStream(URL url, String userAgent) throws UnsupportedAudioFileException, IOException {
        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("MpegAudioFileReaderWorkaround.getAudioInputStream(URL,String): begin");
        }
        MyHelperClass AudioSystem = new MyHelperClass();
        long lFileLengthInBytes =(long)(Object) AudioSystem.NOT_SPECIFIED;
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        boolean isShout = false;
        int toRead = 4;
        byte[] head = new byte[toRead];
        if (userAgent != null) conn.setRequestProperty("User-Agent", userAgent);
        conn.setRequestProperty("Accept", "*/*");
        conn.setRequestProperty("Icy-Metadata", "1");
        conn.setRequestProperty("Connection", "close");
        BufferedInputStream bInputStream = new BufferedInputStream(conn.getInputStream());
        bInputStream.mark(toRead);
        int read =(int)(Object) bInputStream.read(head, 0, toRead);
        if ((read > 2) && (((head[0] == 'I') | (head[0] == 'i')) && ((head[1] == 'C') | (head[1] == 'c')) && ((head[2] == 'Y') | (head[2] == 'y')))) {
            isShout = true;
        }
        bInputStream.reset();
        InputStream inputStream = null;
        if (isShout == true) {
            IcyInputStream icyStream = new IcyInputStream(bInputStream);
            MyHelperClass IcyListener = new MyHelperClass();
            icyStream.addTagParseListener(IcyListener.getInstance());
            inputStream =(InputStream)(Object) icyStream;
        } else {
            String metaint =(String)(Object) conn.getHeaderField("icy-metaint");
            if (metaint != null) {
                IcyInputStream icyStream = new IcyInputStream(bInputStream, metaint);
                MyHelperClass IcyListener = new MyHelperClass();
                icyStream.addTagParseListener(IcyListener.getInstance());
                inputStream =(InputStream)(Object) icyStream;
            } else {
                inputStream =(InputStream)(Object) bInputStream;
            }
        }
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = getAudioInputStream((URL)(Object)inputStream,(String)(Object) lFileLengthInBytes);
        } catch (UnsupportedAudioFileException e) {
            inputStream.close();
            throw e;
        } catch (IOException e) {
            inputStream.close();
            throw e;
        }
//        MyHelperClass TDebug = new MyHelperClass();
        if ((boolean)(Object)TDebug.TraceAudioFileReader) {
//            MyHelperClass TDebug = new MyHelperClass();
            TDebug.out("MpegAudioFileReaderWorkaround.getAudioInputStream(URL,String): end");
        }
        return audioInputStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_SPECIFIED;
	public MyHelperClass TraceAudioFileReader;
public MyHelperClass out(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class AudioInputStream {

}

class UnsupportedAudioFileException extends Exception{
	public UnsupportedAudioFileException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass mark(int o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IcyInputStream {

IcyInputStream(BufferedInputStream o0){}
	IcyInputStream(){}
	IcyInputStream(BufferedInputStream o0, String o1){}
	public MyHelperClass addTagParseListener(MyHelperClass o0){ return null; }}
