


class c11779246 {

    @SuppressWarnings("unchecked")
    public static void unzip(String input, String output) {
        try {
            if (!output.endsWith("/")) output = output + "/";
            ZipFile zip = new ZipFile(input);
            Enumeration entries =(Enumeration)(Object) zip.entries();
            while ((boolean)(Object)entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry)(ZipEntry)(Object) entries.nextElement();
                if ((boolean)(Object)entry.isDirectory()) {
                    MyHelperClass FileUtils = new MyHelperClass();
                    FileUtils.forceMkdir(new File(output + entry.getName()));
                } else {
                    FileOutputStream out = new FileOutputStream(output + entry.getName());
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(zip.getInputStream(entry), out);
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(out);
                }
            }
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("�����ҵ��ļ�:" + output, e);
            throw new RuntimeException("�����ҵ��ļ�:" + output, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
