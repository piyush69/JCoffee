


class c14313659 {
public MyHelperClass Utilities;

    private int writeTraceFile(final File destination_file, final String trace_file_name, final String trace_file_path) {
        URL url = null;
        BufferedInputStream is = null;
        FileOutputStream fo = null;
        BufferedOutputStream os = null;
        int b = 0;
        if (destination_file == null) {
            return 0;
        }
        try {
            url = new URL("http://" + trace_file_path + "/" + trace_file_name);
            is = new BufferedInputStream(url.openStream());
            fo = new FileOutputStream(destination_file);
            os = new BufferedOutputStream(fo);
            while ((b =(int)(Object) is.read()) != -1) {
                os.write(b);
            }
            os.flush();
            is.close();
            os.close();
        } catch (Exception e) {
            System.err.println(url.toString());
            MyHelperClass CONTACT = new MyHelperClass();
            Utilities.unexpectedException(e, this, CONTACT);
            return 0;
        }
        return 1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass unexpectedException(Exception o0, c14313659 o1, MyHelperClass o2){ return null; }}

class File {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}
