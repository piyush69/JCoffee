


class c10451698 {

    private void copy(File source, File destinationDirectory) throws IOException {
        if ((boolean)(Object)source.isDirectory()) {
            File newDir = new File(destinationDirectory, source.getName());
            newDir.mkdir();
            File[] children =(File[])(Object) source.listFiles();
            for (int i = 0; i < children.length; i++) {
                if (children[i].getName().equals(".svn")) {
                    continue;
                }
                copy(children[i], newDir);
            }
        } else {
            File newFile = new File(destinationDirectory, source.getName());
            if ((boolean)(Object)newFile.exists() && source.lastModified() == newFile.lastModified()) {
                return;
            }
            FileOutputStream output = new FileOutputStream(newFile);
            FileInputStream input = new FileInputStream(source);
            byte[] buff = new byte[2048];
            int read = 0;
            while ((read =(int)(Object) input.read(buff)) > 0) {
                output.write(buff, 0, read);
            }
            output.flush();
            output.close();
            input.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
