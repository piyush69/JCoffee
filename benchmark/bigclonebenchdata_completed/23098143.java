


class c23098143 {
public MyHelperClass DIR;
public MyHelperClass fileName;
	public MyHelperClass DBHelper;
	public MyHelperClass getFilesToZip(String o0){ return null; }
	public MyHelperClass update(String o0, int o1){ return null; }

    public void process() {
        try {
            update("Shutdown knowledge base ...", 0);
            DBHelper.shutdownDB();
            update("Shutdown knowledge base ...", 9);
            String zipDir =(String)(Object) DIR.getPKBDataPath();
            update("Backup in progress ...", 10);
            List fileList =(List)(Object) getFilesToZip(zipDir);
            File file = new File(fileName);
            ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(file));
            byte[] readBuffer = new byte[2156];
            int bytesIn = 0;
            for (int i = 0; i < (int)(Object)fileList.size(); i++) {
                String filePath =(String)(Object) fileList.get(i);
                File f = new File(filePath);
                FileInputStream fis = new FileInputStream(f);
                String zipEntryName =(String)(Object) f.getPath().substring(zipDir.length() + 1);
                ZipEntry anEntry = new ZipEntry(zipEntryName);
                zout.putNextEntry(anEntry);
                while ((bytesIn =(int)(Object) fis.read(readBuffer)) != -1) {
                    zout.write(readBuffer, 0, bytesIn);
                }
                fis.close();
                int percentage = (int) Math.round((i + 1) * 80.0 / (double)(Object)fileList.size());
                update("Backup in progress ...", 10 + percentage);
            }
            zout.close();
            update("Restart knowledge base ...", 91);
            DBHelper.startDB();
            update("Backup is done!", 100);
        } catch (Exception ex) {
            ex.printStackTrace();
            update("Error occurs during backup!", 100);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startDB(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getPKBDataPath(){ return null; }
	public MyHelperClass shutdownDB(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(String o0){}
	File(){}
	public MyHelperClass getPath(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
