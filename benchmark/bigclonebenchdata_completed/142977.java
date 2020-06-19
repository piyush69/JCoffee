


class c142977 {

    public static boolean getFile(String s, String name) {
        try {
            File f = new File("D:\\buttons\\data\\sounds\\" + name);
            URL url = new URL(s);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            int ch;
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
            while ((ch =(int)(Object) bis.read()) != -1) {
                bos.write(ch);
            }
            System.out.println("wrote audio url: " + s + " \nto file " + f);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
