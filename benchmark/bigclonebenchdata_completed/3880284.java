


class c3880284 {

    public static StringBuffer readURLText(URL url, StringBuffer errorText) {
        StringBuffer page = new StringBuffer("");
        String thisLine;
        try {
            BufferedReader source = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((thisLine =(String)(Object) source.readLine()) != null) {
                page.append(thisLine + "\n");
            }
            return page;
        } catch (Exception e) {
            return errorText;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
