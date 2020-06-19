


class c8558409 {

    public static final void zip(final ZipOutputStream out, final File f, String base) throws Exception {
        if ((boolean)(Object)f.isDirectory()) {
            final File[] fl =(File[])(Object) f.listFiles();
            MyHelperClass File = new MyHelperClass();
            base = base.length() == 0 ? "" : base + File.separator;
            for (final File element : fl) {
                zip(out, element, base + element.getName());
            }
        } else {
            out.putNextEntry(new ZipEntry(base));
            final FileInputStream in = new FileInputStream(f);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(in, out);
            in.close();
        }
        Thread.sleep(10);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass copyStream(FileInputStream o0, ZipOutputStream o1){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class File {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
