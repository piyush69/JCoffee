import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c18326088 {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        String year = req.getParameter("year").toString();
        String round = req.getParameter("round").toString();
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("Searching for : " + year + ", " + round + "<br/>");
        StringBuffer sb = new StringBuffer("http://www.dfb.de/bliga/bundes/archiv/");
        sb.append(year).append("/xml/blm_e_").append(round).append("_").append(year.substring(2, 4)).append(".xml");
        resp.getWriter().println(sb.toString() + "<br/><br/>");
        try {
            URL url = new URL(sb.toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            StringBuffer xml = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                xml.append(line);
            }
            MyHelperClass DocumentHelper = new MyHelperClass();
            Document document =(Document)(Object) DocumentHelper.parseText(xml.toString());
            List termine =(List)(Object) document.selectNodes("//ergx/termin");
            int index = 1;
            for (Object termin : termine) {
                Element terminNode = (Element) termin;
                resp.getWriter().println("Termin " + index + " : " + terminNode.element("datum").getText() + "<br/>");
                resp.getWriter().println("Heim:" + terminNode.element("teama").getText() + "<br/>");
                resp.getWriter().println("Gast:" + terminNode.element("teamb").getText() + "<br/>");
                resp.getWriter().println("Ergebnis:" + terminNode.element("punkte_a").getText() + ":" + terminNode.element("punkte_b").getText() + "<br/>");
                resp.getWriter().println("<br/>");
                index++;
            }
            resp.getWriter().println();
            resp.getWriter().println("</body></html>");
            reader.close();
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ArithmeticException ex) {
            throw new RuntimeException(ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(){ return null; }
	public MyHelperClass parseText(String o0){ return null; }
	public MyHelperClass println(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class Document {

public MyHelperClass selectNodes(String o0){ return null; }}

class Element {

public MyHelperClass element(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}
