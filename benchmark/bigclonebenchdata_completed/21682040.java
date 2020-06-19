


class c21682040 {
public MyHelperClass showMessage(String o0){ return null; }

    public void extractFrinika() throws Exception {
        MyHelperClass frinikaFile = new MyHelperClass();
        FileInputStream fis = new FileInputStream(frinikaFile);
        MyHelperClass progressBar = new MyHelperClass();
        progressBar.setIndeterminate(true);
        ZipInputStream zis = new ZipInputStream(fis);
        ZipEntry ze =(ZipEntry)(Object) zis.getNextEntry();
        while (ze != null) {
            showMessage("Extracting: " + ze.getName());
            MyHelperClass installDirName = new MyHelperClass();
            File file = new File(installDirName + "/" + ze.getName());
            if ((boolean)(Object)ze.isDirectory()) file.mkdir(); else {
                FileOutputStream fos = new FileOutputStream(file);
                MyHelperClass BUFSIZE = new MyHelperClass();
                byte[] b = new byte[(int)(Object)BUFSIZE];
                int c;
                while ((c =(int)(Object) zis.read(b)) != -1) fos.write(b, 0, c);
                fos.close();
            }
            ze =(ZipEntry)(Object) zis.getNextEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setIndeterminate(boolean o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
