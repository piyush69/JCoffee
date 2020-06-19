


class c15940692 {
public MyHelperClass FileUtil;

//    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String fileName =(String)(Object) request.getParameter("tegsoftFileName");
            if (fileName.startsWith("Tegsoft_BACKUP_")) {
                fileName = fileName.substring("Tegsoft_BACKUP_".length());
                String targetFileName = "/home/customer/" + fileName;
                response.setContentType("application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
                FileInputStream is = new FileInputStream(targetFileName);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, response.getOutputStream());
                is.close();
                return;
            }
            if (fileName.equals("Tegsoft_ASTMODULES")) {
                MyHelperClass tobeHome = new MyHelperClass();
                String targetFileName = tobeHome + "/setup/Tegsoft_ASTMODULES.tgz";
                response.setContentType("application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
                FileInputStream is = new FileInputStream(targetFileName);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, response.getOutputStream());
                is.close();
                return;
            }
            if (fileName.equals("Tegsoft_ASTSBIN")) {
                MyHelperClass tobeHome = new MyHelperClass();
                String targetFileName = tobeHome + "/setup/Tegsoft_ASTSBIN.tgz";
                response.setContentType("application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
                FileInputStream is = new FileInputStream(targetFileName);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, response.getOutputStream());
                is.close();
                return;
            }
            if (!fileName.startsWith("Tegsoft_")) {
                return;
            }
            if (!fileName.endsWith(".zip")) {
                return;
            }
            if (fileName.indexOf("_") < 0) {
                return;
            }
            fileName = fileName.substring(fileName.indexOf("_") + 1);
            if (fileName.indexOf("_") < 0) {
                return;
            }
            String fileType = fileName.substring(0, fileName.indexOf("_"));
            MyHelperClass tobeHome = new MyHelperClass();
            String destinationFileName = tobeHome + "/setup/Tegsoft_" + fileName;
            if (!(Boolean)(Object)new File(destinationFileName).exists()) {
                if ("FORMS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/forms", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("IMAGES".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/image", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("VIDEOS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/videos", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("TEGSOFTJARS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/WEB-INF/lib/", tobeHome + "/setup/Tegsoft_" + fileName, "Tegsoft", "jar");
                } else if ("TOBEJARS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/WEB-INF/lib/", tobeHome + "/setup/Tegsoft_" + fileName, "Tobe", "jar");
                } else if ("ALLJARS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/WEB-INF/lib/", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("DB".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage(tobeHome + "/sql", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("CONFIGSERVICE".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage("/tegsoft/src/java/TegsoftTelecom/configFiles/init.d/", tobeHome + "/setup/Tegsoft_" + fileName, "tegsoft", null);
                } else if ("CONFIGSCRIPTS".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage("/tegsoft/src/java/TegsoftTelecom/configFiles/root/", tobeHome + "/setup/Tegsoft_" + fileName, "tegsoft", null);
                } else if ("CONFIGFOP".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage("/tegsoft/src/java/TegsoftTelecom/configFiles/fop/", tobeHome + "/setup/Tegsoft_" + fileName);
                } else if ("CONFIGASTERISK".equals(fileType)) {
//                    MyHelperClass tobeHome = new MyHelperClass();
                    FileUtil.createZipPackage("/tegsoft/src/java/TegsoftTelecom/configFiles/asterisk/", tobeHome + "/setup/Tegsoft_" + fileName);
                }
            }
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            FileInputStream is = new FileInputStream(destinationFileName);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, response.getOutputStream());
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createZipPackage(String o0, String o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass createZipPackage(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass createZipPackage(String o0, String o1, String o2, Object o3){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}
