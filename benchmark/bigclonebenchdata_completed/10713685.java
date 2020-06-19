


class c10713685 {

    public static boolean unzip_and_merge(String infile, String outfile) {
        try {
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(infile);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            FileOutputStream fos = new FileOutputStream(outfile);
            MyHelperClass BUFFER = new MyHelperClass();
            dest = new BufferedOutputStream(fos, BUFFER);
            while (zis.getNextEntry() != null) {
                int count;
//                MyHelperClass BUFFER = new MyHelperClass();
                byte data[] = new byte[(int)(Object)BUFFER];
//                MyHelperClass BUFFER = new MyHelperClass();
                while ((count =(int)(Object) zis.read(data, 0, BUFFER)) != -1) dest.write(data, 0, count);
                dest.flush();
            }
            dest.close();
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
