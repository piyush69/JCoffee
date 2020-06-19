


class c10912333 {
public int cantidadArchivos;
	public MyHelperClass identificarDato(MyHelperClass o0){ return null; }
public MyHelperClass lugarT;
	public MyHelperClass table;
	public MyHelperClass actividadT;
	public MyHelperClass buffer;
	public MyHelperClass datoSeleccionado;
//	public MyHelperClass cantidadArchivos;
	public MyHelperClass anoTemporal;
	public MyHelperClass horaT;
	public MyHelperClass JOptionPane;
	public MyHelperClass marco;
	public MyHelperClass mesTemporal;
	public MyHelperClass establecerMarca(){ return null; }
	public MyHelperClass guardarCantidad(){ return null; }
	public MyHelperClass espaciosLlenos(){ return null; }

    public void guardarRecordatorio() {
        try {
            if ((boolean)(Object)espaciosLlenos()) {
                guardarCantidad();
                String dat = "";
                String filenametxt = String.valueOf("recordatorio" + cantidadArchivos + ".txt");
                String filenamezip = String.valueOf("recordatorio" + cantidadArchivos + ".zip");
                cantidadArchivos++;
                dat += identificarDato(datoSeleccionado) + "\n";
                dat += String.valueOf(mesTemporal) + "\n";
                dat += String.valueOf(anoTemporal) + "\n";
                dat += horaT.getText() + "\n";
                dat += lugarT.getText() + "\n";
                dat += actividadT.getText() + "\n";
                File archivo = new File(filenametxt);
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter salida = new PrintWriter(bw);
                salida.print(dat);
                salida.close();
                BufferedInputStream origin = null;
                FileOutputStream dest = new FileOutputStream(filenamezip);
                ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
                byte data[] = new byte[(int)(Object)buffer];
                File f = new File(filenametxt);
                FileInputStream fi = new FileInputStream(f);
                origin = new BufferedInputStream(fi, buffer);
                ZipEntry entry = new ZipEntry(filenametxt);
                out.putNextEntry(entry);
                int count;
                while ((count =(int)(Object) origin.read(data, 0, buffer)) != -1) out.write(data, 0, count);
                out.close();
                JOptionPane.showMessageDialog(null, "El recordatorio ha sido guardado con exito", "Recordatorio Guardado", JOptionPane.INFORMATION_MESSAGE);
                marco.hide();
                marco.dispose();
                establecerMarca();
                table.clearSelection();
            } else JOptionPane.showMessageDialog(null, "Debe llenar los espacios de Hora, Lugar y Actividad", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass clearSelection(){ return null; }
	public MyHelperClass hide(){ return null; }
	public MyHelperClass getText(){ return null; }}

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
