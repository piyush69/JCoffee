


class c18133461 {

    private static StringBuffer downloadHTTPPage(URL url) throws Exception {
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setReadTimeout(0);
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line = null;
        while (null != (line =(String)(Object) br.readLine())) {
            sb.append(line);
        }
        br.close();
        return sb;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
