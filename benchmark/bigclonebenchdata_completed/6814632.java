


class c6814632 {

    protected void setOuterIP() {
        try {
            URL url = new URL("http://elm-ve.sf.net/ipCheck/ipCheck.cgi");
            InputStreamReader isr = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(isr);
            String ip =(String)(Object) br.readLine();
            ip = ip.trim();
            MyHelperClass bridgeOutIPTF = new MyHelperClass();
            bridgeOutIPTF.setText(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setText(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
