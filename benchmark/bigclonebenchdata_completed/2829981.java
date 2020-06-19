


class c2829981 {
public MyHelperClass println(String o0){ return null; }

    public void copyFile() throws Exception {
        SmbFile file = new SmbFile("smb://elsa:elsa@elsa/Elsa/Desktop/Ficheiros2/04-04-2066/How To Make a Flash Preloader.doc");
        println("length: " + file.length());
        SmbFileInputStream in = new SmbFileInputStream(file);
        println("available: " + in.available());
        File dest = new File("C:\\Documents and Settings\\Carlos\\Desktop\\Flash Preloader.doc");
        FileOutputStream out = new FileOutputStream(dest);
        int buffer_length = 1024;
        byte[] buffer = new byte[buffer_length];
        while (true) {
            int bytes_read =(int)(Object) in.read(buffer, 0, buffer_length);
            if (bytes_read <= 0) {
                break;
            }
            out.write(buffer, 0, bytes_read);
        }
        in.close();
        out.close();
        println("done.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SmbFile {

SmbFile(String o0){}
	SmbFile(){}
	public MyHelperClass length(){ return null; }}

class SmbFileInputStream {

SmbFileInputStream(){}
	SmbFileInputStream(SmbFile o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
