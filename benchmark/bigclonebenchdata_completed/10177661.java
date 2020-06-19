


class c10177661 {
public MyHelperClass getLogger(){ return null; }

    protected File extractArchive(File archive) {
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte buf[] = new byte[(int)(Object)BUF_SIZE];
        ZipInputStream zis = null;
        File archiveDirectory = null;
        FileOutputStream fos;
        ZipEntry entry;
        File curEntry;
        int n;
        try {
            zis = new ZipInputStream(new FileInputStream(archive));
            while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
                MyHelperClass workingDir = new MyHelperClass();
                curEntry = new File(workingDir, entry.getName());
                if ((boolean)(Object)entry.isDirectory()) {
                    getLogger().info("skip directory: " + entry.getName());
                    if (archiveDirectory == null) archiveDirectory = curEntry;
                    continue;
                }
                getLogger().info("zip-entry (file): " + entry.getName() + " ==> real path: " + curEntry.getAbsolutePath());
                if (!(Boolean)(Object)curEntry.getParentFile().exists()) curEntry.getParentFile().mkdirs();
                fos = new FileOutputStream(curEntry);
                while ((n =(int)(Object) zis.read(buf, 0, buf.length)) > -1) fos.write(buf, 0, n);
                fos.close();
                zis.closeEntry();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            try {
                if (zis != null) zis.close();
            } catch (Throwable t) {
            }
        }
        return archiveDirectory;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
