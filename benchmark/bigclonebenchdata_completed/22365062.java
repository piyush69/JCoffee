


class c22365062 {
public MyHelperClass injectCodeTape(BufferedReader o0, String o1, int o2, int o3){ return null; }

        private void inject(int x, int y) throws IOException {
            MyHelperClass data = new MyHelperClass();
            Tag source =(Tag)(Object) data.getTag();
            MyHelperClass Log = new MyHelperClass();
            Log.event(Log.DEBUG_INFO, "source: " + source.getString());
            MyHelperClass Tag = new MyHelperClass();
            if (source == (Tag)(Object)Tag.ORGANISM) {
//                MyHelperClass data = new MyHelperClass();
                String seed =(String)(Object) data.readString();
//                MyHelperClass Tag = new MyHelperClass();
                data.readTag(Tag.STREAM);
//                MyHelperClass data = new MyHelperClass();
                injectCodeTape((BufferedReader)(Object)data.getIn(), seed, x, y);
//            MyHelperClass Tag = new MyHelperClass();
            } else if (source == (Tag)(Object)Tag.URL) {
//                MyHelperClass data = new MyHelperClass();
                String url =(String)(Object) data.readString();
                String seed = url.substring(url.lastIndexOf('.') + 1);
                BufferedReader urlIn = null;
                try {
                    urlIn = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                    injectCodeTape(urlIn, seed, x, y);
                } finally {
                    if (urlIn != null) urlIn.close();
                }
//            MyHelperClass data = new MyHelperClass();
            } else data.writeString("unknown organism source: " + source.getString());
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORGANISM;
	public MyHelperClass DEBUG_INFO;
	public MyHelperClass URL;
	public MyHelperClass STREAM;
public MyHelperClass readString(){ return null; }
	public MyHelperClass readTag(MyHelperClass o0){ return null; }
	public MyHelperClass writeString(String o0){ return null; }
	public MyHelperClass event(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getTag(){ return null; }
	public MyHelperClass getIn(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Tag {

public MyHelperClass getString(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
