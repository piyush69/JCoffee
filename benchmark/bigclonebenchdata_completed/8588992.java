


class c8588992 {
public MyHelperClass Categories;

    public ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String status = null;
        HttpSession session =(HttpSession)(Object) request.getSession();
        ReportingBean reportingBean = null;
        NewConceptBean conceptBean = null;
        String conceptName = null;
        String primitive = null;
        MyHelperClass MessageResources = new MyHelperClass();
        MessageResources errorMessages =(MessageResources)(Object) MessageResources.getMessageResources("com.apelon.apps.dts.treebrowser.resources.error_messages");
        LogonUtilities logonUtilities = new LogonUtilities();
        if ((boolean)(Object)logonUtilities.checkSession(session, status, reportingBean, errorMessages)) {
            reportingBean = (ReportingBean)(ReportingBean)(Object) session.getAttribute("reportingBean");
            if ((int)(Object)(reportingBean.getMessageHtml().indexOf("Classify")) == -1) {
                reportingBean.setReportingHtml("");
            }
            conceptBean = (NewConceptBean)(NewConceptBean)(Object) session.getAttribute("newConceptEntity");
            conceptName =(String)(Object) request.getParameter("conceptName");
            primitive =(String)(Object) request.getParameter("primitive");
            if (primitive == null) {
                primitive = "false";
            }
            conceptBean.setConceptName(conceptName);
            conceptBean.setPrimitive(primitive);
            String namespace =(String)(Object) conceptBean.getConceptNamespace();
            if (namespace == null) {
                reportingBean.setReportingHtml((String)(Object)errorMessages.getMessage("classify_3"));
                session.setAttribute("reportingBean", reportingBean);
                status = "classify_fail";
                return ((ActionForward)(Object)mapping.findForward(status));
            }
            String[] roleMods =(String[])(Object) request.getParameterValues("some_or_all");
            String[] roleGrps =(String[])(Object) request.getParameterValues("role_group");
            Vector roles =(Vector)(Object) conceptBean.getRoles();
            RoleBean[] roleCons = new RoleBean[(int)(Object)roles.size()];
            roles.copyInto(roleCons);
            if (roleMods != null && roleGrps != null && roleCons != null) {
                if (roleCons.length == roleMods.length && roleCons.length == roleGrps.length) {
                    for (int i = 0; i < roleCons.length; i++) {
                        roleCons[i].setSomeOrAll(roleMods[i]);
                        roleCons[i].setRoleGroup(roleGrps[i]);
                    }
                }
            }
            session.setAttribute("newConceptEntity", conceptBean);
            NewConceptXMLDisplayBean xmlBean = new NewConceptXMLDisplayBean();
            xmlBean.setNewConceptXml(conceptBean);
            MyHelperClass BrowserUtilities = new MyHelperClass();
            String data = BrowserUtilities.encodeUrl("conceptXml") + "=" + BrowserUtilities.encodeUrl((String)(Object)xmlBean.getNewConceptXml()) + "&" + BrowserUtilities.encodeUrl("nameSpace") + "=" + BrowserUtilities.encodeUrl(namespace);
            XMLPropertyHandler configPh = new XMLPropertyHandler("dtsbrowserclassify.xml");
            Properties configProps =(Properties)(Object) configPh.getProps();
            String urlString =(String)(Object) configProps.getProperty("url");
            URL url = new URL(urlString);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line =(String)(Object) rd.readLine()) != null) {
                buf.append(line);
            }
            String resultXml = buf.toString();
            wr.close();
            rd.close();
            ClassifiedConceptBean ccBean = new ClassifiedConceptBean();
            ClassifyResultParser parser = new ClassifyResultParser(resultXml);
            ResultBuilder rbuilder = new ResultBuilder();
            rbuilder.setConceptBean(ccBean);
            rbuilder.setParser(parser);
            rbuilder.setNamespace(namespace);
            try {
                rbuilder.buildResult();
                ccBean =(ClassifiedConceptBean)(Object) rbuilder.getConceptBean();
                ClassifiedConceptDisplayBean displayBean = new ClassifiedConceptDisplayBean();
                displayBean.setNewConceptHtml(ccBean);
                session.setAttribute("classifyResult", ccBean);
                session.setAttribute("classifyDisplayResult", displayBean);
                status = "success";
            } catch (Exception e) {
                MyHelperClass StackTracePrinter = new MyHelperClass();
                Categories.dataServer().error(StackTracePrinter.getStackTrace(e));
                reportingBean.setReportingHtml(errorMessages.getMessage("classify_1") + e.getMessage());
                session.setAttribute("reportingBean", reportingBean);
                status = "classify_fail";
            }
        }
        return ((ActionForward)(Object)mapping.findForward(status));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(MyHelperClass o0){ return null; }
	public MyHelperClass dataServer(){ return null; }
	public MyHelperClass getStackTrace(Exception o0){ return null; }
	public MyHelperClass encodeUrl(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getMessageResources(String o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass setAttribute(String o0, ClassifiedConceptBean o1){ return null; }
	public MyHelperClass setAttribute(String o0, ClassifiedConceptDisplayBean o1){ return null; }
	public MyHelperClass setAttribute(String o0, NewConceptBean o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, ReportingBean o1){ return null; }}

class ReportingBean {

public MyHelperClass setReportingHtml(String o0){ return null; }
	public MyHelperClass getMessageHtml(){ return null; }}

class NewConceptBean {

public MyHelperClass getConceptNamespace(){ return null; }
	public MyHelperClass setConceptName(String o0){ return null; }
	public MyHelperClass setPrimitive(String o0){ return null; }
	public MyHelperClass getRoles(){ return null; }}

class MessageResources {

public MyHelperClass getMessage(String o0){ return null; }}

class LogonUtilities {

public MyHelperClass checkSession(HttpSession o0, String o1, ReportingBean o2, MessageResources o3){ return null; }}

class Vector {

public MyHelperClass size(){ return null; }
	public MyHelperClass copyInto(RoleBean[] o0){ return null; }}

class RoleBean {

public MyHelperClass setSomeOrAll(String o0){ return null; }
	public MyHelperClass setRoleGroup(String o0){ return null; }}

class NewConceptXMLDisplayBean {

public MyHelperClass getNewConceptXml(){ return null; }
	public MyHelperClass setNewConceptXml(NewConceptBean o0){ return null; }}

class XMLPropertyHandler {

XMLPropertyHandler(String o0){}
	XMLPropertyHandler(){}
	public MyHelperClass getProps(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ClassifiedConceptBean {

}

class ClassifyResultParser {

ClassifyResultParser(String o0){}
	ClassifyResultParser(){}}

class ResultBuilder {

public MyHelperClass getConceptBean(){ return null; }
	public MyHelperClass setNamespace(String o0){ return null; }
	public MyHelperClass buildResult(){ return null; }
	public MyHelperClass setConceptBean(ClassifiedConceptBean o0){ return null; }
	public MyHelperClass setParser(ClassifyResultParser o0){ return null; }}

class ClassifiedConceptDisplayBean {

public MyHelperClass setNewConceptHtml(ClassifiedConceptBean o0){ return null; }}
