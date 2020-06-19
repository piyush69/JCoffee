


class c23496079 {

    private void copyTemplate(String resource, OutputStream outputStream) throws IOException {
        MyHelperClass Tools = new MyHelperClass();
        URL url =(URL)(Object) Tools.getResource(resource);
        if (url == null) {
            throw new IOException("could not find resource");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        MyHelperClass Charset = new MyHelperClass();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName("UTF-8")));
        String line = null;
        do {
            line =(String)(Object) reader.readLine();
            if (line != null) {
                writer.write(line);
                writer.newLine();
            }
        } while (line != null);
        reader.close();
        writer.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass forName(String o0){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, MyHelperClass o1){}
	OutputStreamWriter(){}}
