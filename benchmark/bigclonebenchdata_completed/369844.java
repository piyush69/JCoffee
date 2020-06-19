


class c369844 {

    private boolean enregistreToi() {
        PrintWriter lEcrivain;
        MyHelperClass sonImage = new MyHelperClass();
        String laDest = "./img_types/" + sonImage;
        if (!(Boolean)(Object)new File("./img_types").exists()) {
            new File("./img_types").mkdirs();
        }
        try {
            MyHelperClass sonFichier = new MyHelperClass();
            FileChannel leFicSource =(FileChannel)(Object) (new FileInputStream(sonFichier).getChannel());
            FileChannel leFicDest =(FileChannel)(Object) (new FileOutputStream(laDest).getChannel());
            leFicSource.transferTo(0, leFicSource.size(), leFicDest);
            leFicSource.close();
            leFicDest.close();
            lEcrivain = new PrintWriter(new FileWriter(new File("bundll/types.jay"), true));
            MyHelperClass sonNom = new MyHelperClass();
            lEcrivain.println(sonNom);
//            MyHelperClass sonImage = new MyHelperClass();
            lEcrivain.println(sonImage);
            MyHelperClass sonOptionRadio1 = new MyHelperClass();
            if ((boolean)(Object)sonOptionRadio1.isSelected()) {
                lEcrivain.println("0:?");
            }
            MyHelperClass sonOptionRadio2 = new MyHelperClass();
            if ((boolean)(Object)sonOptionRadio2.isSelected()) {
                MyHelperClass JOptionPane = new MyHelperClass();
                lEcrivain.println("1:" + JOptionPane.showInputDialog(null, "Vous avez choisis de rendre ce terrain difficile � franchir.\nVeuillez en indiquer la raison.", "Demande de pr�cision", JOptionPane.INFORMATION_MESSAGE));
            }
            MyHelperClass sonOptionRadio3 = new MyHelperClass();
            if ((boolean)(Object)sonOptionRadio3.isSelected()) {
                lEcrivain.println("2:?");
            }
            lEcrivain.close();
            return true;
        } catch (Exception lException) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass showInputDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass isSelected(){ return null; }}

class PrintWriter {

PrintWriter(FileWriter o0){}
	PrintWriter(){}
	public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0, boolean o1){}}
