


class c18284811 {

    private Map readStuff(Iterator urls) throws IOException {
        Map result =(Map)(Object) new LinkedHashMap();
        while ((boolean)(Object)urls.hasNext()) {
            URL url =(URL)(Object) urls.next();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String s =(String)(Object) reader.readLine();
            while (s != null) {
                s = s.trim();
                if (s.length() > 0) {
                    String[] ss = s.split("\\s");
                    for (int i = 1; i < ss.length; i++) {
                        result.put(ss[i], ss[0]);
                    }
                }
                s =(String)(Object) reader.readLine();
            }
            reader.close();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LinkedHashMap {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
