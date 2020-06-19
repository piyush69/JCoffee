


class c12226563 {
public MyHelperClass Utils;
public MyHelperClass gen;
	public MyHelperClass res;
	public MyHelperClass basePath;
	public MyHelperClass JOptionPane;
	public MyHelperClass dic;
	public MyHelperClass frame;
	public MyHelperClass setVisible(boolean o0){ return null; }

    public void run() {
        Vector updates = new Vector();
        MyHelperClass dic = new MyHelperClass();
        if (dic != null) updates.add(dic);
        MyHelperClass gen = new MyHelperClass();
        if (gen != null) updates.add(gen);
        MyHelperClass res = new MyHelperClass();
        if (res != null) updates.add(res);
        MyHelperClass help = new MyHelperClass();
        if (help != null) updates.add(help);
        for (Iterator iterator =(Iterator)(Object) updates.iterator();(boolean)(Object) iterator.hasNext(); ) {
            Update update = (Update)(Update)(Object) iterator.next();
            try {
                MyHelperClass File = new MyHelperClass();
                File temp =(File)(Object) File.createTempFile("fm_" + update.getType(), ".jar");
                temp.deleteOnExit();
                FileOutputStream out = new FileOutputStream(temp);
                URL url = new URL(update.getAction());
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                Utils.setupProxy(conn);
                InputStream in =(InputStream)(Object) conn.getInputStream();
                byte[] buffer = new byte[1024];
                int read = 0;
                int total = 0;
                while ((read =(int)(Object) in.read(buffer)) != -1) {
                    out.write(buffer, 0, read);
                    total += read;
                    if (total > 10000) {
                        MyHelperClass progressBar = new MyHelperClass();
                        progressBar.setValue((int)(Object)progressBar.getValue() + total);
                        total = 0;
                    }
                }
                out.close();
                in.close();
                MyHelperClass basePath = new MyHelperClass();
                String fileTo = basePath + "diccionariorimas.jar";
                MyHelperClass Update = new MyHelperClass();
                if (update.getType() == Update.GENERATOR) fileTo = basePath + "generador.jar"; else if (update.getType() == Update.RESBC) fileTo = basePath + "resbc.me"; else if (update.getType() == Update.HELP) fileTo = basePath + "help.html";
//                MyHelperClass Update = new MyHelperClass();
                if (update.getType() == Update.RESBC) {
                    MyHelperClass Utils = new MyHelperClass();
                    Utils.unzip(temp, new File(fileTo));
                } else {
                    MyHelperClass Utils = new MyHelperClass();
                    Utils.copyFile(new FileInputStream(temp), new File(fileTo));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setVisible(false);
        if (gen != null || res != null) {
            try {
                new Main(null, basePath, false);
            } catch (Exception e) {
                new ErrorDialog(frame, e);
            }
        }
        String restart = "";
        if (dic != null) restart += "\nAlgunas de ellas s�lo estar�n disponibles despu�s de reiniciar el diccionario.";
        JOptionPane.showMessageDialog(frame, "Se han terminado de realizar las actualizaciones." + restart, "Actualizaciones", JOptionPane.INFORMATION_MESSAGE);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HELP;
	public MyHelperClass GENERATOR;
	public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass RESBC;
public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass setupProxy(URLConnection o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass unzip(File o0, File o1){ return null; }
	public MyHelperClass copyFile(FileInputStream o0, File o1){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Vector {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class Update {

public MyHelperClass getAction(){ return null; }
	public MyHelperClass getType(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Main {

Main(Object o0, MyHelperClass o1, boolean o2){}
	Main(){}}

class ErrorDialog {

ErrorDialog(){}
	ErrorDialog(MyHelperClass o0, Exception o1){}}
