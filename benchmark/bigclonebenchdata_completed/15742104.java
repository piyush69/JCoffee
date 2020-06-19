


class c15742104 {
public MyHelperClass JCFS;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @Test
    public void testWriteAndRead() throws Exception {
        MyHelperClass dir = new MyHelperClass();
        JCFS.configureLoopback(dir);
        RFile file = new RFile("testreadwrite.txt");
        RFileOutputStream out = new RFileOutputStream(file);
        out.write("test".getBytes("utf-8"));
        out.close();
        RFileInputStream in = new RFileInputStream(file);
        byte[] buffer = new byte[4];
        int readCount =(int)(Object) in.read(buffer);
        in.close();
        assertEquals(4, readCount);
        String resultRead = new String(buffer, "utf-8");
        assertEquals("test", resultRead);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass configureLoopback(MyHelperClass o0){ return null; }}

class Test {

}

class RFile {

RFile(String o0){}
	RFile(){}}

class RFileOutputStream {

RFileOutputStream(RFile o0){}
	RFileOutputStream(){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class RFileInputStream {

RFileInputStream(RFile o0){}
	RFileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
