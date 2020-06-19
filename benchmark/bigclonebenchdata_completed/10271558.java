import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10271558 {
public MyHelperClass XslUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass tables;

    private void processBasicContent()  throws Throwable {
        MyHelperClass sourceCollector = new MyHelperClass();
        String[] packageNames =(String[])(Object) sourceCollector.getPackageNames();
        for (int i = 0; i < packageNames.length; i++) {
//            MyHelperClass sourceCollector = new MyHelperClass();
            XdcSource[] sources =(XdcSource[])(Object) sourceCollector.getXdcSources(packageNames[i]);
            MyHelperClass outputDir = new MyHelperClass();
            File dir = new File((String)(Object)outputDir, packageNames[i]);
            dir.mkdirs();
            Set pkgDirs = new HashSet();
            for (int j = 0; j < sources.length; j++) {
                XdcSource source = sources[j];
                Properties patterns =(Properties)(Object) source.getPatterns();
                if (patterns != null) {
                    MyHelperClass tables = new MyHelperClass();
                    tables.put("patterns", patterns);
                }
                pkgDirs.add(source.getFile().getParentFile());
                DialectHandler dialectHandler =(DialectHandler)(Object) source.getDialectHandler();
                Writer out = null;
                try {
                    String sourceFilePath =(String)(Object) source.getFile().getAbsolutePath();
                    MyHelperClass baseProperties = new MyHelperClass();
                    source.setProcessingProperties(baseProperties, j > 0 ? sources[j - 1].getFileName() : null, j < sources.length - 1 ? sources[j + 1].getFileName() : null);
                    MyHelperClass XSL_PKG = new MyHelperClass();
                    String rootComment =(String)(Object) XslUtils.transformToString(sourceFilePath, XSL_PKG + "/source-header.xsl", tables);
                    source.setRootComment(rootComment);
                    MyHelperClass encoding = new MyHelperClass();
                    Document htmlDoc =(Document)(Object) XslUtils.transform(sourceFilePath, encoding, dialectHandler.getXslResourcePath(), tables);
                    MyHelperClass LOG = new MyHelperClass();
                    if ((boolean)(Object)LOG.isInfoEnabled()) {
//                        MyHelperClass LOG = new MyHelperClass();
                        LOG.info("Processing source file " + sourceFilePath);
                    }
                    MyHelperClass docencoding = new MyHelperClass();
                    out =(Writer)(Object) IOUtils.getWriter(new File(dir, source.getFile().getName() + ".html"), docencoding);
                    MyHelperClass XmlUtils = new MyHelperClass();
                    XmlUtils.printHtml(out, htmlDoc);
                    MyHelperClass sourceProcessor = new MyHelperClass();
                    if (sourceProcessor != null) {
//                        MyHelperClass encoding = new MyHelperClass();
                        sourceProcessor.processSource(source, encoding, docencoding);
                    }
//                    MyHelperClass baseProperties = new MyHelperClass();
                    XdcSource.clearProcessingProperties(baseProperties);
                } catch (XmlException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error(e.getMessage(), e);
                } catch (IOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error(e.getMessage(), e);
                } finally {
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            MyHelperClass LOG = new MyHelperClass();
                            LOG.error(e.getMessage(), e);
                        }
                    }
                }
            }
            for (Iterator iter = pkgDirs.iterator(); iter.hasNext(); ) {
                File docFilesDir = new File((File) iter.next(), "xdc-doc-files");
                if (docFilesDir.exists() && docFilesDir.isDirectory()) {
                    File targetDir = new File(dir, "xdc-doc-files");
                    targetDir.mkdirs();
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copyTree(docFilesDir, targetDir);
                    } catch (IOException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error(e.getMessage(), e);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, Properties o1){ return null; }
	public MyHelperClass printHtml(Writer o0, Document o1){ return null; }
	public MyHelperClass getPackageNames(){ return null; }
	public MyHelperClass getWriter(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass processSource(XdcSource o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getXdcSources(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass copyTree(File o0, File o1){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass transformToString(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass transform(String o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass error(String o0, XmlException o1){ return null; }}

class XdcSource {

public MyHelperClass getDialectHandler(){ return null; }
	public MyHelperClass getPatterns(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public static MyHelperClass clearProcessingProperties(MyHelperClass o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass setRootComment(String o0){ return null; }}

class DialectHandler {

public MyHelperClass getXslResourcePath(){ return null; }}

class Document {

}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}
