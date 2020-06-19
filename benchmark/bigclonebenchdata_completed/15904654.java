
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15904654 {
public static MyHelperClass registerParameters(DynamicJasperDesign o0, DynamicReport o1){ return null; }
//public MyHelperClass registerParameters(DynamicJasperDesign o0, DynamicReport o1){ return null; }

    protected static DynamicJasperDesign generateJasperDesign(DynamicReport dr) throws CoreException {
        DynamicJasperDesign jd = null;
        try {
            if (dr.getTemplateFileName() != null) {
                MyHelperClass log = new MyHelperClass();
                log.info("loading template file: " + dr.getTemplateFileName());
//                MyHelperClass log = new MyHelperClass();
                log.info("Attemping to find the file directly in the file system...");
                File file = new File(dr.getTemplateFileName());
                if ((boolean)(Object)file.exists()) {
                    MyHelperClass JRXmlLoader = new MyHelperClass();
                    JasperDesign jdesign =(JasperDesign)(Object) JRXmlLoader.load(file);
                    MyHelperClass DJJRDesignHelper = new MyHelperClass();
                    jd =(DynamicJasperDesign)(Object) DJJRDesignHelper.downCast(jdesign, dr);
                } else {
//                    MyHelperClass log = new MyHelperClass();
                    log.info("Not found: Attemping to find the file in the classpath...");
                    URL url =(URL)(Object) DynamicJasperHelper.class.getClassLoader().getResource((String)(Object)dr.getTemplateFileName());
                    MyHelperClass JRXmlLoader = new MyHelperClass();
                    JasperDesign jdesign =(JasperDesign)(Object) JRXmlLoader.load((File)(Object)url.openStream());
                    MyHelperClass DJJRDesignHelper = new MyHelperClass();
                    jd =(DynamicJasperDesign)(Object) DJJRDesignHelper.downCast(jdesign, dr);
                }
                MyHelperClass JasperDesignHelper = new MyHelperClass();
                JasperDesignHelper.populateReportOptionsFromDesign(jd, dr);
            } else {
                MyHelperClass DJJRDesignHelper = new MyHelperClass();
                jd =(DynamicJasperDesign)(Object) DJJRDesignHelper.getNewDesign(dr);
            }
            registerParameters(jd, dr);
        } catch (UncheckedIOException e) {
            throw new CoreException(e.getMessage(),(IOException)(Object) e);
        } catch (ArithmeticException e) {
            throw new CoreException(e.getMessage(),(IOException)(Object) e);
        }
        return jd;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getNewDesign(DynamicReport o0){ return null; }
	public MyHelperClass downCast(JasperDesign o0, DynamicReport o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass load(File o0){ return null; }
	public MyHelperClass populateReportOptionsFromDesign(DynamicJasperDesign o0, DynamicReport o1){ return null; }}

class DynamicReport {

public MyHelperClass getTemplateFileName(){ return null; }}

class DynamicJasperDesign {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
	CoreException(){}
	CoreException(String o0, IOException o1){}
	CoreException(String o0, JRException o1){}
}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }}

class JasperDesign {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class DynamicJasperHelper {

}

class JRException extends Exception{
	public JRException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
