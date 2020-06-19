


class c15515642 {

    public static void copyFile(String inName, String otName) throws Exception {
        File inFile = null;
        File otFile = null;
        try {
            inFile = new File(inName);
            otFile = new File(otName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (inFile == null || otFile == null) return;
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
        FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(otFile).getChannel());
        sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        sourceChannel.close();
        destinationChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
