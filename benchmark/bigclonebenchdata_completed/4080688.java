


class c4080688 {
public static MyHelperClass checkXMLTagsLowerCase(String o0){ return null; }
//public MyHelperClass checkXMLTagsLowerCase(String o0){ return null; }

    public static String getStringFromAFileAtURL(String anURL) {
        String htmlCode = "<html><body></body></html>";
        try {
            URL url = new URL(anURL);
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = "";
            htmlCode = "";
            while ((inputLine =(String)(Object) in.readLine()) != null) htmlCode += inputLine + "\n";
            in.close();
        } catch (Exception e) {
            MyHelperClass logs = new MyHelperClass();
            logs.info("URLResolver : lien mort");
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "lien mort");
            return "<html><body></body></html>";
        }
        return(String)(Object) checkXMLTagsLowerCase(htmlCode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
