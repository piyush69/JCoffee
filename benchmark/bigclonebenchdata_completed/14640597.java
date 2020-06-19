
import java.io.UncheckedIOException;


class c14640597 {

    private void reloadData(String dataSourceUrl) {
        try {
            URL url = new URL(dataSourceUrl);
            InputStream is =(InputStream)(Object) url.openStream();
            MyHelperClass progressMonitor = new MyHelperClass();
            if ((boolean)(Object)progressMonitor.isCanceled() == false) {
//                MyHelperClass progressMonitor = new MyHelperClass();
                progressMonitor.setNote("Building classifications...");
//                MyHelperClass progressMonitor = new MyHelperClass();
                progressMonitor.setProgress(2);
                MyHelperClass mediator = new MyHelperClass();
                mediator.loadClassificationTree(is);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass setNote(String o0){ return null; }
	public MyHelperClass loadClassificationTree(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
