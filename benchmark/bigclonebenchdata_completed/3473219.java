


class c3473219 {
public MyHelperClass url;
	public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }

    public void test_UseCache_HttpURLConnection_NoCached_GetOutputStream() throws Exception {
        MyHelperClass ResponseCache = new MyHelperClass();
        ResponseCache.setDefault(new MockNonCachedResponseCache());
        HttpURLConnection uc;// = new HttpURLConnection();
        uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass uc = new MyHelperClass();
        uc.setChunkedStreamingMode(10);
//        MyHelperClass uc = new MyHelperClass();
        uc.setDoOutput(true);
//        MyHelperClass uc = new MyHelperClass();
        uc.getOutputStream();
        MyHelperClass isGetCalled = new MyHelperClass();
        assertTrue(isGetCalled);
        MyHelperClass isPutCalled = new MyHelperClass();
        assertFalse(isPutCalled);
        MyHelperClass isAbortCalled = new MyHelperClass();
        assertFalse(isAbortCalled);
//        MyHelperClass uc = new MyHelperClass();
        uc.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setDefault(MockNonCachedResponseCache o0){ return null; }
	public MyHelperClass setChunkedStreamingMode(int o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}

class MockNonCachedResponseCache {

}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setChunkedStreamingMode(int o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}
