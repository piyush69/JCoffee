


class c16590954 {

    public void createJAR(String fileString, String ext) {
        try {
            File file = new File(fileString);
            int i = fileString.lastIndexOf(java.io.File.separator);
            String dir = fileString.substring(0, i + 1);
            if (ext.matches("jar")) {
                File jarFile;// = new File();
                jarFile = new File((String)(Object)getClass().getClassLoader().getResource("jsdviewer.jar").toURI());
                java.io.FileOutputStream fstrm = new java.io.FileOutputStream((String)(Object)file);
//                MyHelperClass jarFile = new MyHelperClass();
                FileChannel in =(FileChannel)(Object) (new java.io.FileInputStream((String)(Object)jarFile)).getChannel();
                FileChannel out =(FileChannel)(Object) fstrm.getChannel();
//                MyHelperClass jarFile = new MyHelperClass();
                in.transferTo(0, jarFile.length(), out);
                in.close();
                out.close();
            } else {
                file.mkdir();
            }
            MyHelperClass File = new MyHelperClass();
            File.umount(file);
            File temp = new File(dir + "document.jsd");
            FileOutputStream fstrm2 = new FileOutputStream(temp.getCanonicalPath());
            ObjectOutputStream ostrm;// = new ObjectOutputStream();
            ostrm = new ObjectOutputStream(fstrm2);
            MyHelperClass doc = new MyHelperClass();
            ostrm.writeObject(doc);
//            MyHelperClass ostrm = new MyHelperClass();
            ostrm.flush();
//            MyHelperClass ostrm = new MyHelperClass();
            ostrm.close();
//            MyHelperClass File = new MyHelperClass();
            File.umount();
            File docFile = new File(file.getCanonicalPath() + java.io.File.separator + "document.jsd");
//            MyHelperClass File = new MyHelperClass();
            File.cp_p(temp, docFile);
//            MyHelperClass File = new MyHelperClass();
            File.umount();
            temp.delete();
//            MyHelperClass File = new MyHelperClass();
            File.umount(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass cp_p(File o0, File o1){ return null; }
	public MyHelperClass writeObject(MyHelperClass o0){ return null; }
	public MyHelperClass umount(File o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass umount(){ return null; }}

class File {

File(String o0){}
	File(){}
	File(URI o0){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(FileOutputStream o0){}
	public MyHelperClass writeObject(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URI {

}
