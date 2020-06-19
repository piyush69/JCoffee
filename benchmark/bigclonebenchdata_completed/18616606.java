


class c18616606 {

    public static String read(URL url) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringWriter res = new StringWriter();
        PrintWriter writer = new PrintWriter(new BufferedWriter(res));
        String line;
        while ((line =(String)(Object) reader.readLine()) != null) {
            writer.println(line);
        }
        reader.close();
        writer.close();
        return res.toString();
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

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringWriter {

}

class PrintWriter {

PrintWriter(){}
	PrintWriter(BufferedWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class BufferedWriter {

BufferedWriter(StringWriter o0){}
	BufferedWriter(){}}
