


class c6214338 {

    private File unzipArchive(File zipArchive, File outDir, String nameInZipArchive) throws IOException {
        File mainFile = null;
        ZipEntry entry = null;
        ZipInputStream zis = new ZipInputStream(new FileInputStream((zipArchive)));
        FileOutputStream fos = null;
        byte buffer[] = new byte[4096];
        int bytesRead;
        while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
            File outFile = new File(outDir, entry.getName());
            if (entry.getName().equals(nameInZipArchive)) mainFile = outFile;
            fos = new FileOutputStream(outFile);
            while ((bytesRead =(int)(Object) zis.read(buffer)) != -1) fos.write(buffer, 0, bytesRead);
            fos.close();
        }
        zis.close();
        return mainFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

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
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
