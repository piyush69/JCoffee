


class c22135200 {
public MyHelperClass newChannel(ByteArrayOutputStream o0){ return null; }
public MyHelperClass File;
	public MyHelperClass wrap(String o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testCodingCompletedFromFile() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel channel =(WritableByteChannel)(Object) newChannel(baos);
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        SessionOutputBuffer outbuf =(SessionOutputBuffer)(Object) new SessionOutputBufferImpl(1024, 128, params);
        HttpTransportMetricsImpl metrics = new HttpTransportMetricsImpl();
        LengthDelimitedEncoder encoder = new LengthDelimitedEncoder(channel, outbuf, metrics, 5);
        encoder.write(wrap("stuff"));
        File tmpFile =(File)(Object) File.createTempFile("testFile", "txt");
        FileOutputStream fout = new FileOutputStream(tmpFile);
        OutputStreamWriter wrtout = new OutputStreamWriter(fout);
        wrtout.write("more stuff");
        wrtout.flush();
        wrtout.close();
        try {
            FileChannel fchannel =(FileChannel)(Object) (new FileInputStream(tmpFile).getChannel());
            encoder.transfer(fchannel, 0, 10);
            fail("IllegalStateException should have been thrown");
        } catch (IllegalStateException ex) {
        } finally {
            tmpFile.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class ByteArrayOutputStream {

}

class WritableByteChannel {

}

class HttpParams {

}

class BasicHttpParams {

}

class SessionOutputBuffer {

}

class SessionOutputBufferImpl {

SessionOutputBufferImpl(){}
	SessionOutputBufferImpl(int o0, int o1, HttpParams o2){}}

class HttpTransportMetricsImpl {

}

class LengthDelimitedEncoder {

LengthDelimitedEncoder(){}
	LengthDelimitedEncoder(WritableByteChannel o0, SessionOutputBuffer o1, HttpTransportMetricsImpl o2, int o3){}
	public MyHelperClass transfer(FileChannel o0, int o1, int o2){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(FileOutputStream o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileChannel {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
