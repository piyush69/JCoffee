


class c15292308 {

    private static File createFileFromURL(URL url) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File tempFile =(File)(Object) File.createTempFile("oboFile", ".obo");
        PrintStream ps = new PrintStream(tempFile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line =(String)(Object) reader.readLine()) != null) {
            ps.println(line);
        }
        ps.close();
        return tempFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

PrintStream(File o0){}
	PrintStream(){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
