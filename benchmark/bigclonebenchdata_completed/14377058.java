


class c14377058 {

    public String process(URL url) throws IOException {
        String line, results = "";
        InputStream is =(InputStream)(Object) url.openStream();
        BufferedReader dis = new BufferedReader(new InputStreamReader(is));
        while ((line =(String)(Object) dis.readLine()) != null) {
            results += line + "\n";
        }
        System.out.println(results);
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
