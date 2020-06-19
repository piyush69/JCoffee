


class c1605515 {
public MyHelperClass getSubFiles(File o0){ return null; }
public MyHelperClass getAbsFileName(String o0, File o1){ return null; }

    public void createZip(String baseDir, String objFileName) throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.info("createZip: [ " + baseDir + "]   [" + objFileName + "]");
        MyHelperClass timesmpt = new MyHelperClass();
        baseDir = baseDir + "/" + timesmpt;
        File folderObject = new File(baseDir);
        if ((boolean)(Object)folderObject.exists()) {
            List fileList =(List)(Object) getSubFiles(new File(baseDir));
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(objFileName));
            ZipEntry ze = null;
            byte[] buf = new byte[1024];
            int readLen = 0;
            for (int i = 0; i < (int)(Object)fileList.size(); i++) {
                File f = (File)(File)(Object) fileList.get(i);
                ze = new ZipEntry(getAbsFileName(baseDir, f));
                ze.setSize(f.length());
                ze.setTime(f.lastModified());
                zos.putNextEntry(ze);
                InputStream is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(f));
                while ((readLen =(int)(Object) is.read(buf, 0, 1024)) != -1) {
                    zos.write(buf, 0, readLen);
                }
                is.close();
            }
            zos.close();
        } else {
            throw new Exception("this folder isnot exist!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass setTime(MyHelperClass o0){ return null; }
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
