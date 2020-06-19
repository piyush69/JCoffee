


class c22480999 {
public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }

//    @Test
    public void testRegisterOwnJceProvider() throws Exception {
        MyTestProvider provider = new MyTestProvider();
        MyHelperClass Security = new MyHelperClass();
        assertTrue(-1 != (int)(Object)Security.addProvider(provider));
        MyHelperClass MyTestProvider = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1", MyTestProvider.NAME);
//        MyHelperClass MyTestProvider = new MyHelperClass();
        assertEquals(MyTestProvider.NAME, messageDigest.getProvider().getName());
        messageDigest.update("hello world".getBytes());
        byte[] result =(byte[])(Object) messageDigest.digest();
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertArrayEquals("hello world".getBytes(), result);
//        MyHelperClass MyTestProvider = new MyHelperClass();
        Security.removeProvider(MyTestProvider.NAME);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NAME;
public MyHelperClass assertArrayEquals(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass addProvider(MyTestProvider o0){ return null; }
	public MyHelperClass removeProvider(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Test {

}

class MyTestProvider {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public static MyHelperClass getInstance(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getProvider(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
