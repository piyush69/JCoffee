


class c11896430 {
public MyHelperClass TP_ICON;
public MyHelperClass JavaliController;
	public MyHelperClass MENU_TYPE_TEXT;
	public MyHelperClass File;
	public MyHelperClass cacheInfo;
	public MyHelperClass MENU_TYPE_ICON;
	public MyHelperClass cacheDir;
	public MyHelperClass PREFIX;
	public MyHelperClass MessageImage;
	public MyHelperClass SUFIX;
	public MyHelperClass getServletConfig(){ return null; }

    protected InputStream createIconType(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        MyHelperClass JavaliController = new MyHelperClass();
        JavaliController.debug(JavaliController.LG_VERBOSE, "Creating iconType");
        MyHelperClass PRM_TYPE = new MyHelperClass();
        String cHash = PRM_TYPE + "=" + TP_ICON;
        String iconName =(String)(Object) req.getParameter("iconName");
        if (iconName == null) {
            res.sendError(res.SC_NOT_FOUND);
            return null;
        }
        Locale loc = null;
        HttpSession sess =(HttpSession)(Object) req.getSession(false);
        JavaliSession jsess = null;
        int menuType = -1;
        MyHelperClass PRM_MENU_TYPE = new MyHelperClass();
        String menuTypeString =(String)(Object) req.getParameter(PRM_MENU_TYPE);
        try {
            menuType = new Integer(menuTypeString).intValue();
        } catch (Exception e) {
        }
        MyHelperClass FormConstants = new MyHelperClass();
        if (sess != null) jsess = (JavaliSession)(JavaliSession)(Object) sess.getAttribute(FormConstants.SESSION_BINDING);
//        MyHelperClass FormConstants = new MyHelperClass();
        if (jsess != null && jsess.getUser() != null) loc =(Locale)(Object) jsess.getUser().getLocale(); else if (sess != null) loc = (Locale)(Locale)(Object) sess.getAttribute(FormConstants.LOCALE_BINDING);
        MyHelperClass Locale = new MyHelperClass();
        if (loc == null) loc =(Locale)(Object) Locale.getDefault();
        MyHelperClass MENU_TYPE_TEXTICON = new MyHelperClass();
        if (menuType == -1) menuType =(int)(Object) MENU_TYPE_TEXTICON;
        MyHelperClass JavaliResource = new MyHelperClass();
        String iconText =(String)(Object) JavaliResource.getString("icon." + iconName, loc);
        if (iconText == null) {
            MyHelperClass PRM_MENU_NAME = new MyHelperClass();
            iconText =(String)(Object) req.getParameter(PRM_MENU_NAME);
            if (iconText == null) iconText = "";
        }
        MyHelperClass PRM_ICON_NAME = new MyHelperClass();
        cHash += ", " + PRM_ICON_NAME + "=" + iconName + ", text=" + iconText + ", menuType=" + menuType;
        String iconFileName = null;
        MyHelperClass PRM_FONT_NAME = new MyHelperClass();
        String fontName =(String)(Object) req.getParameter(PRM_FONT_NAME);
        if (fontName == null) {
            fontName = "Helvetica";
        }
//        MyHelperClass PRM_FONT_NAME = new MyHelperClass();
        cHash += "," + PRM_FONT_NAME + "=" + fontName;
        MyHelperClass PRM_FONT_SIZE = new MyHelperClass();
        String fontSizeString =(String)(Object) req.getParameter(PRM_FONT_SIZE);
        int fontSize;
        try {
            fontSize = Integer.parseInt(fontSizeString);
        } catch (NumberFormatException nfe) {
            fontSize = 12;
        }
//        MyHelperClass PRM_FONT_SIZE = new MyHelperClass();
        cHash += "," + PRM_FONT_SIZE + "=" + fontSize;
        MyHelperClass PRM_FONT_TYPE = new MyHelperClass();
        String fontTypeString =(String)(Object) req.getParameter(PRM_FONT_TYPE);
        MyHelperClass Font = new MyHelperClass();
        int fontType =(int)(Object) Font.BOLD;
//        MyHelperClass Font = new MyHelperClass();
        if ("PLAIN".equalsIgnoreCase(fontTypeString)) fontType =(int)(Object) Font.PLAIN;
//        MyHelperClass Font = new MyHelperClass();
        if ("BOLD".equalsIgnoreCase(fontTypeString)) fontType =(int)(Object) Font.BOLD;
//        MyHelperClass Font = new MyHelperClass();
        if ("ITALIC".equalsIgnoreCase(fontTypeString)) fontType =(int)(Object) Font.ITALIC;
        if ("ITALICBOLD".equalsIgnoreCase(fontTypeString) || "BOLDITALIC".equalsIgnoreCase(fontTypeString) || "BOLD_ITALIC".equalsIgnoreCase(fontTypeString) || "ITALIC_BOLD".equalsIgnoreCase(fontTypeString)) {
//            MyHelperClass Font = new MyHelperClass();
            fontType =(int)(Object) Font.ITALIC | (int)(Object)Font.BOLD;
        }
//        MyHelperClass PRM_FONT_TYPE = new MyHelperClass();
        cHash += "," + PRM_FONT_TYPE + "=" + fontType;
        MyHelperClass PRM_FONT_COLOR = new MyHelperClass();
        String fontColor =(String)(Object) req.getParameter(PRM_FONT_COLOR);
        if (fontColor == null || fontColor.equals("")) fontColor = "0x000000";
//        MyHelperClass PRM_FONT_COLOR = new MyHelperClass();
        cHash += "," + PRM_FONT_COLOR + "=" + fontColor;
        MyHelperClass cacheInfo = new MyHelperClass();
        String fName =(String)(Object) cacheInfo.file(cHash);
//        MyHelperClass JavaliController = new MyHelperClass();
        JavaliController.debug(JavaliController.LG_VERBOSE, "Called for: " + fName);
        if (fName == null) {
//            MyHelperClass JavaliController = new MyHelperClass();
            JavaliController.debug(JavaliController.LG_VERBOSE, "No cache found for: " + cHash);
            if (getServletConfig() != null && getServletConfig().getServletContext() != null) {
                if (iconName != null && iconName.startsWith("/")) iconFileName =(String)(Object) getServletConfig().getServletContext().getRealPath(iconName + ".gif"); else iconFileName =(String)(Object) getServletConfig().getServletContext().getRealPath("/icons/" + iconName + ".gif");
                File iconFile = new File(iconFileName);
                if (!(Boolean)(Object)iconFile.exists()) {
                    JavaliController.debug(JavaliController.LG_VERBOSE, "Could not find: " + iconFileName);
                    res.sendError(res.SC_NOT_FOUND);
                    return null;
                }
                iconFileName =(String)(Object) iconFile.getAbsolutePath();
                JavaliController.debug(JavaliController.LG_VERBOSE, "file: " + iconFileName + " and cHash=" + cHash);
            } else {
                JavaliController.debug(JavaliController.LG_VERBOSE, "No ServletConfig=" + getServletConfig() + " or servletContext");
                res.sendError(res.SC_NOT_FOUND);
                return null;
            }
            File tmp =(File)(Object) File.createTempFile(PREFIX, SUFIX, cacheDir);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(tmp);
            if (menuType == (int)(Object)MENU_TYPE_ICON) {
                FileInputStream in = new FileInputStream(iconFileName);
                byte buf[] = new byte[2048];
                int read = -1;
                while ((read =(int)(Object) in.read(buf)) != -1) out.write(buf, 0, read);
            } else if (menuType == (int)(Object)MENU_TYPE_TEXT) MessageImage.sendAsGIF(MessageImage.makeMessageImage(iconText, fontName, fontSize, fontType, fontColor, false, "0x000000", true), out); else MessageImage.sendAsGIF(MessageImage.makeIconImage(iconFileName, iconText, fontName, fontColor, fontSize, fontType), out);
            out.close();
            cacheInfo.putFile(cHash, tmp);
            fName =(String)(Object) cacheInfo.file(cHash);
        }
        return (InputStream)(Object)new FileInputStream((String)(Object)new File(cacheDir, fName));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOCALE_BINDING;
	public MyHelperClass ITALIC;
	public MyHelperClass PLAIN;
	public MyHelperClass SESSION_BINDING;
	public MyHelperClass LG_VERBOSE;
	public MyHelperClass BOLD;
public MyHelperClass sendAsGIF(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass getString(String o0, Locale o1){ return null; }
	public MyHelperClass createTempFile(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getLocale(){ return null; }
	public MyHelperClass makeMessageImage(String o0, String o1, int o2, int o3, String o4, boolean o5, String o6, boolean o7){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass file(String o0){ return null; }
	public MyHelperClass putFile(String o0, File o1){ return null; }
	public MyHelperClass debug(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass makeIconImage(String o0, String o1, String o2, String o3, int o4, int o5){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getSession(boolean o0){ return null; }
	public MyHelperClass getParameter(MyHelperClass o0){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class InputStream {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Locale {

}

class HttpSession {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }}

class JavaliSession {

public MyHelperClass getUser(){ return null; }}

class File {

File(){}
	File(String o0){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}
