


class c2770143 {

    protected static String readAFewChars(URL url) throws IOException {
        StringBuffer buf = new StringBuffer(10);
        Reader reader =(Reader)(Object) new InputStreamReader(url.openStream());
        for (int i = 0; i < 10; i++) {
            int c =(int)(Object) reader.read();
            if (c == -1) {
                break;
            }
            buf.append((char) c);
        }
        reader.close();
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Reader {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
