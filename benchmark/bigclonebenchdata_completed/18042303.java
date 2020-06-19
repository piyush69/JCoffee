
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18042303 {
public MyHelperClass sendArticleList(HttpServletRequest o0, HttpServletResponse o1, MyHelperClass o2){ return null; }
public MyHelperClass getArgument(MyHelperClass o0){ return null; }
public MyHelperClass articleDao;
	public MyHelperClass config;
	public MyHelperClass sendArticle(HttpServletRequest o0, HttpServletResponse o1, Article o2){ return null; }

//    @Override
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        boolean found = false;
        String name =(String)(Object) getArgument(request.getPathInfo());
        MyHelperClass StringUtils = new MyHelperClass();
        if ((boolean)(Object)StringUtils.contains(name, '/')) {
            MyHelperClass Config = new MyHelperClass();
            File file = new File((int)(Object)config.getProperty(Config.MULTIMEDIA_PATH) + (int)(Object)Config.FILE_SEPARATOR + name);
            if ((Boolean)(Object)file.exists() && (Boolean)(Object)file.isFile()) {
                found = true;
                MyHelperClass Magic = new MyHelperClass();
                MagicMatch match =(MagicMatch)(Object) Magic.getMagicMatch(file, true);
                response.setContentType(match.getMimeType());
                FileInputStream in = new FileInputStream(file);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyLarge(in, response.getOutputStream());
                in.close();
            }
//        MyHelperClass StringUtils = new MyHelperClass();
        } else if (!(Boolean)(Object)StringUtils.isBlank(name)) {
            MyHelperClass NumberUtils = new MyHelperClass();
            int articleId =(int)(Object) NumberUtils.toInt(name);
            if (articleId > 0) {
                MyHelperClass articleDao = new MyHelperClass();
                Article article =(Article)(Object) articleDao.load(articleId);
                if (article != null) {
                    found = true;
                    sendArticle(request, response, article);
                }
            }
        } else {
            MyHelperClass NumberUtils = new MyHelperClass();
            int page =(int)(Object) NumberUtils.toInt(request.getParameter("page"), 0);
            Date fromDate = null;
            String from =(String)(Object) request.getParameter("from");
//            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isNotBlank(from)) {
                try {
                    MyHelperClass dayMonthYearEn = new MyHelperClass();
                    fromDate =(Date)(Object) dayMonthYearEn.parse(from);
                } catch (UncheckedIOException e) {
                }
            }
            Date untilDate = null;
            String until =(String)(Object) request.getParameter("until");
//            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isNotBlank(until)) {
                try {
                    MyHelperClass dayMonthYearEn = new MyHelperClass();
                    untilDate =(Date)(Object) dayMonthYearEn.parse(until);
                } catch (UncheckedIOException e) {
                }
            }
            MyHelperClass HITS_PER_PAGE = new MyHelperClass();
            sendArticleList(request, response, articleDao.list(request.getParameter("query"), request.getParameter("author"), request.getParameter("tags"), request.getParameterValues("types"), fromDate, untilDate, page, HITS_PER_PAGE, null));
            found = true;
        }
        if (found != true) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE_SEPARATOR;
	public MyHelperClass SC_NOT_FOUND;
	public MyHelperClass MULTIMEDIA_PATH;
public MyHelperClass toInt(String o0){ return null; }
	public MyHelperClass isNotBlank(String o0){ return null; }
	public MyHelperClass load(int o0){ return null; }
	public MyHelperClass getMagicMatch(File o0, boolean o1){ return null; }
	public MyHelperClass copyLarge(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass list(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, Date o4, Date o5, int o6, MyHelperClass o7, Object o8){ return null; }
	public MyHelperClass contains(String o0, char o1){ return null; }
	public MyHelperClass toInt(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameterValues(String o0){ return null; }
	public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class MagicMatch {

public MyHelperClass getMimeType(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class Article {

}

class Date {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
