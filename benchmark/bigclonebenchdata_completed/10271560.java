
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10271560 {

    private void processStylesheetFile() {
        InputStream in = null;
        OutputStream out = null;
        try {
            String filename;
            MyHelperClass line = new MyHelperClass();
            if ((boolean)(Object)line.hasOption("stylesheetfile")) {
//                MyHelperClass line = new MyHelperClass();
                filename =(String)(Object) line.getOptionValue("stylesheetfile");
                in =(InputStream)(Object) new FileInputStream(filename);
                filename = filename.replace('\\', '/');
                filename = filename.substring(filename.lastIndexOf('/') + 1);
            } else {
                ClassLoader cl = this.getClass().getClassLoader();
                filename = "stylesheet.css";
                MyHelperClass RESOURCE_PKG = new MyHelperClass();
                in =(InputStream)(Object) cl.getResourceAsStream(RESOURCE_PKG + "/stylesheet.css");
            }
            MyHelperClass baseProperties = new MyHelperClass();
            baseProperties.setProperty("stylesheetfilename", filename);
            MyHelperClass outputDir = new MyHelperClass();
            File outFile = new File(outputDir, filename);
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isInfoEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.info("Processing generated file " + outFile.getAbsolutePath());
            }
            out =(OutputStream)(Object) new FileOutputStream(outFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
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
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error(e.getMessage(),(FileNotFoundException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setProperty(String o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
