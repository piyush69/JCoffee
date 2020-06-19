


class c7993946 {

    public void unsplit(String newFilename, File[] files) throws Exception {
        FileOutputStream stream = new FileOutputStream(new File(newFilename));
        for (int i = 0; i < files.length; i++) {
            FileInputStream fin = new FileInputStream(files[i].getAbsolutePath());
            DataInputStream din = new DataInputStream(fin);
            while ((int)(Object)din.available() > 0) {
                stream.write(din.read());
            }
            din.close();
            fin.close();
        }
        stream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class DataInputStream {

DataInputStream(){}
	DataInputStream(FileInputStream o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}
