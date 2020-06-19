
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10271561 {
public MyHelperClass transformResource(Document o0, String o1, Properties o2, String o3){ return null; }

    private void processHelpFile() {
        InputStream in = null;
        MyHelperClass line = new MyHelperClass();
        if ((boolean)(Object)line.hasOption("helpfile")) {
            OutputStream out = null;
            try {
//                MyHelperClass line = new MyHelperClass();
                String filename =(String)(Object) line.getOptionValue("helpfile");
                in =(InputStream)(Object) new FileInputStream(filename);
                filename = filename.replace('\\', '/');
                filename = filename.substring(filename.lastIndexOf('/') + 1);
                MyHelperClass outputDir = new MyHelperClass();
                File outFile = new File(outputDir, filename);
                MyHelperClass LOG = new MyHelperClass();
                if ((boolean)(Object)LOG.isInfoEnabled()) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.info("Processing generated file " + outFile.getAbsolutePath());
                }
                out =(OutputStream)(Object) new FileOutputStream(outFile);
                MyHelperClass baseProperties = new MyHelperClass();
                baseProperties.setProperty("helpfile", filename);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            } catch (UncheckedIOException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error(e.getMessage(),(XmlException)(Object) e);
            } catch (ArithmeticException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error(e.getMessage(),(XmlException)(Object) e);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (UncheckedIOException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error(e.getMessage(),(XmlException)(Object) e);
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (UncheckedIOException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error(e.getMessage(),(XmlException)(Object) e);
                    }
                }
            }
            return;
        }
        MyHelperClass baseProperties = new MyHelperClass();
        Properties props = new Properties(baseProperties);
        ClassLoader cl = this.getClass().getClassLoader();
        Document doc = null;
        try {
            MyHelperClass RESOURCE_PKG = new MyHelperClass();
            in =(InputStream)(Object) cl.getResourceAsStream(RESOURCE_PKG + "/help-doc.xml");
            MyHelperClass XmlUtils = new MyHelperClass();
            doc =(Document)(Object) XmlUtils.parse(in);
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error(e.getMessage(),(XmlException)(Object) e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error(e.getMessage(),(XmlException)(Object) e);
                }
            }
        }
        transformResource(doc, "help-doc.xsl", props, "help-doc.html");
//        MyHelperClass baseProperties = new MyHelperClass();
        baseProperties.setProperty("helpfile", "help-doc.html");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, XmlException o1){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }
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

class Properties {

Properties(){}
	Properties(MyHelperClass o0){}}

class Document {

}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}
