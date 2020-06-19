


class c17156131 {

    private static void readAndWriteFile(File source, File target) {
        try {
            FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(target);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
