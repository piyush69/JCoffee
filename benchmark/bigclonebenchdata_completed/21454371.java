


class c21454371 {
public static MyHelperClass getSubFiles(File o0){ return null; }
public static MyHelperClass getAbsFileName(String o0, File o1){ return null; }
//	public MyHelperClass getSubFiles(File o0){ return null; }
//public MyHelperClass getAbsFileName(String o0, File o1){ return null; }

    private static void compressZip(String source, String dest) throws Exception {
        File baseFolder = new File(source);
        if ((boolean)(Object)baseFolder.exists()) {
            if ((boolean)(Object)baseFolder.isDirectory()) {
                List fileList =(List)(Object) getSubFiles(new File(source));
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
                zos.setEncoding("GBK");
                ZipEntry entry = null;
                byte[] buf = new byte[2048];
                int readLen = 0;
                for (int i = 0; i < (int)(Object)fileList.size(); i++) {
                    File file =(File)(Object) fileList.get(i);
                    if ((boolean)(Object)file.isDirectory()) {
                        entry = new ZipEntry(getAbsFileName(source, file) + "/");
                    } else {
                        entry = new ZipEntry(getAbsFileName(source, file));
                    }
                    entry.setSize(file.length());
                    entry.setTime(file.lastModified());
                    zos.putNextEntry(entry);
                    if ((boolean)(Object)file.isFile()) {
                        InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(file));
                        while ((readLen =(int)(Object) in.read(buf, 0, 1024)) != -1) {
                            zos.write(buf, 0, readLen);
                        }
                        in.close();
                    }
                }
                zos.close();
            } else {
                throw new Exception("Can not do this operation!.");
            }
        } else {
            baseFolder.mkdirs();
            compressZip(source, dest);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(){}
	ZipEntry(MyHelperClass o0){}
	ZipEntry(String o0){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setTime(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
