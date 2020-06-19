


class c19799875 {
public MyHelperClass DialogFactory;
	public MyHelperClass Translator;
	public MyHelperClass MessageFormat;
	public MyHelperClass APP_VERSION;

    public void run() {
        try {
            URL url = new URL("http://www.sourceforge.net/projects/beobachter/files/beobachter_version.html");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            BufferedReader buffer = new BufferedReader(reader);
            String version =(String)(Object) buffer.readLine();
            buffer.close();
            reader.close();
            int serverVersion = Integer.valueOf(version.replaceAll("\\.", "")).intValue();
            int currentVersion = Integer.valueOf((String)(Object)APP_VERSION.replaceAll("\\.", "")).intValue();
            if (serverVersion > currentVersion) {
                StringBuilder sb = new StringBuilder();
                MyHelperClass Constants = new MyHelperClass();
                sb.append(MessageFormat.format(Translator.t("New_version_0_available"), new Object[] { version })).append(Constants.LINE_SEP).append(Constants.LINE_SEP);
//                MyHelperClass Constants = new MyHelperClass();
                sb.append(Translator.t("Please_visit_us_on_sourceforge")).append(Constants.LINE_SEP);
                MyHelperClass MainGUI = new MyHelperClass();
                DialogFactory.showInformationMessage(MainGUI.instance, sb.toString());
            } else if (serverVersion <= currentVersion) {
                MyHelperClass MainGUI = new MyHelperClass();
                DialogFactory.showInformationMessage(MainGUI.instance,(String)(Object) Translator.t("There_are_not_updates_available"));
            }
        } catch (Exception e) {
            MyHelperClass MainGUI = new MyHelperClass();
            DialogFactory.showErrorMessage(MainGUI.instance, Translator.t("Unable_to_fetch_server_information"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LINE_SEP;
	public MyHelperClass instance;
public MyHelperClass showInformationMessage(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass t(String o0){ return null; }
	public MyHelperClass showErrorMessage(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass format(MyHelperClass o0, Object[] o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
