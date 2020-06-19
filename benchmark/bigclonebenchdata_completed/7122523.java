


class c7122523 {
public MyHelperClass saveErrors(HttpServletRequest o0, ActionErrors o1){ return null; }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MyHelperClass RegistroManager = new MyHelperClass();
        InstanciaDelegate delegate =(InstanciaDelegate)(Object) RegistroManager.recuperarInstancia(request);
        if (delegate == null) {
            ActionErrors errors = new ActionErrors();
            errors.add(null, new ActionError("errors.session"));
            saveErrors(request, errors);
            return(ActionForward)(Object) mapping.findForward("fail");
        }
        AyudaPantalla ayudaPantalla =(AyudaPantalla)(Object) delegate.obtenerAyudaPantalla();
        TraAyudaPantalla traAyudaPantalla = (TraAyudaPantalla)(TraAyudaPantalla)(Object) ayudaPantalla.getTraduccion();
        String urlSonido =(String)(Object) traAyudaPantalla.getUrlSonido();
        if (urlSonido == null) {
            return null;
        }
        URL url = new URL(urlSonido);
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        urlConnection.connect();
        String tipoMime =(String)(Object) urlConnection.getContentType();
        MyHelperClass log = new MyHelperClass();
        log.debug("Tipo Mime: " + tipoMime);
        Map audioOptions =(Map)(Object) new HashMap();
        if (tipoMime.indexOf("audio") != -1 || tipoMime.indexOf("asf") != -1 || tipoMime.equals("unknown/unknown")) {
            audioOptions.put("id", "MediaPlayer");
            audioOptions.put("codeBase", "http://activex.microsoft.com/activex/controls/mplayer/en/nsmp2inf.cab#Version=6,4,7,1112");
            audioOptions.put("classId", "CLSID:22D6F312-B0F6-11D0-94AB-0080C74C7E95");
            audioOptions.put("mimeType", "application/x-mplayer2");
            audioOptions.put("urlSonido", urlSonido);
            audioOptions.put("pluginSpage", "http://www.microsoft.com/Windows/Downloads/Contents/Products/MediaPlayer/");
        } else if (tipoMime.indexOf("real") != -1) {
            audioOptions.put("id", "RVOCX");
            audioOptions.put("codeBase", "");
            audioOptions.put("classId", "clsid:CFCDAA03-8BE4-11cf-B84B-0020AFBBCCFA");
            audioOptions.put("mimeType", "audio/x-pn-realaudio-plugin");
            audioOptions.put("urlSonido", urlSonido);
            audioOptions.put("pluginSpage", "");
        }
        request.setAttribute("audioOptions", audioOptions);
//        MyHelperClass log = new MyHelperClass();
        log.debug("entra success");
        return(ActionForward)(Object) mapping.findForward("success");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass recuperarInstancia(HttpServletRequest o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, Map o1){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class InstanciaDelegate {

public MyHelperClass obtenerAyudaPantalla(){ return null; }}

class ActionErrors {

public MyHelperClass add(Object o0, ActionError o1){ return null; }}

class ActionError {

ActionError(String o0){}
	ActionError(){}}

class AyudaPantalla {

public MyHelperClass getTraduccion(){ return null; }}

class TraAyudaPantalla {

public MyHelperClass getUrlSonido(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentType(){ return null; }
	public MyHelperClass connect(){ return null; }}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class HashMap {

}
