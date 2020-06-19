


class c5271061 {

    private void createJarArchive(File archiveFile, List filesToBeJared, File base) throws Exception {
        FileOutputStream stream = new FileOutputStream(archiveFile);
        JarOutputStream out = new JarOutputStream(stream);
        for (File tobeJared :(File[])(Object) (Object[])(Object)filesToBeJared) {
            if (tobeJared == null || !(Boolean)(Object)tobeJared.exists() || (boolean)(Object)tobeJared.isDirectory()) continue;
            String entryName =(String)(Object) tobeJared.getAbsolutePath().substring((int)(Object)base.getAbsolutePath().length() + 1).replace("\\", "/");
            JarEntry jarEntry = new JarEntry(entryName);
            jarEntry.setTime(tobeJared.lastModified());
            out.putNextEntry(jarEntry);
            FileInputStream in = new FileInputStream(tobeJared);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
            out.closeEntry();
        }
        out.close();
        stream.close();
        System.out.println("Generated file: " + archiveFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, JarOutputStream o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class List {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class JarOutputStream {

JarOutputStream(FileOutputStream o0){}
	JarOutputStream(){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}
	public MyHelperClass setTime(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
