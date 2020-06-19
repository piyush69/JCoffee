


class c9088945 {

    public static void v2ljastaVeebileht(String s) throws IOException {
        URL url = new URL(s);
        InputStream is =(InputStream)(Object) url.openConnection().getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line =(String)(Object) br.readLine()) != null) {
            System.out.println(line);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
