


class c21840034 {
public MyHelperClass create(File o0){ return null; }
public MyHelperClass out;
	public MyHelperClass close(){ return null; }

    public FileOutputStream transfer(File from, File to, long mark) throws IOException, InterruptedException {
        MyHelperClass out = new MyHelperClass();
        if (out != null) {
            close();
        }
        FileChannel fch =(FileChannel)(Object) (new FileInputStream(from).getChannel());
        FileChannel rollch =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
        long size = mark;
        int count = 0;
        try {
            while ((count += (int)(Object)rollch.transferFrom(fch, count, size - count)) < size) {
            }
        } finally {
            fch.close();
            rollch.close();
        }
        out = create(to);
        return (FileOutputStream)(Object)out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
