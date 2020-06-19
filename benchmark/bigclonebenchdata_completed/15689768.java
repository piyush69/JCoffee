


class c15689768 {
public MyHelperClass writeMessage(NateOnMessage o0){ return null; }

    protected void channelConnected() throws IOException {
        MessageDigest md = null;
        String digest = "";
        try {
            MyHelperClass nateon = new MyHelperClass();
            String userid =(String)(Object) nateon.getUserId();
            if (userid.endsWith("@nate.com")) userid = userid.substring(0, userid.lastIndexOf('@'));
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
//            MyHelperClass nateon = new MyHelperClass();
            md.update((byte[])(Object)nateon.getPassword().getBytes());
            md.update(userid.getBytes());
            byte[] bData =(byte[])(Object) md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bData) {
                int v = (int) b;
                v = v < 0 ? v + 0x100 : v;
                String s = Integer.toHexString(v);
                if (s.length() == 1) sb.append('0');
                sb.append(s);
            }
            digest = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        NateOnMessage out = new NateOnMessage("LSIN");
        MyHelperClass nateon = new MyHelperClass();
        out.add(nateon.getUserId()).add(digest).add("MD5").add("3.615");
        out.setCallback("processAuth");
        writeMessage(out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getUserId(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NateOnMessage {

NateOnMessage(String o0){}
	NateOnMessage(){}
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setCallback(String o0){ return null; }}
