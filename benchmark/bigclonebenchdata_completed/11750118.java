


class c11750118 {

    public static LinkedList read(URL url, String exc) throws IOException {
        LinkedList data = new LinkedList();
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String input = "";
        while (true) {
            input =(String)(Object) br.readLine();
            if (input == null) break;
            if (!input.startsWith(exc)) {
                data.add(input);
            }
        }
        br.close();
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class LinkedList {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
