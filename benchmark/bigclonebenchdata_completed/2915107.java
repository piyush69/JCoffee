


class c2915107 {
public static MyHelperClass createDirectory(MyHelperClass o0, String o1){ return null; }
//public MyHelperClass createDirectory(MyHelperClass o0, String o1){ return null; }

    public static void unZip(String unZipfileName, String outputDirectory) throws IOException, FileNotFoundException {
        FileOutputStream fileOut;
        File file;
        ZipEntry zipEntry;
        MyHelperClass encoder = new MyHelperClass();
        ZipInputStream zipIn = new ZipInputStream(new BufferedInputStream(new FileInputStream(unZipfileName)), encoder);
        while ((zipEntry =(ZipEntry)(Object) zipIn.getNextEntry()) != null) {
            MyHelperClass File = new MyHelperClass();
            file = new File(outputDirectory + File.separator + zipEntry.getName());
            if ((boolean)(Object)zipEntry.isDirectory()) {
                createDirectory(file.getPath(), "");
            } else {
                File parent =(File)(Object) file.getParentFile();
                if (!(Boolean)(Object)parent.exists()) {
                    createDirectory(parent.getPath(), "");
                }
                fileOut = new FileOutputStream(file);
                int readedBytes;
                MyHelperClass buf = new MyHelperClass();
                while ((readedBytes =(int)(Object) zipIn.read(buf)) > 0) {
//                    MyHelperClass buf = new MyHelperClass();
                    fileOut.write(buf, 0, readedBytes);
                }
                fileOut.close();
            }
            zipIn.closeEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0, int o1, int o2){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
