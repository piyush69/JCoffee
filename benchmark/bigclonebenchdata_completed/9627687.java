
import java.io.UncheckedIOException;


class c9627687 {

    private boolean isReservaOK(String urlAddress, String operationId, String idioma, String codigo_pedido, String merchantId) throws ServletException {
        StringBuffer buf = new StringBuffer();
        try {
            URL url = new URL(urlAddress + "?Num_operacion=" + operationId + "&Idioma=" + idioma + "&Codigo_pedido=" + codigo_pedido + "&MerchantID=" + merchantId);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                buf.append(str);
            }
            in.close();
        } catch (UncheckedIOException e) {
            throw new ServletException((String)(Object)e);
        }
        return buf.indexOf("$*$OKY$*$") != -1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

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
