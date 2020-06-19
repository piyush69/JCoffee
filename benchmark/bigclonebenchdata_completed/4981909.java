
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4981909 {

    public static File enregistrerFichier(String fileName, File file, String path, String fileMime) throws Exception {
        if (file != null) {
            try {
                MyHelperClass ServletActionContext = new MyHelperClass();
                HttpServletRequest request =(HttpServletRequest)(Object) ServletActionContext.getRequest();
                HttpSession session =(HttpSession)(Object) request.getSession();
                MyHelperClass File = new MyHelperClass();
                String pathFile =(int)(Object) session.getServletContext().getRealPath(path) + (int)(Object)File.separator + fileName;
                File outfile = new File(pathFile);
                String[] nomPhotoTab = fileName.split("\\.");
                String extension = nomPhotoTab[nomPhotoTab.length - 1];
                StringBuffer pathResBuff = new StringBuffer(nomPhotoTab[0]);
                for (int i = 1; i < nomPhotoTab.length - 1; i++) {
                    pathResBuff.append(".").append(nomPhotoTab[i]);
                }
                String pathRes = pathResBuff.toString();
                String nomPhoto = fileName;
                for (int i = 0; !(Boolean)(Object)outfile.createNewFile(); i++) {
                    nomPhoto = pathRes + "_" + +i + "." + extension;
//                    MyHelperClass File = new MyHelperClass();
                    pathFile =(int)(Object) session.getServletContext().getRealPath(path) + (int)(Object)File.separator + nomPhoto;
                    outfile = new File(pathFile);
                }
                MyHelperClass logger = new MyHelperClass();
                logger.debug(" enregistrerFichier - Enregistrement du fichier : " + pathFile);
                FileChannel in = null;
                FileChannel out = null;
                try {
                    in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                    out =(FileChannel)(Object) (new FileOutputStream(outfile).getChannel());
                    in.transferTo(0, in.size(), out);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                }
                return outfile;
            } catch (UncheckedIOException e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Erreur lors de l'enregistrement de l'image ",(IOException)(Object) e);
                throw new Exception("Erreur lors de l'enregistrement de l'image ");
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getRequest(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }}

class HttpSession {

public MyHelperClass getServletContext(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
