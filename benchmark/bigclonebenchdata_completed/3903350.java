
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3903350 {

    private static String getSummaryText(File packageFile) {
        String retVal = null;
        Reader in = null;
        try {
            in =(Reader)(Object) new FileReader(packageFile);
            StringWriter out = new StringWriter();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            StringBuffer buf =(StringBuffer)(Object) out.getBuffer();
            int pos1 = buf.indexOf("<body>");
            int pos2 = buf.lastIndexOf("</body>");
            if (pos1 >= 0 && pos1 < pos2) {
                retVal = buf.substring(pos1 + 6, pos2);
            } else {
                retVal = "";
            }
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e.getMessage(),(FileNotFoundException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e.getMessage(),(FileNotFoundException)(Object) e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error(e.getMessage(),(FileNotFoundException)(Object) e);
                }
            }
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, StringWriter o1){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

}

class Reader {

public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class StringWriter {

public MyHelperClass getBuffer(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
