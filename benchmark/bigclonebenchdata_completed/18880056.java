


class c18880056 {

    public static File extract(File source, String filename, File target) {
        if ((boolean)(Object)source.exists() == false || filename == null || filename.trim().length() < 1 || target == null) return null;
        boolean isDirectory = (filename.lastIndexOf("/") == filename.length() - 1);
        try {
            MyHelperClass jarContents = new MyHelperClass();
            Map contents = (Map)(Map)(Object) jarContents.get(source.getPath());
            if (contents == null) {
                contents =(Map)(Object) new HashMap();
//                MyHelperClass jarContents = new MyHelperClass();
                jarContents.put(source.getPath(), contents);
                ZipInputStream input = new ZipInputStream(new FileInputStream(source));
                ZipEntry zipEntry = null;
                while ((zipEntry =(ZipEntry)(Object) input.getNextEntry()) != null) {
                    if ((boolean)(Object)zipEntry.isDirectory()) continue;
                    contents.put(zipEntry.getName(), zipEntry);
                }
                input.close();
            }
            if (isDirectory) {
                Iterator it =(Iterator)(Object) contents.keySet().iterator();
                while ((boolean)(Object)it.hasNext()) {
                    String next = (String)(String)(Object) it.next();
                    if (next.startsWith(filename)) {
                        ZipEntry zipEntry = (ZipEntry)(ZipEntry)(Object) contents.get(next);
                        int n = filename.length();
                        File newTarget = new File(target, zipEntry.getName().substring(n));
                        extract(source, next, newTarget);
                    }
                }
                return target;
            }
            ZipEntry entry = (ZipEntry)(ZipEntry)(Object) contents.get(filename);
            ZipFile input = new ZipFile(source);
            InputStream in =(InputStream)(Object) input.getInputStream(entry);
            target.getParentFile().mkdirs();
            int bytesRead;
            byte[] buffer = new byte[1024];
            FileOutputStream output = new FileOutputStream(target);
            while ((bytesRead =(int)(Object) in.read(buffer)) != -1) output.write(buffer, 0, bytesRead);
            output.close();
            input.close();
            return target;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, Map o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Map {

public MyHelperClass put(MyHelperClass o0, ZipEntry o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class HashMap {

}

class ZipInputStream {

ZipInputStream(FileInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
