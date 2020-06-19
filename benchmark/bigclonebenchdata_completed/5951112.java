import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5951112 {
public static MyHelperClass Characters;
	public static MyHelperClass workingDirectory;
	public static MyHelperClass LOGGER;
	public static MyHelperClass URLTools;
	public static MyHelperClass getExistingFile(String o0){ return null; }
//public MyHelperClass LOGGER;
//	public MyHelperClass URLTools;
//	public MyHelperClass Characters;
//	public MyHelperClass workingDirectory;
//	public MyHelperClass getExistingFile(String o0){ return null; }

    public static String getFileContents(String path)  throws Throwable {
        BufferedReader buffReader = null;
        InputStream stream = null;
        if (path.indexOf("://") != -1) {
            URL url = null;
            try {
                url = new URL(path);
            } catch (MalformedURLException e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.warn(String.format("Malformed URL: \"%s\"", path));
            }
            if (url == null) {
                throw(Throwable)(Object) new DeveloperError(String.format("Cannot create URL from path: \"%s\"", path), new NullPointerException());
            }
            try {
                MyHelperClass Characters = new MyHelperClass();
                String encoding =(String)(Object) Characters.getDeclaredXMLEncoding(url);
                stream = url.openStream();
                buffReader = new BufferedReader(new InputStreamReader(stream, encoding));
            } catch (IOException e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.warn(String.format("I/O error trying to read \"%s\"", path));
            }
        } else {
            File toRead = null;
            try {
                toRead =(File)(Object) getExistingFile(path);
            } catch (UncheckedIOException e) {
                throw(Throwable)(Object) new UserError(new FileNotFoundException(path));
            }
            if (toRead.isAbsolute()) {
                String parent = toRead.getParent();
                try {
                    workingDirectory.push(URLTools.createValidURL(parent));
                } catch (UncheckedIOException e) {
                    throw(Throwable)(Object) new DeveloperError(String.format("Created an invalid parent file: \"%s\".", parent),(FileNotFoundException)(Object) e);
                }
            }
            if (toRead.exists() && !toRead.isDirectory()) {
                String _path = toRead.getAbsolutePath();
                try {
                    String encoding =(String)(Object) Characters.getDeclaredXMLEncoding((URL)(Object)URLTools.createValidURL(_path));
                    stream = new FileInputStream(_path);
                    buffReader = new BufferedReader(new InputStreamReader(stream, encoding));
                } catch (IOException e) {
                    LOGGER.warn(String.format("I/O error trying to read \"%s\"", _path));
                    return null;
                }
            } else {
                assert toRead.exists() : "getExistingFile() returned a non-existent file";
                if (toRead.isDirectory()) {
                    throw(Throwable)(Object) new UserError((FileNotFoundException)(Object)new FileAlreadyExistsAsDirectoryException((String)(Object)toRead));
                }
            }
        }
        StringBuilder result = new StringBuilder();
        String line;
        if (buffReader != null && stream != null) {
            try {
                while ((line = buffReader.readLine()) != null) {
                    result.append(line);
                }
                buffReader.close();
                stream.close();
            } catch (IOException e) {
                LOGGER.warn(String.format("I/O error trying to read \"%s\"", path));
                return null;
            }
        }
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createValidURL(String o0){ return null; }
	public MyHelperClass getDeclaredXMLEncoding(URL o0){ return null; }
	public MyHelperClass push(MyHelperClass o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class DeveloperError {

DeveloperError(){}
	DeveloperError(String o0, FileNotFoundException o1){}
	DeveloperError(String o0, NullPointerException o1){}}

class UserError {

UserError(FileNotFoundException o0){}
	UserError(){}}

class FileAlreadyExistsAsDirectoryException extends Exception{
	public FileAlreadyExistsAsDirectoryException(String errorMessage) { super(errorMessage); }
}
