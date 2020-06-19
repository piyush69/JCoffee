
import java.io.UncheckedIOException;


class c9562033 {
public MyHelperClass FileUtil;
	public MyHelperClass IOUtils;
	public MyHelperClass FileSystem;

    public void run(String srcf, String dst) {
        final Path srcPath = new Path("./" + srcf);
        final Path desPath = new Path(dst);
        try {
            MyHelperClass hdfs = new MyHelperClass();
            Path[] srcs =(Path[])(Object) FileUtil.stat2Paths(hdfs.globStatus(srcPath), srcPath);
            MyHelperClass conf = new MyHelperClass();
            OutputStream out =(OutputStream)(Object) FileSystem.getLocal(conf).create(desPath);
            for (int i = 0; i < srcs.length; i++) {
                System.out.println(srcs[i]);
//                MyHelperClass hdfs = new MyHelperClass();
                InputStream in =(InputStream)(Object) hdfs.open(srcs[i]);
//                MyHelperClass conf = new MyHelperClass();
                IOUtils.copyBytes(in, out, conf, false);
                in.close();
            }
            out.close();
        } catch (UncheckedIOException ex) {
            System.err.print(ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass globStatus(Path o0){ return null; }
	public MyHelperClass getLocal(MyHelperClass o0){ return null; }
	public MyHelperClass copyBytes(InputStream o0, OutputStream o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass stat2Paths(MyHelperClass o0, Path o1){ return null; }
	public MyHelperClass open(Path o0){ return null; }
	public MyHelperClass create(Path o0){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
