
import java.io.UncheckedIOException;


class c10076077 {

//    @Override
    public void save(String arxivId, InputStream inputStream, String encoding) {
        MyHelperClass StringUtil = new MyHelperClass();
        String filename =(String)(Object) StringUtil.arxivid2filename(arxivId, "tex");
        try {
            MyHelperClass LATEX_DOCUMENT_DIR = new MyHelperClass();
            Writer writer =(Writer)(Object) new OutputStreamWriter(new FileOutputStream(String.format("%s/%s", LATEX_DOCUMENT_DIR, filename)), encoding);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, writer, encoding);
            writer.flush();
            writer.close();
            inputStream.close();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Failed to save the Latex source with id='{}'", arxivId,(IOException)(Object) e);
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, Writer o1, String o2){ return null; }
	public MyHelperClass arxivid2filename(String o0, String o1){ return null; }
	public MyHelperClass error(String o0, String o1, IOException o2){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
