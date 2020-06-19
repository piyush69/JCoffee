import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6961579 {
public MyHelperClass report;
	public MyHelperClass ReportFactory;
	public MyHelperClass _applyPermissions(ActionRequest o0, MyHelperClass o1){ return null; }
	public MyHelperClass _getUser(ActionRequest o0){ return null; }
	public MyHelperClass _checkWritePermissions(MyHelperClass o0, User o1, HttpServletRequest o2, ArrayList<String o3){ return null; }

    public void processAction(ActionMapping mapping, ActionForm form, PortletConfig config, ActionRequest req, ActionResponse res) throws Throwable, Exception {
        boolean editor = false;
        MyHelperClass ViewReportsAction = new MyHelperClass();
        req.setAttribute(ViewReportsAction.REPORT_EDITOR_OR_ADMIN, false);
        User user = _getUser(req);
        MyHelperClass RoleFactory = new MyHelperClass();
        List<Role> roles = RoleFactory.getAllRolesForUser(user.getUserId());
        for (Role role : roles) {
            if (role.getName().equals("Report Administrator") || role.getName().equals("Report Editor") || role.getName().equals("CMS Administrator")) {
//                MyHelperClass ViewReportsAction = new MyHelperClass();
                req.setAttribute(ViewReportsAction.REPORT_EDITOR_OR_ADMIN, true);
                editor = true;
                break;
            }
        }
        boolean requiresInput = NULL; //new boolean();
        requiresInput = false;
        boolean badParameters = NULL; //new boolean();
        badParameters = false;
        boolean newReport = NULL; //new boolean();
        newReport = false;
        ActionRequestImpl reqImpl = (ActionRequestImpl)(ActionRequestImpl)(Object) req;
        HttpServletRequest httpReq = reqImpl.getHttpServletRequest();
        MyHelperClass Constants = new MyHelperClass();
        String cmd = req.getParameter(Constants.CMD);
        MyHelperClass Logger = new MyHelperClass();
        Logger.debug(this, "Inside EditReportAction cmd=" + cmd);
        ReportForm rfm = (ReportForm)(ReportForm)(Object) form;
        MyHelperClass DbConnectionFactory = new MyHelperClass();
        ArrayList<String> ds = (DbConnectionFactory.getAllDataSources());
        ArrayList<DataSource> dsResults = new ArrayList<DataSource>();
        for (String dataSource : ds) {
            DataSource d = rfm.getNewDataSource();
            if (dataSource.equals(Constants.DATABASE_DEFAULT_DATASOURCE)) {
                d.setDsName("DotCMS Datasource");
            } else {
                d.setDsName(dataSource);
            }
            dsResults.add(d);
        }
        rfm.setDataSources(dsResults);
        httpReq.setAttribute("dataSources", rfm.getDataSources());
        MyHelperClass UtilMethods = new MyHelperClass();
        Long reportId = UtilMethods.parseLong(req.getParameter("reportId"), 0);
        String referrer = req.getParameter("referrer");
        if (reportId > 0) {
            MyHelperClass report = new MyHelperClass();
            report = ReportFactory.getReport(reportId);
            ArrayList<String> adminRoles = new ArrayList<String>();
            adminRoles.add(Constants.ROLE_REPORT_ADMINISTRATOR);
//            MyHelperClass report = new MyHelperClass();
            if (user.getUserId().equals(report.getOwner())) {
//                MyHelperClass report = new MyHelperClass();
                _checkWritePermissions(report, user, httpReq, adminRoles);
            }
//            MyHelperClass Constants = new MyHelperClass();
            if (cmd == null || !cmd.equals(Constants.EDIT)) {
//                MyHelperClass report = new MyHelperClass();
                rfm.setSelectedDataSource(report.getDs());
//                MyHelperClass report = new MyHelperClass();
                rfm.setReportName(report.getReportName());
//                MyHelperClass report = new MyHelperClass();
                rfm.setReportDescription(report.getReportDescription());
//                MyHelperClass report = new MyHelperClass();
                rfm.setReportId(report.getInode());
//                MyHelperClass report = new MyHelperClass();
                rfm.setWebFormReport(report.isWebFormReport());
//                MyHelperClass report = new MyHelperClass();
                httpReq.setAttribute("selectedDS", report.getDs());
            }
        } else {
            if (!editor) {
                throw new DotRuntimeException("user not allowed to create a new report");
            }
            MyHelperClass report = new MyHelperClass();
            report = new Report();
//            MyHelperClass report = new MyHelperClass();
            report.setOwner(_getUser(req).getUserId());
//            MyHelperClass newReport = new MyHelperClass();
            newReport =(MyHelperClass)(Object) true;
        }
        MyHelperClass WebKeys = new MyHelperClass();
        req.setAttribute(WebKeys.PERMISSION_INODE_EDIT, report);
//        MyHelperClass Constants = new MyHelperClass();
        if ((cmd != null) && cmd.equals(Constants.EDIT)) {
            MyHelperClass Validator = new MyHelperClass();
            if (Validator.validate(req, form, mapping)) {
                MyHelperClass report = new MyHelperClass();
                report.setReportName(rfm.getReportName());
//                MyHelperClass report = new MyHelperClass();
                report.setReportDescription(rfm.getReportDescription());
//                MyHelperClass report = new MyHelperClass();
                report.setWebFormReport(rfm.isWebFormReport());
//                MyHelperClass report = new MyHelperClass();
                if (rfm.isWebFormReport()) report.setDs("None"); else report.setDs(rfm.getSelectedDataSource());
                String jrxmlPath = "";
                String jasperPath = "";
                try {
                    MyHelperClass HibernateUtil = new MyHelperClass();
                    HibernateUtil.startTransaction();
//                    MyHelperClass report = new MyHelperClass();
                    ReportFactory.saveReport(report);
//                    MyHelperClass report = new MyHelperClass();
                    _applyPermissions(req, report);
                    if (!rfm.isWebFormReport()) {
                        MyHelperClass Config = new MyHelperClass();
                        if (UtilMethods.isSet(Config.getStringProperty("ASSET_REAL_PATH"))) {
//                            MyHelperClass Config = new MyHelperClass();
                            jrxmlPath = Config.getStringProperty("ASSET_REAL_PATH") + File.separator + Config.getStringProperty("REPORT_PATH") + File.separator + report.getInode() + ".jrxml";
//                            MyHelperClass Config = new MyHelperClass();
                            jasperPath = Config.getStringProperty("ASSET_REAL_PATH") + File.separator + Config.getStringProperty("REPORT_PATH") + File.separator + report.getInode() + ".jasper";
                        } else {
//                            MyHelperClass Config = new MyHelperClass();
                            jrxmlPath = Config.CONTEXT.getRealPath(File.separator + Config.getStringProperty("REPORT_PATH") + File.separator + report.getInode() + ".jrxml");
//                            MyHelperClass Config = new MyHelperClass();
                            jasperPath = Config.CONTEXT.getRealPath(File.separator + Config.getStringProperty("REPORT_PATH") + File.separator + report.getInode() + ".jasper");
                        }
                        MyHelperClass PortalUtil = new MyHelperClass();
                        UploadPortletRequest upr = PortalUtil.getUploadPortletRequest(req);
                        File importFile = upr.getFile("jrxmlFile");
                        if (importFile.exists()) {
                            byte[] currentData = new byte[0];
                            FileInputStream is = new FileInputStream(importFile);
                            int size = is.available();
                            currentData = new byte[size];
                            is.read(currentData);
                            File f = new File(jrxmlPath);
                            FileChannel channelTo = (FileChannel)(Object)new FileOutputStream(f).getChannel();
                            MyHelperClass ByteBuffer = new MyHelperClass();
                            ByteBuffer currentDataBuffer = ByteBuffer.allocate(currentData.length);
                            currentDataBuffer.put(currentData);
                            currentDataBuffer.position(0);
                            channelTo.write(currentDataBuffer);
                            channelTo.force(false);
                            channelTo.close();
                            try {
                                MyHelperClass JasperCompileManager = new MyHelperClass();
                                JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);
                            } catch (Exception e) {
//                                MyHelperClass Logger = new MyHelperClass();
                                Logger.error(this, "Unable to compile or save jrxml: " + e.toString());
                                try {
                                    f = new File(jrxmlPath);
                                    f.delete();
                                } catch (Exception ex) {
                                    MyHelperClass Logger = new MyHelperClass();
                                    Logger.info(this, "Unable to delete jrxml. This is usually a permissions problem.");
                                }
                                try {
                                    f = new File(jasperPath);
                                    f.delete();
                                } catch (Exception ex) {
                                    MyHelperClass Logger = new MyHelperClass();
                                    Logger.info(this, "Unable to delete jasper. This is usually a permissions problem.");
                                }
                                MyHelperClass HibernateUtil = new MyHelperClass();
                                HibernateUtil.rollbackTransaction();
                                MyHelperClass UtilMethods = new MyHelperClass();
                                SessionMessages.add(req, "error", UtilMethods.htmlLineBreak(e.getMessage()));
                                setForward(req, "portlet.ext.report.edit_report");
                                return;
                            }
                            MyHelperClass JRLoader = new MyHelperClass();
                            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperPath);
                            MyHelperClass report = new MyHelperClass();
                            ReportParameterFactory.deleteReportsParameters(report);
                            _loadReportParameters(jasperReport.getParameters());
                            MyHelperClass requiresInput = new MyHelperClass();
                            report.setRequiresInput(requiresInput);
                            MyHelperClass report = new MyHelperClass();
                            HibernateUtil.save(report);
                        MyHelperClass newReport = new MyHelperClass();
                        } else if (newReport) {
                            MyHelperClass HibernateUtil = new MyHelperClass();
                            HibernateUtil.rollbackTransaction();
                            MyHelperClass SessionMessages = new MyHelperClass();
                            SessionMessages.add(req, "error", "message.report.compile.error");
                            setForward(req, "portlet.ext.report.edit_report");
                            return;
                        }
                    }
                    MyHelperClass HibernateUtil = new MyHelperClass();
                    HibernateUtil.commitTransaction();
                    HashMap params = new HashMap();
                    MyHelperClass SessionMessages = new MyHelperClass();
                    SessionMessages.add(req, "message", "message.report.upload.success");
                    params.put("struts_action", new String[] { "/ext/report/view_reports" });
                    referrer = com.dotmarketing.util.PortletURLUtil.getRenderURL(((ActionRequestImpl) req).getHttpServletRequest(), MAXIMIZED.toString(), params);
                    _sendToReferral(req, res, referrer);
                    return;
                } catch (Exception ex) {
                    HibernateUtil.rollbackTransaction();
                    Logger.error(this, "Unable to save Report: " + ex.toString());
                    File f;
                    Logger.info(this, "Trying to delete jrxml");
                    try {
                        f = new File(jrxmlPath);
                        f.delete();
                    } catch (Exception e) {
                        Logger.info(this, "Unable to delete jrxml. This is usually because the file doesn't exist.");
                    }
                    try {
                        f = new File(jasperPath);
                        f.delete();
                    } catch (Exception e) {
                        Logger.info(this, "Unable to delete jasper. This is usually because the file doesn't exist.");
                    }
                    if (badParameters) {
                        SessionMessages.add(req, "error", ex.getMessage());
                    } else {
                        SessionMessages.add(req, "error", "message.report.compile.error");
                    }
                    setForward(req, "portlet.ext.report.edit_report");
                    return;
                }
            } else {
                setForward(req, "portlet.ext.report.edit_report");
            }
        }
        if ((cmd != null) && cmd.equals("downloadReportSource")) {
            ActionResponseImpl resImpl = (ActionResponseImpl) res;
            HttpServletResponse response = resImpl.getHttpServletResponse();
            if (!downloadSourceReport(reportId, httpReq, response)) {
                SessionMessages.add(req, "error", "message.report.source.file.not.found");
            }
        }
        setForward(req, "portlet.ext.report.edit_report");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTEXT;
	public MyHelperClass REPORT_EDITOR_OR_ADMIN;
	public MyHelperClass ROLE_REPORT_ADMINISTRATOR;
	public MyHelperClass EDIT;
	public MyHelperClass CMD;
	public MyHelperClass PERMISSION_INODE_EDIT;
	public MyHelperClass DATABASE_DEFAULT_DATASOURCE;
