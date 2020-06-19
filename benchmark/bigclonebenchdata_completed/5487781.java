


class c5487781 {

    private void saveURL(URL url, String filename) throws IOException {
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.connect();
        InputStreamReader ReadIn = new InputStreamReader(connection.getInputStream());
        BufferedReader BufData = new BufferedReader(ReadIn);
        FileWriter FWriter = new FileWriter(filename);
        BufferedWriter BWriter = new BufferedWriter(FWriter);
        String urlData = null;
        while ((urlData =(String)(Object) BufData.readLine()) != null) {
            BWriter.write(urlData);
            BWriter.newLine();
        }
        BWriter.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}
