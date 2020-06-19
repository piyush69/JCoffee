import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14232817 {
public MyHelperClass Types;
	public MyHelperClass getParsableElementMethods(JClassType o0){ return null; }
public MyHelperClass parsedElementList;

    protected void lookupForParsedElementAnnotations(JClassType t)  throws Throwable {
        List<JMethod> methods =(List<JMethod>)(Object) getParsableElementMethods(t);
        if (methods != null) {
            for (JMethod method : methods) {
                ParsedElement elementAnnotation =(ParsedElement)(Object) method.getAnnotation((ParsedElement)(Object)ParsedElement.class);
                if (elementAnnotation.type() == Types.SYNC) {
                    try {
                        String contents = "";
                        URL url = getClass().getClassLoader().getResource((String)(Object)elementAnnotation.file());
                        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            contents += line;
                        }
                        reader.close();
                        ParsedElementDescriptor elementDescriptor = new ParsedElementDescriptor(method.getName(), contents.replaceAll("\"", "'"), elementAnnotation.type());
                        this.parsedElementList.add(elementDescriptor);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    ParsedElementDescriptor elementDescriptor = new ParsedElementDescriptor(method.getName(), elementAnnotation.file(), elementAnnotation.type());
                    this.parsedElementList.add(elementDescriptor);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYNC;
public MyHelperClass add(ParsedElementDescriptor o0){ return null; }}

class JClassType {

}

class JMethod {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getAnnotation(ParsedElement o0){ return null; }}

class ParsedElement {

public MyHelperClass type(){ return null; }
	public MyHelperClass file(){ return null; }}

class ParsedElementDescriptor {

ParsedElementDescriptor(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	ParsedElementDescriptor(){}
	ParsedElementDescriptor(MyHelperClass o0, String o1, MyHelperClass o2){}}
