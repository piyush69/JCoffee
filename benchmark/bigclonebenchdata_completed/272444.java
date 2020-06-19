


class c272444 {

    public static void main(String[] args) {
        boolean rotateLeft = false;
        boolean rotateRight = false;
        boolean exclude = false;
        boolean reset = false;
        float quality = 0f;
        int thumbArea = 12000;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-rotl")) rotateLeft = true; else if (args[i].equals("-rotr")) rotateRight = true; else if (args[i].equals("-exclude")) exclude = true; else if (args[i].equals("-reset")) reset = true; else if (args[i].equals("-quality")) quality = Float.parseFloat(args[++i]); else if (args[i].equals("-area")) thumbArea = Integer.parseInt(args[++i]); else {
                File f = new File(args[i]);
                try {
                    Tools t = new Tools(f);
                    if (exclude) {
                        URL url =(URL)(Object) t.getClass().getResource("exclude.jpg");
                        InputStream is =(InputStream)(Object) url.openStream();
                        File dest =(File)(Object) t.getExcludeFile();
                        OutputStream os =(OutputStream)(Object) new FileOutputStream(dest);
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len =(int)(Object) is.read(buf)) > 0) os.write(buf, 0, len);
                        os.close();
                        is.close();
                        t.getOutFile().delete();
                        t.getThumbFile().delete();
                        System.exit(0);
                    }
                    if (reset) {
                        t.getOutFile().delete();
                        t.getThumbFile().delete();
                        t.getExcludeFile().delete();
                        System.exit(0);
                    }
                    if (quality > 0) t.setQuality(quality);
                    MyHelperClass Tools = new MyHelperClass();
                    if (t.getType() == Tools.THUMB || t.getType() == Tools.EXCLUDE) t.load(t.getBaseFile()); else t.load(t.getSourceFile());
                    File out =(File)(Object) t.getOutFile();
                    if (rotateLeft) t.rotateLeft(); else if (rotateRight) t.rotateRight();
                    t.save(out);
                    t.getExcludeFile().delete();
                    t.getThumbFile().delete();
                    System.exit(0);
                } catch (Throwable e) {
                    e.printStackTrace();
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "The operation could not be performed", "JPhotoAlbum", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass THUMB;
	public MyHelperClass EXCLUDE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass delete(){ return null; }}

class File {

File(String o0){}
	File(){}}

class Tools {

Tools(){}
	Tools(File o0){}
	public MyHelperClass getOutFile(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getSourceFile(){ return null; }
	public MyHelperClass save(File o0){ return null; }
	public MyHelperClass getThumbFile(){ return null; }
	public MyHelperClass setQuality(float o0){ return null; }
	public MyHelperClass rotateRight(){ return null; }
	public MyHelperClass rotateLeft(){ return null; }
	public MyHelperClass getBaseFile(){ return null; }
	public MyHelperClass getExcludeFile(){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
