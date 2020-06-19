


class c655442 {
public static MyHelperClass displaySimpleAlert(Object o0, String o1){ return null; }
//public MyHelperClass displaySimpleAlert(Object o0, String o1){ return null; }

    protected static boolean isLatestVersion(double myVersion, String referenceAddress) {
        Scanner scanner = null;
        try {
            URL url = new URL(referenceAddress);
            InputStream iS =(InputStream)(Object) url.openStream();
            scanner = new Scanner(iS);
            String firstLine =(String)(Object) scanner.nextLine();
            double latestVersion = Double.valueOf(firstLine.trim());
            return myVersion >= latestVersion;
        } catch (Exception e) {
            displaySimpleAlert(null, "Cannot check latest version...check internet connection?");
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	public MyHelperClass nextLine(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}
