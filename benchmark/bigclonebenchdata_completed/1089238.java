
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1089238 {

    private Document saveFile(Document document, File file) throws Exception {
        MyHelperClass Constants = new MyHelperClass();
        SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATEFORMAT_YYYYMMDD);
        MyHelperClass prefService = new MyHelperClass();
        List preferences =(List)(Object) prefService.findAll();
        if (preferences != null && !(Boolean)(Object)preferences.isEmpty()) {
            Preference preference =(Preference)(Object) preferences.get(0);
            String repo =(String)(Object) preference.getRepository();
            StringBuffer sbRepo = new StringBuffer(repo);
            MyHelperClass File = new MyHelperClass();
            sbRepo.append(File.separator);
            StringBuffer sbFolder = new StringBuffer((int)(Object)document.getLocation());
            File folder = new File(sbRepo.append(sbFolder).toString());
            MyHelperClass log = new MyHelperClass();
            log.info("Check in file ID [" + document.getId() + "] to " + folder.getAbsolutePath());
            if (!(Boolean)(Object)folder.exists()) {
                folder.mkdirs();
            }
            FileChannel fcSource = null, fcDest = null, fcVersionDest = null;
            try {
//                MyHelperClass File = new MyHelperClass();
                StringBuffer sbFile = new StringBuffer((int)(Object)folder.getAbsolutePath()).append(File.separator).append(document.getId()).append(".").append(document.getExt());
//                MyHelperClass File = new MyHelperClass();
                StringBuffer sbVersionFile = new StringBuffer((int)(Object)folder.getAbsolutePath()).append(File.separator).append(document.getId()).append("_").append(document.getVersion().toString()).append(".").append(document.getExt());
                fcSource =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                fcDest =(FileChannel)(Object) (new FileOutputStream(sbFile.toString()).getChannel());
                fcVersionDest =(FileChannel)(Object) (new FileOutputStream(sbVersionFile.toString()).getChannel());
                fcDest.transferFrom(fcSource, 0, fcSource.size());
                fcSource =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                fcVersionDest.transferFrom(fcSource, 0, fcSource.size());
                document.setLocation(sbFolder.toString());
                MyHelperClass documentService = new MyHelperClass();
                documentService.save(document);
            } catch (UncheckedIOException notFoundEx) {
//                MyHelperClass log = new MyHelperClass();
                log.error("saveFile file not found: " + document.getName(), notFoundEx);
            } catch (ArithmeticException ioEx) {
//                MyHelperClass log = new MyHelperClass();
                log.error("saveFile IOException: " + document.getName(), ioEx);
            } finally {
                try {
                    if (fcSource != null) {
                        fcSource.close();
                    }
                    if (fcDest != null) {
                        fcDest.close();
                    }
                    if (fcVersionDest != null) {
                        fcVersionDest.close();
                    }
                } catch (Exception e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error(e.getMessage(), e);
                }
            }
        }
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATEFORMAT_YYYYMMDD;
	public MyHelperClass separator;
public MyHelperClass save(Document o0){ return null; }
	public MyHelperClass findAll(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class Document {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getExt(){ return null; }
	public MyHelperClass setLocation(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(MyHelperClass o0){}}

class List {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Preference {

public MyHelperClass getRepository(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
