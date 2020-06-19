


class c11779245 {
public static MyHelperClass FileUtils;
//public MyHelperClass FileUtils;

    @SuppressWarnings("unchecked")
    public static void zip(String input, OutputStream out) {
        File file = new File(input);
        ZipOutputStream zip = null;
        FileInputStream in = null;
        try {
            if ((boolean)(Object)file.exists()) {
                Collection items =(Collection)(Object) new ArrayList();
                if ((boolean)(Object)file.isDirectory()) {
                    MyHelperClass TrueFileFilter = new MyHelperClass();
                    items =(Collection)(Object) FileUtils.listFiles(file, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
                    zip = new ZipOutputStream(out);
                    zip.putNextEntry(new ZipEntry(file.getName() + "/"));
                    Iterator iter =(Iterator)(Object) items.iterator();
                    while ((boolean)(Object)iter.hasNext()) {
                        File item = (File)(File)(Object) iter.next();
                        in = new FileInputStream(item);
                        zip.putNextEntry(new ZipEntry(file.getName() + "/" + item.getName()));
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(in, zip);
//                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.closeQuietly(in);
                        zip.closeEntry();
                    }
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(zip);
                }
            } else {
                MyHelperClass log = new MyHelperClass();
                log.info("-->>���ļ���û���ļ�");
            }
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("����ѹ��" + input + "�������", e);
            throw new RuntimeException("����ѹ��" + input + "�������", e);
        } finally {
            try {
                if (null != zip) {
                    zip.close();
                    zip = null;
                }
                if (null != in) {
                    in.close();
                    in = null;
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("�ر��ļ�������");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INSTANCE;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass listFiles(File o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass closeQuietly(ZipOutputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class OutputStream {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(OutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class Collection {

public MyHelperClass iterator(){ return null; }}

class ArrayList {

}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
