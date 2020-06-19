
import java.io.UncheckedIOException;


class c21495755 {
public MyHelperClass cat(BufferedReader o0, MyHelperClass o1){ return null; }

    protected Object doExecute() throws Exception {
        MyHelperClass args = new MyHelperClass();
        if ((int)(Object)args.size() == 1 && "-".equals(args.get(0))) {
            MyHelperClass log = new MyHelperClass();
            log.info("Printing STDIN");
            MyHelperClass io = new MyHelperClass();
            cat(new BufferedReader(io.in), io);
        } else {
//            MyHelperClass args = new MyHelperClass();
            for (String filename :(String[])(Object) (Object[])(Object)args) {
                BufferedReader reader;
                try {
                    URL url = new URL(filename);
                    MyHelperClass log = new MyHelperClass();
                    log.info("Printing URL: " + url);
                    reader = new BufferedReader((MyHelperClass)(Object)new InputStreamReader(url.openStream()));
                } catch (UncheckedIOException ignore) {
                    File file = new File(filename);
                    MyHelperClass log = new MyHelperClass();
                    log.info("Printing file: " + file);
                    reader = new BufferedReader(new FileReader(file));
                }
                try {
                    MyHelperClass io = new MyHelperClass();
                    cat(reader, io);
                } finally {
                    MyHelperClass IOUtil = new MyHelperClass();
                    IOUtil.close(reader);
                }
            }
        }
        MyHelperClass SUCCESS = new MyHelperClass();
        return SUCCESS;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass in;
public MyHelperClass size(){ return null; }
	public MyHelperClass close(BufferedReader o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class BufferedReader {

BufferedReader(MyHelperClass o0){}
	BufferedReader(FileReader o0){}
	BufferedReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
