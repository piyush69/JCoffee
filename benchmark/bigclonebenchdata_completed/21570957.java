


class c21570957 {

    private static long saveAndClosePDFDocument(PDDocument document, OutputStreamProvider outProvider) throws IOException, COSVisitorException {
        File tempFile = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            MyHelperClass File = new MyHelperClass();
            tempFile =(File)(Object) File.createTempFile("temp", "pdf");
            OutputStream tempFileOut =(OutputStream)(Object) new FileOutputStream(tempFile);
            tempFileOut =(OutputStream)(Object) new BufferedOutputStream(tempFileOut);
            document.save(tempFileOut);
            document.close();
            tempFileOut.close();
            long length =(long)(Object) tempFile.length();
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(tempFile));
            out =(OutputStream)(Object) new BufferedOutputStream((OutputStream)(Object)outProvider.getOutputStream());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            return length;
        } finally {
            if (in != null) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(in);
            }
            if (out != null) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
            MyHelperClass FileUtils = new MyHelperClass();
            if (tempFile != null && !(Boolean)(Object)FileUtils.deleteQuietly(tempFile)) {
                tempFile.deleteOnExit();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass deleteQuietly(File o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class PDDocument {

public MyHelperClass close(){ return null; }
	public MyHelperClass save(OutputStream o0){ return null; }}

class OutputStreamProvider {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class COSVisitorException extends Exception{
	public COSVisitorException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass length(){ return null; }}

class InputStream {

}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0){}
	BufferedOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
