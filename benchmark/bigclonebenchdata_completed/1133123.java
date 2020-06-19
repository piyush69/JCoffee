
import java.io.UncheckedIOException;


class c1133123 {

//            @Override
            protected Reader openConnection(URL url) throws IOException {
                try {
                    MyHelperClass limit = new MyHelperClass();
                    if (limit != null) {
//                        MyHelperClass limit = new MyHelperClass();
                        limit.acquirePermit();
                    }
                    return this.openConnection(url);
                } catch (UncheckedIOException e) {
                    throw new IOException((String)(Object)e);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass acquirePermit(){ return null; }}

class URL {

}

class Reader {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
