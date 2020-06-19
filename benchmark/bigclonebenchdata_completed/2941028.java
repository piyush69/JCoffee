


class c2941028 {
public static MyHelperClass insertModule(ZipInputStream o0, ZipEntry o1, ByteArrayOutputStream o2, String o3, String o4, String o5){ return null; }
//public MyHelperClass insertModule(ZipInputStream o0, ZipEntry o1, ByteArrayOutputStream o2, String o3, String o4, String o5){ return null; }

    private static void insertModuleInEar(File fromEar, File toEar, String moduleType, String moduleName, String contextRoot) throws Exception {
        ZipInputStream earFile = new ZipInputStream(new FileInputStream(fromEar));
        FileOutputStream fos = new FileOutputStream(toEar);
        ZipOutputStream tempZip = new ZipOutputStream(fos);
        ZipEntry next =(ZipEntry)(Object) earFile.getNextEntry();
        while (next != null) {
            ByteArrayOutputStream content = new ByteArrayOutputStream();
            byte[] data = new byte[30000];
            int numberread;
            while ((numberread =(int)(Object) earFile.read(data)) != -1) {
                content.write(data, 0, numberread);
            }
            if (next.getName().equals("META-INF/application.xml")) {
                content =(ByteArrayOutputStream)(Object) insertModule(earFile, next, content, moduleType, moduleName, contextRoot);
                next = new ZipEntry("META-INF/application.xml");
            }
            tempZip.putNextEntry(next);
            tempZip.write(content.toByteArray());
            next =(ZipEntry)(Object) earFile.getNextEntry();
        }
        earFile.close();
        tempZip.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
