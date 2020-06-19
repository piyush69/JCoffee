


class c10432260 {
public MyHelperClass compFrame;
	public MyHelperClass CompilationProfile;
	public MyHelperClass outputFile;

    private void appendArchive() throws Exception {
        String cmd;
        MyHelperClass profile = new MyHelperClass();
        if (profile == CompilationProfile.UNIX_GCC) {
            cmd = "cat";
//        MyHelperClass profile = new MyHelperClass();
        } else if (profile == CompilationProfile.MINGW_WINDOWS) {
            cmd = "type";
        } else {
//            MyHelperClass profile = new MyHelperClass();
            throw new Exception("Unknown cat equivalent for profile " + profile);
        }
        MyHelperClass imageArchive = new MyHelperClass();
        compFrame.writeLine("<span style='color: green;'>" + cmd + " \"" + imageArchive.getAbsolutePath() + "\" >> \"" + outputFile.getAbsolutePath() + "\"</span>");
        MyHelperClass outputFile = new MyHelperClass();
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile, true));
//        MyHelperClass imageArchive = new MyHelperClass();
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(imageArchive));
        int read;
        while ((read =(int)(Object) in.read()) != -1) {
            out.write(read);
        }
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MINGW_WINDOWS;
	public MyHelperClass UNIX_GCC;
public MyHelperClass writeLine(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0, boolean o1){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
