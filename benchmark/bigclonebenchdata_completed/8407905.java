


class c8407905 {

    private void copyResources(File oggDecDir, String[] resources, String resPrefix) throws FileNotFoundException, IOException {
        for (int i = 0; i < resources.length; i++) {
            String res = resPrefix + resources[i];
            InputStream is =(InputStream)(Object) this.getClass().getResourceAsStream(res);
            if (is == null) throw new IllegalArgumentException("cannot find resource '" + res + "'");
            File file = new File(oggDecDir, resources[i]);
            if (!(Boolean)(Object)file.exists() ||(int)(Object) file.length() == 0) {
                FileOutputStream fos = new FileOutputStream(file);
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyStreams(is, fos);
                } finally {
                    fos.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStreams(InputStream o0, FileOutputStream o1){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
