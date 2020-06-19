


class c13997019 {

    public String read(String url) throws IOException {
        URL myurl = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(myurl.openStream()));
        StringBuffer sb = new StringBuffer();
        String inputLine;
        while ((inputLine =(String)(Object) in.readLine()) != null) sb.append(inputLine);
        in.close();
        return sb.toString();
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
