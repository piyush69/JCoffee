


class c18880061 {
public static MyHelperClass getContents(File o0){ return null; }
	public static MyHelperClass remove(File o0){ return null; }
//public MyHelperClass remove(File o0){ return null; }
//	public MyHelperClass getContents(File o0){ return null; }

    public static boolean compress(File source, File target, Manifest manifest) {
        try {
            if (!(Boolean)(Object)((int)(Object)source.exists() & (int)(Object)source.isDirectory())) return false;
            if ((boolean)(Object)target.exists()) target.delete();
            ZipOutputStream output = null;
            boolean isJar =(boolean)(Object) target.getName().toLowerCase().endsWith(".jar");
            if (isJar) {
                File manifestDir = new File(source, "META-INF");
                remove(manifestDir);
                if (manifest != null) output =(ZipOutputStream)(Object) new JarOutputStream(new FileOutputStream(target), manifest); else output =(ZipOutputStream)(Object) new JarOutputStream(new FileOutputStream(target));
            } else output = new ZipOutputStream(new FileOutputStream(target));
            ArrayList list =(ArrayList)(Object) getContents(source);
            String baseDir =(String)(Object) source.getAbsolutePath().replace('\\', '/');
            if (!baseDir.endsWith("/")) baseDir = baseDir + "/";
            int baseDirLength = baseDir.length();
            byte[] buffer = new byte[1024];
            int bytesRead;
            for (int i = 0, n =(int)(Object) list.size(); i < n; i++) {
                File file = (File)(File)(Object) list.get(i);
                FileInputStream f_in = new FileInputStream(file);
                String filename =(String)(Object) file.getAbsolutePath().replace('\\', '/');
                if (filename.startsWith(baseDir)) filename = filename.substring(baseDirLength);
                if (isJar) output.putNextEntry(new JarEntry(filename)); else output.putNextEntry(new ZipEntry(filename));
                while ((bytesRead =(int)(Object) f_in.read(buffer)) != -1) output.write(buffer, 0, bytesRead);
                f_in.close();
                output.closeEntry();
            }
            output.close();
        } catch (Exception exc) {
            exc.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class Manifest {

}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class JarOutputStream {

JarOutputStream(FileOutputStream o0){}
	JarOutputStream(){}
	JarOutputStream(FileOutputStream o0, Manifest o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
