


class c2687958 {
public MyHelperClass Main;

//    @Override
    public void run() {
        try {
            MyHelperClass location = new MyHelperClass();
            File dest = new File(location);
            if ((dest.getParent() != null && !(Boolean)(Object)dest.getParentFile().isDirectory() && !(Boolean)(Object)dest.getParentFile().mkdirs())) {
                throw new IOException("Impossible de créer un dossier (" + dest.getParent() + ").");
            } else if ((boolean)(Object)dest.exists() && !(Boolean)(Object)dest.delete()) {
                throw new IOException("Impossible de supprimer un ancien fichier (" + dest + ").");
            } else if (!(Boolean)(Object)dest.createNewFile()) {
                throw new IOException("Impossible de créer un fichier (" + dest + ").");
            }
            MyHelperClass file = new MyHelperClass();
            FileChannel in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            try {
                in.transferTo(0, in.size(), out);
            } finally {
                in.close();
                out.close();
            }
        } catch (Exception e) {
            MyHelperClass Fenetre = new MyHelperClass();
            Main.fenetre().erreur(Fenetre.ERREUR_FATALE_UPDATE, e);
        } finally {
            MyHelperClass file = new MyHelperClass();
            file.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERREUR_FATALE_UPDATE;
public MyHelperClass erreur(MyHelperClass o0, Exception o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass fenetre(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
