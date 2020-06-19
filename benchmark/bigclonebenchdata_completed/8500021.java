
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8500021 {

    private Document saveFile(Document document, File file) throws Exception {
        MyHelperClass prefService = new MyHelperClass();
        List preferences =(List)(Object) prefService.findAll();
        if (preferences != null && !(Boolean)(Object)preferences.isEmpty()) {
            MyHelperClass preference = new MyHelperClass();
            preference = preferences.get(0);
        }
        MyHelperClass Constants = new MyHelperClass();
        SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATEFORMAT_YYYYMMDD);
        MyHelperClass preference = new MyHelperClass();
        String repo =(String)(Object) preference.getRepository();
        MyHelperClass Calendar = new MyHelperClass();
        Calendar calendar =(Calendar)(Object) Calendar.getInstance();
        StringBuffer sbRepo = new StringBuffer(repo);
        MyHelperClass File = new MyHelperClass();
        sbRepo.append(File.separator);
        StringBuffer sbFolder = new StringBuffer((int)(Object)sdf.format(calendar.getTime()));
//        MyHelperClass Calendar = new MyHelperClass();
        sbFolder.append(File.separator).append(calendar.get(Calendar.HOUR_OF_DAY));
        File folder = new File(sbRepo.append(sbFolder).toString());
        if (!(Boolean)(Object)folder.exists()) {
            folder.mkdirs();
        }
        FileChannel fcSource = null, fcDest = null;
        try {
            StringBuffer sbFile = new StringBuffer((int)(Object)folder.getAbsolutePath());
            StringBuffer fname = new StringBuffer(document.getId().toString());
            fname.append(".").append(document.getExt());
//            MyHelperClass File = new MyHelperClass();
            sbFile.append(File.separator).append(fname);
            fcSource =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            fcDest =(FileChannel)(Object) (new FileOutputStream(sbFile.toString()).getChannel());
            fcDest.transferFrom(fcSource, 0, fcSource.size());
            document.setLocation(sbFolder.toString());
            MyHelperClass documentService = new MyHelperClass();
            documentService.save(document);
        } catch (UncheckedIOException notFoundEx) {
            MyHelperClass log = new MyHelperClass();
            log.error("saveFile file not found: " + document.getName(), notFoundEx);
        } catch (ArithmeticException ioEx) {
            MyHelperClass log = new MyHelperClass();
            log.error("saveFile IOException: " + document.getName(), ioEx);
        } finally {
            try {
                if (fcSource != null) {
                    fcSource.close();
                }
                if (fcDest != null) {
                    fcDest.close();
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error(e.getMessage(), e);
            }
        }
        return document;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATEFORMAT_YYYYMMDD;
	public MyHelperClass HOUR_OF_DAY;
	public MyHelperClass separator;
public MyHelperClass save(Document o0){ return null; }
	public MyHelperClass findAll(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }}

class Document {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getExt(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setLocation(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class List {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class Preference {

}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(MyHelperClass o0){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}

class Calendar {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

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
