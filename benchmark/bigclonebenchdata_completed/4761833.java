


class c4761833 {
public MyHelperClass frame;

    private void copyFileToDir(MyFile file, MyFile to, wlPanel panel) throws IOException {
        MyHelperClass Utilities = new MyHelperClass();
        Utilities.print("started copying " + file.getAbsolutePath() + "\n");
        FileOutputStream fos = new FileOutputStream(new File(to.getAbsolutePath()));
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        FileInputStream fis = new FileInputStream(new File(file.getAbsolutePath()));
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        Date d1 = new Date();
        MyHelperClass rest = new MyHelperClass();
        long amount =(long)(Object) foc.transferFrom(fic, rest,(int)(Object) fic.size() - (int)(Object)rest);
        fic.close();
        foc.force(false);
        foc.close();
        Date d2 = new Date();
        long time =(int)(Object) d2.getTime() - (int)(Object)d1.getTime();
        double secs = time / 1000.0;
        double rate = amount / secs;
//        MyHelperClass Utilities = new MyHelperClass();
        frame.getStatusArea().append(secs + "s " + "amount: " + Utilities.humanReadable(amount) + " rate: " + Utilities.humanReadable(rate) + "/s\n", "black");
        panel.updateView();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass humanReadable(long o0){ return null; }
	public MyHelperClass append(String o0, String o1){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass getStatusArea(){ return null; }
	public MyHelperClass humanReadable(double o0){ return null; }}

class MyFile {

public MyHelperClass getAbsolutePath(){ return null; }}

class wlPanel {

public MyHelperClass updateView(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, MyHelperClass o1, int o2){ return null; }
	public MyHelperClass force(boolean o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}
