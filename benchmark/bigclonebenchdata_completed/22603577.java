


class c22603577 {
public static MyHelperClass getURLFromPlugin(String o0){ return null; }
//public MyHelperClass getURLFromPlugin(String o0){ return null; }

    public static String getFileContentFromPlugin(String path) {
        URL url =(URL)(Object) getURLFromPlugin(path);
        StringBuffer sb = new StringBuffer();
        try {
            Scanner scanner = new Scanner(url.openStream());
            while ((boolean)(Object)scanner.hasNextLine()) {
                String line =(String)(Object) scanner.nextLine();
                sb.append(line + "\n");
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Scanner {

Scanner(){}
	Scanner(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}
