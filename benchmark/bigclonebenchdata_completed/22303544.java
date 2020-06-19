


class c22303544 {
public MyHelperClass defaultUdpPort;
	public MyHelperClass defaultUdpAddress;
	public MyHelperClass JCFS;
	public MyHelperClass dir;
	public MyHelperClass defaultTcpAddress;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @Test
    public void testWriteAndRead() throws Exception {
        MyHelperClass defaultTcpPort = new MyHelperClass();
        JCFSFileServer server = new JCFSFileServer(defaultTcpPort, defaultTcpAddress, defaultUdpPort, defaultUdpAddress, dir, 0, 0);
        MyHelperClass defaultUdpAddress = new MyHelperClass();
        JCFS.configureDiscovery(defaultUdpAddress, defaultUdpPort);
        try {
            server.start();
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
        } finally {
            server.stop();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass configureDiscovery(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Test {

}

class JCFSFileServer {

JCFSFileServer(){}
	JCFSFileServer(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, int o5, int o6){}
	public MyHelperClass stop(){ return null; }
	public MyHelperClass start(){ return null; }}

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
