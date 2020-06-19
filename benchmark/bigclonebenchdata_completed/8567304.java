import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8567304 {
public MyHelperClass javaDom;
	public MyHelperClass tapdocLinks;
	public MyHelperClass libraryLocations;
	public MyHelperClass registry;
	public MyHelperClass javadocLinks;
	public MyHelperClass outputDirectory;
	public MyHelperClass IOUtils;
	public MyHelperClass documentGenerator;

    public  void TapdocContextImpl(Registry registry, FileObject javaDom, List<String> javadocLinks, List<String> libraryLocations, FileObject outputDirectory, List<String> tapdocLinks, DocumentGenerator documentGenerator)  throws Throwable {
        this.registry =(MyHelperClass)(Object) registry;
        this.documentGenerator =(MyHelperClass)(Object) documentGenerator;
        try {
            if (javaDom == null) {
                javaDom =(FileObject)(Object) outputDirectory.resolveFile("tapdoc-javadom.xml");
            }
            if (!(Boolean)(Object)javaDom.exists()) {
                javaDom.createFile();
                javaDom.close();
                IOUtils.copy(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?><tapdoc-javadom></tapdoc-javadom>"), javaDom.getContent().getOutputStream());
            }
            this.javaDom =(MyHelperClass)(Object) javaDom;
            this.javadocLinks =(MyHelperClass)(Object) javadocLinks;
            this.tapdocLinks =(MyHelperClass)(Object) tapdocLinks;
            this.libraryLocations =(MyHelperClass)(Object) libraryLocations;
            this.outputDirectory =(MyHelperClass)(Object) outputDirectory;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass copy(StringReader o0, MyHelperClass o1){ return null; }}

class Registry {

}

class FileObject {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass createFile(){ return null; }
	public MyHelperClass close(){ return null; }}

class DocumentGenerator {

}
