


class c10466758 {
public MyHelperClass getRealPathPrefix(MyHelperClass o0){ return null; }
public MyHelperClass getETagValue(HttpServletRequest o0){ return null; }
	public MyHelperClass getEtagExpiration(){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass getImageFile(String o0, String o1, String o2, String o3){ return null; }

    public void handleRequestInternal(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) throws ServletException, IOException {
        final String servetPath =(String)(Object) httpServletRequest.getServletPath();
        MyHelperClass IF_NONE_MATCH = new MyHelperClass();
        final String previousToken =(String)(Object) httpServletRequest.getHeader(IF_NONE_MATCH);
        final String currentToken =(String)(Object) getETagValue(httpServletRequest);
        MyHelperClass ETAG = new MyHelperClass();
        httpServletResponse.setHeader(ETAG, currentToken);
        MyHelperClass IF_MODIFIED_SINCE = new MyHelperClass();
        final Date modifiedDate = new Date(httpServletRequest.getDateHeader(IF_MODIFIED_SINCE));
        MyHelperClass Calendar = new MyHelperClass();
        final Calendar calendar =(Calendar)(Object) Calendar.getInstance();
        final Date now =(Date)(Object) calendar.getTime();
        calendar.setTime(modifiedDate);
//        MyHelperClass Calendar = new MyHelperClass();
        calendar.add(Calendar.MINUTE, getEtagExpiration());
        if (currentToken.equals(previousToken) && ((int)(Object)now.getTime() < (int)(Object)calendar.getTime().getTime())) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_MODIFIED);
            MyHelperClass LAST_MODIFIED = new MyHelperClass();
            httpServletResponse.setHeader(LAST_MODIFIED,(String)(Object) httpServletRequest.getHeader(IF_MODIFIED_SINCE));
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isDebugEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("ETag the same, will return 304");
            }
        } else {
            MyHelperClass LAST_MODIFIED = new MyHelperClass();
            httpServletResponse.setDateHeader(LAST_MODIFIED, (new Date()).getTime());
            MyHelperClass Constants = new MyHelperClass();
            final String width =(String)(Object) httpServletRequest.getParameter(Constants.WIDTH);
//            MyHelperClass Constants = new MyHelperClass();
            final String height =(String)(Object) httpServletRequest.getParameter(Constants.HEIGHT);
            MyHelperClass imageService = new MyHelperClass();
            final ImageNameStrategy imageNameStrategy =(ImageNameStrategy)(Object) imageService.getImageNameStrategy(servetPath);
            String code =(String)(Object) imageNameStrategy.getCode(servetPath);
            String fileName =(String)(Object) imageNameStrategy.getFileName(servetPath);
            final String imageRealPathPrefix =(String)(Object) getRealPathPrefix(httpServletRequest.getServerName().toLowerCase());
            String original = imageRealPathPrefix + imageNameStrategy.getFullFileNamePath(fileName, code);
            final File origFile = new File(original);
            if (!(Boolean)(Object)origFile.exists()) {
//                MyHelperClass Constants = new MyHelperClass();
                code =(String)(Object) Constants.NO_IMAGE;
                fileName =(String)(Object) imageNameStrategy.getFileName(code);
                original = imageRealPathPrefix + imageNameStrategy.getFullFileNamePath(fileName, code);
            }
            String resizedImageFileName = null;
//            MyHelperClass imageService = new MyHelperClass();
            if (width != null && height != null && (boolean)(Object)imageService.isSizeAllowed(width, height)) {
                resizedImageFileName = imageRealPathPrefix + imageNameStrategy.getFullFileNamePath(fileName, code, width, height);
            }
            final File imageFile =(File)(Object) getImageFile(original, resizedImageFileName, width, height);
            final FileInputStream fileInputStream = new FileInputStream(imageFile);
            IOUtils.copy(fileInputStream, httpServletResponse.getOutputStream());
            fileInputStream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MINUTE;
	public MyHelperClass NO_IMAGE;
	public MyHelperClass HEIGHT;
	public MyHelperClass WIDTH;
	public MyHelperClass SC_NOT_MODIFIED;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getImageNameStrategy(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isSizeAllowed(String o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class HttpServletRequest {

public MyHelperClass getServletPath(){ return null; }
	public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass getServerName(){ return null; }
	public MyHelperClass getDateHeader(MyHelperClass o0){ return null; }
	public MyHelperClass getHeader(MyHelperClass o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setDateHeader(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setHeader(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Date {

Date(MyHelperClass o0){}
	Date(){}
	public MyHelperClass getTime(){ return null; }}

class Calendar {

public MyHelperClass add(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setTime(Date o0){ return null; }
	public MyHelperClass getTime(){ return null; }}

class ImageNameStrategy {

public MyHelperClass getFullFileNamePath(String o0, String o1){ return null; }
	public MyHelperClass getFullFileNamePath(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass getFileName(String o0){ return null; }
	public MyHelperClass getCode(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
