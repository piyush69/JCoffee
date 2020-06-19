import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10986824 {

    private static String executeQueryWithSaxon(String queryFile) throws Throwable, XPathException, FileNotFoundException, IOException, URISyntaxException {
        URL url = DocumentTableTest.class.getResource(queryFile);
        URI uri = url.toURI();
        MyHelperClass IOUtils = new MyHelperClass();
        String query = IOUtils.toString(url.openStream());
        Configuration config = new Configuration();
        MyHelperClass Configuration = new MyHelperClass();
        config.setHostLanguage(Configuration.XQUERY);
        StaticQueryContext staticContext = new StaticQueryContext(config);
        staticContext.setBaseURI(uri.toString());
        XQueryExpression exp =(XQueryExpression)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) staticContext.compileQuery(query);
        Properties props = new Properties();
        MyHelperClass SaxonOutputKeys = new MyHelperClass();
        props.setProperty((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)SaxonOutputKeys.WRAP, "no");
        MyHelperClass OutputKeys = new MyHelperClass();
        props.setProperty((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)OutputKeys.INDENT, "no");
//        MyHelperClass OutputKeys = new MyHelperClass();
        props.setProperty((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter res_sw = new StringWriter();
        DynamicQueryContext dynamicContext = new DynamicQueryContext(config);
        exp.run(dynamicContext, new StreamResult(res_sw), props);
        return res_sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WRAP;
	public MyHelperClass XQUERY;
	public MyHelperClass INDENT;
	public MyHelperClass OMIT_XML_DECLARATION;
}

class XPathException extends Exception{
	public XPathException(String errorMessage) { super(errorMessage); }
}

class DocumentTableTest {

}

class Configuration {

public MyHelperClass setHostLanguage(MyHelperClass o0){ return null; }}

class StaticQueryContext {

StaticQueryContext(Configuration o0){}
	StaticQueryContext(){}
	public MyHelperClass setBaseURI(String o0){ return null; }
	public MyHelperClass compileQuery(String o0){ return null; }}

class XQueryExpression {

public MyHelperClass run(DynamicQueryContext o0, StreamResult o1, Properties o2){ return null; }}

class DynamicQueryContext {

DynamicQueryContext(Configuration o0){}
	DynamicQueryContext(){}}

class StreamResult {

StreamResult(StringWriter o0){}
	StreamResult(){}}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
