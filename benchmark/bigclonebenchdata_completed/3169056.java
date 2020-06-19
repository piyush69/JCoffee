


class c3169056 {

    private List getHashesFrom(String webPage) {
        Vector out = new Vector();
        try {
            URL url = new URL(webPage);
            BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) r.readLine()) != null) {
                out.add(line);
            }
        } catch (Exception X) {
            return null;
        }
        return (List)(Object)out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
