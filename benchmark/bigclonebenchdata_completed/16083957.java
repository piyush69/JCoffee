
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16083957 {
public MyHelperClass appendValueList(IProgressMonitor o0, Map o1, IFile o2, String o3, VelocityEngine o4, boolean o5){ return null; }
public MyHelperClass VelocityEngineUtils;
	public MyHelperClass Logger;
	public MyHelperClass JeeServiceComponentUIPlugin;
	public MyHelperClass IStatus;
	public MyHelperClass isFacadeAdapter(){ return null; }
	public MyHelperClass getAdapterType(){ return null; }

    protected void createValueListAnnotation(IProgressMonitor monitor, IPackageFragment pack, Map model) throws CoreException {
        IProject pj =(IProject)(Object) pack.getJavaProject().getProject();
        MyHelperClass JstActivator = new MyHelperClass();
        QualifiedName qn = new QualifiedName(JstActivator.PLUGIN_ID, JstActivator.PACKAGE_INFO_LOCATION);
        String location =(String)(Object) pj.getPersistentProperty(qn);
        if (location != null) {
            MyHelperClass NexOpenFacetInstallDataModelProvider = new MyHelperClass();
            IFolder javaFolder =(IFolder)(Object) pj.getFolder(new Path(NexOpenFacetInstallDataModelProvider.WEB_SRC_MAIN_JAVA));
            IFolder packageInfo =(IFolder)(Object) javaFolder.getFolder(location);
            if (!(Boolean)(Object)packageInfo.exists()) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.log(Logger.INFO, "package-info package [" + location + "] does not exists.");
//                MyHelperClass Logger = new MyHelperClass();
                Logger.log(Logger.INFO, "ValueList annotation will not be added by this wizard. " + "You must add manually in your package-info class if exist " + "or create a new one at location " + location);
                return;
            }
            IFile pkginfo =(IFile)(Object) packageInfo.getFile("package-info.java");
            if (!(Boolean)(Object)pkginfo.exists()) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.log(Logger.INFO, "package-info class at location [" + location + "] does not exists.");
                return;
            }
            InputStream in =(InputStream)(Object) pkginfo.getContents();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, baos);
                String content = new String((String)(Object)baos.toByteArray());
                MyHelperClass VelocityEngineHolder = new MyHelperClass();
                VelocityEngine engine =(VelocityEngine)(Object) VelocityEngineHolder.getEngine();
                model.put("adapterType", getAdapterType());
                model.put("packageInfo", location.replace('/', '.'));
                model.put("defaultNumberPerPage", "5");
                model.put("defaultSortDirection", "asc");
                if ((boolean)(Object)isFacadeAdapter()) {
                    model.put("facadeType", "true");
                }
                if (content.indexOf("@ValueLists({})") > -1) {
                    appendValueList(monitor, model, pkginfo, content, engine, true);
                    return;
                } else if (content.indexOf("@ValueLists") > -1) {
                    appendValueList(monitor, model, pkginfo, content, engine, false);
                    return;
                }
                String vl =(String)(Object) VelocityEngineUtils.mergeTemplateIntoString(engine, "ValueList.vm", model);
                ByteArrayInputStream bais = new ByteArrayInputStream(vl.getBytes());
                try {
                    pkginfo.setContents(bais, true, false, monitor);
                } finally {
                    bais.close();
                }
                return;
            } catch (UncheckedIOException e) {
                IStatus status =(IStatus)(Object) new Status(IStatus.ERROR, JeeServiceComponentUIPlugin.PLUGIN_ID, IStatus.OK, "I/O exception",(IOException)(Object) e);
                throw new CoreException((String)(Object)status);
            } catch (ArithmeticException e) {
                IStatus status =(IStatus)(Object) new Status(IStatus.ERROR, JeeServiceComponentUIPlugin.PLUGIN_ID, IStatus.OK, "Velocity exception",(IOException)(Object) e);
                throw new CoreException((String)(Object)status);
            } finally {
                try {
                    baos.close();
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        Logger.log(Logger.INFO, "package-info location property does not exists.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WEB_SRC_MAIN_JAVA;
	public MyHelperClass PLUGIN_ID;
	public MyHelperClass OK;
	public MyHelperClass INFO;
	public MyHelperClass PACKAGE_INFO_LOCATION;
	public MyHelperClass ERROR;
public MyHelperClass mergeTemplateIntoString(VelocityEngine o0, String o1, Map o2){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass getEngine(){ return null; }}

class IProgressMonitor {

}

class IPackageFragment {

public MyHelperClass getJavaProject(){ return null; }}

class Map {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IProject {

public MyHelperClass getFolder(Path o0){ return null; }
	public MyHelperClass getPersistentProperty(QualifiedName o0){ return null; }}

class QualifiedName {

QualifiedName(){}
	QualifiedName(MyHelperClass o0, MyHelperClass o1){}}

class IFolder {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass getFolder(String o0){ return null; }}

class Path {

Path(){}
	Path(MyHelperClass o0){}}

class IFile {

public MyHelperClass getContents(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setContents(ByteArrayInputStream o0, boolean o1, boolean o2, IProgressMonitor o3){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}

class VelocityEngine {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IStatus {

}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, IOException o4){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, VelocityException o4){}}

class VelocityException extends Exception{
	public VelocityException(String errorMessage) { super(errorMessage); }
}
