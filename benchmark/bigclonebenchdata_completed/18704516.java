


class c18704516 {

    public static void loadMessages(String filename, Map map) throws FileNotFoundException, IOException {
        String line;
        URL url =(URL)(Object) CurrentLocale.class.getResource("MessagesBundle_" + filename + ".properties");
        InputStreamReader isr = new InputStreamReader(url.openStream());
        BufferedReader br = new BufferedReader(isr);
        while ((line =(String)(Object) br.readLine()) != null) {
            String[] l = line.split("=", 2);
            map.put(l[0].trim(), l[1].trim());
        }
        br.close();
        isr.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class CurrentLocale {

}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
