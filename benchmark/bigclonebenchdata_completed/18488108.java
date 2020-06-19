


class c18488108 {

    public static void saveZipComponents(ZipComponents zipComponents, File zipFile) throws FileNotFoundException, IOException, Exception {
        ZipOutputStream zipOutStream = new ZipOutputStream(new FileOutputStream(zipFile));
        for (ZipComponent comp :(ZipComponent[])(Object) (Object[])(Object)zipComponents.getComponents()) {
            ZipEntry newEntry = new ZipEntry(comp.getName());
            zipOutStream.putNextEntry(newEntry);
            if ((boolean)(Object)comp.isDirectory()) {
            } else {
                if ((Boolean)(Object)comp.getName().endsWith("document.xml") || (Boolean)(Object)comp.getName().endsWith("document.xml.rels")) {
                }
                InputStream inputStream =(InputStream)(Object) comp.getInputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, zipOutStream);
                inputStream.close();
            }
        }
        zipOutStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class ZipComponents {

public MyHelperClass getComponents(){ return null; }}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(FileOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class ZipComponent {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(MyHelperClass o0){}}

class InputStream {

public MyHelperClass close(){ return null; }}
