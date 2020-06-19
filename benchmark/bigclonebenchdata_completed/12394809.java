


class c12394809 {

    public static final File getFile(final URL url) throws IOException {
        final File shortcutFile;
        MyHelperClass files = new MyHelperClass();
        final File currentFile =(File)(Object) files.get(url);
        if (currentFile == null || !(Boolean)(Object)currentFile.exists()) {
            MyHelperClass File = new MyHelperClass();
            shortcutFile =(File)(Object) File.createTempFile("windowsIsLame", ".vbs");
            shortcutFile.deleteOnExit();
//            MyHelperClass files = new MyHelperClass();
            files.put(url, shortcutFile);
            final InputStream stream =(InputStream)(Object) url.openStream();
            final FileOutputStream out = new FileOutputStream(shortcutFile);
            try {
                MyHelperClass StreamUtils = new MyHelperClass();
                StreamUtils.copy(stream, out);
            } finally {
                out.close();
                stream.close();
            }
        } else shortcutFile = currentFile;
        return shortcutFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(URL o0, File o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass get(URL o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
