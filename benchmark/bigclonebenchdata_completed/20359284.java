


class c20359284 {
public MyHelperClass copy(ZipInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }

    private void SaveToArchive(Layer layer, String layerFileName) throws Exception {
        Object archiveObj = layer.getBlackboard().get("ArchiveFileName");
        Object entryObj = layer.getBlackboard().get("ArchiveEntryPrefix");
        if ((archiveObj == null) || (entryObj == null)) return;
        String archiveName = archiveObj.toString();
        String entryPrefix = entryObj.toString();
        if ((archiveName == "") || (entryPrefix == "")) return;
        MyHelperClass File = new MyHelperClass();
        File tempZip =(File)(Object) File.createTempFile("tmp", ".zip");
        InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(archiveName));
        OutputStream out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(tempZip));
        copy(in, out);
        in.close();
        out.close();
        ZipFile zipFile = new ZipFile(tempZip);
        ZipOutputStream zout = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(archiveName)));
        ZipInputStream zin = new ZipInputStream(new FileInputStream(tempZip));
        ZipEntry entry =(ZipEntry)(Object) zin.getNextEntry();
        while (entry != null) {
            String entryName =(String)(Object) entry.getName();
            MyHelperClass GUIUtil = new MyHelperClass();
            String en =(String)(Object) GUIUtil.nameWithoutExtension(new File(entryName));
            if (en.equalsIgnoreCase(entryPrefix)) {
                if (entryName.endsWith(".jmp")) {
                    MyHelperClass CreateArchivePlugIn = new MyHelperClass();
                    String layerTaskPath =(String)(Object) CreateArchivePlugIn.createLayerTask(layer, archiveName, entryPrefix);
//                    MyHelperClass CreateArchivePlugIn = new MyHelperClass();
                    CreateArchivePlugIn.WriteZipEntry(layerTaskPath, entryPrefix, zout);
                } else if ((!entryName.endsWith(".shx")) && (!entryName.endsWith(".dbf")) && (!entryName.endsWith(".shp.xml")) && (!entryName.endsWith(".prj"))) {
                    MyHelperClass CreateArchivePlugIn = new MyHelperClass();
                    CreateArchivePlugIn.WriteZipEntry(layerFileName, entryPrefix, zout);
                }
            } else {
                zout.putNextEntry(entry);
                copy(zin, zout);
            }
            entry =(ZipEntry)(Object) zin.getNextEntry();
        }
        zin.close();
        zout.close();
        zipFile.close();
        tempZip.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createLayerTask(Layer o0, String o1, String o2){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass nameWithoutExtension(File o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass WriteZipEntry(String o0, String o1, ZipOutputStream o2){ return null; }}

class Layer {

public MyHelperClass getBlackboard(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass close(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
