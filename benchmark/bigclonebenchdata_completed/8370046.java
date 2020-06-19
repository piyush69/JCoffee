


class c8370046 {
public static MyHelperClass getURLFileName(URL o0){ return null; }
//public MyHelperClass getURLFileName(URL o0){ return null; }

    public static String downloadJar(URL url) throws IOException {
        String localFile = null;
        char[] buf = new char[4096];
        int num;
        MyHelperClass Settings = new MyHelperClass();
        localFile = Settings.getFreeTsUserPath() + "lib" + Settings.SLASH + getURLFileName(url);
        MyHelperClass DebugDialog = new MyHelperClass();
        DebugDialog.print("Downloading jar-file " + url + " to " + localFile + ".", 4);
        InputStreamReader in = new InputStreamReader(url.openStream());
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(localFile));
        do {
            num =(int)(Object) in.read(buf, 0, 4096);
            if (num > 0) {
                out.write(buf, 0, num);
            }
        } while (num > 0);
        in.close();
        out.close();
        return localFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SLASH;
public MyHelperClass getFreeTsUserPath(){ return null; }
	public MyHelperClass print(String o0, int o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
