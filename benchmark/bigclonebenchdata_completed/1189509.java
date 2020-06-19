


class c1189509 {

    public void testRoundTrip_1(String resource) throws Exception {
        long start1 = System.currentTimeMillis();
        MyHelperClass File = new MyHelperClass();
        File originalFile =(File)(Object) File.createTempFile("RoundTripTest", "testRoundTrip_1");
        FileOutputStream fos = new FileOutputStream(originalFile);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy((InputStream)(Object)getClass().getResourceAsStream(resource), fos);
        fos.close();
        long start2 = System.currentTimeMillis();
        IsoFile isoFile = new IsoFile(new FileInputStream(originalFile).getChannel());
        long start3 = System.currentTimeMillis();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MyHelperClass Channels = new MyHelperClass();
        WritableByteChannel wbc =(WritableByteChannel)(Object) Channels.newChannel(baos);
        long start4 = System.currentTimeMillis();
        MyHelperClass Walk = new MyHelperClass();
        Walk.through(isoFile);
        long start5 = System.currentTimeMillis();
        isoFile.getBox(wbc);
        wbc.close();
        long start6 = System.currentTimeMillis();
        System.err.println("Preparing tmp copy took: " + (start2 - start1) + "ms");
        System.err.println("Parsing took           : " + (start3 - start2) + "ms");
        System.err.println("Writing took           : " + (start6 - start3) + "ms");
        System.err.println("Walking took           : " + (start5 - start4) + "ms");
//        MyHelperClass IOUtils = new MyHelperClass();
        byte[] a =(byte[])(Object) IOUtils.toByteArray((InputStream)(Object)getClass().getResourceAsStream(resource));
        byte[] b =(byte[])(Object) baos.toByteArray();
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertArrayEquals(a, b);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass toByteArray(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass assertArrayEquals(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass newChannel(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass through(IsoFile o0){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class IsoFile {

IsoFile(MyHelperClass o0){}
	IsoFile(){}
	public MyHelperClass getBox(WritableByteChannel o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class WritableByteChannel {

public MyHelperClass close(){ return null; }}

class InputStream {

}
