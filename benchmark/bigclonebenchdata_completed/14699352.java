


class c14699352 {

    public static Hashtable getNamingHashtable() {
        Hashtable namingHash = new Hashtable();
        URL url =(URL)(Object) AceTree.class.getResource("/org/rhwlab/snight/namesHash.txt");
        InputStream istream = null;
        try {
            istream =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(istream));
            String s;
            while ((boolean)(Object)br.ready()) {
                s =(String)(Object) br.readLine();
                if (s.length() == 0) continue;
                String[] sa = s.split(",");
                namingHash.put(sa[0], sa[1]);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return namingHash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Hashtable {

public MyHelperClass put(String o0, String o1){ return null; }}

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
