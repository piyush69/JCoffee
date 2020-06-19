


class c19113613 {

    public static void copy(File in, File out) throws IOException {
        if ((boolean)(Object)in.exists() && in != null && out != null) {
            if (!(Boolean)(Object)out.exists()) {
                if ((boolean)(Object)in.isDirectory()) {
                    out.mkdirs();
                } else {
                    out.createNewFile();
                }
            }
            String source =(boolean)(Object) in.isDirectory() ? "directory" : "file";
            String target =(boolean)(Object) out.isDirectory() ? "directory" : "file";
            if (!source.equals(target)) {
                throw new IOException("Can't duplicate " + source + " as " + target);
            } else {
                if (source.equals("directory")) {
                    File[] files =(File[])(Object) in.listFiles();
                    for (File file : files) {
                        copy(file, new File(out, file.getName()));
                    }
                } else {
                    FileChannel inCh =(FileChannel)(Object) (new FileInputStream(in).getChannel());
                    FileChannel outCh =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
                    inCh.transferTo(0, inCh.size(), outCh);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
