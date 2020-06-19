
import java.io.UncheckedIOException;


class c72041 {

    protected static boolean isLatestVersion(double myVersion, String referenceAddress) {
        Scanner scanner = null;
        try {
            URL url = new URL(referenceAddress);
            InputStream iS =(InputStream)(Object) url.openStream();
            scanner = new Scanner(iS);
            String firstLine =(String)(Object) scanner.nextLine();
            double latestVersion = Double.valueOf(firstLine.trim());
            MyHelperClass OpenSONAR = new MyHelperClass();
            double thisVersion =(double)(Object) OpenSONAR.VERSION;
            return thisVersion >= latestVersion;
        } catch (UncheckedIOException e) {
            System.out.println("Unknown Host!!!");
            return false;
        } catch (Exception e) {
            System.out.println("Can't decide latest version");
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION;
}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	public MyHelperClass nextLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}
