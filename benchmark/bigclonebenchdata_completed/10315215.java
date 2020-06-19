import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10315215 {
public MyHelperClass tmpDir;
	public MyHelperClass rc;
	public MyHelperClass testFileName;
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public final void testT4CClientWriter() throws Exception {
        InputStream is = ClassLoader.getSystemResourceAsStream((String)(Object)this.testFileName);
        T4CClientReader reader = new T4CClientReader(is, rc);
        File tmpFile = File.createTempFile("barde", ".log",(File)(Object) this.tmpDir);
        System.out.println("tmp=" + tmpFile.getAbsolutePath());
        T4CClientWriter writer = new T4CClientWriter(new FileOutputStream(tmpFile), rc);
        for (Message m =(Message)(Object) reader.read(); m != null; m =(Message)(Object) reader.read()) writer.write(m);
        writer.close();
        InputStream fa = ClassLoader.getSystemResourceAsStream((String)(Object)this.testFileName);
        FileInputStream fb = new FileInputStream(tmpFile);
		for (int ba = fa.read(); ba != -1; ba = fa.read()) assertEquals(ba, fb.read());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class T4CClientReader {

T4CClientReader(InputStream o0, MyHelperClass o1){}
	T4CClientReader(){}
	public MyHelperClass read(){ return null; }}

class T4CClientWriter {

T4CClientWriter(FileOutputStream o0, MyHelperClass o1){}
	T4CClientWriter(){}
	public MyHelperClass write(Message o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Message {

}
