import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7436647 {

//    @Test
    public void testFromFile() throws Throwable, IOException {
        File temp = File.createTempFile("fannj_", ".tmp");
        temp.deleteOnExit();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(this.getClass().getResourceAsStream("xor_float.net"), new FileOutputStream(temp));
        Fann fann = new Fann(temp.getPath());
        assertEquals(2, fann.getNumInputNeurons());
        assertEquals(1, fann.getNumOutputNeurons());
        assertEquals(-1f, fann.run(new float[] { -1, -1 })[0], .2f);
        assertEquals(1f, fann.run(new float[] { -1, 1 })[0], .2f);
        assertEquals(1f, fann.run(new float[] { 1, -1 })[0], .2f);
        assertEquals(-1f, fann.run(new float[] { 1, 1 })[0], .2f);
        fann.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class Test {

}

class Fann {

Fann(){}
	Fann(String o0){}
	public MyHelperClass getNumOutputNeurons(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass run(float[] o0){ return null; }
	public MyHelperClass getNumInputNeurons(){ return null; }}
