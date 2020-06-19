import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5774521 {

    private static URL lookForDefaultThemeFile(String aFilename) {
        try {
            MyHelperClass XPathFactory = new MyHelperClass();
            XPathFactory fabrique =(XPathFactory)(Object) XPathFactory.newInstance();
            XPath environnement =(XPath)(Object) fabrique.newXPath();
            URL url = new URL("file:" + aFilename);
            InputSource source = new InputSource(url.openStream());
            XPathExpression expression;
            expression =(XPathExpression)(Object) environnement.compile("/alloy/instance/@filename");
            String resultat =(String)(Object) expression.evaluate(source);
            MyHelperClass AlloyPlugin = new MyHelperClass();
            AlloyPlugin.getDefault().logInfo("Solution coming from " + resultat);
            IPath path =(IPath)(Object) new Path(resultat);
            IPath themePath =(IPath)(Object) path.removeFileExtension().addFileExtension("thm");
            File themeFile =(File)(Object) themePath.toFile();
            if (themeFile.exists()) {
//                MyHelperClass AlloyPlugin = new MyHelperClass();
                AlloyPlugin.getDefault().logInfo("Found default theme " + themeFile);
                return(URL)(Object) themeFile.toURI().toURL();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass AlloyPlugin = new MyHelperClass();
            AlloyPlugin.getDefault().log((XPathExpressionException)(Object)e);
        } catch (IOException e) {
            MyHelperClass AlloyPlugin = new MyHelperClass();
            AlloyPlugin.getDefault().log(e);
        } catch (ArithmeticException e) {
            MyHelperClass AlloyPlugin = new MyHelperClass();
            AlloyPlugin.getDefault().log((XPathExpressionException)(Object)e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(XPathExpressionException o0){ return null; }
	public MyHelperClass log(IOException o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass logInfo(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass addFileExtension(String o0){ return null; }
	public MyHelperClass log(MalformedURLException o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class XPathFactory {

public MyHelperClass newXPath(){ return null; }}

class XPath {

public MyHelperClass compile(String o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}}

class XPathExpression {

public MyHelperClass evaluate(InputSource o0){ return null; }}

class IPath {

public MyHelperClass toFile(){ return null; }
	public MyHelperClass removeFileExtension(){ return null; }}

class Path {

Path(){}
	Path(String o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}
