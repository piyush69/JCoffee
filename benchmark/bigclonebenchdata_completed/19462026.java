


class c19462026 {

    public void copy(final File source, final File dest) throws IOException {
        final FileInputStream in = new FileInputStream(source);
        try {
            final FileOutputStream out = new FileOutputStream(dest);
            try {
                final FileChannel inChannel =(FileChannel)(Object) in.getChannel();
                final FileChannel outChannel =(FileChannel)(Object) out.getChannel();
                inChannel.transferTo(0, inChannel.size(), outChannel);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
