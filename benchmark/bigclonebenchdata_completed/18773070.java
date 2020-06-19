
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18773070 {

    public static void main(String[] args) {
        if (args.length != 2) throw new IllegalArgumentException();
        String inFileName = args[0];
        String outFileName = args[1];
        File fInput = new File(inFileName);
        Scanner in = null;
        try {
            in = new Scanner(fInput);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        PrintWriter out = null;
        try {
            out = new PrintWriter(outFileName);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        while ((boolean)(Object)in.hasNextLine()) {
            out.println(in.nextLine());
        }
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class Scanner {

Scanner(){}
	Scanner(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

PrintWriter(String o0){}
	PrintWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(MyHelperClass o0){ return null; }}
