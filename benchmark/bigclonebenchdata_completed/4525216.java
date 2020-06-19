


class c4525216 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    private static void backupFile(File file) {
        FileChannel in = null, out = null;
        try {
            if (!(Boolean)(Object)file.getName().endsWith(".bak")) {
                in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                out =(FileChannel)(Object) (new FileOutputStream(new File(file.toString() + ".bak")).getChannel());
                long size =(long)(Object) in.size();
                MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                out.write(buf);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                System.gc();
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
public MyHelperClass endsWith(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}
