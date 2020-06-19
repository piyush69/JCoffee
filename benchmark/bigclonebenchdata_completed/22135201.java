import java.io.*;
import java.lang.*;
import java.util.*;



class c22135201 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass newChannel(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

    public void testCodingFromFileSmaller() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel channel =(WritableByteChannel)(Object) newChannel(baos);
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        SessionOutputBuffer outbuf =(SessionOutputBuffer)(Object) new SessionOutputBufferImpl(1024, 128, params);
        HttpTransportMetricsImpl metrics = new HttpTransportMetricsImpl();
        LengthDelimitedEncoder encoder = new LengthDelimitedEncoder(channel, outbuf, metrics, 16);
        File tmpFile = File.createTempFile("testFile", "txt");
        FileOutputStream fout = new FileOutputStream(tmpFile);
        OutputStreamWriter wrtout = new OutputStreamWriter(fout);
        wrtout.write("stuff;");
        wrtout.write("more stuff;");
        wrtout.flush();
        wrtout.close();
        FileChannel fchannel =(FileChannel)(Object) (new FileInputStream(tmpFile).getChannel());
        encoder.transfer(fchannel, 0, 20);
        String s = baos.toString("US-ASCII");
        assertTrue(encoder.isCompleted());
        assertEquals("stuff;more stuff", s);
        tmpFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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

SessionOutputBufferImpl(int o0, int o1, HttpParams o2){}
	SessionOutputBufferImpl(){}}

class HttpTransportMetricsImpl {

}

class LengthDelimitedEncoder {

LengthDelimitedEncoder(){}
	LengthDelimitedEncoder(WritableByteChannel o0, SessionOutputBuffer o1, HttpTransportMetricsImpl o2, int o3){}
	public MyHelperClass isCompleted(){ return null; }
	public MyHelperClass transfer(FileChannel o0, int o1, int o2){ return null; }}

class FileChannel {

}
