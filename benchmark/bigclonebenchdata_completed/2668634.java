
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2668634 {
public MyHelperClass parseXml(InputStream o0){ return null; }
	public MyHelperClass addFile(String o0, InputStream o1, JarOutputStream o2){ return null; }
	public MyHelperClass addFile(MyHelperClass o0, Document o1, JarOutputStream o2){ return null; }
public MyHelperClass File;
	public MyHelperClass META_INF_CONTEXT_XML;
	public MyHelperClass WEB_INF_WEB_XML;
	public MyHelperClass WEB_INF_PORTLET_XML;
	public MyHelperClass getPortletApplicationName(String o0){ return null; }

    public void WebmillDeploy(String inputName, String outputName, boolean stripLoggers) throws Exception {
        File tempFile = null;
        JarFile jin = null;
        JarOutputStream jout = null;
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            String portletApplicationName =(String)(Object) getPortletApplicationName(outputName);
            System.out.println("portletApplicationName = " + portletApplicationName);
            tempFile =(File)(Object) File.createTempFile("webmill-delpoy-", "");
            tempFile.deleteOnExit();
            jin = new JarFile(inputName);
            jout = new JarOutputStream(new FileOutputStream(tempFile));
            Document webXml = null;
            Document portletXml = null;
            Document contextXml = null;
            ZipEntry src;
            InputStream source;
            Enumeration zipEntries =(Enumeration)(Object) jin.entries();
            while ((boolean)(Object)zipEntries.hasMoreElements()) {
                src = (ZipEntry)(ZipEntry)(Object) zipEntries.nextElement();
                source =(InputStream)(Object) jin.getInputStream(src);
                try {
                    String target =(String)(Object) src.getName();
                    if (WEB_INF_WEB_XML.equals(target)) {
                        System.out.println("Found web.xml");
                        webXml =(Document)(Object) parseXml(source);
                    } else if (WEB_INF_PORTLET_XML.equals(target)) {
                        System.out.println("Found WEB-INF/portlet.xml");
                        portletXml =(Document)(Object) parseXml(source);
                    } else if (META_INF_CONTEXT_XML.equals(target)) {
                        System.out.println("Found META-INF/context.xml");
                        contextXml =(Document)(Object) parseXml(source);
                    }
                } finally {
                    source.close();
                }
            }
            if (webXml == null) {
                throw new IllegalArgumentException("WEB-INF/web.xml not found");
            }
            if (portletXml == null) {
                throw new IllegalArgumentException("WEB-INF/portlet.xml not found");
            }
            WebmillWebApplicationRewriter webRewriter = new WebmillWebApplicationRewriter(webXml);
            webRewriter.processWebXML();
            WebmillContextRewriter contextRewriter = new WebmillContextRewriter(contextXml, portletApplicationName);
            contextRewriter.processContextXML();
            jin = new JarFile(inputName);
            zipEntries =(Enumeration)(Object) jin.entries();
            while ((boolean)(Object)zipEntries.hasMoreElements()) {
                src = (ZipEntry)(ZipEntry)(Object) zipEntries.nextElement();
                source =(InputStream)(Object) jin.getInputStream(src);
                try {
                    String target =(String)(Object) src.getName();
                    String fullTarget = '/' + target;
                    if (stripLoggers && target.endsWith(".jar") && (target.startsWith("WEB-INF/lib/commons-logging") || target.startsWith("WEB-INF/lib/log4j"))) {
                        System.out.println("Skip logger " + target);
                        continue;
                    } else {
                        if (webRewriter.getRealPortletTldFile() != null && fullTarget.equals(webRewriter.getRealPortletTldFile())) {
                            System.out.println("Skip portlet tld file " + fullTarget);
                            continue;
                        } else if (target.equals(WEB_INF_WEB_XML)) {
                            System.out.println("Skip web.xml file " + target);
                            continue;
                        } else if (target.equals(WEB_INF_PORTLET_XML)) {
                            System.out.println("Skip portlet.xml file " + target);
                            continue;
                        } else if (target.equals(META_INF_CONTEXT_XML)) {
                            System.out.println("Skip context.xml file " + target);
                            continue;
                        }
                        System.out.println("Add file " + target);
                    }
                    addFile(target, source, jout);
                } finally {
                    source.close();
                }
            }
            addFile(WEB_INF_WEB_XML, webXml, jout);
            addFile(WEB_INF_PORTLET_XML, portletXml, jout);
            addFile(META_INF_CONTEXT_XML, contextXml, jout);
            System.out.println("Attempting to add portlet.tld to war...");
            InputStream is =(InputStream)(Object) this.getClass().getResourceAsStream("/org/riverock/webmill/container/tags/portlet.tld");
            if (is == null) {
                System.out.println("Failed to find portlet.tld in classpath");
            } else {
                String portletTldFile =(String)(Object) webRewriter.getRealPortletTldFile();
                if (portletTldFile.charAt(0) == '/') {
                    portletTldFile = portletTldFile.substring(1);
                }
                System.out.println("Adding file " + portletTldFile);
                try {
                    addFile(portletTldFile, is, jout);
                } finally {
                    is.close();
                }
            }
            jout.close();
            jin.close();
            jin = null;
            jout = null;
            System.out.println("Creating war " + outputName + " ...");
            System.out.flush();
            srcChannel =(FileChannel)(Object) (new FileInputStream(tempFile).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(outputName).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            srcChannel = null;
            dstChannel.close();
            dstChannel = null;
            tempFile.delete();
            tempFile = null;
            System.out.println("War " + outputName + " created");
            System.out.flush();
        } finally {
            if (srcChannel != null && (boolean)(Object)srcChannel.isOpen()) {
                try {
                    srcChannel.close();
                } catch (UncheckedIOException e1) {
                }
            }
            if (dstChannel != null && (boolean)(Object)dstChannel.isOpen()) {
                try {
                    dstChannel.close();
                } catch (UncheckedIOException e1) {
                }
            }
            if (jin != null) {
                try {
                    jin.close();
                    jin = null;
                } catch (UncheckedIOException e1) {
                }
            }
            if (jout != null) {
                try {
                    jout.close();
                    jout = null;
                } catch (UncheckedIOException e1) {
                }
            }
            if (tempFile != null && (boolean)(Object)tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }}

class JarFile {

JarFile(String o0){}
	JarFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0){}
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	FileOutputStream(String o0){}
	public MyHelperClass getChannel(){ return null; }}

class Document {

}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class WebmillWebApplicationRewriter {

WebmillWebApplicationRewriter(){}
	WebmillWebApplicationRewriter(Document o0){}
	public MyHelperClass processWebXML(){ return null; }
	public MyHelperClass getRealPortletTldFile(){ return null; }}

class WebmillContextRewriter {

WebmillContextRewriter(){}
	WebmillContextRewriter(Document o0, String o1){}
	public MyHelperClass processContextXML(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
