
import java.io.UncheckedIOException;


class c19652844 {
public MyHelperClass url;

    public long getLastModified() {
        MyHelperClass lastModified = new MyHelperClass();
        if ((int)(Object)lastModified == 0) {
            MyHelperClass connection = new MyHelperClass();
            if (connection == null) try {
//                MyHelperClass connection = new MyHelperClass();
                connection = url.openConnection();
            } catch (UncheckedIOException e) {
            }
//            MyHelperClass connection = new MyHelperClass();
            if (connection != null) lastModified = connection.getLastModified();
        }
//        MyHelperClass lastModified = new MyHelperClass();
        return (long)(Object)lastModified;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
