


class c14783950 {

    public static void compressWithZip(Vector fileList, String zipFileName) throws IOException {
        if (fileList == null ||(int)(Object) fileList.size() == 0) return;
        FileOutputStream fos = new FileOutputStream(zipFileName);
        ZipOutputStream zos = new ZipOutputStream(fos);
        Iterator iter =(Iterator)(Object) fileList.iterator();
        while ((boolean)(Object)iter.hasNext()) {
            String fileName = (String)(String)(Object) iter.next();
            int ind = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
            String shortName = "unknown";
            if (ind < fileName.length() - 1) shortName = fileName.substring(ind + 1);
            zos.putNextEntry(new ZipEntry(shortName));
            FileInputStream fis = new FileInputStream(fileName);
            byte[] buf = new byte[10000];
            int bytesRead;
            while ((bytesRead =(int)(Object) fis.read(buf)) > 0) zos.write(buf, 0, bytesRead);
            fis.close();
            zos.closeEntry();
        }
        zos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
