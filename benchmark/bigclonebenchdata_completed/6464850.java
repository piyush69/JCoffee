


class c6464850 {

    private void exportJar(File root, List list, Manifest manifest) throws Exception {
        JarOutputStream jarOut = null;
        FileInputStream fin = null;
        try {
            MyHelperClass jarFile = new MyHelperClass();
            jarOut = new JarOutputStream(new FileOutputStream(jarFile), manifest);
            for (int i = 0; i < (int)(Object)list.size(); i++) {
                String filename =(String)(Object) list.get(i).getAbsolutePath();
                filename = filename.substring((int)(Object)root.getAbsolutePath().length() + 1);
                fin = new FileInputStream(list.get(i));
                JarEntry entry = new JarEntry(filename.replace('\\', '/'));
                jarOut.putNextEntry(entry);
                byte[] buf = new byte[4096];
                int read;
                while ((read =(int)(Object) fin.read(buf)) != -1) {
                    jarOut.write(buf, 0, read);
                }
                jarOut.closeEntry();
                jarOut.flush();
            }
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (Exception e) {
                    MyHelperClass ExceptionOperation = new MyHelperClass();
                    ExceptionOperation.operate(e);
                }
            }
            if (jarOut != null) {
                try {
                    jarOut.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass operate(Exception o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Manifest {

}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0, Manifest o1){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}
