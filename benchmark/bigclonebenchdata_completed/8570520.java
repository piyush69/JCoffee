import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8570520 {
public MyHelperClass IOUtils;
	public MyHelperClass saveErrors(HttpServletRequest o0, ActionErrors o1){ return null; }
public MyHelperClass logger;
	public MyHelperClass UUIDGenerator;
	public MyHelperClass UploadFileOne;
	public MyHelperClass getServlet(){ return null; }

    public String doAdd(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("doAdd(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse) - start");
        }
        t_information_EditMap editMap = new t_information_EditMap();
        try {
            t_information_Form vo = null;
            vo = (t_information_Form)(t_information_Form)(Object) form;
            vo.setCompany(vo.getCounty());
            if ("����".equals(vo.getInfo_type())) {
                vo.setInfo_level(null);
                vo.setAlert_level(null);
            }
            String str_postFIX = "";
            int i_p = 0;
            editMap.add(vo);
            try {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("���͹�˾�鱨��");
                String[] mobiles =(String[])(Object) request.getParameterValues("mobiles");
                vo.setMobiles(mobiles);
                MyHelperClass SMSService = new MyHelperClass();
                SMSService.inforAlert(vo);
            } catch (Exception e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.error("doAdd(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)", e);
            }
            String filename =(String)(Object) vo.getFile().getFileName();
            if (null != filename && !"".equals(filename)) {
                FormFile file =(FormFile)(Object) vo.getFile();
                String realpath =(String)(Object) getServlet().getServletContext().getRealPath("/");
                realpath = realpath.replaceAll("\\\\", "/");
                String inforId =(String)(Object) vo.getId();
                String rootFilePath =(String)(Object) getServlet().getServletContext().getRealPath(request.getContextPath());
                rootFilePath = (new StringBuilder(String.valueOf(rootFilePath))).append(UploadFileOne.strPath).toString();
                String strAppend = (new StringBuilder(String.valueOf(UUIDGenerator.nextHex()))).append(UploadFileOne.getFileType(file)).toString();
                if ((int)(Object)file.getFileSize() != 0) {
                    file.getInputStream();
                    String name =(String)(Object) file.getFileName();
                    i_p =(int)(Object) file.getFileName().lastIndexOf(".");
                    str_postFIX =(String)(Object) file.getFileName().substring(i_p, file.getFileName().length());
                    String fullPath = realpath + "attach/" + strAppend + str_postFIX;
                    t_attach attach = new t_attach();
                    attach.setAttach_fullname(fullPath);
                    attach.setAttach_name(name);
                    attach.setInfor_id(Integer.parseInt(inforId));
                    attach.setInsert_day(new Date());
                    attach.setUpdate_day(new Date());
                    t_attach_EditMap attachEdit = new t_attach_EditMap();
                    attachEdit.add(attach);
                    File sysfile = new File(fullPath);
                    if (!sysfile.exists()) {
                        sysfile.createNewFile();
                    }
                    java.io.OutputStream out = new FileOutputStream(sysfile);
                    IOUtils.copy(file.getInputStream(), out);
                    out.close();
                }
            }
        } catch (ArithmeticException e) {
            logger.error("doAdd(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)", e);
            ActionErrors errors = new ActionErrors();
            errors.add("org.apache.struts.action.GLOBAL_ERROR", new ActionError("error.database.save", e.toString()));
            saveErrors(request, errors);
            e.printStackTrace();
            request.setAttribute("t_information_Form", form);
            if ((boolean)(Object)logger.isDebugEnabled()) {
                logger.debug("doAdd(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse) - end");
            }
            return "addpage";
        }
        if ((boolean)(Object)logger.isDebugEnabled()) {
            logger.debug("doAdd(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse) - end");
        }
        return "aftersave";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass strPath;
public MyHelperClass error(String o0, HibernateException o1){ return null; }
	public MyHelperClass getRealPath(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getFileType(FormFile o0){ return null; }
	public MyHelperClass inforAlert(t_information_Form o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass nextHex(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class ActionMapping {

}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, ActionForm o1){ return null; }
	public MyHelperClass getContextPath(){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }}

class HttpServletResponse {

}

class t_information_EditMap {

public MyHelperClass add(t_information_Form o0){ return null; }}

class t_information_Form {

public MyHelperClass setAlert_level(Object o0){ return null; }
	public MyHelperClass getCounty(){ return null; }
	public MyHelperClass setInfo_level(Object o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setMobiles(String[] o0){ return null; }
	public MyHelperClass setCompany(MyHelperClass o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getInfo_type(){ return null; }}

class FormFile {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class t_attach {

public MyHelperClass setAttach_fullname(String o0){ return null; }
	public MyHelperClass setUpdate_day(Date o0){ return null; }
	public MyHelperClass setInsert_day(Date o0){ return null; }
	public MyHelperClass setInfor_id(int o0){ return null; }
	public MyHelperClass setAttach_name(String o0){ return null; }}

class t_attach_EditMap {

public MyHelperClass add(t_attach o0){ return null; }}

class HibernateException extends Exception{
	public HibernateException(String errorMessage) { super(errorMessage); }
}

class ActionErrors {

public MyHelperClass add(String o0, ActionError o1){ return null; }}

class ActionError {

ActionError(String o0, String o1){}
	ActionError(){}}
