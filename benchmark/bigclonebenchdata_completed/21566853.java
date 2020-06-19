


class c21566853 {

    public void readURL() throws Exception {
        URL url = new URL("http://www.google.com");
        URLConnection c =(URLConnection)(Object) url.openConnection();
        Map headers =(Map)(Object) c.getHeaderFields();
        for (String s :(String[])(Object) (Object[])(Object)headers.keySet()) {
            System.out.println(s + ": " + headers.get(s));
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line =(String)(Object) reader.readLine();
        while (line != null) {
            System.out.println(line);
            line =(String)(Object) reader.readLine();
        }
        reader.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getHeaderFields(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class List {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
