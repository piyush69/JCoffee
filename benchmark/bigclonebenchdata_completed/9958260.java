import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9958260 {
public MyHelperClass IOUtils;
public MyHelperClass UUIDGenerator;
	public MyHelperClass UploadFileOne;
	public MyHelperClass getServlet(){ return null; }

    public String doAdd(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        UploadFileForm vo = (UploadFileForm)(UploadFileForm)(Object) form;
        FormFile file =(FormFile)(Object) vo.getFile();
        String inforId =(String)(Object) request.getParameter("inforId");
        System.out.println("inforId=" + inforId);
        if (file != null) {
            String realpath =(String)(Object) getServlet().getServletContext().getRealPath("/");
            realpath = realpath.replaceAll("\\\\", "/");
            String rootFilePath =(String)(Object) getServlet().getServletContext().getRealPath(request.getContextPath());
            rootFilePath = (new StringBuilder(String.valueOf(rootFilePath))).append(UploadFileOne.strPath).toString();
            String strAppend = (new StringBuilder(String.valueOf(UUIDGenerator.nextHex()))).append(UploadFileOne.getFileType(file)).toString();
            if ((int)(Object)file.getFileSize() != 0) {
                file.getInputStream();
                String name =(String)(Object) file.getFileName();
                String fullPath = realpath + "attach/" + strAppend + name;
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
                System.out.println("file name is :" + name);
            }
        }
        request.setAttribute("operating-status", "�����ɹ�!  ��ӭ����ʹ�á�");
        System.out.println("in the end....");
        return "aftersave";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass strPath;
public MyHelperClass getRealPath(MyHelperClass o0){ return null; }
	public MyHelperClass getFileType(FormFile o0){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass nextHex(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }}

class ActionMapping {

}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getContextPath(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

}

class UploadFileForm {

public MyHelperClass getFile(){ return null; }}

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
