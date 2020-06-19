


class c5785861 {
public MyHelperClass Assert;

//    @Test
    public void testEncryptDecrypt() throws IOException {
        BlockCipher cipher =(BlockCipher)(Object) new SerpentEngine();
        Random rnd = new Random();
        byte[] key = new byte[256 / 8];
        rnd.nextBytes(key);
        byte[] iv = new byte[(int)(Object)cipher.getBlockSize()];
        rnd.nextBytes(iv);
        byte[] data = new byte[1230000];
        new Random().nextBytes(data);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        CryptOutputStream eout = new CryptOutputStream(bout, cipher, key);
        eout.write(data);
        eout.close();
        byte[] eData =(byte[])(Object) bout.toByteArray();
        ByteArrayInputStream bin = new ByteArrayInputStream(eData);
        CryptInputStream din = new CryptInputStream(bin, cipher, key);
        bout = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(din, bout);
        eData =(byte[])(Object) bout.toByteArray();
        MyHelperClass Arrays = new MyHelperClass();
        Assert.assertTrue(Arrays.areEqual(data, eData));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass areEqual(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass copy(CryptInputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class BlockCipher {

public MyHelperClass getBlockSize(){ return null; }}

class SerpentEngine {

}

class Random {

public MyHelperClass nextBytes(byte[] o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class CryptOutputStream {

CryptOutputStream(){}
	CryptOutputStream(ByteArrayOutputStream o0, BlockCipher o1, byte[] o2){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class CryptInputStream {

CryptInputStream(){}
	CryptInputStream(ByteArrayInputStream o0, BlockCipher o1, byte[] o2){}}
