


class c2885691 {
public static MyHelperClass Activator;
//public MyHelperClass Activator;

    public static boolean sendInformation(String reportType, HashMap data) {
        MyHelperClass PreferenceConstants = new MyHelperClass();
        if ((boolean)(Object)Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_UDC)) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Report usage information to devs...");
            String transferData = "reportType=" + reportType;
            MyHelperClass Platform = new MyHelperClass();
            transferData += "&build=" + Platform.getBundle("de.uni_mannheim.swt.codeconjurer").getHeaders().get("Bundle-Version");
//            MyHelperClass PreferenceConstants = new MyHelperClass();
            transferData += "&Suppl-Server=" + Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_SERVER);
            for (String key :(String[])(Object) (Object[])(Object)data.keySet()) {
                transferData += "&Suppl-" + key + "=" + data.get(key);
            }
            try {
                URL url = new URL("http://www.merobase.com:7777/org.code_conjurer.udc/UsageReport");
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setDoOutput(true);
                OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
                writer.write(transferData);
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
                logger.debug("UDC Server answer: " + answer.toString());
            } catch (Exception e) {
                MyHelperClass CrashReporter = new MyHelperClass();
                CrashReporter.reportException(e);
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Could not report usage data: " + e.toString());
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
public MyHelperClass P_UDC;
	public MyHelperClass P_SERVER;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getPreferenceStore(){ return null; }
	public MyHelperClass getBundle(String o0){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass reportException(Exception o0){ return null; }
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
