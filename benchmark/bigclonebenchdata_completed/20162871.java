


class c20162871 {

    public static void copyFile(String f_in, String f_out, boolean remove) throws FileNotFoundException, IOException {
        if (remove) {
            MyHelperClass PogoUtil = new MyHelperClass();
            PogoString readcode = new PogoString(PogoUtil.readFile(f_in));
//            MyHelperClass PogoUtil = new MyHelperClass();
            readcode =(PogoString)(Object) PogoUtil.removeLogMessages(readcode);
//            MyHelperClass PogoUtil = new MyHelperClass();
            PogoUtil.writeFile(f_out, readcode.str);
        } else {
            FileInputStream fid = new FileInputStream(f_in);
            FileOutputStream fidout = new FileOutputStream(f_out);
            int nb =(int)(Object) fid.available();
            byte[] inStr = new byte[nb];
            if ((int)(Object)fid.read(inStr) > 0) fidout.write(inStr);
            fid.close();
            fidout.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeFile(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass readFile(String o0){ return null; }
	public MyHelperClass removeLogMessages(PogoString o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PogoString {
public MyHelperClass str;
PogoString(MyHelperClass o0){}
	PogoString(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(String o0){}
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
