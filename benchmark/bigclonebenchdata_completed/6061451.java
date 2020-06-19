


class c6061451 {
public MyHelperClass URLEncoder;
	public MyHelperClass semformsSettings;
	public MyHelperClass loadData(){ return null; }

    public String execute(Map params, String body, RenderContext renderContext) throws MacroException {
        loadData();
        String from = (String)(String)(Object) params.get("from");
        if (body.length() > 0 && from != null) {
            try {
                URL url;
                String serverUser = null;
                String serverPassword = null;
                url = new URL(semformsSettings.getZRapServerUrl() + "ZRAP_QueryProcessor.php?from=" + URLEncoder.encode(from, "utf-8") + "&query=" + URLEncoder.encode(body, "utf-8"));
                if (url.getUserInfo() != null) {
                    String[] userInfo =(String[])(Object) url.getUserInfo().split(":");
                    if (userInfo.length == 2) {
                        serverUser = userInfo[0];
                        serverPassword = userInfo[1];
                    }
                }
                URLConnection connection = null;
                InputStreamReader bf;
                if (serverUser != null && serverPassword != null) {
                    connection =(URLConnection)(Object) url.openConnection();
                    String encoding = new sun.misc.BASE64Encoder().encode((serverUser + ":" + serverPassword).getBytes());
                    connection.setRequestProperty("Authorization", "Basic " + encoding);
                    bf = new InputStreamReader(connection.getInputStream());
                } else {
                    bf = new InputStreamReader(url.openStream());
                }
                BufferedReader bbf = new BufferedReader(bf);
                String line =(String)(Object) bbf.readLine();
                String buffer = "";
                while (line != null) {
                    buffer += line;
                    line =(String)(Object) bbf.readLine();
                }
                return buffer;
            } catch (Exception e) {
                e.printStackTrace();
                return "ERROR:" + e.getLocalizedMessage();
            }
        } else return "Please write an RDQL query in the macro as body and an url of the model as 'from' parameter";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getZRapServerUrl(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class RenderContext {

}

class MacroException extends Exception{
	public MacroException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getUserInfo(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
