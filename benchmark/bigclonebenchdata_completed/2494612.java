


class c2494612 {
public MyHelperClass log;
	public MyHelperClass jsdir;
	public MyHelperClass Arrays;
	public MyHelperClass listJavascript(){ return null; }

        private void update() throws IOException {
            MyHelperClass combined = new MyHelperClass();
            FileOutputStream out = new FileOutputStream(combined);
            try {
                File[] _files =(File[])(Object) listJavascript();
                List files =(List)(Object) new ArrayList(Arrays.asList(_files));
                files.add(0, new File(jsdir.getAbsolutePath() + "/leemba.js"));
                files.add(0, new File(jsdir.getAbsolutePath() + "/jquery.min.js"));
                for (File js :(File[])(Object) (Object[])(Object)files) {
                    FileInputStream fin = null;
                    try {
                        int count = 0;
                        byte buf[] = new byte[16384];
                        fin = new FileInputStream(js);
                        while ((count =(int)(Object) fin.read(buf)) > 0) out.write(buf, 0, count);
                    } catch (Throwable t) {
                        log.error("Failed to read file: " + js.getAbsolutePath(), t);
                    } finally {
                        if (fin != null) fin.close();
                    }
                }
            } finally {
                out.close();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass asList(File[] o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class List {

public MyHelperClass add(int o0, File o1){ return null; }}

class ArrayList {

ArrayList(MyHelperClass o0){}
	ArrayList(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
