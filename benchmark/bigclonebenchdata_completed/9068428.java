


class c9068428 {

    public static String getTextFileFromURL(String urlName) {
        try {
            StringBuffer textFile = new StringBuffer("");
            String line = null;
            URL url = new URL(urlName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line =(String)(Object) reader.readLine()) != null) textFile = textFile.append(line + "\n");
            reader.close();
            return textFile.toString();
        } catch (Exception e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.signal(Debug.ERROR, null, "Failed to open " + urlName + ", exception " + e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass signal(MyHelperClass o0, Object o1, String o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
