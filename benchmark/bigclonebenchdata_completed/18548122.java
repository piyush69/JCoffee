


class c18548122 {

    private static String loadUrlToString(String a_url) throws IOException {
        URL l_url1 = new URL(a_url);
        BufferedReader br = new BufferedReader(new InputStreamReader(l_url1.openStream()));
        String l_content = "";
        String l_ligne = null;
        l_content =(String)(Object) br.readLine();
        while ((l_ligne =(String)(Object) br.readLine()) != null) {
            MyHelperClass AA = new MyHelperClass();
            l_content += AA.SL + l_ligne;
        }
        return l_content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SL;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
