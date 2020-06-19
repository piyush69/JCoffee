import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16946193 {
public MyHelperClass StringUtils;
	public MyHelperClass templateSchemaNamespace;
	public MyHelperClass extensionWebDir;
	public MyHelperClass RequestContextHolder;
	public MyHelperClass templateService;
	public MyHelperClass infPrefix;
	public MyHelperClass definitionModule;
	public MyHelperClass configurationFileExtension;
	public MyHelperClass IOUtils;
	public MyHelperClass schemaAttribute;
	public MyHelperClass definitionsSchemaNamespace;
	public MyHelperClass zoneModule;
	public MyHelperClass log;

    public void deploy(final File extension)  throws Throwable {
        MyHelperClass log = new MyHelperClass();
        log.info("Deploying new extension from {}", extension.getPath());
        MyHelperClass SZoneConfig = new MyHelperClass();
        RequestContextHolder.setRequestContext(new RequestContext(SZoneConfig.getDefaultZoneName(), SZoneConfig.getAdminUserName(SZoneConfig.getDefaultZoneName()), new BaseSessionContext()));
        MyHelperClass RequestContextHolder = new MyHelperClass();
        RequestContextHolder.getRequestContext().resolve();
        JarInputStream warIn;
        try {
            warIn = new JarInputStream(new FileInputStream(extension), true);
        } catch (IOException e) {
//            MyHelperClass log = new MyHelperClass();
            log.warn("Unable to open extension WAR at " + extension.getPath(), e);
            return;
        }
        SAXReader reader = new SAXReader(false);
        reader.setIncludeExternalDTDDeclarations(false);
        String extensionPrefix = extension.getName().substring(0, extension.getName().lastIndexOf("."));
        MyHelperClass extensionBaseDir = new MyHelperClass();
        File extensionDir = new File((String)(Object)extensionBaseDir, extensionPrefix);
        extensionDir.mkdirs();
        File extensionWebDir = new File((String)(Object)this.extensionWebDir, extensionPrefix);
        extensionWebDir.mkdirs();
        try {
            for (JarEntry entry =(JarEntry)(Object) warIn.getNextJarEntry(); entry != null; entry =(JarEntry)(Object) warIn.getNextJarEntry()) {
                File inflated = new File((String)(Object)(String)(Object)entry.getName().startsWith(infPrefix) ? extensionDir : extensionWebDir, entry.getName());
                if ((boolean)(Object)entry.isDirectory()) {
                    log.debug("Creating directory at {}", inflated.getPath());
                    inflated.mkdirs();
                    continue;
                }
                inflated.getParentFile().mkdirs();
                FileOutputStream entryOut = new FileOutputStream(inflated);
                if (!(Boolean)(Object)entry.getName().endsWith(configurationFileExtension)) {
                    log.debug("Inflating file resource to {}", inflated.getPath());
                    IOUtils.copy(warIn, entryOut);
                    entryOut.close();
                    continue;
                }
                try {
                    final Document document = reader.read(new TeeInputStream(new CloseShieldInputStream(warIn), entryOut, true));
                    Attribute schema =(Attribute)(Object) document.getRootElement().attribute(schemaAttribute);
                    if (schema == null || (boolean)(Object)StringUtils.isBlank(schema.getText())) {
                        log.debug("Inflating XML with unrecognized schema to {}", inflated.getPath());
                        continue;
                    }
                    if ((boolean)(Object)schema.getText().contains(definitionsSchemaNamespace)) {
                        log.debug("Inflating and registering definition from {}", inflated.getPath());
                        document.getRootElement().add(new AbstractAttribute() {

                            private static final long serialVersionUID = -7880537136055718310L;

                            public QName getQName() {
                                MyHelperClass extensionAttr = new MyHelperClass();
                                return new QName(extensionAttr, document.getRootElement().getNamespace());
                            }

                            public String getValue() {
                                return extension.getName().substring(0, extension.getName().lastIndexOf("."));
                            }
                        });
                        definitionModule.addDefinition(document, true);
                        continue;
                    }
                    if ((boolean)(Object)schema.getText().contains(templateSchemaNamespace)) {
                        log.debug("Inflating and registering template from {}", inflated.getPath());
                        templateService.addTemplate(document, true, zoneModule.getDefaultZone());
                        continue;
                    }
                } catch (DocumentException e) {
                    log.warn("Malformed XML file in extension war at " + extension.getPath(), e);
                    return;
                }
            }
        } catch (IOException e) {
            log.warn("Malformed extension war at " + extension.getPath(), e);
            return;
        } finally {
            try {
                warIn.close();
            } catch (IOException e) {
                log.warn("Unable to close extension war at " + extension.getPath(), e);
                return;
            }
            RequestContextHolder.clear();
        }
        log.info("Extension deployed successfully from {}", extension.getPath());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass add(<anonymous AbstractAttribute> o0){ return null; }
	public MyHelperClass resolve(){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass isBlank(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0, String o1){ return null; }
	public MyHelperClass getDefaultZoneName(){ return null; }
	public MyHelperClass add(){ return null; }
	public MyHelperClass getNamespace(){ return null; }
	public MyHelperClass copy(JarInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass addDefinition(Document o0, boolean o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass getRequestContext(){ return null; }
	public MyHelperClass warn(String o0, DocumentException o1){ return null; }
	public MyHelperClass getAdminUserName(MyHelperClass o0){ return null; }
	public MyHelperClass addTemplate(Document o0, boolean o1, MyHelperClass o2){ return null; }
	public MyHelperClass endsWith(MyHelperClass o0){ return null; }
	public MyHelperClass getDefaultZone(){ return null; }
	public MyHelperClass attribute(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class RequestContext {

RequestContext(MyHelperClass o0, MyHelperClass o1, BaseSessionContext o2){}
	RequestContext(){}}

class JarInputStream {

JarInputStream(FileInputStream o0, boolean o1){}
	JarInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }}

class SAXReader {

SAXReader(boolean o0){}
	SAXReader(){}
	public MyHelperClass setIncludeExternalDTDDeclarations(boolean o0){ return null; }
	public MyHelperClass read(TeeInputStream o0){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class TeeInputStream {

TeeInputStream(CloseShieldInputStream o0, FileOutputStream o1, boolean o2){}
	TeeInputStream(){}}

class CloseShieldInputStream {

CloseShieldInputStream(JarInputStream o0){}
	CloseShieldInputStream(){}}

class Attribute {

public MyHelperClass getText(){ return null; }}

class AbstractAttribute {

}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class BaseSessionContext {

}

class QName {

QName(MyHelperClass o0, MyHelperClass o1){}
	QName(){}}
