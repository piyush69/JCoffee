


class c6871529 {

    private boolean readUrlFile(String fullUrl, PrintWriter out) {
        try {
            URL url = new URL(fullUrl);
            String encoding = "gbk";
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), encoding));
            MyHelperClass fileEditor = new MyHelperClass();
            return(boolean)(Object) fileEditor.pushStream(out, in, fullUrl, false);
        } catch (Exception e) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass pushStream(PrintWriter o0, BufferedReader o1, String o2, boolean o3){ return null; }}

class PrintWriter {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
