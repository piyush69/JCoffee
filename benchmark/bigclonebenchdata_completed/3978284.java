


class c3978284 {

    private String getJsonString(String url) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()), 8192);
        String line =(String)(Object) reader.readLine();
        String jsonString = "";
        while (line != null) {
            jsonString += line;
            line =(String)(Object) reader.readLine();
        }
        jsonString = jsonString.substring(jsonString.indexOf(":") + 1, jsonString.length() - 1);
        return jsonString;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
