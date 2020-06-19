
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17261985 {

    public int doEndTag() throws JspException {
        MyHelperClass pageContext = new MyHelperClass();
        HttpSession session =(HttpSession)(Object) pageContext.getSession();
        try {
            MyHelperClass Constants = new MyHelperClass();
            IntactUserI user = (IntactUserI)(IntactUserI)(Object) session.getAttribute(Constants.USER_KEY);
            String urlStr =(String)(Object) user.getSourceURL();
            if (urlStr == null) {
                MyHelperClass EVAL_PAGE = new MyHelperClass();
                return (int)(Object)EVAL_PAGE;
            }
            URL url = null;
            try {
                url = new URL(urlStr);
            } catch (UncheckedIOException me) {
                MyHelperClass URLDecoder = new MyHelperClass();
                String decodedUrl =(String)(Object) URLDecoder.decode(urlStr, "UTF-8");
//                MyHelperClass pageContext = new MyHelperClass();
                pageContext.getOut().write("The source is malformed : <a href=\"" + decodedUrl + "\" target=\"_blank\">" + decodedUrl + "</a>");
                MyHelperClass EVAL_PAGE = new MyHelperClass();
                return (int)(Object)EVAL_PAGE;
            }
            StringBuffer httpContent = new StringBuffer();
            httpContent.append("<!-- URL : " + urlStr + "-->");
            String tmpLine;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                while ((tmpLine =(String)(Object) reader.readLine()) != null) {
                    httpContent.append(tmpLine);
                }
                reader.close();
            } catch (UncheckedIOException ioe) {
                user.resetSourceURL();
                MyHelperClass URLDecoder = new MyHelperClass();
                String decodedUrl =(String)(Object) URLDecoder.decode(urlStr, "UTF-8");
//                MyHelperClass pageContext = new MyHelperClass();
                pageContext.getOut().write("Unable to display the source at : <a href=\"" + decodedUrl + "\" target=\"_blank\">" + decodedUrl + "</a>");
                MyHelperClass EVAL_PAGE = new MyHelperClass();
                return (int)(Object)EVAL_PAGE;
            }
//            MyHelperClass pageContext = new MyHelperClass();
            pageContext.getOut().write(httpContent.toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new JspException("Error when trying to get HTTP content");
        }
        MyHelperClass EVAL_PAGE = new MyHelperClass();
        return (int)(Object)EVAL_PAGE;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER_KEY;
public MyHelperClass getOut(){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class JspException extends Exception{
	public JspException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class IntactUserI {

public MyHelperClass getSourceURL(){ return null; }
	public MyHelperClass resetSourceURL(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
