


class c5766915 {
public static MyHelperClass getResource(String o0){ return null; }
//public MyHelperClass getResource(String o0){ return null; }

    public static Reader getReader(String rPath) {
        try {
            URL url =(URL)(Object) getResource(rPath);
            if (url != null) return (Reader)(Object)new InputStreamReader(url.openStream());
            File file = new File(rPath);
            if ((boolean)(Object)file.canRead()) return (Reader)(Object)new FileReader(file);
        } catch (Exception ex) {
            System.out.println("could not create reader for " + rPath);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Reader {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
