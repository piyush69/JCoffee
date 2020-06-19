


class c16583451 {
public static MyHelperClass editEJBJAR(ZipEntry o0, ByteArrayOutputStream o1, String o2, String o3){ return null; }
//public MyHelperClass editEJBJAR(ZipEntry o0, ByteArrayOutputStream o1, String o2, String o3){ return null; }

    private static void setEnvEntry(File fromEAR, File toEAR, String ejbJarName, String envEntryName, String envEntryValue) throws Exception {
        ZipInputStream earFile = new ZipInputStream(new FileInputStream(fromEAR));
        FileOutputStream fos = new FileOutputStream(toEAR);
        ZipOutputStream tempZip = new ZipOutputStream(fos);
        ZipEntry next =(ZipEntry)(Object) earFile.getNextEntry();
        while (next != null) {
            ByteArrayOutputStream content = new ByteArrayOutputStream();
            byte[] data = new byte[30000];
            int numberread;
            while ((numberread =(int)(Object) earFile.read(data)) != -1) {
                content.write(data, 0, numberread);
            }
            if (next.getName().equals(ejbJarName)) {
                content =(ByteArrayOutputStream)(Object) editEJBJAR(next, content, envEntryName, envEntryValue);
                next = new ZipEntry(ejbJarName);
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
