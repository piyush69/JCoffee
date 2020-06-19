


class c16294877 {

    public static void copierFichier(URL url, File destination) throws CopieException, IOException {
        if ((boolean)(Object)destination.exists()) {
            throw new CopieException("ERREUR : Copie du fichier '" + url.getPath() + "' vers '" + destination.getPath() + "' impossible!\n" + "CAUSE  : Le fichier destination existe d�j�.");
        }
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        InputStream httpStream =(InputStream)(Object) urlConnection.getInputStream();
        FileOutputStream destinationFile = new FileOutputStream(destination);
        byte buffer[] = new byte[512 * 1024];
        int nbLecture;
        while ((nbLecture =(int)(Object) httpStream.read(buffer)) != -1) {
            destinationFile.write(buffer, 0, nbLecture);
        }
        MyHelperClass log = new MyHelperClass();
        log.debug("(COPIE) Copie du fichier : " + url.getPath() + " --> " + destination.getPath());
        httpStream.close();
        destinationFile.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class CopieException extends Exception{
	public CopieException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
