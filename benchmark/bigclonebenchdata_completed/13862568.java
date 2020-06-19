


class c13862568 {

    private String getShaderIncludeSource(String path) throws Exception {
        URL url =(URL)(Object) this.getClass().getResource(path);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        boolean run = true;
        String str;
        String ret = new String();
        while (run) {
            str =(String)(Object) in.readLine();
            if (str != null) ret += str + "\n"; else run = false;
        }
        in.close();
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
