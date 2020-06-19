


class c15679088 {

    public static String createStringFromHtml(MyUrl url) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.getUrl().openStream(), "UTF-8"));
            String line;
            String xmlAsString = "";
            while ((line =(String)(Object) reader.readLine()) != null) {
                xmlAsString += line;
            }
            reader.close();
            return xmlAsString;
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class MyUrl {

public MyHelperClass getUrl(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
