


class c10912336 {
public MyHelperClass[] meses;
public MyHelperClass obtenerCantidad(){ return null; }
	public MyHelperClass identificarDato(MyHelperClass o0){ return null; }
public MyHelperClass table;
	public MyHelperClass mesTemporal;
	public MyHelperClass anoTemporal;
//	public MyHelperClass meses;
	public MyHelperClass datoSeleccionado;
	public MyHelperClass JOptionPane;
	public MyHelperClass verRecordatorioInterfaz(String o0, String o1, String o2){ return null; }

    public void verRecordatorio() {
        try {
            int cantidadArchivos;// = new int();
            cantidadArchivos =(int)(Object) obtenerCantidad() + 1;
            boolean existe = false;
            String filenametxt = "";
            String filenamezip = "";
            String hora = "";
            String lugar = "";
            String actividad = "";
            String linea = "";
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
                MyHelperClass datoSeleccionado = new MyHelperClass();
                if (dia == Integer.parseInt((String)(Object)identificarDato(datoSeleccionado))) {
                    existe = true;
                    hora =(String)(Object) input.readLine();
                    lugar =(String)(Object) input.readLine();
                    while ((linea =(String)(Object) input.readLine()) != null) actividad += linea + "\n";
                    verRecordatorioInterfaz(hora, lugar, actividad);
                    hora = "";
                    lugar = "";
                    actividad = "";
                }
                input.close();
            }
            if (!existe) JOptionPane.showMessageDialog(null, "No existe un recordatorio guardado\n" + "para el " + identificarDato(datoSeleccionado) + " de " + meses[(int)(Object)mesTemporal].toLowerCase() + " del a�o " + anoTemporal, "No existe", JOptionPane.INFORMATION_MESSAGE);
            table.clearSelection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass clearSelection(){ return null; }
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
