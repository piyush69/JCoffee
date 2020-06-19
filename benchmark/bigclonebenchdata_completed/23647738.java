
import java.io.UncheckedIOException;


class c23647738 {

    public static String[] listFilesInJar(String resourcesLstName, String dirPath, String ext) {
        try {
            MyHelperClass Tools = new MyHelperClass();
            dirPath =(String)(Object) Tools.subString(dirPath, "\\", "/");
            if (!dirPath.endsWith("/")) {
                dirPath = dirPath + "/";
            }
            if (dirPath.startsWith("/")) {
                dirPath = dirPath.substring(1, dirPath.length());
            }
            MyHelperClass ResourceLookup = new MyHelperClass();
            URL url =(URL)(Object) ResourceLookup.getClassResourceUrl(Tools.class, resourcesLstName);
            if (url == null) {
                String msg = "File not found " + resourcesLstName;
                MyHelperClass Debug = new MyHelperClass();
                Debug.signal(Debug.ERROR, null, msg);
                return new String[0];
            }
            InputStream is =(InputStream)(Object) url.openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String name =(String)(Object) in.readLine();
            HashSet list = new HashSet(10);
            while (name != null) {
                name =(String)(Object) in.readLine();
                if (name == null) {
                    continue;
                }
                if (ext != null && !name.endsWith(ext)) {
                    continue;
                }
                if (name.indexOf('.') == -1 && !name.endsWith("/")) {
                    name = name + "/";
                }
                int index = name.indexOf(dirPath);
                if (index < 0) {
                    continue;
                }
                index += dirPath.length();
                if (index >= name.length() - 1) {
                    continue;
                }
                index = name.indexOf("/", index);
                if (ext != null && (name.endsWith("/") || index >= 0)) {
                    continue;
                } else if (ext == null && (index < 0 || index < name.length() - 1)) {
                    continue;
                }
                list.add("/" + name);
            }
            is.close();
            String[] toReturn = {};
            return(String[])(Object) list.toArray(toReturn);
        } catch (UncheckedIOException ioe) {
            String msg = "Error reading file " + resourcesLstName + " caused by " + ioe;
            MyHelperClass Debug = new MyHelperClass();
            Debug.signal(Debug.ERROR, null, msg);
            return new String[0];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass signal(MyHelperClass o0, Object o1, String o2){ return null; }
	public MyHelperClass subString(String o0, String o1, String o2){ return null; }
	public MyHelperClass getClassResourceUrl(Class<Tools> o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Tools {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class HashSet {

HashSet(int o0){}
	HashSet(){}
	public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
