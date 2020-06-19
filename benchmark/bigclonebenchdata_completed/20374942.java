
import java.io.UncheckedIOException;


class c20374942 {
public MyHelperClass ENTRY_KEY_ERROR_DESCRIPTION;
	public MyHelperClass TestMessages;
	public MyHelperClass base;

    public TestReport runImpl() throws Exception {
        DefaultTestReport report = new DefaultTestReport(this);
        ParsedURL purl;
        try {
            MyHelperClass base = new MyHelperClass();
            purl = new ParsedURL(base);
        } catch (Exception e) {
            StringWriter trace = new StringWriter();
            e.printStackTrace((java.io.PrintStream)(Object)(PrintStream)(Object)new PrintWriter(trace));
            MyHelperClass ERROR_CANNOT_PARSE_URL = new MyHelperClass();
            report.setErrorCode(ERROR_CANNOT_PARSE_URL);
            report.setDescription(new Entry[] { new Entry(TestMessages.formatMessage(ENTRY_KEY_ERROR_DESCRIPTION, null), TestMessages.formatMessage(ERROR_CANNOT_PARSE_URL, new String[] { "null",(String)(Object) base, trace.toString() })) });
            report.setPassed(false);
            return (TestReport)(Object)report;
        }
        byte[] data = new byte[5];
        int num = 0;
        try {
            InputStream is =(InputStream)(Object) purl.openStream();
            num =(int)(Object) is.read(data);
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int val = ((int) data[i]) & 0xFF;
            if (val < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(val) + " ");
        }
        String info = ("CT: " + purl.getContentType() + " CE: " + purl.getContentEncoding() + " DATA: " + sb + "URL: " + purl);
        MyHelperClass ref = new MyHelperClass();
        if (ref.equals(info)) {
            report.setPassed(true);
            return (TestReport)(Object)report;
        }
        MyHelperClass ERROR_WRONG_RESULT = new MyHelperClass();
        report.setErrorCode(ERROR_WRONG_RESULT);
        report.setDescription(new Entry[] { new Entry(TestMessages.formatMessage(ENTRY_KEY_ERROR_DESCRIPTION, null), TestMessages.formatMessage(ERROR_WRONG_RESULT, new String[] { info,(String)(Object) ref })) });
        report.setPassed(false);
        return (TestReport)(Object)report;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass formatMessage(MyHelperClass o0, String[] o1){ return null; }
	public MyHelperClass formatMessage(MyHelperClass o0, Object o1){ return null; }}

class TestReport {

}

class DefaultTestReport {

DefaultTestReport(){}
	DefaultTestReport(c20374942 o0){}
	public MyHelperClass setDescription(Entry[] o0){ return null; }
	public MyHelperClass setPassed(boolean o0){ return null; }
	public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }}

class ParsedURL {

ParsedURL(){}
	ParsedURL(MyHelperClass o0){}
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class StringWriter {

}

class PrintWriter {

PrintWriter(StringWriter o0){}
	PrintWriter(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Entry {

Entry(MyHelperClass o0, MyHelperClass o1){}
	Entry(){}}

class PrintStream {

}
