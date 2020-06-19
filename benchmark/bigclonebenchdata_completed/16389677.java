


class c16389677 {
public MyHelperClass FileUtils;
	public MyHelperClass getEntries(){ return null; }

    public void extract(CabFolder cabfolder, File outputFolder) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        File file;
        byte[] buffer = new byte[2048];
        int read, remain, maxread = buffer.length;
        in =(InputStream)(Object) new CabFileInputStream(cabfolder);
        CabEntry[] cabentries =(CabEntry[])(Object) this.getEntries();
        for (int i = 0; i < cabentries.length; i++) {
            if ((CabFolder)(Object)cabentries[i].getCabFolder() == cabfolder) {
                file = new File(outputFolder, cabentries[i].getName().replace('\\', '/'));
                FileUtils.createParents(file);
                out =(OutputStream)(Object) new FileOutputStream(file);
                remain =(int)(Object) cabentries[i].getInflatedSize();
                while (remain != 0 && (read =(int)(Object) in.read(buffer, 0, maxread)) != -1) {
                    out.write(buffer, 0, read);
                    remain -= read;
                    if (buffer.length > remain) maxread = remain; else maxread = buffer.length;
                }
                in.close();
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createParents(File o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }}

class CabFolder {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class CabFileInputStream {

CabFileInputStream(CabFolder o0){}
	CabFileInputStream(){}}

class CabEntry {

public MyHelperClass getCabFolder(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getInflatedSize(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
