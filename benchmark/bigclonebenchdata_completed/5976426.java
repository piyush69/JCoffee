


class c5976426 {

    public List query(String query) throws IOException {
        List list =(List)(Object) new LinkedList();
        MyHelperClass URLEncoder = new MyHelperClass();
        query =(String)(Object) URLEncoder.encode(query, "UTF-8");
        MyHelperClass baseurl = new MyHelperClass();
        String queryurl = baseurl + "?type=tuples&lang=itql&format=csv&query=" + query;
        URL url = new URL(queryurl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line =(String)(Object) reader.readLine();
        while (line != null) {
            list.add(line);
            line =(String)(Object) reader.readLine();
        }
        reader.close();
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LinkedList {

}

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
