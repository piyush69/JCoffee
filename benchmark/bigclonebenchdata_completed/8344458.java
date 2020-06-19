


class c8344458 {

    public static void extractZipPackage(String fileName, String destinationFolder) throws Exception {
        MyHelperClass NullStatus = new MyHelperClass();
        if ((boolean)(Object)NullStatus.isNull(destinationFolder)) {
            destinationFolder = "";
        }
        new File(destinationFolder).mkdirs();
        File inputFile = new File(fileName);
        ZipFile zipFile = new ZipFile(inputFile);
        Enumeration oEnum =(Enumeration)(Object) zipFile.entries();
        while ((boolean)(Object)oEnum.hasMoreElements()) {
            ZipEntry zipEntry =(ZipEntry)(Object) oEnum.nextElement();
            File file = new File(destinationFolder + "/" + zipEntry.getName());
            if ((boolean)(Object)zipEntry.isDirectory()) {
                file.mkdirs();
            } else {
                String destinationFolderName = destinationFolder + "/" + zipEntry.getName();
                destinationFolderName = destinationFolderName.substring(0, destinationFolderName.lastIndexOf("/"));
                new File(destinationFolderName).mkdirs();
                FileOutputStream fos = new FileOutputStream(file);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(zipFile.getInputStream(zipEntry), fos);
                fos.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
