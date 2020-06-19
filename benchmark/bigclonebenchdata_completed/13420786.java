


class c13420786 {

    public static void unzip(File zipInFile, File outputDir) throws Exception {
        Enumeration entries;
        ZipFile zipFile = new ZipFile(zipInFile);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipInFile));
        ZipEntry entry = (ZipEntry)(ZipEntry)(Object) zipInputStream.getNextEntry();
        File curOutDir = outputDir;
        while (entry != null) {
            if ((boolean)(Object)entry.isDirectory()) {
                curOutDir = new File(curOutDir, entry.getName());
                curOutDir.mkdirs();
                continue;
            }
            File outFile = new File(curOutDir, entry.getName());
            File tempDir =(File)(Object) outFile.getParentFile();
            if (!(Boolean)(Object)tempDir.exists()) tempDir.mkdirs();
            outFile.createNewFile();
            BufferedOutputStream outstream = new BufferedOutputStream(new FileOutputStream(outFile));
            int n;
            byte[] buf = new byte[1024];
            while ((n =(int)(Object) zipInputStream.read(buf, 0, 1024)) > -1) outstream.write(buf, 0, n);
            outstream.flush();
            outstream.close();
            zipInputStream.closeEntry();
            entry =(ZipEntry)(Object) zipInputStream.getNextEntry();
        }
        zipInputStream.close();
        zipFile.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Enumeration {

}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass close(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