public MyHelperClass startTransaction(){ return null; }
	public MyHelperClass getAllDataSources(){ return null; }
	public MyHelperClass getUploadPortletRequest(ActionRequest o0){ return null; }
	public MyHelperClass getDs(){ return null; }
	public MyHelperClass debug(c6961579 o0, String o1){ return null; }
	public MyHelperClass getInode(){ return null; }
	public MyHelperClass getReportDescription(){ return null; }
	public MyHelperClass isWebFormReport(){ return null; }
	public MyHelperClass compileReportToFile(String o0, String o1){ return null; }
	public MyHelperClass setDs(String o0){ return null; }
	public MyHelperClass getOwner(){ return null; }
	public MyHelperClass validate(ActionRequest o0, ActionForm o1, ActionMapping o2){ return null; }
	public MyHelperClass error(c6961579 o0, String o1){ return null; }
	public MyHelperClass getReportName(){ return null; }
	public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass getStringProperty(String o0){ return null; }}

class ActionMapping {

}

class ActionForm {

}

class PortletConfig {

}

class ActionRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class ActionResponse {

}

class User {

public MyHelperClass getUserId(){ return null; }}

class Role {

public MyHelperClass getName(){ return null; }}

class ActionRequestImpl {

public MyHelperClass getHttpServletRequest(){ return null; }}

class HttpServletRequest {

}

class ReportForm {

public MyHelperClass getReportDescription(){ return null; }
	public MyHelperClass getReportName(){ return null; }
	public MyHelperClass getSelectedDataSource(){ return null; }
	public MyHelperClass isWebFormReport(){ return null; }
	public MyHelperClass getDataSources(){ return null; }
	public MyHelperClass setDataSources(ArrayList<DataSource o0){ return null; }
	public MyHelperClass getNewDataSource(){ return null; }}

class DataSource {

public MyHelperClass setDsName(String o0){ return null; }}

class DotRuntimeException extends Exception{
	public DotRuntimeException(String errorMessage) { super(errorMessage); }
}

class UploadPortletRequest {

public MyHelperClass getFile(String o0){ return null; }}

class FileChannel {

public MyHelperClass force(boolean o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass put(byte[] o0){ return null; }
	public MyHelperClass position(int o0){ return null; }}

class JasperReport {

}

class Report {

}
