


class c19309971 {

    private static void copyFile(String src, String dest) {
        try {
            File inputFile = new File(src);
            File outputFile = new File(dest);
            FileInputStream in = new FileInputStream(inputFile);
            FileOutputStream out = new FileOutputStream(outputFile);
            FileChannel inc =(FileChannel)(Object) in.getChannel();
            FileChannel outc =(FileChannel)(Object) out.getChannel();
            inc.transferTo(0, inc.size(), outc);
            inc.close();
            outc.close();
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

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
