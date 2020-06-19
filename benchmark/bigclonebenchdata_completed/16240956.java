


class c16240956 {
public static MyHelperClass extractZip(MyHelperClass o0){ return null; }
public static MyHelperClass JOptionPane;
//	public MyHelperClass extractZip(MyHelperClass o0){ return null; }
//public MyHelperClass JOptionPane;

    public static void copyZip() {
        InputStream is;
        OutputStream os;
        String javacZip = "";
        try {
            MyHelperClass Compilador = new MyHelperClass();
            if ("windows".equalsIgnoreCase((String)(Object)Compilador.getSo())) {
                javacZip = "javacWin.zip";
                is =(InputStream)(Object) UnZip.class.getResourceAsStream("javacWin.zip");
//            MyHelperClass Compilador = new MyHelperClass();
            } else if ("linux".equalsIgnoreCase((String)(Object)Compilador.getSo())) {
                javacZip = "javacLinux.zip";
                is =(InputStream)(Object) UnZip.class.getResourceAsStream("javacLinux.zip");
            }
            is =(InputStream)(Object) UnZip.class.getResourceAsStream(javacZip);
            MyHelperClass File = new MyHelperClass();
            File tempZip =(File)(Object) File.createTempFile("tempJavacJTraductor", ".zip");
            tempZip.mkdir();
            tempZip.deleteOnExit();
            MyHelperClass FileUtils = new MyHelperClass();
            os =(OutputStream)(Object) FileUtils.openOutputStream(tempZip);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            is.close();
            os.close();
            extractZip(tempZip.getPath());
        } catch (Exception ex) {
            MyHelperClass PseutemView = new MyHelperClass();
            JOptionPane.showMessageDialog(PseutemView.mainPanel, "Error al copiar los archivos temporales necesarios para ejecutar el programa:\n\n" + ex, "Error copiando.", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass mainPanel;
public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass getSo(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class UnZip {

}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass mkdir(){ return null; }}
