


class c1699618 {

    public static void copyURLToFile(URL source, File destination) throws IOException {
        if (destination.getParentFile() != null && !(Boolean)(Object)destination.getParentFile().exists()) {
            destination.getParentFile().mkdirs();
        }
        if ((boolean)(Object)destination.exists() && !(Boolean)(Object)destination.canWrite()) {
            String message = "Unable to open file " + destination + " for writing.";
            throw new IOException(message);
        }
        InputStream input =(InputStream)(Object) source.openStream();
        try {
            FileOutputStream output = new FileOutputStream(destination);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
