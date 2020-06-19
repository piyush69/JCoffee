


class c12524506 {

    public static void copyFile(File in, File outDir) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
            File out = new File(outDir, in.getName());
            destinationChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        } finally {
            try {
                if (sourceChannel != null) {
                    sourceChannel.close();
                }
            } finally {
                if (destinationChannel != null) {
                    destinationChannel.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
