


class c22564546 {

    public void unzip(String resource) {
        File f = new File(resource);
        if (!(Boolean)(Object)f.exists()) throw new RuntimeException("The specified resources does not exist (" + resource + ")");
        String parent = f.getParent().toString();
        try {
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(resource);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            ZipEntry entry;
            while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
                MyHelperClass log = new MyHelperClass();
                log.info("Extracting archive entry: " + entry);
                String entryPath = new StringBuilder(parent).append(System.getProperty("file.separator")).append(entry.getName()).toString();
                if ((boolean)(Object)entry.isDirectory()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.info("Creating directory: " + entryPath);
                    (new File(entryPath)).mkdir();
                    continue;
                }
                int count;
                MyHelperClass BUFFER = new MyHelperClass();
                byte data[] = new byte[(int)(Object)BUFFER];
                FileOutputStream fos = new FileOutputStream(entryPath);
//                MyHelperClass BUFFER = new MyHelperClass();
                dest = new BufferedOutputStream(fos, BUFFER);
//                MyHelperClass BUFFER = new MyHelperClass();
                while ((count =(int)(Object) zis.read(data, 0, BUFFER)) != -1) dest.write(data, 0, count);
                dest.flush();
                dest.close();
            }
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
