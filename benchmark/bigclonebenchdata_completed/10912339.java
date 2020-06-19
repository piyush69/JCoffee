


class c10912339 {

    public int obtenerCantidad() {
        try {
            BufferedOutputStream dest = null;
            BufferedInputStream is = null;
            ZipEntry entry;
            ZipFile zipfile = new ZipFile("cantidadArchivos.zip");
            Enumeration e =(Enumeration)(Object) zipfile.entries();
            while ((boolean)(Object)e.hasMoreElements()) {
                entry = (ZipEntry)(ZipEntry)(Object) e.nextElement();
                is = new BufferedInputStream(zipfile.getInputStream(entry));
                int count;
                MyHelperClass buffer = new MyHelperClass();
                byte data[] = new byte[(int)(Object)buffer];
                FileOutputStream fos = new FileOutputStream(entry.getName());
//                MyHelperClass buffer = new MyHelperClass();
                dest = new BufferedOutputStream(fos, buffer);
//                MyHelperClass buffer = new MyHelperClass();
                while ((count =(int)(Object) is.read(data, 0, buffer)) != -1) dest.write(data, 0, count);
                dest.flush();
                dest.close();
                is.close();
            }
            DataInputStream input = new DataInputStream(new FileInputStream("cantidadArchivos.txt"));
            int a = Integer.parseInt((String)(Object)input.readLine());
            input.close();
            return (a);
        } catch (Exception e) {
            return (0);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class DataInputStream {

DataInputStream(FileInputStream o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
