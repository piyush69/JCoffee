


class c3265819 {
public MyHelperClass _putHandle;

//    @Test
    public void testLargePut() throws Throwable {
        MyHelperClass CommonParameters = new MyHelperClass();
        int size =(int)(Object) CommonParameters.BLOCK_SIZE;
        MyHelperClass _fileName = new MyHelperClass();
        InputStream is =(InputStream)(Object) new FileInputStream(_fileName);
        MyHelperClass _nodeName = new MyHelperClass();
        RepositoryFileOutputStream ostream = new RepositoryFileOutputStream(_nodeName, _putHandle, CommonParameters.local);
        int readLen = 0;
        int writeLen = 0;
//        MyHelperClass CommonParameters = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)CommonParameters.BLOCK_SIZE];
        while ((readLen =(int)(Object) is.read(buffer, 0, size)) != -1) {
            ostream.write(buffer, 0, readLen);
            writeLen += readLen;
        }
        ostream.close();
        MyHelperClass _putHandle = new MyHelperClass();
        CCNStats stats =(CCNStats)(Object) _putHandle.getNetworkManager().getStats();
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(0, stats.getCounter("DeliverInterestFailed"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BLOCK_SIZE;
	public MyHelperClass local;
public MyHelperClass getStats(){ return null; }
	public MyHelperClass getNetworkManager(){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }}

class Test {

}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class RepositoryFileOutputStream {

RepositoryFileOutputStream(){}
	RepositoryFileOutputStream(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class CCNStats {

public MyHelperClass getCounter(String o0){ return null; }}
