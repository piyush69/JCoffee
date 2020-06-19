


class c8788371 {
public MyHelperClass IOUtils;
	public MyHelperClass getConf(){ return null; }

    private void tail(String[] cmd, int pos) throws IOException {
        CommandFormat c = new CommandFormat("tail", 1, 1, "f");
        String src = null;
        Path path = null;
        try {
            List parameters =(List)(Object) c.parse(cmd, pos);
            src =(String)(Object) parameters.get(0);
        } catch (IllegalArgumentException iae) {
            MyHelperClass TAIL_USAGE = new MyHelperClass();
            System.err.println("Usage: java FsShell " + TAIL_USAGE);
            throw iae;
        }
        boolean foption =(boolean)(Object) c.getOpt("f") ? true : false;
        path = new Path(src);
        FileSystem srcFs =(FileSystem)(Object) path.getFileSystem(getConf());
        if ((boolean)(Object)srcFs.isDirectory(path)) {
            throw new IOException("Source must be a file.");
        }
        long fileSize =(long)(Object) srcFs.getFileStatus(path).getLen();
        long offset = (fileSize > 1024) ? fileSize - 1024 : 0;
        while (true) {
            FSDataInputStream in =(FSDataInputStream)(Object) srcFs.open(path);
            in.seek(offset);
            IOUtils.copyBytes(in,(PrintStream)(Object) System.out, 1024, false);
            offset =(long)(Object) in.getPos();
            in.close();
            if (!foption) {
                break;
            }
            fileSize =(long)(Object) srcFs.getFileStatus(path).getLen();
            offset = (fileSize > offset) ? offset : fileSize;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLen(){ return null; }
	public MyHelperClass copyBytes(FSDataInputStream o0, PrintStream o1, int o2, boolean o3){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CommandFormat {

CommandFormat(String o0, int o1, int o2, String o3){}
	CommandFormat(){}
	public MyHelperClass parse(String[] o0, int o1){ return null; }
	public MyHelperClass getOpt(String o0){ return null; }}

class Path {

Path(String o0){}
	Path(){}
	public MyHelperClass getFileSystem(MyHelperClass o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }}

class FileSystem {

public MyHelperClass isDirectory(Path o0){ return null; }
	public MyHelperClass open(Path o0){ return null; }
	public MyHelperClass getFileStatus(Path o0){ return null; }}

class FSDataInputStream {

public MyHelperClass getPos(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass seek(long o0){ return null; }}

class PrintStream {

}
