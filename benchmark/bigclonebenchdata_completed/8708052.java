import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8708052 {

    public ActionForward dbExecute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse) throws Throwable, DatabaseException {
        Integer key;
        SubmitUserForm form = (SubmitUserForm)(SubmitUserForm)(Object) pForm;
        if (pRequest.getParameter("key") == null) {
            key =(Integer)(Object) form.getPrimaryKey();
        } else {
            key = Integer.parseInt((String)(Object)pRequest.getParameter("key"));
        }
        User currentUser = (User)(User)(Object) (pRequest.getSession().getAttribute("login"));
        if ((currentUser == null) || (!(Boolean)(Object)currentUser.getAdminRights() && ((Integer)(Object)currentUser.getPrimaryKey() != key))) {
            return ((ActionForward)(Object)pMapping.findForward("denied"));
        }
        if ((boolean)(Object)currentUser.getAdminRights()) {
            pRequest.setAttribute("isAdmin", new Boolean(true));
        }
        if ((boolean)(Object)currentUser.getPDFRights()) {
            pRequest.setAttribute("pdfRights", Boolean.TRUE);
        }
        MyHelperClass database = new MyHelperClass();
        User user =(User)(Object) database.acquireUserByPrimaryKey(key);
        if ((boolean)(Object)user.isSuperAdmin() && !(Boolean)(Object)currentUser.isSuperAdmin()) {
            return ((ActionForward)(Object)pMapping.findForward("denied"));
        }
        pRequest.setAttribute("user", user);
//        MyHelperClass database = new MyHelperClass();
        pRequest.setAttribute("taxonomy",(User)(Object) database.acquireTaxonomy());
        if (form.getAction().equals("none")) {
            form.setPrimaryKey(user.getPrimaryKey());
        }
        if (form.getAction().equals("edit")) {
            FormError formError =(FormError)(Object) form.validateFields();
            if (formError != null) {
                if (formError.getFormFieldErrors().get("firstName") != null) {
                    pRequest.setAttribute("FirstNameBad", new Boolean(true));
                }
                if (formError.getFormFieldErrors().get("lastName") != null) {
                    pRequest.setAttribute("LastNameBad", new Boolean(true));
                }
                if (formError.getFormFieldErrors().get("emailAddress") != null) {
                    pRequest.setAttribute("EmailAddressBad", new Boolean(true));
                }
                if (formError.getFormFieldErrors().get("mismatchPassword") != null) {
                    pRequest.setAttribute("mismatchPassword", new Boolean(true));
                }
                if (formError.getFormFieldErrors().get("shortPassword") != null) {
                    pRequest.setAttribute("shortPassword", new Boolean(true));
                }
                return ((ActionForward)(Object)pMapping.findForward("invalid"));
            }
            user.setFirstName(form.getFirstName());
            user.setLastName(form.getLastName());
            user.setEmailAddress(form.getEmailAddress());
            if (!form.getFirstPassword().equals("")) {
                MessageDigest md;
                try {
                    md = MessageDigest.getInstance("SHA");
                } catch (NoSuchAlgorithmException e) {
                    throw new DatabaseException("Could not hash password for storage: no such algorithm");
                }
                try {
                    md.update((byte)(Object)form.getFirstPassword().getBytes("UTF-8"));
                } catch (ArithmeticException e) {
                    throw new DatabaseException("Could not hash password for storage: no such encoding");
                }
                user.setPassword((new BASE64Encoder()).encode(md.digest()));
            }
            user.setTitle(form.getTitle());
            user.setDegree(form.getDegree());
            user.setAddress(form.getAddress());
            user.setNationality(form.getNationality());
            user.setLanguages(form.getLanguages());
            user.setHomepage(form.getHomepage());
            user.setInstitution(form.getInstitution());
            if (pRequest.getParameter("hideEmail") != null) {
                if (pRequest.getParameter("hideEmail").equals("on")) {
                    user.setHideEmail(true);
                }
            } else {
                user.setHideEmail(false);
            }
//            MyHelperClass database = new MyHelperClass();
            User storedUser =(User)(Object) database.acquireUserByPrimaryKey((Integer)(Object)user.getPrimaryKey());
            if ((boolean)(Object)currentUser.isSuperAdmin()) {
                if (pRequest.getParameter("admin") != null) {
                    user.setAdminRights(true);
                } else {
                    if (!(Boolean)(Object)storedUser.isSuperAdmin()) {
                        user.setAdminRights(false);
                    }
                }
            } else {
                user.setAdminRights((boolean)(Object)storedUser.getAdminRights());
            }
            if ((boolean)(Object)currentUser.isAdmin()) if (pRequest.getParameter("PDFRights") != null) user.setPDFRights(true); else user.setPDFRights(false);
            if ((boolean)(Object)currentUser.isAdmin()) {
                if (!(Boolean)(Object)storedUser.isAdmin() || !(Boolean)(Object)storedUser.isSuperAdmin()) {
                    if (pRequest.getParameter("active") != null) {
                        user.setActive(true);
                    } else {
                        user.setActive(false);
                    }
                } else {
                    user.setActive((boolean)(Object)storedUser.getActive());
                }
            }
            if ((Boolean)(Object)currentUser.isAdmin() || (Boolean)(Object)currentUser.isSuperAdmin()) {
                String[] categories =(String[])(Object) pRequest.getParameterValues("categories");
                user.setModeratorRights(new Categories());
                if (categories != null) {
                    try {
                        for (int i = 0; i < categories.length; i++) {
                            Integer catkey = Integer.parseInt(categories[i]);
//                            MyHelperClass database = new MyHelperClass();
                            Category cat =(Category)(Object) database.acquireCategoryByPrimaryKey(catkey);
                            user.getModeratorRights().add(cat);
                        }
                    } catch (NumberFormatException nfe) {
                        throw new DatabaseException("Invalid category key.");
                    }
                }
            }
            if (!(Boolean)(Object)currentUser.isAdmin() && !(Boolean)(Object)currentUser.isSuperAdmin()) {
                user.setAdminRights(false);
                user.setSuperAdminRights(false);
            }
//            MyHelperClass database = new MyHelperClass();
            database.updateUser(user);
            if (currentUser.getPrimaryKey() == user.getPrimaryKey()) {
                pRequest.getSession().setAttribute("login", user);
            }
            pRequest.setAttribute("helpKey", key);
            if ((Boolean)(Object)currentUser.isAdmin() || (Boolean)(Object)currentUser.isSuperAdmin()) {
                return ((ActionForward)(Object)pMapping.findForward("adminfinished"));
            }
            return ((ActionForward)(Object)pMapping.findForward("finished"));
        }
        return ((ActionForward)(Object)pMapping.findForward("success"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAttribute(String o0, User o1){ return null; }
	public MyHelperClass acquireCategoryByPrimaryKey(Integer o0){ return null; }
	public MyHelperClass add(Category o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass acquireTaxonomy(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass acquireUserByPrimaryKey(Integer o0){ return null; }
	public MyHelperClass updateUser(User o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, User o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, Boolean o1){ return null; }
	public MyHelperClass setAttribute(String o0, Integer o1){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SubmitUserForm {

public MyHelperClass getLastName(){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass getEmailAddress(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getLanguages(){ return null; }
	public MyHelperClass getInstitution(){ return null; }
	public MyHelperClass getNationality(){ return null; }
	public MyHelperClass setPrimaryKey(MyHelperClass o0){ return null; }
	public MyHelperClass getFirstPassword(){ return null; }
	public MyHelperClass getDegree(){ return null; }
	public MyHelperClass validateFields(){ return null; }
	public MyHelperClass getHomepage(){ return null; }
	public MyHelperClass getAction(){ return null; }}

class User {

public MyHelperClass getAdminRights(){ return null; }
	public MyHelperClass setAdminRights(boolean o0){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass setModeratorRights(Categories o0){ return null; }
	public MyHelperClass setLastName(MyHelperClass o0){ return null; }
	public MyHelperClass getModeratorRights(){ return null; }
	public MyHelperClass setAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setSuperAdminRights(boolean o0){ return null; }
	public MyHelperClass setHideEmail(boolean o0){ return null; }
	public MyHelperClass isSuperAdmin(){ return null; }
	public MyHelperClass setEmailAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setFirstName(MyHelperClass o0){ return null; }
	public MyHelperClass setLanguages(MyHelperClass o0){ return null; }
	public MyHelperClass getActive(){ return null; }
	public MyHelperClass setPassword(MyHelperClass o0){ return null; }
	public MyHelperClass setPDFRights(boolean o0){ return null; }
	public MyHelperClass setDegree(MyHelperClass o0){ return null; }
	public MyHelperClass setHomepage(MyHelperClass o0){ return null; }
	public MyHelperClass setInstitution(MyHelperClass o0){ return null; }
	public MyHelperClass setActive(boolean o0){ return null; }
	public MyHelperClass getPDFRights(){ return null; }
	public MyHelperClass setNationality(MyHelperClass o0){ return null; }
	public MyHelperClass isAdmin(){ return null; }}

class FormError {

public MyHelperClass getFormFieldErrors(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class Categories {

}

class Category {

}
