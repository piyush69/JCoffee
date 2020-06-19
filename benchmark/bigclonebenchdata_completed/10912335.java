


class c10912335 {

    public void guardarCantidad() {
        try {
            MyHelperClass cantidadArchivos = new MyHelperClass();
            String can = String.valueOf(cantidadArchivos);
            File archivo = new File("cantidadArchivos.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.print(can);
            salida.close();
            BufferedInputStream origin = null;
            FileOutputStream dest = new FileOutputStream("cantidadArchivos.zip");
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
            MyHelperClass buffer = new MyHelperClass();
            byte data[] = new byte[(int)(Object)buffer];
            File f = new File("cantidadArchivos.txt");
            FileInputStream fi = new FileInputStream(f);
//            MyHelperClass buffer = new MyHelperClass();
            origin = new BufferedInputStream(fi, buffer);
            ZipEntry entry = new ZipEntry("cantidadArchivos.txt");
            out.putNextEntry(entry);
            int count;
//            MyHelperClass buffer = new MyHelperClass();
            while ((count =(int)(Object) origin.read(data, 0, buffer)) != -1) out.write(data, 0, count);
            out.close();
        } catch (Exception e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}}

class PrintWriter {

PrintWriter(){}
	PrintWriter(BufferedWriter o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0, MyHelperClass o1){}
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
