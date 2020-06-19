
import java.io.UncheckedIOException;


class c3558514 {
public MyHelperClass IOUtils;
	public MyHelperClass createTemporaryFile(){ return null; }

    private synchronized void ensureParsed() throws IOException, BadIMSCPException {
        MyHelperClass cp = new MyHelperClass();
        if (cp != null) return;
        MyHelperClass on_disk = new MyHelperClass();
        if (on_disk == null) {
//            MyHelperClass on_disk = new MyHelperClass();
            on_disk = createTemporaryFile();
//            MyHelperClass on_disk = new MyHelperClass();
            OutputStream to_disk =(OutputStream)(Object) new FileOutputStream(on_disk);
            MyHelperClass in = new MyHelperClass();
            IOUtils.copy(in.getInputStream(), to_disk);
            to_disk.close();
        }
        try {
            MyHelperClass utils = new MyHelperClass();
            ZipFilePackageParser parser =(ZipFilePackageParser)(Object) utils.getIMSCPParserFactory().createParser();
//            MyHelperClass on_disk = new MyHelperClass();
            parser.parse(on_disk);
//            MyHelperClass cp = new MyHelperClass();
            cp = parser.getPackage();
        } catch (UncheckedIOException x) {
            throw new BadIMSCPException("Cannot parse content package",(BadParseException)(Object) x);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createParser(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getIMSCPParserFactory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BadIMSCPException extends Exception{
	public BadIMSCPException(String errorMessage) { super(errorMessage); }
	BadIMSCPException(){}
	BadIMSCPException(String o0, BadParseException o1){}
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class ZipFilePackageParser {

public MyHelperClass getPackage(){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class BadParseException extends Exception{
	public BadParseException(String errorMessage) { super(errorMessage); }
}
