import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4080715 {
public MyHelperClass saveErrors(HttpServletRequest o0, ActionErrors o1){ return null; }
	public MyHelperClass saveMessages(HttpServletRequest o0, ActionMessages o1){ return null; }

    public ActionForward sendTrackback(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Throwable, RollerException {
        ActionMessages resultMsg = new ActionMessages();
        ActionForward forward =(ActionForward)(Object) mapping.findForward("weblogEdit.page");
        ActionErrors errors = new ActionErrors();
        WeblogEntryData entry = null;
        try {
            WeblogEntryFormEx form = (WeblogEntryFormEx)(WeblogEntryFormEx)(Object) actionForm;
            String entryid =(String)(Object) form.getId();
            if (entryid == null) {
                MyHelperClass RollerRequest = new MyHelperClass();
                entryid =(String)(Object) request.getParameter(RollerRequest.WEBLOGENTRYID_KEY);
            }
            MyHelperClass RollerFactory = new MyHelperClass();
            Roller roller =(Roller)(Object) RollerFactory.getRoller();
            MyHelperClass RollerContext = new MyHelperClass();
            RollerContext rctx =(RollerContext)(Object) RollerContext.getRollerContext();
            WeblogManager wmgr =(WeblogManager)(Object) roller.getWeblogManager();
            entry =(WeblogEntryData)(Object) wmgr.getWeblogEntry(entryid);
            MyHelperClass RollerSession = new MyHelperClass();
            RollerSession rses =(RollerSession)(Object) RollerSession.getRollerSession(request);
            if ((boolean)(Object)rses.isUserAuthorizedToAuthor(entry.getWebsite())) {
                PagePluginManager ppmgr =(PagePluginManager)(Object) roller.getPagePluginManager();
//                MyHelperClass RollerContext = new MyHelperClass();
                Map plugins =(Map)(Object) ppmgr.createAndInitPagePlugins(entry.getWebsite(), RollerContext.getRollerContext().getServletContext(), RollerContext.getRollerContext().getAbsoluteContextUrl(request), new VelocityContext());
                String content = "";
                MyHelperClass StringUtils = new MyHelperClass();
                if (!(Boolean)(Object)StringUtils.isEmpty(entry.getText())) {
                    content =(String)(Object) entry.getText();
                } else {
                    content =(String)(Object) entry.getSummary();
                }
                content =(String)(Object) ppmgr.applyPagePlugins(entry, plugins, content, true);
                String title =(String)(Object) entry.getTitle();
                MyHelperClass Utilities = new MyHelperClass();
                String excerpt =(String)(Object) StringUtils.left(Utilities.removeHTML(content), 255);
                String url =(String)(Object) rctx.createEntryPermalink(entry, request, true);
                String blog_name =(String)(Object) entry.getWebsite().getName();
                if (form.getTrackbackUrl() != null) {
                    boolean allowTrackback = true;
                    MyHelperClass RollerConfig = new MyHelperClass();
                    String allowedURLs =(String)(Object) RollerConfig.getProperty("trackback.allowedURLs");
                    if (allowedURLs != null && allowedURLs.trim().length() > 0) {
                        allowTrackback = false;
                        String[] splitURLs = allowedURLs.split("\\|\\|");
                        for (int i = 0; i < splitURLs.length; i++) {
                            MyHelperClass Pattern = new MyHelperClass();
                            Matcher m =(Matcher)(Object) Pattern.compile(splitURLs[i]).matcher(form.getTrackbackUrl());
                            if ((boolean)(Object)m.matches()) {
                                allowTrackback = true;
                                break;
                            }
                        }
                    }
                    if (!allowTrackback) {
                        MyHelperClass ActionErrors = new MyHelperClass();
                        errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.trackbackNotAllowed"));
                    } else {
                        try {
                            String data = URLEncoder.encode("title", "UTF-8") + "=" + URLEncoder.encode(title, "UTF-8");
                            data += ("&" + URLEncoder.encode("excerpt", "UTF-8") + "=" + URLEncoder.encode(excerpt, "UTF-8"));
                            data += ("&" + URLEncoder.encode("url", "UTF-8") + "=" + URLEncoder.encode(url, "UTF-8"));
                            data += ("&" + URLEncoder.encode("blog_name", "UTF-8") + "=" + URLEncoder.encode(blog_name, "UTF-8"));
                            URL tburl = new URL((String)(Object)form.getTrackbackUrl());
                            HttpURLConnection conn = (HttpURLConnection) tburl.openConnection();
                            conn.setDoOutput(true);
                            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                            BufferedReader rd = null;
                            try {
                                wr.write(data);
                                wr.flush();
                                boolean inputAvailable = false;
                                try {
                                    rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                                    inputAvailable = true;
                                } catch (Throwable e) {
                                    MyHelperClass mLogger = new MyHelperClass();
                                    mLogger.debug(e);
                                }
                                if (inputAvailable) {
                                    String line;
                                    StringBuffer resultBuff = new StringBuffer();
                                    while ((line = rd.readLine()) != null) {
//                                        MyHelperClass Utilities = new MyHelperClass();
                                        resultBuff.append(Utilities.escapeHTML(line, true));
                                        resultBuff.append("<br />");
                                    }
                                    MyHelperClass ActionMessages = new MyHelperClass();
                                    resultMsg.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("weblogEdit.trackbackResults", resultBuff));
                                }
                                if (conn.getResponseCode() > 399) {
                                    MyHelperClass ActionErrors = new MyHelperClass();
                                    errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("weblogEdit.trackbackStatusCodeBad", new Integer(conn.getResponseCode())));
                                } else {
                                    MyHelperClass ActionMessages = new MyHelperClass();
                                    resultMsg.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("weblogEdit.trackbackStatusCodeGood", new Integer(conn.getResponseCode())));
                                }
                            } finally {
                                if (wr != null) wr.close();
                                if (rd != null) rd.close();
                            }
                        } catch (IOException e) {
                            MyHelperClass ActionErrors = new MyHelperClass();
                            errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.trackback", e));
                        }
                    }
                } else {
                    MyHelperClass ActionErrors = new MyHelperClass();
                    errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.noTrackbackUrlSpecified"));
                }
                form.setTrackbackUrl(null);
            } else {
                forward =(ActionForward)(Object) mapping.findForward("access-denied");
            }
        } catch (Exception e) {
            MyHelperClass mLogger = new MyHelperClass();
            mLogger.error(e);
            String msg = e.getMessage();
            if (msg == null) {
                msg = e.getClass().getName();
            }
            MyHelperClass ActionErrors = new MyHelperClass();
            errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.general", msg));
        }
        saveErrors(request, errors);
        saveMessages(request, resultMsg);
        MyHelperClass WeblogEntryPageModel = new MyHelperClass();
        request.setAttribute("model", new WeblogEntryPageModel(request, response, mapping, (WeblogEntryFormEx)(WeblogEntryFormEx)(Object) actionForm, WeblogEntryPageModel.EDIT_MODE));
        return forward;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GLOBAL_ERROR;
	public MyHelperClass WEBLOGENTRYID_KEY;
	public MyHelperClass GLOBAL_MESSAGE;
	public MyHelperClass EDIT_MODE;
