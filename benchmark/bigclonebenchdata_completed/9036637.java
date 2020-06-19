


class c9036637 {
public static MyHelperClass Activator;
//public MyHelperClass Activator;

    public static boolean reportException(Throwable ex, HashMap suppl) {
        MyHelperClass PreferenceConstants = new MyHelperClass();
        if ((boolean)(Object)Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_CRASH_REPORTING)) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Report exception to devs...");
            String data = "reportType=exception&" + "message=" + ex.getMessage();
            MyHelperClass Platform = new MyHelperClass();
            data += "&build=" + Platform.getBundle("de.uni_mannheim.swt.codeconjurer").getHeaders().get("Bundle-Version");
            int ln = 0;
            for (StackTraceElement el : ex.getStackTrace()) {
                data += "&st_line_" + ++ln + "=" + el.getClassName() + "#" + el.getMethodName() + "<" + el.getLineNumber() + ">";
            }
            data += "&lines=" + ln;
            data += "&Suppl-Description=" + ex.toString();
//            MyHelperClass PreferenceConstants = new MyHelperClass();
            data += "&Suppl-Server=" + Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_SERVER);
//            MyHelperClass PreferenceConstants = new MyHelperClass();
            data += "&Suppl-User=" + Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_USERNAME);
            if (suppl != null) {
                for (String key :(String[])(Object) (Object[])(Object)suppl.keySet()) {
                    data += "&Suppl-" + key + "=" + suppl.get(key);
                }
            }
            try {
                URL url = new URL("http://www.merobase.com:7777/org.code_conjurer.udc/CrashReport");
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setDoOutput(true);
                OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
                writer.write(data);
                writer.flush();
                StringBuffer answer = new StringBuffer();
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    answer.append(line + "\r\n");
                }
                writer.close();
                reader.close();
//                MyHelperClass logger = new MyHelperClass();
                logger.debug(answer.toString());
            } catch (Exception e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Could not report exception");
                return false;
            }
            return true;
        } else {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Reporting not wished!");
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass P_USERNAME;
	public MyHelperClass P_CRASH_REPORTING;
	public MyHelperClass P_SERVER;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getPreferenceStore(){ return null; }
	public MyHelperClass getBundle(String o0){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class HashMap {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
