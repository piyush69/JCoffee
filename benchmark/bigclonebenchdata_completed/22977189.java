


class c22977189 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        Writer out =(Writer)(Object) new FileWriter(args[1]);
        out =(Writer)(Object) new WrapFilter(new BufferedWriter(out), 40);
        out =(Writer)(Object) new TitleCaseFilter(out);
        String line;
        while ((line =(String)(Object) in.readLine()) != null) out.write(line + "\n");
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class WrapFilter {

WrapFilter(BufferedWriter o0, int o1){}
	WrapFilter(){}}

class BufferedWriter {

BufferedWriter(Writer o0){}
	BufferedWriter(){}}

class TitleCaseFilter {

TitleCaseFilter(Writer o0){}
	TitleCaseFilter(){}}
