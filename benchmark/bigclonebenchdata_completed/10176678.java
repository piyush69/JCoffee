


class c10176678 {
public MyHelperClass Utils;
public MyHelperClass assertEquals(int o0, int o1){ return null; }

//    @Test
    public void testLoadHttpGzipped() throws Exception {
        MyHelperClass HTTP_GZIPPED = new MyHelperClass();
        String url =(String)(Object) HTTP_GZIPPED;
        MyHelperClass fsManager = new MyHelperClass();
        LoadingInfo loadingInfo =(LoadingInfo)(Object) Utils.openFileObject(fsManager.resolveFile(url));
        InputStream contentInputStream =(InputStream)(Object) loadingInfo.getContentInputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        byte[] actual =(byte[])(Object) IOUtils.toByteArray(contentInputStream);
//        MyHelperClass IOUtils = new MyHelperClass();
        byte[] expected =(byte[])(Object) IOUtils.toByteArray((InputStream)(Object)new GZIPInputStream(new URL(url).openStream()));
        assertEquals(expected.length, actual.length);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass toByteArray(InputStream o0){ return null; }
	public MyHelperClass openFileObject(MyHelperClass o0){ return null; }}

class Test {

}

class LoadingInfo {

public MyHelperClass getContentInputStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
