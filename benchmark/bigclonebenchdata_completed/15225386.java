import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15225386 {
public MyHelperClass StringUtils;
	public MyHelperClass saveErrors(HttpServletRequest o0, ActionErrors o1){ return null; }
	public MyHelperClass saveMessages(HttpServletRequest o0, ActionMessages o1){ return null; }

    public ActionForward sendTrackback(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Throwable, RollerException {
        ActionForward forward =(ActionForward)(Object) mapping.findForward("weblogEdit.page");
        ActionErrors errors = new ActionErrors();
        WeblogEntryData entry = null;
        try {
            MyHelperClass RollerRequest = new MyHelperClass();
            RollerRequest rreq =(RollerRequest)(Object) RollerRequest.getRollerRequest(request);
            if ((boolean)(Object)rreq.isUserAuthorizedToEdit()) {
                WeblogEntryFormEx form = (WeblogEntryFormEx)(WeblogEntryFormEx)(Object) actionForm;
                String entryid =(String)(Object) form.getId();
                if (entryid == null) {
//                    MyHelperClass RollerRequest = new MyHelperClass();
                    entryid =(String)(Object) request.getParameter(RollerRequest.WEBLOGENTRYID_KEY);
                }
                MyHelperClass RollerContext = new MyHelperClass();
                RollerContext rctx =(RollerContext)(Object) RollerContext.getRollerContext(request);
                WeblogManager wmgr =(WeblogManager)(Object) rreq.getRoller().getWeblogManager();
                entry =(WeblogEntryData)(Object) wmgr.retrieveWeblogEntry(entryid);
                String title =(String)(Object) entry.getTitle();
                MyHelperClass PageHelper = new MyHelperClass();
                PageHelper pageHelper =(PageHelper)(Object) PageHelper.createPageHelper(request, response);
                pageHelper.setSkipFlag(true);
                String excerpt =(String)(Object) pageHelper.renderPlugins(entry);
                MyHelperClass Utilities = new MyHelperClass();
                excerpt =(String)(Object) StringUtils.left(Utilities.removeHTML(excerpt), 255);
                String url =(String)(Object) rctx.createEntryPermalink(entry, request, true);
                String blog_name =(String)(Object) entry.getWebsite().getName();
                if (form.getTrackbackUrl() != null) {
                    try {
                        String data = URLEncoder.encode("title", "UTF-8") + "=" + URLEncoder.encode(title, "UTF-8");
                        data += ("&" + URLEncoder.encode("excerpt", "UTF-8") + "=" + URLEncoder.encode(excerpt, "UTF-8"));
                        data += ("&" + URLEncoder.encode("url", "UTF-8") + "=" + URLEncoder.encode(url, "UTF-8"));
                        data += ("&" + URLEncoder.encode("blog_name", "UTF-8") + "=" + URLEncoder.encode(blog_name, "UTF-8"));
                        URL tburl = new URL((String)(Object)form.getTrackbackUrl());
                        URLConnection conn = tburl.openConnection();
                        conn.setDoOutput(true);
                        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                        wr.write(data);
                        wr.flush();
                        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String line;
                        StringBuffer resultBuff = new StringBuffer();
                        while ((line = rd.readLine()) != null) {
//                            MyHelperClass Utilities = new MyHelperClass();
                            resultBuff.append(Utilities.escapeHTML(line, true));
                            resultBuff.append("<br />");
                        }
                        ActionMessages resultMsg = new ActionMessages();
                        MyHelperClass ActionMessages = new MyHelperClass();
                        resultMsg.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("weblogEdit.trackbackResults", resultBuff));
                        saveMessages(request, resultMsg);
                        wr.close();
                        rd.close();
                    } catch (IOException e) {
                        MyHelperClass ActionErrors = new MyHelperClass();
                        errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.trackback", e));
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
        if (!(Boolean)(Object)errors.isEmpty()) {
            saveErrors(request, errors);
        }
        MyHelperClass WeblogEntryPageModel = new MyHelperClass();
        request.setAttribute("model", new WeblogEntryPageModel(request, response, mapping, (WeblogEntryFormEx)(WeblogEntryFormEx)(Object) actionForm, WeblogEntryPageModel.EDIT_MODE));
        return forward;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GLOBAL_MESSAGE;
	public MyHelperClass EDIT_MODE;
	public MyHelperClass GLOBAL_ERROR;
	public MyHelperClass WEBLOGENTRYID_KEY;
public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRollerRequest(HttpServletRequest o0){ return null; }
	public MyHelperClass left(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass escapeHTML(String o0, boolean o1){ return null; }
	public MyHelperClass createPageHelper(HttpServletRequest o0, HttpServletResponse o1){ return null; }
	public MyHelperClass removeHTML(String o0){ return null; }
	public MyHelperClass getRollerContext(HttpServletRequest o0){ return null; }
	public MyHelperClass getWeblogManager(){ return null; }}

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

class ActionErrors {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass add(MyHelperClass o0, ActionError o1){ return null; }}

class WeblogEntryData {

public MyHelperClass getWebsite(){ return null; }
	public MyHelperClass getTitle(){ return null; }}

class RollerRequest {

public MyHelperClass isUserAuthorizedToEdit(){ return null; }
	public MyHelperClass getRoller(){ return null; }}

class WeblogEntryFormEx {

public MyHelperClass getTrackbackUrl(){ return null; }
	public MyHelperClass setTrackbackUrl(Object o0){ return null; }
	public MyHelperClass getId(){ return null; }}

class RollerContext {

public MyHelperClass createEntryPermalink(WeblogEntryData o0, HttpServletRequest o1, boolean o2){ return null; }}

class WeblogManager {

public MyHelperClass retrieveWeblogEntry(String o0){ return null; }}

class PageHelper {

public MyHelperClass setSkipFlag(boolean o0){ return null; }
	public MyHelperClass renderPlugins(WeblogEntryData o0){ return null; }}

class ActionMessages {

public MyHelperClass add(MyHelperClass o0, ActionMessage o1){ return null; }}

class WeblogEntryPageModel {

WeblogEntryPageModel(HttpServletRequest o0, HttpServletResponse o1, ActionMapping o2, WeblogEntryFormEx o3, MyHelperClass o4){}
	WeblogEntryPageModel(){}}

class ActionMessage {

ActionMessage(){}
	ActionMessage(String o0, StringBuffer o1){}}

class ActionError {

ActionError(String o0){}
	ActionError(){}
	ActionError(String o0, IOException o1){}
	ActionError(String o0, String o1){}}
