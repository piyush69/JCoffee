


class c5142039 {

    public static String uncompress(String readPath, boolean mkdir) throws Exception {
        ZipArchiveInputStream arcInputStream = new ZipArchiveInputStream(new FileInputStream(readPath));
        BufferedInputStream bis = new BufferedInputStream(arcInputStream);
        File baseDir =(File)(Object) (new File(readPath).getParentFile());
        String basePath = baseDir.getPath() + "/";
        if (mkdir) {
            String[] schema = readPath.split("/");
            String baseName = schema[schema.length - 1].replaceAll(".zip", "");
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.forceMkdir(new File(basePath + baseName));
            basePath = basePath + baseName + "/";
        }
        ArchiveEntry entry;
        while ((entry =(ArchiveEntry)(Object) arcInputStream.getNextEntry()) != null) {
            if ((boolean)(Object)entry.isDirectory()) {
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.forceMkdir(new File(basePath + entry.getName()));
            } else {
                String writePath = basePath + entry.getName();
                MyHelperClass FilenameUtils = new MyHelperClass();
                String dirName =(String)(Object) FilenameUtils.getPath(writePath);
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.forceMkdir(new File(dirName));
//                MyHelperClass FileUtils = new MyHelperClass();
                BufferedOutputStream bos = new BufferedOutputStream(FileUtils.openOutputStream(new File(writePath)));
                int i = 0;
                while ((i =(int)(Object) bis.read()) != -1) {
                    bos.write(i);
                }
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(bos);
            }
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(bis);
        return basePath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPath(String o0){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass closeQuietly(BufferedInputStream o0){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }}

class ZipArchiveInputStream {

ZipArchiveInputStream(){}
	ZipArchiveInputStream(FileInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(ZipArchiveInputStream o0){}
	public MyHelperClass read(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class ArchiveEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(int o0){ return null; }}
