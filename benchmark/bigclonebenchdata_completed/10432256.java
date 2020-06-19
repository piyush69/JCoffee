


class c10432256 {
public MyHelperClass convertImage(MyHelperClass o0, File o1){ return null; }

    private void copyImage(ProjectElement e) throws Exception {
        String fn =(String)(Object) e.getName();
        if (!fn.toLowerCase().endsWith(".png")) {
            if (fn.contains(".")) {
                fn = fn.substring(0, fn.lastIndexOf('.')) + ".png";
            } else {
                fn += ".png";
            }
        }
        MyHelperClass resFolder = new MyHelperClass();
        File img = new File(resFolder, fn);
        MyHelperClass resoutFolder = new MyHelperClass();
        File imgz = new File(resoutFolder.getAbsolutePath(), fn + ".zlib");
        boolean copy = true;
        MyHelperClass config = new MyHelperClass();
        if ((Boolean)(Object)img.exists() && (Boolean)(Object)config.containsKey(img.getName())) {
//            MyHelperClass config = new MyHelperClass();
            long modified = Long.parseLong((String)(Object)config.get(img.getName()));
            if (modified >= (long)(Object)img.lastModified()) {
                copy = false;
            }
        }
        if (copy) {
            convertImage(e.getFile(), img);
//            MyHelperClass config = new MyHelperClass();
            config.put(img.getName(), String.valueOf(img.lastModified()));
        }
        DeflaterOutputStream out = new DeflaterOutputStream(new BufferedOutputStream(new FileOutputStream(imgz)));
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(img));
        int read;
        while ((read =(int)(Object) in.read()) != -1) {
            out.write(read);
        }
        out.close();
        in.close();
        MyHelperClass imageFiles = new MyHelperClass();
        imageFiles.add(imgz);
        MyHelperClass imageNames = new MyHelperClass();
        imageNames.put(imgz, e.getName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass add(File o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class ProjectElement {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass getName(){ return null; }}

class DeflaterOutputStream {

DeflaterOutputStream(){}
	DeflaterOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}
