


class c17415423 {

    public void overwriteFileTest() throws Exception {
        File filefrom = new File("/tmp/from.txt");
        File fileto = new File("/tmp/to.txt");
        InputStream from = null;
        OutputStream to = null;
        try {
            from =(InputStream)(Object) new FileInputStream(filefrom);
            to =(OutputStream)(Object) new FileOutputStream(fileto);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read =(int)(Object) from.read(buffer)) != -1) {
                to.write(buffer, 0, bytes_read);
            }
        } finally {
            if (from != null) {
                from.close();
            }
            if (to != null) {
                to.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
