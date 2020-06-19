import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16499419 {
public MyHelperClass saveFile(MyHelperClass o0, String o1){ return null; }
public MyHelperClass IOUtils;
public MyHelperClass LoginUtils;
	public MyHelperClass UUIDGenerator;
	public MyHelperClass UploadFileOne;
	public MyHelperClass getServlet(){ return null; }

    public String doAdd(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        UploadFileForm vo = (UploadFileForm)(UploadFileForm)(Object) form;
        String review =(String)(Object) request.getParameter("review");
        String realpath =(String)(Object) getServlet().getServletContext().getRealPath("/");
        realpath = realpath.replaceAll("\\\\", "/");
        String inforId =(String)(Object) request.getParameter("inforId");
        request.setAttribute("id", inforId);
        String str_postFIX = "";
        int i_p = 0;
        if (null == review) {
            FormFile file =(FormFile)(Object) vo.getFile();
            if (file != null) {
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
            request.setAttribute("operating-status", "�����ɹ�!  ��ӭ����ʹ�á�");
            return "editsave";
        } else {
            String rootFilePath =(String)(Object) getServlet().getServletContext().getRealPath(request.getContextPath());
            rootFilePath = (new StringBuilder(String.valueOf(rootFilePath))).append(UploadFileOne.strPath).toString();
            FormFile file =(FormFile)(Object) vo.getFile();
            FormFile file2 =(FormFile)(Object) vo.getFile2();
            FormFile file3 =(FormFile)(Object) vo.getFile3();
            t_infor_review newreview = new t_infor_review();
            String content =(String)(Object) request.getParameter("content");
            newreview.setContent(content);
            if (null != inforId) newreview.setInfor_id(Integer.parseInt(inforId));
            newreview.setInsert_day(new Date());
            UserDetails user =(UserDetails)(Object) LoginUtils.getLoginUser(request);
            newreview.setCreate_name(user.getUsercode());
            if (null != file.getFileName() && !"".equals(file.getFileName())) {
                newreview.setAttachname1(file.getFileName());
                String strAppend1 = (new StringBuilder(String.valueOf(UUIDGenerator.nextHex()))).append(UploadFileOne.getFileType(file)).toString();
                i_p =(int)(Object) file.getFileName().lastIndexOf(".");
                str_postFIX =(String)(Object) file.getFileName().substring(i_p, file.getFileName().length());
                newreview.setAttachfullname1(realpath + "attach/" + strAppend1 + str_postFIX);
                saveFile(file.getInputStream(), realpath + "attach/" + strAppend1 + str_postFIX);
            }
            if (null != file2.getFileName() && !"".equals(file2.getFileName())) {
                newreview.setAttachname2(file2.getFileName());
                String strAppend2 = (new StringBuilder(String.valueOf(UUIDGenerator.nextHex()))).append(UploadFileOne.getFileType(file)).toString();
                i_p =(int)(Object) file2.getFileName().lastIndexOf(".");
                str_postFIX =(String)(Object) file2.getFileName().substring(i_p, file2.getFileName().length());
                newreview.setAttachfullname2(realpath + "attach/" + strAppend2 + str_postFIX);
                saveFile(file2.getInputStream(), realpath + "attach/" + strAppend2 + str_postFIX);
            }
            if (null != file3.getFileName() && !"".equals(file3.getFileName())) {
                newreview.setAttachname3(file3.getFileName());
                String strAppend3 = (new StringBuilder(String.valueOf(UUIDGenerator.nextHex()))).append(UploadFileOne.getFileType(file)).toString();
                i_p =(int)(Object) file3.getFileName().lastIndexOf(".");
                str_postFIX =(String)(Object) file3.getFileName().substring(i_p, file3.getFileName().length());
                newreview.setAttachfullname3(realpath + "attach/" + strAppend3 + str_postFIX);
                saveFile(file3.getInputStream(), realpath + "attach/" + strAppend3 + str_postFIX);
            }
            t_infor_review_EditMap reviewEdit = new t_infor_review_EditMap();
            reviewEdit.add(newreview);
            request.setAttribute("review", "1");
            return "aftersave";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass strPath;
public MyHelperClass getLoginUser(HttpServletRequest o0){ return null; }
	public MyHelperClass getRealPath(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getFileType(FormFile o0){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
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

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getFile2(){ return null; }
	public MyHelperClass getFile3(){ return null; }}

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

class t_infor_review {

public MyHelperClass setAttachname1(MyHelperClass o0){ return null; }
	public MyHelperClass setAttachfullname2(String o0){ return null; }
	public MyHelperClass setAttachname3(MyHelperClass o0){ return null; }
	public MyHelperClass setAttachfullname3(String o0){ return null; }
	public MyHelperClass setInsert_day(Date o0){ return null; }
	public MyHelperClass setContent(String o0){ return null; }
	public MyHelperClass setCreate_name(MyHelperClass o0){ return null; }
	public MyHelperClass setAttachname2(MyHelperClass o0){ return null; }
	public MyHelperClass setInfor_id(int o0){ return null; }
	public MyHelperClass setAttachfullname1(String o0){ return null; }}

class UserDetails {

public MyHelperClass getUsercode(){ return null; }}

class t_infor_review_EditMap {

public MyHelperClass add(t_infor_review o0){ return null; }}
