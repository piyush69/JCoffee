import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19267604 {
public MyHelperClass convert(File o0, DocumentFormat o1, File o2, DocumentFormat o3){ return null; }

    protected void convertInternal(InputStream inputStream, DocumentFormat inputFormat, OutputStream outputStream, DocumentFormat outputFormat)  throws Throwable {
        File inputFile = null;
        File outputFile = null;
        try {
            inputFile = File.createTempFile("document", "." + inputFormat.getFileExtension());
            OutputStream inputFileStream = null;
            try {
                inputFileStream = new FileOutputStream(inputFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, inputFileStream);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(inputFileStream);
            }
            outputFile = File.createTempFile("document", "." + outputFormat.getFileExtension());
            convert(inputFile, inputFormat, outputFile, outputFormat);
            InputStream outputFileStream = null;
            try {
                outputFileStream = new FileInputStream(outputFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(outputFileStream, outputStream);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(outputFileStream);
            }
        } catch (IOException ioException) {
            throw new OpenOfficeException("conversion failed", ioException);
        } finally {
            if (inputFile != null) {
                inputFile.delete();
            }
            if (outputFile != null) {
                outputFile.delete();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class DocumentFormat {

public MyHelperClass getFileExtension(){ return null; }}

class OpenOfficeException extends Exception{
	public OpenOfficeException(String errorMessage) { super(errorMessage); }
	OpenOfficeException(){}
	OpenOfficeException(String o0, IOException o1){}
}
