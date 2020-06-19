


class c11373801 {

    public boolean resolve(String parameters, Reader in, Writer out, DataFieldResolver dataFieldResolver, int[] arrayPositioner) throws IOException {
        PrintWriter printOut = new PrintWriter(out);
        URL url = new URL(parameters);
        Reader urlIn =(Reader)(Object) new InputStreamReader(url.openStream());
        int ch =(int)(Object) urlIn.read();
        while (ch != -1) {
            out.write(ch);
            ch =(int)(Object) urlIn.read();
        }
        out.flush();
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Reader {

public MyHelperClass read(){ return null; }}

class Writer {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class DataFieldResolver {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintWriter {

PrintWriter(Writer o0){}
	PrintWriter(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
