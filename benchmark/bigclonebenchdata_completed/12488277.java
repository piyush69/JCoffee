


class c12488277 {
public MyHelperClass parseResponse(MyHelperClass o0){ return null; }
public MyHelperClass u;

    public void loginMD5() throws Exception {
        GetMethod get = new GetMethod("http://login.yahoo.com/config/login?.src=www&.done=http://www.yahoo.com");
        get.setRequestHeader("user-agent", "Mozilla/5.0 (Macintosh; U; PPC MacOS X; en-us) AppleWebKit/124 (KHTML, like Gecko) Safari/125.1");
        MyHelperClass client = new MyHelperClass();
        client.executeMethod(get);
        parseResponse(get.getResponseBodyAsStream());
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        MyHelperClass password = new MyHelperClass();
        digest.update((byte[])(Object)password.getBytes("US-ASCII"));
        String hash1 = new String((byte[])(Object)digest.digest(), "US-ASCII");
        MyHelperClass challenge = new MyHelperClass();
        String hash2 = hash1 + challenge;
        digest.update(hash2.getBytes("US-ASCII"));
        String hash = new String((byte[])(Object)digest.digest(), "US-ASCII");
        MyHelperClass login = new MyHelperClass();
        NameValuePair[] pairs = { new NameValuePair("login", login), new NameValuePair("password", hash), new NameValuePair(".save", "1"), new NameValuePair(".tries", "1"), new NameValuePair(".src", "www"), new NameValuePair(".md5", "1"), new NameValuePair(".hash", "1"), new NameValuePair(".js", "1"), new NameValuePair(".last", ""), new NameValuePair(".promo", ""), new NameValuePair(".intl", "us"), new NameValuePair(".bypass", ""), new NameValuePair(".u", u), new NameValuePair(".v", "0"), new NameValuePair(".challenge", challenge), new NameValuePair(".yplus", ""), new NameValuePair(".emailCode", ""), new NameValuePair("pkg", ""), new NameValuePair("stepid", ""), new NameValuePair(".ev", ""), new NameValuePair("hasMsgr", "0"), new NameValuePair(".chkP", "Y"), new NameValuePair(".done", "http://www.yahoo.com"), new NameValuePair(".persistent", "y") };
        get = new GetMethod("http://login.yahoo.com/config/login");
        get.setRequestHeader("user-agent", "Mozilla/5.0 (Macintosh; U; PPC MacOS X; en-us) AppleWebKit/124 (KHTML, like Gecko) Safari/125.1");
        get.addRequestHeader("Accept", "*/*");
        get.addRequestHeader("Accept-Language", "en-us, ja;q=0.21, de-de;q=0.86, de;q=0.79, fr-fr;q=0.71, fr;q=0.64, nl-nl;q=0.57, nl;q=0.50, it-it;q=0.43, it;q=0.36, ja-jp;q=0.29, en;q=0.93, es-es;q=0.14, es;q=0.07");
        get.setQueryString(pairs);
//        MyHelperClass client = new MyHelperClass();
        client.executeMethod(get);
        get.getResponseBodyAsString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class GetMethod {

GetMethod(){}
	GetMethod(String o0){}
	public MyHelperClass setQueryString(NameValuePair[] o0){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getResponseBodyAsString(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NameValuePair {

NameValuePair(){}
	NameValuePair(String o0, String o1){}
	NameValuePair(String o0, MyHelperClass o1){}}
