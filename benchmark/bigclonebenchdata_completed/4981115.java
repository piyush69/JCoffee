


class c4981115 {

    private String fazHttpRequest(String u) {
        StringBuilder str = new StringBuilder();
        URL url = null;
        URLConnection urlC = null;
        try {
            url = new URL(u.toString());
            urlC =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlC.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                str.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("[fazHttpRequest]" + e);
        }
        return (str.length() > 0) ? str.toString() : null;
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
