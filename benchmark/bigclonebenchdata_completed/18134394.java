


class c18134394 {

    private String fetch(String urlstring) {
        String content = "";
        try {
            URL url = new URL(urlstring);
            InputStream is =(InputStream)(Object) url.openStream();
            BufferedReader d = new BufferedReader(new InputStreamReader(is));
            String s;
            while (null != (s =(String)(Object) d.readLine())) {
                content = content + s + "\n";
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
