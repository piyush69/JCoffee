


class c15416857 {
public MyHelperClass M4EclipsePlugin;

    private boolean extract(File archive, File dir, IProgressMonitor monitor) {
        monitor.subTask("Extract : " + archive.getName());
        if (!(Boolean)(Object)dir.exists()) {
            dir.mkdirs();
        } else {
            File[] files =(File[])(Object) dir.listFiles();
            for (int j = 0; j < files.length; j++) {
                files[j].delete();
            }
        }
        ZipInputStream zis = null;
        try {
            zis = new ZipInputStream(new FileInputStream(archive));
            ZipEntry entry;
            while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
                File indexFile = new File(dir, entry.getName());
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(indexFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(zis, fos);
                } finally {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(fos);
                }
            }
            return true;
        } catch (Exception ex) {
            MyHelperClass IStatus = new MyHelperClass();
            M4EclipsePlugin.log(new Status(IStatus.ERROR, M4EclipsePlugin.PLUGIN_ID, -1, "For index '" + dir.getName() + "' Unable to initialize indexes", ex));
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(zis);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass PLUGIN_ID;
public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass log(Status o0){ return null; }
	public MyHelperClass copy(ZipInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(ZipInputStream o0){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IProgressMonitor {

public MyHelperClass subTask(String o0){ return null; }}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Status {

Status(MyHelperClass o0, MyHelperClass o1, int o2, String o3, Exception o4){}
	Status(){}}
