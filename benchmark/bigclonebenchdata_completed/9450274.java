


class c9450274 {

    public void seeURLConnection() throws Exception {
        URL url = new URL("http://wantmeet.iptime.org");
        URLConnection uc =(URLConnection)(Object) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String s = null;
        StringBuffer sb = new StringBuffer();
        while ((s =(String)(Object) br.readLine()) != null) {
            sb.append(s);
        }
        br.close();
        MyHelperClass log = new MyHelperClass();
        log.debug("sb=[" + sb.toString() + "]");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
