
import java.io.UncheckedIOException;


class c21162921 {
public static MyHelperClass FileUtils;
	public static MyHelperClass StringUtils;
	public static MyHelperClass convertToSwf(File o0, String o1, DocuBean o2){ return null; }
	public static MyHelperClass pdfByFirstPageToJpeg(File o0, String o1, DocuBean o2){ return null; }
//public MyHelperClass StringUtils;
//	public MyHelperClass FileUtils;
//	public MyHelperClass pdfByFirstPageToJpeg(File o0, String o1, DocuBean o2){ return null; }
//	public MyHelperClass convertToSwf(File o0, String o1, DocuBean o2){ return null; }

    private static void convertToOnline(final String filePath, final DocuBean docuBean) throws Exception {
        MyHelperClass File = new MyHelperClass();
        File source = new File(filePath + File.separator + docuBean.getFileName());
//        MyHelperClass File = new MyHelperClass();
        File dir = new File(filePath + File.separator + docuBean.getId());
        if (!(Boolean)(Object)dir.exists()) {
            dir.mkdir();
        }
        File in = source;
        boolean isSpace = false;
        if ((int)(Object)source.getName().indexOf(" ") != -1) {
            MyHelperClass StringUtils = new MyHelperClass();
            in = new File((String)(Object)StringUtils.replace(source.getName(), " ", ""));
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyFile(source, in);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            isSpace = true;
        }
        File finalPdf = null;
        try {
            String outPath =(String)(Object) dir.getAbsolutePath();
            MyHelperClass DocViewerConverter = new MyHelperClass();
            final File pdf =(File)(Object) DocViewerConverter.toPDF(in, outPath);
            convertToSwf(pdf, outPath, docuBean);
//            MyHelperClass File = new MyHelperClass();
            finalPdf = new File(outPath + File.separator + FileUtils.getFilePrefix(StringUtils.replace(source.getName(), " ", "")) + "_decrypted.pdf");
            if (!(Boolean)(Object)finalPdf.exists()) {
                finalPdf = pdf;
            }
            pdfByFirstPageToJpeg(finalPdf, outPath, docuBean);
            if ((int)(Object)docuBean.getSuccess() == 2 &&(int)(Object) dir.listFiles().length < 2) {
                docuBean.setSuccess(3);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (isSpace) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.delete(in);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
	public MyHelperClass separator;
public MyHelperClass getFilePrefix(MyHelperClass o0){ return null; }
	public MyHelperClass delete(File o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass toPDF(File o0, String o1){ return null; }
	public MyHelperClass replace(MyHelperClass o0, String o1, String o2){ return null; }}

class DocuBean {

public MyHelperClass getSuccess(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass setSuccess(int o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
