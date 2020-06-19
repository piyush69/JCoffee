import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18736653 {
public MyHelperClass NULL;
public MyHelperClass ontologyServiceMetaData;
public MyHelperClass isSourceWorking;
	public MyHelperClass url;
	public MyHelperClass status;
	public MyHelperClass PedroResources;
	public MyHelperClass parseDocument(InputStream o0){ return null; }
	public MyHelperClass buildTree(){ return null; }

    public void load()  throws Throwable {
        try {
            boolean isSourceWorking =(boolean)(Object) NULL; //new boolean();
            isSourceWorking = true;
            MyHelperClass url = new MyHelperClass();
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
//            MyHelperClass url = new MyHelperClass();
            ontologyServiceMetaData.setName("Ontology for " + url.getFile());
            parseDocument(urlConnection.getInputStream());
            buildTree();
            isSourceWorking =(boolean)(Object)(MyHelperClass)(Object) true;
            String statusOKMessage =(String)(Object) PedroResources.getMessage("ontology.statusOK",(String)(Object) url.getFile());
            status =(MyHelperClass)(Object) new StringBuffer();
            status.append(statusOKMessage);
        } catch (Exception err) {
            err.printStackTrace(System.out);
            String statusErrorMessage =(String)(Object) PedroResources.getMessage("ontology.statusError", err.toString());
            status.append(statusErrorMessage);
            isSourceWorking =(MyHelperClass)(Object) false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getMessage(String o0, String o1){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass append(String o0){ return null; }}
