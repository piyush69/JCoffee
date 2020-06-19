
import java.io.UncheckedIOException;


class c19096138 {

    public static void main(String[] args) {
        String logFileName = args[0];
        int extractLineEvery = new Integer(args[1]).intValue();
        String filterToken = "P0";
        if (args.length > 2) {
            filterToken = args[2];
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(logFileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(logFileName + ".trim")));
            String readLine;
            int x = 0;
            while ((readLine =(String)(Object) br.readLine()) != null) {
                if ((x++ % extractLineEvery == 0) && readLine.startsWith(filterToken)) {
                    bw.write(readLine + "\n");
                }
            }
            bw.flush();
            bw.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class File {

File(String o0){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
