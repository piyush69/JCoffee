
import java.io.UncheckedIOException;


class c16522034 {

    public int doEndTag() throws JspException {
        MyHelperClass pageContext = new MyHelperClass();
        JspWriter saida =(JspWriter)(Object) pageContext.getOut();
        HttpURLConnection urlConnection = null;
        try {
            URL requisicao = new URL(((HttpServletRequest)(HttpServletRequest)(Object) pageContext.getRequest()).getRequestURL().toString());
            MyHelperClass url = new MyHelperClass();
            URL link = new URL(requisicao, url);
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) link.openConnection();
            BufferedReader entrada = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "ISO-8859-1"));
            String linha =(String)(Object) entrada.readLine();
            while (linha != null) {
                saida.write(linha + "\n");
                linha =(String)(Object) entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            try {
                MyHelperClass url = new MyHelperClass();
                saida.write("Erro ao incluir o conte�do da URL \"" + url + "\"");
            } catch (UncheckedIOException e1) {
            }
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return this.doEndTag();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOut(){ return null; }
	public MyHelperClass getRequest(){ return null; }}

class JspException extends Exception{
	public JspException(String errorMessage) { super(errorMessage); }
}

class JspWriter {

public MyHelperClass write(String o0){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	URL(URL o0, MyHelperClass o1){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0, String o1){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}
