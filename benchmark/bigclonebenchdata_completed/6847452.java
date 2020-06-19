


class c6847452 {
public MyHelperClass IOUtils;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String act =(String)(Object) request.getParameter("act");
            if (null == act) {
            } else if ("down".equalsIgnoreCase(act)) {
                String vest =(String)(Object) request.getParameter("vest");
                String id =(String)(Object) request.getParameter("id");
                if (null == vest) {
                    t_attach_Form attach = null;
                    t_attach_QueryMap query = new t_attach_QueryMap();
                    attach =(t_attach_Form)(Object) query.getByID(id);
                    if (null != attach) {
                        String filename =(String)(Object) attach.getAttach_name();
                        String fullname =(String)(Object) attach.getAttach_fullname();
                        response.addHeader("Content-Disposition", "attachment;filename=" + filename + "");
                        File file = new File(fullname);
                        if ((boolean)(Object)file.exists()) {
                            java.io.FileInputStream in =(java.io.FileInputStream)(Object) new FileInputStream(file);
                            IOUtils.copy((FileInputStream)(Object)in, response.getOutputStream());
                        }
                    }
                } else if ("review".equalsIgnoreCase(vest)) {
                    t_infor_review_QueryMap reviewQuery = new t_infor_review_QueryMap();
                    t_infor_review_Form review =(t_infor_review_Form)(Object) reviewQuery.getByID(id);
                    String seq =(String)(Object) request.getParameter("seq");
                    String name = null, fullname = null;
                    if ("1".equals(seq)) {
                        name =(String)(Object) review.getAttachname1();
                        fullname =(String)(Object) review.getAttachfullname1();
                    } else if ("2".equals(seq)) {
                        name =(String)(Object) review.getAttachname2();
                        fullname =(String)(Object) review.getAttachfullname2();
                    } else if ("3".equals(seq)) {
                        name =(String)(Object) review.getAttachname3();
                        fullname =(String)(Object) review.getAttachfullname3();
                    }
                    MyHelperClass DownType = new MyHelperClass();
                    String downTypeStr =(String)(Object) DownType.getInst().getDownTypeByFileName(name);
                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("filename=" + name + " downtype=" + downTypeStr);
                    response.setContentType(downTypeStr);
                    response.addHeader("Content-Disposition", "attachment;filename=" + name + "");
                    File file = new File(fullname);
                    if ((boolean)(Object)file.exists()) {
                        java.io.FileInputStream in =(java.io.FileInputStream)(Object) new FileInputStream(file);
                        IOUtils.copy((FileInputStream)(Object)in, response.getOutputStream());
                        in.close();
                    }
                }
            } else if ("upload".equalsIgnoreCase(act)) {
                String infoId =(String)(Object) request.getParameter("inforId");
                MyHelperClass logger = new MyHelperClass();
                logger.debug("infoId=" + infoId);
            }
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInst(){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getDownTypeByFileName(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class t_attach_Form {

public MyHelperClass getAttach_name(){ return null; }
	public MyHelperClass getAttach_fullname(){ return null; }}

class t_attach_QueryMap {

public MyHelperClass getByID(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class t_infor_review_QueryMap {

public MyHelperClass getByID(String o0){ return null; }}

class t_infor_review_Form {

public MyHelperClass getAttachname2(){ return null; }
	public MyHelperClass getAttachfullname1(){ return null; }
	public MyHelperClass getAttachname3(){ return null; }
	public MyHelperClass getAttachfullname2(){ return null; }
	public MyHelperClass getAttachfullname3(){ return null; }
	public MyHelperClass getAttachname1(){ return null; }}
