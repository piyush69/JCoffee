


class c3975166 {

        public void applyTo(File source, File target) throws IOException {
            boolean failed = true;
            FileInputStream fin = new FileInputStream(source);
            try {
                FileChannel in =(FileChannel)(Object) fin.getChannel();
                FileOutputStream fos = new FileOutputStream(target);
                try {
                    FileChannel out =(FileChannel)(Object) fos.getChannel();
                    long pos = 0L;
                    MyHelperClass replacements = new MyHelperClass();
                    for (Replacement replacement :(Replacement[])(Object) (Object[])(Object)replacements) {
                        in.transferTo(pos,(long)(Object) replacement.pos - pos, out);
                        MyHelperClass ByteBuffer = new MyHelperClass();
                        if (replacement.val != null) out.write(ByteBuffer.wrap(replacement.val));
                        pos =(int)(Object) replacement.pos + (int)(Object)replacement.len;
                    }
                    in.transferTo(pos,(long)(Object) source.length() - pos, out);
                    failed = false;
                } finally {
                    fos.close();
                    if (failed == true) target.delete();
                }
            } finally {
                fin.close();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass wrap(MyHelperClass o0){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class Replacement {
public MyHelperClass val;
	public MyHelperClass len;
	public MyHelperClass pos;
}
