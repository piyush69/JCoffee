
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20194293 {
public static MyHelperClass countElement(Element o0){ return null; }
//public MyHelperClass countElement(Element o0){ return null; }

    public static void main(String[] argArray) {
        if (argArray.length == 0) {
            System.out.println("Usage: java  -jar doc-analyzer.jar  url | file");
        }
        List urlList =(List)(Object) new LinkedList();
        for (String urlStr : argArray) {
            if (!(urlStr.startsWith("http") || urlStr.startsWith("file"))) {
                if (urlStr.indexOf("*") > -1) {
                    if (urlStr.indexOf("**") > -1) {
                    }
                    continue;
                } else {
                    if (!urlStr.startsWith("/")) {
                        File workDir = new File(System.getProperty("user.dir"));
                        urlStr = workDir.getPath() + "/" + urlStr;
                    }
                    urlStr = "file:" + urlStr;
                }
            }
            try {
                URL url = new URL(urlStr);
                urlList.add(url);
            } catch (UncheckedIOException murle) {
                System.err.println(murle);
            }
        }
        for (URL url :(URL[])(Object) (Object[])(Object)urlList) {
            try {
                MyHelperClass builder = new MyHelperClass();
                Document doc =(Document)(Object) builder.build(url.openStream());
                Element element =(Element)(Object) doc.getRootElement();
                Map numberOfElementMap =(Map)(Object) countElement(element);
                System.out.println("Overview of tags in '" + url + "':");
                for (String elementName :(String[])(Object) (Object[])(Object)new TreeSet(numberOfElementMap.keySet())) {
                    System.out.println("  " + elementName + ": " + numberOfElementMap.get(elementName));
                }
            } catch (UncheckedIOException jdome) {
                System.err.println(jdome.getMessage());
            } catch (ArithmeticException ioe) {
                System.err.println(ioe.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass build(MyHelperClass o0){ return null; }}

class List {

public MyHelperClass add(URL o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class LinkedList {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getPath(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

}

class Map {

public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class TreeSet {

TreeSet(){}
	TreeSet(MyHelperClass o0){}}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
