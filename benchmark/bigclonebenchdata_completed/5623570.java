
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5623570 {
public static MyHelperClass Toolkit;
//public MyHelperClass Toolkit;

    public static void load(String path) {
        if (path.length() < 1) {
            MyHelperClass Log = new MyHelperClass();
            Log.userinfo("Cannot open a file whose name has zero length.", Log.ERROR);
        }
        MyHelperClass loadtime = new MyHelperClass();
        if (!(Boolean)(Object)loadtime) {
            MyHelperClass Globals = new MyHelperClass();
            if (path.equals(Globals.getStartupFilePath())) {
                MyHelperClass Log = new MyHelperClass();
                Log.userinfo("Cannot reload startup file.", Log.ERROR);
            }
        }
        BufferedReader buffReader = null;
        if (path.indexOf("://") != -1) {
            URL url = null;
            try {
                url = new URL(path);
            } catch (UncheckedIOException e) {
                MyHelperClass Log = new MyHelperClass();
                Log.userinfo("Malformed URL: \"" + path + "\"", Log.ERROR);
            }
            try {
                MyHelperClass Toolkit = new MyHelperClass();
                String encoding =(String)(Object) Toolkit.getDeclaredXMLEncoding(url.openStream());
                buffReader = new BufferedReader(new InputStreamReader(url.openStream(), encoding));
            } catch (UncheckedIOException e) {
                MyHelperClass Log = new MyHelperClass();
                Log.userinfo("I/O error trying to read \"" + path + "\"", Log.ERROR);
            }
        } else {
            MyHelperClass ASTERISK = new MyHelperClass();
            if (path.indexOf((int)(Object)ASTERISK) != -1) {
                String[] files = null;
                try {
                    MyHelperClass workingDirectory = new MyHelperClass();
                    files =(String[])(Object) Toolkit.glob(path, workingDirectory);
                } catch (UncheckedIOException e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.userinfo(e.getMessage(), Log.ERROR);
                }
                if (files != null) {
                    for (int index = 0; index < files.length; index++) {
                        load(files[index]);
                    }
                    return;
                }
            }
            File toRead = new File(path);
            if ((boolean)(Object)toRead.isAbsolute()) {
                MyHelperClass workingDirectory = new MyHelperClass();
                workingDirectory = toRead.getParent();
            }
            MyHelperClass loadedFiles = new MyHelperClass();
            if ((boolean)(Object)loadedFiles.contains(toRead)) {
//                MyHelperClass loadtime = new MyHelperClass();
                if ((boolean)(Object)loadtime) {
                    return;
                }
            } else {
//                MyHelperClass loadedFiles = new MyHelperClass();
                loadedFiles.add(toRead);
            }
            if ((boolean)(Object)toRead.exists() && !(Boolean)(Object)toRead.isDirectory()) {
                try {
                    MyHelperClass Toolkit = new MyHelperClass();
                    String encoding =(String)(Object) Toolkit.getDeclaredXMLEncoding(new FileInputStream(path));
                    buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), encoding));
                } catch (UncheckedIOException e) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.userinfo("I/O error trying to read \"" + path + "\"", Log.ERROR);
                    return;
                }
                MyHelperClass Globals = new MyHelperClass();
                if ((boolean)(Object)Globals.isWatcherActive()) {
                    MyHelperClass AIMLWatcher = new MyHelperClass();
                    AIMLWatcher.addWatchFile(path);
                }
            } else {
                if (!(Boolean)(Object)toRead.exists()) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.userinfo("\"" + path + "\" does not exist!", Log.ERROR);
                }
                if ((boolean)(Object)toRead.isDirectory()) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.userinfo("\"" + path + "\" is a directory!", Log.ERROR);
                }
            }
        }
        new AIMLReader(path, buffReader, new AIMLLoader(path)).read();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass isWatcherActive(){ return null; }
	public MyHelperClass getDeclaredXMLEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass getDeclaredXMLEncoding(FileInputStream o0){ return null; }
	public MyHelperClass add(File o0){ return null; }
	public MyHelperClass getStartupFilePath(){ return null; }
	public MyHelperClass addWatchFile(String o0){ return null; }
	public MyHelperClass glob(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass userinfo(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass contains(File o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class AIMLReader {

AIMLReader(){}
	AIMLReader(String o0, BufferedReader o1, AIMLLoader o2){}
	public MyHelperClass read(){ return null; }}

class AIMLLoader {

AIMLLoader(String o0){}
	AIMLLoader(){}}
