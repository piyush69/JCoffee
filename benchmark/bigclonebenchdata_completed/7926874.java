


class c7926874 {
public static MyHelperClass log;
//public MyHelperClass log;

    public static void main(String arg[]) {
        try {
            String readFile = arg[0];
            String writeFile = arg[1];
            java.io.FileInputStream ss = new java.io.FileInputStream(readFile);
            ManagedMemoryDataSource ms = new ManagedMemoryDataSource((FileInputStream)(Object)ss, 1024 * 1024, "foo/data", true);
            javax.activation.DataHandler dh = new javax.activation.DataHandler((javax.activation.DataSource)(Object)(DataSource)(Object)ms);
            java.io.InputStream is = dh.getInputStream();
            java.io.FileOutputStream fo = new java.io.FileOutputStream(writeFile);
            byte[] buf = new byte[512];
            int read = 0;
            do {
                read = is.read(buf);
                if (read > 0) {
                    fo.write(buf, 0, read);
                }
            } while (read > -1);
            fo.close();
            is.close();
        } catch (java.lang.Exception e) {
            MyHelperClass Messages = new MyHelperClass();
            log.error(Messages.getMessage("exception00"), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass error(MyHelperClass o0, Exception o1){ return null; }}

class ManagedMemoryDataSource {

ManagedMemoryDataSource(){}
	ManagedMemoryDataSource(FileInputStream o0, int o1, String o2, boolean o3){}}

class FileInputStream {

}

class DataSource {

}
