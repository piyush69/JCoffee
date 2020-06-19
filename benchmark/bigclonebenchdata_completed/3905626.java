


class c3905626 {

    public String getScript(String script, String params) {
        params = params.replaceFirst("&", "?");
        StringBuffer document = new StringBuffer();
        try {
            URL url = new URL(script + params);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                document.append(line + "\n");
            }
            reader.close();
        } catch (Exception e) {
            return e.toString();
        }
        return document.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
