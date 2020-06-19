import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16995204 {
public MyHelperClass doTrace(HttpServletRequest o0, MyHelperClass o1, Class o2, String o3){ return null; }
public MyHelperClass saveErrors(HttpServletRequest o0, ActionMessages o1){ return null; }
	public MyHelperClass getSendInstance(HttpServletRequest o0){ return null; }
	public MyHelperClass getPreferencesInstance(HttpServletRequest o0){ return null; }

    protected ActionForward doExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        ActionMessages errors = new ActionMessages();
        try {
            MyHelperClass FileUpload = new MyHelperClass();
            boolean isMultipart =(boolean)(Object) FileUpload.isMultipartContent(request);
            if (isMultipart) {
                Map fields = new HashMap();
                Vector attachments = new Vector();
                MyHelperClass diskFileUpload = new MyHelperClass();
                List items =(List)(Object) diskFileUpload.parseRequest(request);
                Iterator iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();
                    if ((boolean)(Object)item.isFormField()) {
                        fields.put(item.getFieldName(), item.getString());
                    } else {
                        MyHelperClass StringUtils = new MyHelperClass();
                        if (!(Boolean)(Object)StringUtils.isBlank(item.getName())) {
                            ByteArrayOutputStream baos = null;
                            try {
                                baos = new ByteArrayOutputStream();
                                MyHelperClass IOUtils = new MyHelperClass();
                                IOUtils.copy(item.getInputStream(), baos);
                                MailPartObj part = new MailPartObj();
                                part.setAttachent(baos.toByteArray());
                                part.setContentType(item.getContentType());
                                part.setName(item.getName());
                                part.setSize(item.getSize());
                                attachments.addElement(part);
                            } catch (Exception ex) {
                            } finally {
                                MyHelperClass IOUtils = new MyHelperClass();
                                IOUtils.closeQuietly(baos);
                            }
                        }
                    }
                }
                String body = "";
                if (fields.get("taBody") != null) {
                    body = (String) fields.get("taBody");
                } else if (fields.get("taReplyBody") != null) {
                    body = (String) fields.get("taReplyBody");
                }
                Preferences preferencesInstance =(Preferences)(Object) getPreferencesInstance(request);
                Send sendInstance =(Send)(Object) getSendInstance(request);
                String mid = (String) fields.get("mid");
                MyHelperClass Charset = new MyHelperClass();
                sendInstance.saveDraft(mid, Integer.parseInt((String) fields.get("identity")), (String) fields.get("to"), (String) fields.get("cc"), (String) fields.get("bcc"), (String) fields.get("subject"), body, attachments, preferencesInstance.getPreferences().isHtmlMessage(), Charset.defaultCharset().displayName(), (String) fields.get("priority"));
            } else {
                MyHelperClass ExceptionCode = new MyHelperClass();
                errors.add("general", new ActionMessage(ExceptionCode.ERROR_MESSAGES_PREFIX + "mail.send", "The form is null"));
                request.setAttribute("exception", "The form is null");
                request.setAttribute("newLocation", null);
                MyHelperClass DLog = new MyHelperClass();
                doTrace(request, DLog.ERROR, getClass(), "The form is null");
            }
        } catch (Exception ex) {
            MyHelperClass ExceptionUtilities = new MyHelperClass();
            String errorMessage =(String)(Object) ExceptionUtilities.parseMessage(ex);
            if (errorMessage == null) {
                errorMessage = "NullPointerException";
            }
            MyHelperClass ExceptionCode = new MyHelperClass();
            errors.add("general", new ActionMessage(ExceptionCode.ERROR_MESSAGES_PREFIX + "general", errorMessage));
            request.setAttribute("exception", errorMessage);
            MyHelperClass DLog = new MyHelperClass();
            doTrace(request, DLog.ERROR, getClass(), errorMessage);
        } finally {
        }
        if ((boolean)(Object)errors.isEmpty()) {
            MyHelperClass DLog = new MyHelperClass();
            doTrace(request, DLog.INFO, getClass(), "OK");
            MyHelperClass Constants = new MyHelperClass();
            return(ActionForward)(Object) mapping.findForward(Constants.ACTION_SUCCESS_FORWARD);
        } else {
            saveErrors(request, errors);
            MyHelperClass Constants = new MyHelperClass();
            return(ActionForward)(Object) mapping.findForward(Constants.ACTION_FAIL_FORWARD);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGES_PREFIX;
	public MyHelperClass INFO;
	public MyHelperClass ACTION_FAIL_FORWARD;
	public MyHelperClass ACTION_SUCCESS_FORWARD;
	public MyHelperClass ERROR;
public MyHelperClass isMultipartContent(HttpServletRequest o0){ return null; }
	public MyHelperClass isBlank(MyHelperClass o0){ return null; }
	public MyHelperClass parseMessage(Exception o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass displayName(){ return null; }
	public MyHelperClass parseRequest(HttpServletRequest o0){ return null; }
	public MyHelperClass isHtmlMessage(){ return null; }
	public MyHelperClass closeQuietly(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass defaultCharset(){ return null; }}

class ActionMapping {

public MyHelperClass findForward(MyHelperClass o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, Object o1){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class ActionMessages {

public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass add(String o0, ActionMessage o1){ return null; }}

class FileItem {

public MyHelperClass isFormField(){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getFieldName(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getName(){ return null; }}

class MailPartObj {

public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }
	public MyHelperClass setAttachent(byte[] o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class Preferences {

public MyHelperClass getPreferences(){ return null; }}

class Send {

public MyHelperClass saveDraft(String o0, int o1, String o2, String o3, String o4, String o5, String o6, Vector o7, MyHelperClass o8, MyHelperClass o9, String o10){ return null; }}

class ActionMessage {

ActionMessage(String o0, String o1){}
	ActionMessage(){}}
