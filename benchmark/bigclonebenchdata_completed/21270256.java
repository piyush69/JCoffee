import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21270256 {
public static MyHelperClass IOUtils;
	public static MyHelperClass Utils;
	public static MyHelperClass printConstructorDoc(ConstructorDoc o0, PrintWriter o1){ return null; }
	public static MyHelperClass printConstructorSchema(ConstructorDoc o0, PrintWriter o1){ return null; }
	public static MyHelperClass isMeantForXMLAccess(ConstructorDoc o0){ return null; }
	public static MyHelperClass getSuperClasses(ClassDoc o0){ return null; }
	public static MyHelperClass printRuleDocStart(ClassDoc o0, PrintWriter o1){ return null; }
//public MyHelperClass Utils;
//	public MyHelperClass IOUtils;
//	public MyHelperClass isMeantForXMLAccess(ConstructorDoc o0){ return null; }
//	public MyHelperClass printConstructorSchema(ConstructorDoc o0, PrintWriter o1){ return null; }
//	public MyHelperClass printConstructorDoc(ConstructorDoc o0, PrintWriter o1){ return null; }
	public static MyHelperClass printRuleDocEnd(PrintWriter o0){ return null; }
//	public MyHelperClass printRuleDocStart(ClassDoc o0, PrintWriter o1){ return null; }
//	public MyHelperClass getSuperClasses(ClassDoc o0){ return null; }
public MyHelperClass destination;
//	public MyHelperClass printRuleDocEnd(PrintWriter o0){ return null; }

    public static boolean start(RootDoc root)  throws Throwable {
        MyHelperClass Logger = new MyHelperClass();
        Logger log =(Logger)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Logger.getLogger("DocletGenerator");
        MyHelperClass destination = new MyHelperClass();
        if (destination == null) {
            try {
                MyHelperClass ruleListenerDef = new MyHelperClass();
                ruleListenerDef = IOUtils.toString(GeneratorOfXmlSchemaForConvertersDoclet.class.getResourceAsStream("/RuleListenersFragment.xsd"), "UTF-8");
                String fn = System.getenv("annocultor.xconverter.destination.file.name");
                fn = (fn == null) ? "./../../../src/site/resources/schema/XConverterInclude.xsd" : fn;
//                MyHelperClass destination = new MyHelperClass();
                destination =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new File(fn);
//                MyHelperClass destination = new MyHelperClass();
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)destination.exists()) {
//                    MyHelperClass destination = new MyHelperClass();
                    destination.delete();
                }
                FileOutputStream os;
//                MyHelperClass destination = new MyHelperClass();
                os = new FileOutputStream(new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)destination.getParentFile(), "XConverter.xsd"));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new AutoCloseInputStream(GeneratorOfXmlSchemaForConvertersDoclet.class.getResourceAsStream("/XConverterTemplate.xsd")), os);
                os.close();
//                MyHelperClass destination = new MyHelperClass();
                os = new FileOutputStream((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)destination);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new AutoCloseInputStream(GeneratorOfXmlSchemaForConvertersDoclet.class.getResourceAsStream("/XConverterInclude.xsd")), os);
                os.close();
            } catch (Exception e) {
                try {
//                    MyHelperClass destination = new MyHelperClass();
                    throw new RuntimeException("On destination " + destination.getCanonicalPath(), e);
                } catch (IOException e1) {
                    throw new RuntimeException(e1);
                }
            }
        }
        try {
//            MyHelperClass destination = new MyHelperClass();
            String s =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) Utils.loadFileToString(destination.getCanonicalPath(), "\n");
            MyHelperClass XSD_TEXT_TO_REPLACED_WITH_GENERATED_XML_SIGNATURES = new MyHelperClass();
            int breakPoint = s.indexOf((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)XSD_TEXT_TO_REPLACED_WITH_GENERATED_XML_SIGNATURES);
            if (breakPoint < 0) {
//                MyHelperClass XSD_TEXT_TO_REPLACED_WITH_GENERATED_XML_SIGNATURES = new MyHelperClass();
                throw new Exception("Signature not found in XSD: " + XSD_TEXT_TO_REPLACED_WITH_GENERATED_XML_SIGNATURES);
            }
            String preambula = s.substring(0, breakPoint);
            String appendix = s.substring(breakPoint);
//            MyHelperClass destination = new MyHelperClass();
            destination.delete();
//            MyHelperClass destination = new MyHelperClass();
            PrintWriter schemaWriter = new PrintWriter((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Writer)(Object)destination);
            schemaWriter.print(preambula);
            ClassDoc[] classes =(ClassDoc[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) root.classes();
            for (int i = 0; i < classes.length; ++i) {
                ClassDoc cd = classes[i];
                PrintWriter documentationWriter = null;
                if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)getSuperClasses(cd).contains(Rule.class.getName())) {
                    for (ConstructorDoc constructorDoc :(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (Object[])(Object)cd.constructors()) {
                        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)constructorDoc.isPublic()) {
                            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)isMeantForXMLAccess(constructorDoc)) {
                                if (documentationWriter == null) {
                                    File file = new File("./../../../src/site/xdoc/rules." + cd.name() + ".xml");
                                    documentationWriter = new PrintWriter(file);
                                    log.info("Generating doc for rule " + file.getCanonicalPath());
                                    printRuleDocStart(cd, documentationWriter);
                                }
                                boolean initFound = false;
                                for (MethodDoc methodDoc :(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) (Object[])(Object)cd.methods()) {
                                    if ("init".equals(methodDoc.name())) {
                                        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(int)(Object)methodDoc.parameters().length == 0) {
                                            initFound = true;
                                            break;
                                        }
                                    }
                                }
                                if (!initFound) {
                                }
                                printConstructorSchema(constructorDoc, schemaWriter);
                                if (documentationWriter != null) {
                                    printConstructorDoc(constructorDoc, documentationWriter);
                                }
                            }
                        }
                    }
                }
                if (documentationWriter != null) {
                    printRuleDocEnd(documentationWriter);
                }
            }
            schemaWriter.print(appendix);
            schemaWriter.close();
            log.info("Saved to " + destination.getCanonicalPath());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass loadFileToString(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copy(AutoCloseInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class RootDoc {

public MyHelperClass classes(){ return null; }}

class Logger {

public MyHelperClass info(String o0){ return null; }}

class AutoCloseInputStream {

AutoCloseInputStream(InputStream o0){}
	AutoCloseInputStream(){}}

class GeneratorOfXmlSchemaForConvertersDoclet {

}

class ClassDoc {

public MyHelperClass methods(){ return null; }
	public MyHelperClass name(){ return null; }
	public MyHelperClass constructors(){ return null; }}

class Rule {

}

class ConstructorDoc {

public MyHelperClass isPublic(){ return null; }}

class MethodDoc {

public MyHelperClass name(){ return null; }
	public MyHelperClass parameters(){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0, String o1){ return null; }}
