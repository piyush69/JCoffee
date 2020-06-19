


class c16899717 {

    public static String loadURLToString(String url, String EOL) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader((new URL(url)).openStream()));
        String result = "";
        String str;
        while ((str =(String)(Object) in.readLine()) != null) {
            result += str + EOL;
        }
        in.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
