


class c6830445 {

    public static void main(String[] args) throws IOException {
        System.out.println("start");
        URL url = new URL("https://spreadsheets.google.com/feeds/list/" + "0AnoMCh3_x82sdERLR3FvVDBIWXpjT1JlcENmOFdERVE/" + "od7/public/basic");
        InputStream is =(InputStream)(Object) url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line =(String)(Object) br.readLine()) != null) {
            String[] mass = line.split("<entry>");
            for (String m : mass) {
                System.out.println(m);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
