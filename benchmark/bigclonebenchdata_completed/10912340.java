


class c10912340 {
public MyHelperClass obtenerCantidad(){ return null; }

    public boolean chequearMarca(int a, int m, int d) {
        boolean existe = false;
        try {
            int cantidadArchivos;// = new int();
            cantidadArchivos =(int)(Object) obtenerCantidad() + 1;
            String filenametxt = "";
            String filenamezip = "";
            int dia = 0;
            int mes = 0;
            int ano = 0;
//            MyHelperClass cantidadArchivos = new MyHelperClass();
            for (int i = 1; i < (int)(Object)cantidadArchivos; i++) {
                filenamezip = "recordatorio" + i + ".zip";
                filenametxt = "recordatorio" + i + ".txt";
                BufferedOutputStream dest = null;
                BufferedInputStream is = null;
                ZipEntry entry;
                ZipFile zipfile = new ZipFile(filenamezip);
                Enumeration e =(Enumeration)(Object) zipfile.entries();
                while ((boolean)(Object)e.hasMoreElements()) {
                    entry = (ZipEntry)(ZipEntry)(Object) e.nextElement();
                    is = new BufferedInputStream(zipfile.getInputStream(entry));
                    int count;
                    MyHelperClass buffer = new MyHelperClass();
                    byte data[] = new byte[(int)(Object)buffer];
                    FileOutputStream fos = new FileOutputStream(entry.getName());
//                    MyHelperClass buffer = new MyHelperClass();
                    dest = new BufferedOutputStream(fos, buffer);
//                    MyHelperClass buffer = new MyHelperClass();
                    while ((count =(int)(Object) is.read(data, 0, buffer)) != -1) dest.write(data, 0, count);
                    dest.flush();
                    dest.close();
                    is.close();
                }
                DataInputStream input = new DataInputStream(new FileInputStream(filenametxt));
                dia = Integer.parseInt((String)(Object)input.readLine());
                mes = Integer.parseInt((String)(Object)input.readLine());
                ano = Integer.parseInt((String)(Object)input.readLine());
                if (ano == a && mes == m && dia == d) existe = true;
                input.close();
            }
        } catch (Exception e) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return (existe);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
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

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}}

class DataInputStream {

DataInputStream(){}
	DataInputStream(FileInputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
