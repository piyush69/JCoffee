


class c20735941 {
public MyHelperClass IOUtils;
	public MyHelperClass getFilePrefix(){ return null; }

    protected File getFile() throws IOException {
        File home = new File(System.getProperty("user.dir"));
        String fileName = String.format("%s.txt", getFilePrefix());
        File file = new File(home, fileName);
        if ((boolean)(Object)file.exists()) {
            return file;
        } else {
            URL url =(URL)(Object) LocalNameGenerator.class.getResource("/" + fileName);
            if (url == null) {
                throw new IllegalStateException(String.format("Cannot find resource at %s", fileName));
            } else {
                InputStream in =(InputStream)(Object) url.openStream();
                try {
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        IOUtils.copy(in, out);
                    } finally {
                        out.close();
                    }
                } finally {
                    in.close();
                }
                return file;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, BufferedOutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class LocalNameGenerator {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
