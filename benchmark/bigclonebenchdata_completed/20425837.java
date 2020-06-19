


class c20425837 {

    public static String loadSite(String spec) throws IOException {
        URL url = new URL(spec);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String output = "";
        String str;
        while ((str =(String)(Object) in.readLine()) != null) {
            output += str + "\n";
        }
        in.close();
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
