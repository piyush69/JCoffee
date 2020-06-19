


class c23525479 {

    protected static final void copyFile(String from, String to) throws SeleniumException {
        try {
            java.io.File fileFrom =(java.io.File)(Object) new File(from);
            java.io.File fileTo =(java.io.File)(Object) new File(to);
            FileReader in = new FileReader((File)(Object)fileFrom);
            FileWriter out = new FileWriter((File)(Object)fileTo);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (Exception e) {
            throw new SeleniumException("Failed to copy new file : " + from + " to : " + to, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SeleniumException extends Exception{
	public SeleniumException(String errorMessage) { super(errorMessage); }
	SeleniumException(String o0, Exception o1){}
	SeleniumException(){}
}

class File {

File(String o0){}
	File(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
