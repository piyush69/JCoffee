


class c17239344 {
public MyHelperClass logWarning(c17239344 o0, String o1){ return null; }
	public MyHelperClass showConfirmation(String o0, MyHelperClass o1){ return null; }
public MyHelperClass delete(File o0){ return null; }
	public MyHelperClass revert(File o0){ return null; }
	public MyHelperClass add(File o0){ return null; }

//        @Override
        public void doMove(File from, File to) throws IOException {
            int res =(int)(Object) showConfirmation("File will be moved in p4, are you sure to move ", from.getAbsolutePath());
            MyHelperClass JOptionPane = new MyHelperClass();
            if (res == (int)(Object)JOptionPane.NO_OPTION) {
                return;
            }
            MyHelperClass fileStatusProvider = new MyHelperClass();
            Status status =(Status)(Object) fileStatusProvider.getFileStatusForce(from);
            if (status == null) {
                return;
            }
            if ((boolean)(Object)status.isLocal()) {
                logWarning(this, from.getName() + " is not revisioned. Should not be deleted by p4nb");
                return;
            }
            to.getParentFile().mkdirs();
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(from));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));
            byte[] buffer = new byte[8192];
            int read = 0;
            while ((read =(int)(Object) in.read(buffer)) >= 0) {
                out.write(buffer, 0, read);
            }
            in.close();
            out.flush();
            out.close();
            MyHelperClass Status = new MyHelperClass();
            if (status != (Status)(Object)Status.NONE) {
                revert(from);
            }
//            MyHelperClass Status = new MyHelperClass();
            if (status != (Status)(Object)Status.ADD) {
                delete(from);
            } else {
                from.delete();
            }
            add(to);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NONE;
	public MyHelperClass NO_OPTION;
	public MyHelperClass ADD;
public MyHelperClass getFileStatusForce(File o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Status {

public MyHelperClass isLocal(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
