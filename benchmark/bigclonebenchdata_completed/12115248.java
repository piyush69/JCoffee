
import java.io.UncheckedIOException;


class c12115248 {
public MyHelperClass BUFFER_SIZE;

        public void actionPerformed(ActionEvent evt) {
            try {
                File tempFile = new File("/tmp/controler.xml");
                File f = new File("/tmp/controler-temp.xml");
                BufferedInputStream copySource = new BufferedInputStream(new FileInputStream(tempFile));
                BufferedOutputStream copyDestination = new BufferedOutputStream(new FileOutputStream(f));
                int read = 0;
                while (read != -1) {
                    MyHelperClass buffer = new MyHelperClass();
                    read =(int)(Object) copySource.read(buffer, 0, BUFFER_SIZE);
                    if (read != -1) {
//                        MyHelperClass buffer = new MyHelperClass();
                        copyDestination.write(buffer, 0, read);
                    }
                }
                copyDestination.write(new String("</log>\n").getBytes());
                copySource.close();
                copyDestination.close();
                XMLParser parser = new XMLParser("Controler");
                parser.parse(f);
                f.delete();
            } catch (UncheckedIOException ex) {
                System.out.println("An error occured during the file copy!");
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ActionEvent {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(MyHelperClass o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(MyHelperClass o0, int o1, int o2){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class XMLParser {

XMLParser(String o0){}
	XMLParser(){}
	public MyHelperClass parse(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
