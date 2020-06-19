


class c20602651 {

    protected void readURL(URL url) {
        InputStream istream = null;
        InputStreamReader isr = null;
        BufferedReader in = null;
        try {
            istream =(InputStream)(Object) url.openStream();
            isr = new InputStreamReader(istream);
            in = new BufferedReader(isr);
            String line =(String)(Object) in.readLine();
            while (null != line) {
                System.out.println(line);
                line =(String)(Object) in.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyHelperClass IOUtilities = new MyHelperClass();
            IOUtilities.close(in);
//            MyHelperClass IOUtilities = new MyHelperClass();
            IOUtilities.close(isr);
//            MyHelperClass IOUtilities = new MyHelperClass();
            IOUtilities.close(istream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass close(BufferedReader o0){ return null; }
	public MyHelperClass close(InputStreamReader o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