public MyHelperClass left(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass escapeHTML(String o0, boolean o1){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass removeHTML(String o0){ return null; }
	public MyHelperClass getRollerContext(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsoluteContextUrl(HttpServletRequest o0){ return null; }
	public MyHelperClass matcher(MyHelperClass o0){ return null; }
	public MyHelperClass getRollerSession(HttpServletRequest o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getRoller(){ return null; }
	public MyHelperClass debug(Throwable o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getParameter(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(String o0, WeblogEntryPageModel o1){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class RollerException extends Exception{
	public RollerException(String errorMessage) { super(errorMessage); }
}

class ActionMessages {

public MyHelperClass add(MyHelperClass o0, ActionMessage o1){ return null; }}

class ActionErrors {

public MyHelperClass add(MyHelperClass o0, ActionError o1){ return null; }}

class WeblogEntryData {

public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getSummary(){ return null; }}

class WeblogEntryFormEx {

public MyHelperClass getTrackbackUrl(){ return null; }
	public MyHelperClass setTrackbackUrl(Object o0){ return null; }
	public MyHelperClass getId(){ return null; }}

class Roller {

public MyHelperClass getPagePluginManager(){ return null; }
	public MyHelperClass getWeblogManager(){ return null; }}

class RollerContext {

public MyHelperClass createEntryPermalink(WeblogEntryData o0, HttpServletRequest o1, boolean o2){ return null; }}

class WeblogManager {

public MyHelperClass getWeblogEntry(String o0){ return null; }}

class RollerSession {

public MyHelperClass isUserAuthorizedToAuthor(MyHelperClass o0){ return null; }}

class PagePluginManager {

public MyHelperClass createAndInitPagePlugins(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, VelocityContext o3){ return null; }
	public MyHelperClass applyPagePlugins(WeblogEntryData o0, Map o1, String o2, boolean o3){ return null; }}

class Matcher {

public MyHelperClass matches(){ return null; }}

class WeblogEntryPageModel {

WeblogEntryPageModel(HttpServletRequest o0, HttpServletResponse o1, ActionMapping o2, WeblogEntryFormEx o3, MyHelperClass o4){}
	WeblogEntryPageModel(){}}

class VelocityContext {

}

class ActionError {

ActionError(){}
	ActionError(String o0, Integer o1){}
	ActionError(String o0, String o1){}
	ActionError(String o0){}
	ActionError(String o0, IOException o1){}}

class ActionMessage {

ActionMessage(){}
	ActionMessage(String o0, StringBuffer o1){}
	ActionMessage(String o0, Integer o1){}}
