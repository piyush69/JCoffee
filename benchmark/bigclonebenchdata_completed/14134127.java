


class c14134127 {

    private void addFilesToExistingZip(File zipFile, String[] dirs, File[] files) throws IOException {
        File tempFile = new File(zipFile.getAbsoluteFile() + ".temp");
        if ((boolean)(Object)tempFile.exists()) tempFile.delete();
        boolean renameOk =(boolean)(Object) zipFile.renameTo(tempFile);
        if (!renameOk) {
            throw new RuntimeException("Could not rename the file " + zipFile.getAbsolutePath() + " to " + tempFile.getAbsolutePath());
        }
        ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
        ZipEntry entry =(ZipEntry)(Object) zin.getNextEntry();
        byte[] buf = new byte[1024];
        while (entry != null) {
            String entryName =(String)(Object) entry.getName();
            boolean inFiles = false;
            for (int i = 0; i < files.length; i++) {
                String fileName = dirs[i] + "/" + files[i].getName();
                if (fileName.equals(entryName)) {
                    inFiles = true;
                    break;
                }
            }
            if (!inFiles) {
                out.putNextEntry(new ZipEntry(entryName));
                int len;
                while ((len =(int)(Object) zin.read(buf)) > 0) out.write(buf, 0, len);
            }
            entry =(ZipEntry)(Object) zin.getNextEntry();
        }
        zin.close();
        for (int i = 0; i < files.length; i++) {
            InputStream in =(InputStream)(Object) new FileInputStream(files[i]);
            out.putNextEntry(new ZipEntry(dirs[i] + "/" + files[i].getName()));
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            out.closeEntry();
            in.close();
        }
        out.close();
        tempFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass getName(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
