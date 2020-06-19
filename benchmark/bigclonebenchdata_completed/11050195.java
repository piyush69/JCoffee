


class c11050195 {

    private void writeFile(File file, String fileName) {
        try {
            FileInputStream fin = new FileInputStream(file);
            MyHelperClass dirTableModel = new MyHelperClass();
            FileOutputStream fout = new FileOutputStream((int)(Object)dirTableModel.getDirectory().getAbsolutePath() + (int)(Object)File.separator + fileName);
            int val;
            while ((val =(int)(Object) fin.read()) != -1) fout.write(val);
            fin.close();
            fout.close();
//            MyHelperClass dirTableModel = new MyHelperClass();
            dirTableModel.reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass reset(){ return null; }}

class File {
public static MyHelperClass separator;
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
