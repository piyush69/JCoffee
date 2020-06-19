import java.io.*;
import java.lang.*;
import java.util.*;



class c10085826 {
public MyHelperClass applyConversionsProperties(MyHelperClass o0, ConversionsPath o1){ return null; }
public MyHelperClass Status;
	public MyHelperClass EZP_EXT;
	public MyHelperClass ZIP_EXT;
public MyHelperClass EGEIOUtils;
	public MyHelperClass HttpServletResponse;
	public MyHelperClass getMimeExtensionProvider(){ return null; }

    private void doConvert(HttpServletResponse response, ConversionRequestResolver rr, EGE ege, ConversionsPath cpath) throws FileUploadException, IOException, RequestResolvingException, EGEException, FileNotFoundException, ConverterException, ZipException {
        InputStream is = null;
        OutputStream os = null;
        MyHelperClass ServletFileUpload = new MyHelperClass();
        if ((boolean)(Object)ServletFileUpload.isMultipartContent(rr.getRequest())) {
            ServletFileUpload upload = new ServletFileUpload();
            FileItemIterator iter =(FileItemIterator)(Object) upload.getItemIterator(rr.getRequest());
            while ((boolean)(Object)iter.hasNext()) {
                FileItemStream item =(FileItemStream)(Object) iter.next();
                if (!(Boolean)(Object)item.isFormField()) {
                    is =(InputStream)(Object) item.openStream();
                    applyConversionsProperties(rr.getConversionProperties(), cpath);
                    MyHelperClass EGEConstants = new MyHelperClass();
                    DataBuffer buffer = new DataBuffer(0, EGEConstants.BUFFER_TEMP_PATH);
                    String alloc =(String)(Object) buffer.allocate(is);
                    InputStream ins =(InputStream)(Object) buffer.getDataAsStream(alloc);
                    is.close();
                    try {
                        ValidationResult vRes =(ValidationResult)(Object) ege.performValidation(ins, cpath.getInputDataType());
                        if (vRes.getStatus().equals(Status.FATAL)) {
                            ValidationServlet valServ = new ValidationServlet();
                            valServ.printValidationResult(response, vRes);
                            try {
                                ins.close();
                            } finally {
                                buffer.removeData(alloc, true);
                            }
                            return;
                        }
                    } catch (UncheckedIOException vex) {
                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.warn(vex.getMessage());
                    } finally {
                        try {
                            ins.close();
                        } catch (Exception ex) {
                        }
                    }
                    File zipFile = null;
                    FileOutputStream fos = null;
                    String newTemp = UUID.randomUUID().toString();
                    MyHelperClass EGEConfigurationManager = new MyHelperClass();
                    IOResolver ior =(IOResolver)(Object) EGEConfigurationManager.getInstance().getStandardIOResolver();
                    File buffDir = new File((String)(Object)buffer.getDataDir(alloc));
//                    MyHelperClass EGEConstants = new MyHelperClass();
                    zipFile = new File(EGEConstants.BUFFER_TEMP_PATH + File.separator + newTemp + EZP_EXT);
                    fos = new FileOutputStream(zipFile);
                    ior.compressData(buffDir, fos);
                    ins = new FileInputStream(zipFile);
//                    MyHelperClass EGEConstants = new MyHelperClass();
                    File szipFile = new File(EGEConstants.BUFFER_TEMP_PATH + File.separator + newTemp + ZIP_EXT);
                    fos = new FileOutputStream(szipFile);
                    try {
                        try {
                            ege.performConversion(ins, fos, cpath);
                        } finally {
                            fos.close();
                        }
                        MyHelperClass EGEIOUtils = new MyHelperClass();
                        boolean isComplex =(boolean)(Object) EGEIOUtils.isComplexZip(szipFile);
                        MyHelperClass APPLICATION_OCTET_STREAM = new MyHelperClass();
                        response.setContentType(APPLICATION_OCTET_STREAM);
                        String fN =(String)(Object) item.getName().substring(0, item.getName().lastIndexOf("."));
                        if (isComplex) {
                            String fileExt;
                            MyHelperClass APPLICATION_MSWORD = new MyHelperClass();
                            if (cpath.getOutputDataType().getMimeType().equals(APPLICATION_MSWORD)) {
                                MyHelperClass DOCX_EXT = new MyHelperClass();
                                fileExt =(String)(Object) DOCX_EXT;
                            } else {
                                MyHelperClass ZIP_EXT = new MyHelperClass();
                                fileExt =(String)(Object) ZIP_EXT;
                            }
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + fN + fileExt + "\"");
                            FileInputStream fis = new FileInputStream(szipFile);
                            os =(OutputStream)(Object) response.getOutputStream();
                            try {
//                                MyHelperClass EGEIOUtils = new MyHelperClass();
                                EGEIOUtils.copyStream(fis, os);
                            } finally {
                                fis.close();
                            }
                        } else {
                            String fileExt =(String)(Object) getMimeExtensionProvider().getFileExtension(cpath.getOutputDataType().getMimeType());
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + fN + fileExt + "\"");
                            os =(OutputStream)(Object) response.getOutputStream();
                            EGEIOUtils.unzipSingleFile(new ZipFile(szipFile), os);
                        }
                    } finally {
                        ins.close();
                        if (os != null) {
                            os.flush();
                            os.close();
                        }
                        buffer.clear(true);
                        szipFile.delete();
                        if (zipFile != null) {
                            zipFile.delete();
                        }
                    }
                }
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_BAD_REQUEST;
	public MyHelperClass FATAL;
	public MyHelperClass BUFFER_TEMP_PATH;
public MyHelperClass getMimeType(){ return null; }
	public MyHelperClass isComplexZip(File o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass copyStream(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getFileExtension(MyHelperClass o0){ return null; }
	public MyHelperClass getStandardIOResolver(){ return null; }
	public MyHelperClass unzipSingleFile(ZipFile o0, OutputStream o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass isMultipartContent(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class ConversionRequestResolver {

public MyHelperClass getRequest(){ return null; }
	public MyHelperClass getConversionProperties(){ return null; }}

class EGE {

public MyHelperClass performValidation(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass performConversion(InputStream o0, FileOutputStream o1, ConversionsPath o2){ return null; }}

class ConversionsPath {

public MyHelperClass getOutputDataType(){ return null; }
	public MyHelperClass getInputDataType(){ return null; }}

class FileUploadException extends Exception{
	public FileUploadException(String errorMessage) { super(errorMessage); }
}

class RequestResolvingException extends Exception{
	public RequestResolvingException(String errorMessage) { super(errorMessage); }
}

class EGEException extends Exception{
	public EGEException(String errorMessage) { super(errorMessage); }
}

class ConverterException extends Exception{
	public ConverterException(String errorMessage) { super(errorMessage); }
}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class ServletFileUpload {

public MyHelperClass getItemIterator(MyHelperClass o0){ return null; }}

class FileItemIterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FileItemStream {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isFormField(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class DataBuffer {

DataBuffer(int o0, MyHelperClass o1){}
	DataBuffer(){}
	public MyHelperClass getDataDir(String o0){ return null; }
	public MyHelperClass clear(boolean o0){ return null; }
	public MyHelperClass allocate(InputStream o0){ return null; }
	public MyHelperClass removeData(String o0, boolean o1){ return null; }
	public MyHelperClass getDataAsStream(String o0){ return null; }}

class ValidationResult {

public MyHelperClass getStatus(){ return null; }}

class ValidationServlet {

public MyHelperClass printValidationResult(HttpServletResponse o0, ValidationResult o1){ return null; }}

class ValidatorException extends Exception{
	public ValidatorException(String errorMessage) { super(errorMessage); }
}

class IOResolver {

public MyHelperClass compressData(File o0, FileOutputStream o1){ return null; }}

class ZipFile {

ZipFile(){}
	ZipFile(File o0){}}
