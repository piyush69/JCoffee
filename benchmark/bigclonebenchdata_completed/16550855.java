


class c16550855 {

    public String readPage(boolean ignoreComments) throws Exception {
        MyHelperClass url = new MyHelperClass();
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        String html = "";
        if (ignoreComments) {
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                if (inputLine.length() > 0) {
                    if (inputLine.substring(0, 1).compareTo("#") != 0) {
                        html = html + inputLine + "\n";
                    }
                }
            }
        } else {
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                html = html + inputLine + "\n";
            }
        }
        in.close();
        return html;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
