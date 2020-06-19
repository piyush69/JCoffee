


class c11101258 {

    private String getPlayerName(String id) throws UnsupportedEncodingException, IOException {
        String result = "";
        MyHelperClass sc = new MyHelperClass();
        Map players = (Map)(Map)(Object) sc.getAttribute("players");
        if ((boolean)(Object)players.containsKey(id)) {
            result =(String)(Object) players.get(id);
            System.out.println("skip name:" + result);
        } else {
            String palyerURL = "http://goal.2010worldcup.163.com/player/" + id + ".html";
            URL url = new URL(palyerURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
            String line = null;
            String nameFrom = "英文名:";
            String nameTo = "</dd>";
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.indexOf(nameFrom) != -1) {
                    result = line.substring(line.indexOf(nameFrom) + nameFrom.length(), line.indexOf(nameTo));
                    break;
                }
            }
            reader.close();
            players.put(id, result);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAttribute(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

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

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
