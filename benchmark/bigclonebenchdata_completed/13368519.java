
import java.io.UncheckedIOException;


class c13368519 {
public MyHelperClass Context;
	public MyHelperClass RUN_MODE;
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass _getFile(String o0){ return null; }

    public void sendTemplate(String filename, TemplateValues values) throws IOException {
        MyHelperClass Checker = new MyHelperClass();
        Checker.checkEmpty(filename, "filename");
//        MyHelperClass Checker = new MyHelperClass();
        Checker.checkNull(values, "values");
        URL url =(URL)(Object) _getFile(filename);
        boolean writeSpaces = Context.getRootContext().getRunMode() == RUN_MODE.DEV ? true : false;
        Template t = new Template(url.openStream(), writeSpaces);
        try {
            t.write(getWriter(), values);
        } catch (UncheckedIOException ele) {
            Context.getRootContext().getLogger().error((ErrorListException)(Object)ele);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEV;
public MyHelperClass getRootContext(){ return null; }
	public MyHelperClass getRunMode(){ return null; }
	public MyHelperClass checkNull(TemplateValues o0, String o1){ return null; }
	public MyHelperClass checkEmpty(String o0, String o1){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass error(ErrorListException o0){ return null; }}

class TemplateValues {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class Template {

Template(){}
	Template(MyHelperClass o0, boolean o1){}
	public MyHelperClass write(MyHelperClass o0, TemplateValues o1){ return null; }}

class ErrorListException extends Exception{
	public ErrorListException(String errorMessage) { super(errorMessage); }
}
