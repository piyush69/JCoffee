
import java.io.UncheckedIOException;


class c10846725 {
public MyHelperClass ContentType;
	public MyHelperClass Factory;

        private DataFileType[] getDataFiles(Collection contentsToSend) {
            DataFileType[] files = new DataFileType[(int)(Object)contentsToSend.size()];
            int fileIndex = 0;
            for (ContentToSend contentToSend :(ContentToSend[])(Object) (Object[])(Object)contentsToSend) {
                DataFileType dataFile =(DataFileType)(Object) Factory.newInstance();
                dataFile.setFilename(contentToSend.getFileName());
                dataFile.setId("D" + fileIndex);
                dataFile.setMimeType(contentToSend.getMimeType());
                dataFile.setContentType(ContentType.EMBEDDED_BASE_64);
                final StringWriter stringWriter = new StringWriter();
                MyHelperClass Base64 = new MyHelperClass();
                final OutputStream encodeStream =(OutputStream)(Object) Base64.newEncoder(stringWriter, 0, null);
                final InputStream is =(InputStream)(Object) contentToSend.getInputStream();
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    long sizeCopied =(long)(Object) IOUtils.copyLarge(is, encodeStream);
                    MyHelperClass BigDecimal = new MyHelperClass();
                    dataFile.setSize(BigDecimal.valueOf(sizeCopied));
                } catch (UncheckedIOException e) {
                    throw new RuntimeException("Failed to get input to the file to be sent", e);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(encodeStream);
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(is);
                }
                dataFile.setStringValue(stringWriter.toString());
                files[fileIndex++] = dataFile;
            }
            return files;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMBEDDED_BASE_64;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass newEncoder(StringWriter o0, int o1, Object o2){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass valueOf(long o0){ return null; }}

class Collection {

public MyHelperClass size(){ return null; }}

class ContentToSend {

public MyHelperClass getMimeType(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataFileType {

public MyHelperClass setMimeType(MyHelperClass o0){ return null; }
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setId(String o0){ return null; }
	public MyHelperClass setStringValue(String o0){ return null; }
	public MyHelperClass setFilename(MyHelperClass o0){ return null; }}

class StringWriter {

}

class OutputStream {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
