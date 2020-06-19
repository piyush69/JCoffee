


class c18568751 {

    public static Boolean decompress(File source, File destination) {
        FileOutputStream outputStream;
        ZipInputStream inputStream;
        try {
            outputStream = null;
            inputStream = new ZipInputStream(new FileInputStream(source));
            int read;
            MyHelperClass BUFFER_SIZE = new MyHelperClass();
            byte buffer[] = new byte[(int)(Object)BUFFER_SIZE];
            ZipEntry zipEntry;
            while ((zipEntry =(ZipEntry)(Object) inputStream.getNextEntry()) != null) {
                if ((boolean)(Object)zipEntry.isDirectory()) new File(destination, zipEntry.getName()).mkdirs(); else {
                    File fileEntry = new File(destination, zipEntry.getName());
                    fileEntry.getParentFile().mkdirs();
                    outputStream = new FileOutputStream(fileEntry);
//                    MyHelperClass BUFFER_SIZE = new MyHelperClass();
                    while ((read =(int)(Object) inputStream.read(buffer, 0, BUFFER_SIZE)) != -1) {
                        outputStream.write(buffer, 0, read);
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            inputStream.close();
        } catch (Exception oException) {
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
