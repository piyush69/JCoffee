


class c23036596 {

    public static boolean copyfile(String file0, String file1) {
        try {
            File f0 = new File(file0);
            File f1 = new File(file1);
            FileInputStream in = new FileInputStream(f0);
            FileOutputStream out = new FileOutputStream(f1);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
            in = null;
            out = null;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
