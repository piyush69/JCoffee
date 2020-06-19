import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13255487 {
public MyHelperClass NULL;
public MyHelperClass RepositoryLocalDirectory;
	public MyHelperClass username;

    private synchronized boolean createOrganization(String organizationName, HttpServletRequest req) {
        if ((organizationName == null) || (organizationName.equals(""))) {
            String message =(String)(Object) NULL; //new String();
            message = "invalid new_organization_name.";
            return false;
        }
        MyHelperClass TextUtil = new MyHelperClass();
        String tmpxml =(String)(Object) TextUtil.xmlEscape(organizationName);
        MyHelperClass DBAccess = new MyHelperClass();
        String tmpdb =(String)(Object) DBAccess.SQLEscape(organizationName);
//        MyHelperClass TextUtil = new MyHelperClass();
        if ((!organizationName.equals(tmpxml)) || (!organizationName.equals(tmpdb)) || (!(Boolean)(Object)TextUtil.isValidFilename(organizationName))) {
            String message =(String)(Object) NULL; //new String();
            message = "invalid new_organization_name.";
            return false;
        }
        if ((organizationName.indexOf('-') > -1) || (organizationName.indexOf(' ') > -1)) {
            String message =(String)(Object) NULL; //new String();
            message = "invalid new_organization_name.";
            return false;
        }
        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        String[] orgnames =(String[])(Object) ServerConsoleServlet.getOrganizationNames();
        for (int i = 0; i < orgnames.length; i++) {
            if (orgnames.equals(organizationName)) {
                String message =(String)(Object) NULL; //new String();
                message = "already exists.";
                return false;
            }
        }
        String message =(String)(Object) NULL; //new String();
        message = "create new organization: " + organizationName;
        File newOrganizationDirectory = new File(RepositoryLocalDirectory.getAbsolutePath() + File.separator + organizationName);
        if (!newOrganizationDirectory.mkdir()) {
//            MyHelperClass message = new MyHelperClass();
            message =(String)(Object)(MyHelperClass)(Object) "cannot create directory.";
            return false;
        }
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        File cacheDir = new File(newOrganizationDirectory.getAbsolutePath() + File.separator + ServerConsoleServlet.getConfigByTagName("CacheDirName"));
        cacheDir.mkdir();
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        File confDir = new File(newOrganizationDirectory.getAbsolutePath() + File.separator + ServerConsoleServlet.getConfigByTagName("ConfDirName"));
        confDir.mkdir();
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        File rdfDir = new File(newOrganizationDirectory.getAbsolutePath() + File.separator + ServerConsoleServlet.getConfigByTagName("RDFDirName"));
        rdfDir.mkdir();
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        File resourceDir = new File(newOrganizationDirectory.getAbsolutePath() + File.separator + ServerConsoleServlet.getConfigByTagName("ResourceDirName"));
        resourceDir.mkdir();
        File obsoleteDir = new File(resourceDir.getAbsolutePath() + File.separator + "obsolete");
        obsoleteDir.mkdir();
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        File schemaDir = new File(newOrganizationDirectory.getAbsolutePath() + File.separator + ServerConsoleServlet.getConfigByTagName("SchemaDirName"));
        schemaDir.mkdir();
//        MyHelperClass ServerConsoleServlet = new MyHelperClass();
        String organization_temp_dir =(String)(Object) ServerConsoleServlet.convertToAbsolutePath(ServerConsoleServlet.getConfigByTagName("OrganizationTemplate"));
        File templ = new File(organization_temp_dir);
        File[] confFiles = templ.listFiles();
        for (int i = 0; i < confFiles.length; i++) {
            try {
                FileReader fr = new FileReader(confFiles[i]);
                FileWriter fw = new FileWriter(confDir.getAbsolutePath() + File.separator + confFiles[i].getName());
                int c = -1;
                while ((c = fr.read()) != -1) fw.write(c);
                fw.flush();
                fw.close();
                fr.close();
            } catch (IOException e) {
            }
        }
        MyHelperClass SchemaModelHolder = new MyHelperClass();
        SchemaModelHolder.reloadSchemaModel(organizationName);
        MyHelperClass ResourceModelHolder = new MyHelperClass();
        ResourceModelHolder.reloadResourceModel(organizationName);
        MyHelperClass UserLogServlet = new MyHelperClass();
        UserLogServlet.initializeUserLogDB(organizationName);
        MyHelperClass MetaEditServlet = new MyHelperClass();
        MetaEditServlet.createNewProject(organizationName, "standard", MetaEditServlet.convertProjectIdToProjectUri(organizationName, "standard", req), this.username);
//        MyHelperClass ResourceModelHolder = new MyHelperClass();
        ResourceModelHolder.reloadResourceModel(organizationName);
//        MyHelperClass message = new MyHelperClass();
        message =(MyHelperClass)(Object) organizationName + " is created. Restart Tomcat to activate this organization.";
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convertProjectIdToProjectUri(String o0, String o1, HttpServletRequest o2){ return null; }
	public MyHelperClass convertToAbsolutePath(MyHelperClass o0){ return null; }
	public MyHelperClass isValidFilename(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass SQLEscape(String o0){ return null; }
	public MyHelperClass reloadResourceModel(String o0){ return null; }
	public MyHelperClass initializeUserLogDB(String o0){ return null; }
	public MyHelperClass xmlEscape(String o0){ return null; }
	public MyHelperClass getConfigByTagName(String o0){ return null; }
	public MyHelperClass reloadSchemaModel(String o0){ return null; }
	public MyHelperClass createNewProject(String o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getOrganizationNames(){ return null; }}

class HttpServletRequest {

}
