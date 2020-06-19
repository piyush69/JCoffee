


class c7474020 {
public MyHelperClass fileExistAsChild(File o0, MyHelperClass o1){ return null; }

    protected void copyClassFiles(File initFile, File destFile) {
        if (initFile != null && destFile != null) {
            File[] children =(File[])(Object) initFile.listFiles();
            File childDestinationDirectory = null, destChild = null;
            FileInputStream in = null;
            FileOutputStream out = null;
            FileChannel cin = null, cout = null;
            for (File child : children) {
                if (child != null) {
                    if ((boolean)(Object)child.isDirectory()) {
                        childDestinationDirectory =(File)(Object) fileExistAsChild(destFile, child.getName());
                        if (childDestinationDirectory == null) {
                            try {
                                childDestinationDirectory = new File(destFile, child.getName());
                                childDestinationDirectory.mkdir();
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                        copyClassFiles(child, childDestinationDirectory);
                    } else {
                        try {
                            destChild = new File(destFile, child.getName());
                            in = new FileInputStream(child);
                            out = new FileOutputStream(destChild);
                            cin =(FileChannel)(Object) in.getChannel();
                            cout =(FileChannel)(Object) out.getChannel();
                            MyHelperClass ByteBuffer = new MyHelperClass();
                            ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1000);
                            int pos = 0;
                            while ((int)(Object)cin.position() < (int)(Object)cin.size()) {
                                pos =(int)(Object) cin.read(buffer);
                                if (pos > 0) {
                                    cout.write(buffer);
                                }
                            }
                            cin.close();
                            cout.close();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

}
