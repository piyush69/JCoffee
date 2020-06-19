


class c2439668 {

    public void run() {
        try {
            MyHelperClass textUpdater = new MyHelperClass();
            textUpdater.start();
            int cnt;
            byte[] buf = new byte[4096];
            File file = null;
            MyHelperClass filename = new MyHelperClass();
            ZipInputStream zis = new ZipInputStream(new FileInputStream(new File(filename)));
            ZipEntry ze =(ZipEntry)(Object) zis.getNextEntry();
            FileOutputStream fos;
            while (ze != null) {
                if ((boolean)(Object)ze.isDirectory()) {
                    file = new File(ze.getName());
                    if (!(Boolean)(Object)file.exists()) {
//                        MyHelperClass textUpdater = new MyHelperClass();
                        textUpdater.appendText("Creating directory: " + ze.getName() + "\n");
                        file.mkdirs();
                    }
                } else {
//                    MyHelperClass textUpdater = new MyHelperClass();
                    textUpdater.appendText("Extracting file: " + ze.getName() + "\n");
                    MyHelperClass dstdir = new MyHelperClass();
                    fos = new FileOutputStream((int)(Object)dstdir + (int)(Object)File.separator + (int)(Object)ze.getName());
                    while ((cnt =(int)(Object) zis.read(buf, 0, buf.length)) != -1) fos.write(buf, 0, cnt);
                    fos.close();
                }
                zis.closeEntry();
                ze =(ZipEntry)(Object) zis.getNextEntry();
            }
            zis.close();
            MyHelperClass complete = new MyHelperClass();
            if (complete != null) textUpdater.appendText(complete + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyHelperClass textUpdater = new MyHelperClass();
        textUpdater.setFinished(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass appendText(String o0){ return null; }
	public MyHelperClass setFinished(boolean o0){ return null; }
	public MyHelperClass start(){ return null; }}

class File {
public static MyHelperClass separator;
File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(int o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
