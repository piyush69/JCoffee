


class c9540291 {

    private String getManifestVersion() {
        URL url =(URL)(Object) AceTree.class.getResource("/org/rhwlab/help/messages/manifest.html");
        InputStream istream = null;
        String s = "";
        try {
            istream =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(istream));
            while ((boolean)(Object)br.ready()) {
                s =(String)(Object) br.readLine();
                if (s.indexOf("Manifest-Version:") == 0) {
                    s = s.substring(17);
                    break;
                }
                System.out.println("read: " + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyHelperClass C = new MyHelperClass();
        return "Version: " + s + C.NL;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NL;
}

class URL {

public MyHelperClass openStream(){ return null; }}

class AceTree {

}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
