


class c10936821 {

//    @Override
    public void doIt() {
        try {
            MyHelperClass Shared = new MyHelperClass();
            Shared.createBackup("articulo precio codigo_de_barras costo movimiento_inventario detalles_movimientos");
            MyHelperClass mode = new MyHelperClass();
            if (mode.equals("FTP")) {
                FTPClient client = new FTPClient();
                MyHelperClass Constants = new MyHelperClass();
                client.connect(Constants.ftpHost);
//                MyHelperClass Constants = new MyHelperClass();
                client.login(Constants.ftpUser, Constants.ftpPass);
//                MyHelperClass Constants = new MyHelperClass();
                client.changeDirectory(Constants.ftpDir);
//                MyHelperClass Constants = new MyHelperClass();
                File ff = new File((int)(Object)Constants.tmpDir + (int)(Object)Constants.tmpFtpFileName);
                client.download("GT99_A09.rar", ff);
                client.disconnect(false);
//                MyHelperClass Shared = new MyHelperClass();
                Shared.prepareMovements(ff);
//            MyHelperClass mode = new MyHelperClass();
            } else if (mode.equals("File")) {
                JFileChooser jfc = new JFileChooser();
                FileFilter f =(FileFilter)(Object) new ExtensionFileFilter("Traslados de Total Pos", "rar");
                jfc.setFileFilter(f);
//                MyHelperClass Shared = new MyHelperClass();
                int selection =(int)(Object) jfc.showOpenDialog(Shared.getMyMainWindows());
                MyHelperClass JFileChooser = new MyHelperClass();
                if (selection == (int)(Object)JFileChooser.APPROVE_OPTION) {
//                    MyHelperClass Shared = new MyHelperClass();
                    Shared.prepareMovements((File)(Object)jfc.getSelectedFile());
                } else {
                    return;
                }
            }
//            MyHelperClass Shared = new MyHelperClass();
            Shared.updateMovements();
//            MyHelperClass Shared = new MyHelperClass();
            if ((boolean)(Object)Shared.isHadMovements()) {
                MyHelperClass MessageBox = new MyHelperClass();
                MessageBox msg = new MessageBox(MessageBox.SGN_SUCCESS, "Fue cargado el nuevo inventario satisfactoriamente!");
//                MyHelperClass Shared = new MyHelperClass();
                msg.show(Shared.getMyMainWindows());
            } else {
                MyHelperClass MessageBox = new MyHelperClass();
                MessageBox msg = new MessageBox(MessageBox.SGN_WARNING, "La tienda no tuvo ningun movimiento asociado.");
//                MyHelperClass Shared = new MyHelperClass();
                msg.show(Shared.getMyMainWindows());
            }
        } catch (Exception ex) {
            MyHelperClass MessageBox = new MyHelperClass();
            MessageBox msg = new MessageBox(MessageBox.SGN_DANGER, "Ha ocurrido un error.", ex);
            MyHelperClass Shared = new MyHelperClass();
            msg.show(Shared.getMyMainWindows());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ftpHost;
	public MyHelperClass SGN_WARNING;
	public MyHelperClass ftpDir;
	public MyHelperClass ftpUser;
	public MyHelperClass SGN_SUCCESS;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass ftpPass;
	public MyHelperClass SGN_DANGER;
	public MyHelperClass tmpFtpFileName;
	public MyHelperClass tmpDir;
public MyHelperClass getMyMainWindows(){ return null; }
	public MyHelperClass updateMovements(){ return null; }
	public MyHelperClass createBackup(String o0){ return null; }
	public MyHelperClass prepareMovements(File o0){ return null; }
	public MyHelperClass isHadMovements(){ return null; }}

class FTPClient {

public MyHelperClass download(String o0, File o1){ return null; }
	public MyHelperClass changeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(boolean o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class File {

File(int o0){}
	File(){}}

class JFileChooser {

public MyHelperClass setFileFilter(FileFilter o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }}

class FileFilter {

}

class ExtensionFileFilter {

ExtensionFileFilter(String o0, String o1){}
	ExtensionFileFilter(){}}

class MessageBox {

MessageBox(){}
	MessageBox(MyHelperClass o0, String o1, Exception o2){}
	MessageBox(MyHelperClass o0, String o1){}
	public MyHelperClass show(MyHelperClass o0){ return null; }}
