


class c19403960 {
public static MyHelperClass filter(Set o0){ return null; }
	public static MyHelperClass join(Set o0){ return null; }
//public MyHelperClass filter(Set o0){ return null; }
//	public MyHelperClass join(Set o0){ return null; }

    public static Set getProteins(final String goCode, final Set evCodes, final int taxon, final int limit) throws IOException {
        final Set proteins =(Set)(Object) new HashSet();
        HttpURLConnection connection = null;
        try {
            final String evCodeList =(String)(Object) join(evCodes);
            MyHelperClass __urlTempl4 = new MyHelperClass();
            final URL url = new URL(String.format((String)(Object)__urlTempl4, goCode, evCodeList, taxon, limit + 1));
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass __connTimeout = new MyHelperClass();
            connection.setConnectTimeout(__connTimeout);
            MyHelperClass __readTimeout = new MyHelperClass();
            connection.setReadTimeout(__readTimeout);
            connection.setRequestProperty("Connection", "close");
            connection.connect();
            final BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line =(String)(Object) br.readLine()) != null) {
                proteins.add(line.trim());
            }
        } finally {
            if (connection != null) connection.disconnect();
        }
        return(Set)(Object) filter(proteins);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Set {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HashSet {

}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
