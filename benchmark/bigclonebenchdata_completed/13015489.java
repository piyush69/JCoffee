
import java.io.UncheckedIOException;


class c13015489 {
public MyHelperClass StringUtils;
public MyHelperClass EaasyStreet;
	public MyHelperClass OUTPUT_METHOD;
	public MyHelperClass METHOD_OUT;
	public MyHelperClass className;
	public MyHelperClass getFormName(){ return null; }

    public void prepareOutput(HttpServletRequest req) {
        MyHelperClass METHOD_IN = new MyHelperClass();
        EaasyStreet.logTrace((int)(Object)METHOD_IN + (int)(Object)className + (int)(Object)OUTPUT_METHOD);
        this.prepareOutput(req);
        MyHelperClass Constants = new MyHelperClass();
        String content =(String)(Object) Constants.EMPTY_STRING;
        String rawContent = null;
        List parts = null;
        try {
            MyHelperClass sourceUrl = new MyHelperClass();
            URL url = new URL(sourceUrl);
            BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line =(String)(Object) input.readLine()) != null) {
                buffer.append(line);
//                MyHelperClass Constants = new MyHelperClass();
                buffer.append(Constants.LF);
            }
            rawContent = buffer.toString();
        } catch (UncheckedIOException nf) {
//            MyHelperClass Constants = new MyHelperClass();
            req.setAttribute(Constants.RAK_SYSTEM_ACTION,(String)(Object) Constants.SYSTEM_ACTION_BACK);
//            MyHelperClass Constants = new MyHelperClass();
            EaasyStreet.handleSafeEvent(req, new Event(Constants.EAA0012I, new String[] { "URL", nf.getMessage(), nf.toString() }));
        } catch (Exception e) {
//            MyHelperClass Constants = new MyHelperClass();
            req.setAttribute(Constants.RAK_SYSTEM_ACTION,(String)(Object) Constants.SYSTEM_ACTION_BACK);
//            MyHelperClass Constants = new MyHelperClass();
            EaasyStreet.handleSafeEvent(req, new Event(Constants.EAA0012I, new String[] { "URL", e.getMessage(), e.toString() }));
        }
        if (rawContent != null) {
            MyHelperClass startDelimiter = new MyHelperClass();
            if (startDelimiter != null) {
//                MyHelperClass startDelimiter = new MyHelperClass();
                parts =(List)(Object) StringUtils.split(rawContent, startDelimiter);
                if (parts != null &&(int)(Object) parts.size() > 1) {
                    rawContent = (String)(String)(Object) parts.get(1);
                    if ((int)(Object)parts.size() > 2) {
                        for (int x = 2; x < (int)(Object)parts.size(); x++) {
//                            MyHelperClass startDelimiter = new MyHelperClass();
                            rawContent += startDelimiter;
                            rawContent += parts.get(x);
                        }
                    }
                } else {
                    rawContent = null;
                }
            }
        }
        if (rawContent != null) {
            MyHelperClass endDelimiter = new MyHelperClass();
            if (endDelimiter != null) {
//                MyHelperClass endDelimiter = new MyHelperClass();
                parts =(List)(Object) StringUtils.split(rawContent, endDelimiter);
                if (parts != null &&(int)(Object) parts.size() > 0) {
                    rawContent = (String)(String)(Object) parts.get(0);
                } else {
                    rawContent = null;
                }
            }
        }
        if (rawContent != null) {
            MyHelperClass replacementValues = new MyHelperClass();
            if (replacementValues != null && !(Boolean)(Object)replacementValues.isEmpty()) {
//                MyHelperClass replacementValues = new MyHelperClass();
                for (int x = 0; x < (int)(Object)replacementValues.size(); x++) {
//                    MyHelperClass replacementValues = new MyHelperClass();
                    LabelValueBean bean = (LabelValueBean)(LabelValueBean)(Object) replacementValues.get(x);
                    MyHelperClass StringUtils = new MyHelperClass();
                    rawContent =(String)(Object) StringUtils.replace(rawContent, bean.getLabel(), bean.getValue());
                }
            }
        }
        if (rawContent != null) {
            content = rawContent;
        }
        req.setAttribute(getFormName(), content);
        EaasyStreet.logTrace((int)(Object)METHOD_OUT + (int)(Object)className + (int)(Object)OUTPUT_METHOD);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY_STRING;
	public MyHelperClass LF;
	public MyHelperClass RAK_SYSTEM_ACTION;
	public MyHelperClass SYSTEM_ACTION_BACK;
	public MyHelperClass EAA0012I;
public MyHelperClass logTrace(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass handleSafeEvent(HttpServletRequest o0, Event o1){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass replace(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass split(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class HttpServletRequest {

public MyHelperClass setAttribute(MyHelperClass o0, String o1){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class Event {

Event(){}
	Event(MyHelperClass o0, String[] o1){}}

class LabelValueBean {

public MyHelperClass getLabel(){ return null; }
	public MyHelperClass getValue(){ return null; }}
