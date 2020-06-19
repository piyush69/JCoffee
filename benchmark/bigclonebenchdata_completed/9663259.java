


class c9663259 {

    private static void checkForUpgrade() {
        try {
            MyHelperClass Log = new MyHelperClass();
            Log.out("Checking for updates...");
            MyHelperClass Settings = new MyHelperClass();
            URL u =(URL)(Object) ClassLoader.getSystemResource((String)(Object)Settings.readme);
            if (u == null) {
//                MyHelperClass Settings = new MyHelperClass();
                u =(URL)(Object) HImage.class.getResource("/" + Settings.readme);
            }
            DataInputStream i = new DataInputStream(u.openStream());
            String tmp =(String)(Object) i.readLine();
            tmp = tmp.substring(tmp.lastIndexOf(">"));
            tmp = tmp.substring(tmp.indexOf(".") + 1);
            tmp = tmp.substring(0, tmp.indexOf("<"));
            int x = Integer.parseInt(tmp) + 1;
            String nextVersion = "jftp-1.";
            if (x < 10) {
                nextVersion = nextVersion + "0";
            }
            nextVersion = nextVersion + x + ".tar.gz";
            File dl = new File(nextVersion);
            if (!(Boolean)(Object)dl.exists() || ((int)(Object)dl.length() <= 0)) {
                URL url = new URL("http://osdn.dl.sourceforge.net/sourceforge/j-ftp/" + nextVersion);
                BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream(dl));
                BufferedInputStream in = new BufferedInputStream(url.openStream());
                byte[] buf = new byte[4096];
                int stat = 1;
//                MyHelperClass Log = new MyHelperClass();
                Log.out("\ndownloading update: " + dl.getAbsolutePath() + "\n\n");
                while (stat > 0) {
                    stat =(int)(Object) in.read(buf);
                    if (stat == -1) {
                        break;
                    }
                    f.write(buf, 0, stat);
                    System.out.print(".");
                }
                f.flush();
                f.close();
                in.close();
            }
//            MyHelperClass Log = new MyHelperClass();
            Log.out("\n\n\na newer version was found!\nplease install the File " + dl.getAbsolutePath() + " or even better visit the homepage to download the latest version...\n" + "you can turn this feature off if you don't like it (view readme for details)\n\nStarting anyway...\n\n");
        } catch (Exception ex) {
        }
        MyHelperClass Log = new MyHelperClass();
        Log.out("finished check...");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass readme;
public MyHelperClass out(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HImage {

}
