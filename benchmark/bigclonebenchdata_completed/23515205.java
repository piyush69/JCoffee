


class c23515205 {
public MyHelperClass addBuilders(List o0){ return null; }
	public MyHelperClass addClasspaths(List o0, MyHelperClass o1){ return null; }
public MyHelperClass IStatus;
	public MyHelperClass projectPage;
	public MyHelperClass ResourcesPlugin;
	public MyHelperClass JavaCore;
	public MyHelperClass StatusManager;
	public MyHelperClass getProjectTypeName(){ return null; }
	public MyHelperClass getPluginID(){ return null; }
	public MyHelperClass getNatures(){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass createFiles(){ return null; }

    public boolean performFinish() {
        try {
            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(getProject());
            final IProjectDescription projectDescription =(IProjectDescription)(Object) ResourcesPlugin.getWorkspace().newProjectDescription(projectPage.getProjectName());
            projectDescription.setLocation(null);
            getProject().create(projectDescription, null);
            List classpathEntries =(List)(Object) new ArrayList();
            projectDescription.setNatureIds(getNatures());
            List builderIDs =(List)(Object) new ArrayList();
            addBuilders(builderIDs);
            ICommand[] buildCMDS = new ICommand[(int)(Object)builderIDs.size()];
            int i = 0;
            for (String builderID :(String[])(Object) (Object[])(Object)builderIDs) {
                ICommand build =(ICommand)(Object) projectDescription.newCommand();
                build.setBuilderName(builderID);
                buildCMDS[i++] = build;
            }
            projectDescription.setBuildSpec(buildCMDS);
            getProject().open(null);
            getProject().setDescription(projectDescription, null);
            addClasspaths(classpathEntries, getProject());
            javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[(int)(Object)classpathEntries.size()]), null);
            javaProject.setOutputLocation(new Path("/" + projectPage.getProjectName() + "/bin"), null);
            createFiles();
            return true;
        } catch (Exception exception) {
            StatusManager.getManager().handle(new Status(IStatus.ERROR, getPluginID(), "Problem creating " + getProjectTypeName() + " project. Ignoring.", exception));
            try {
                getProject().delete(true, null);
            } catch (Exception e) {
            }
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass newProjectDescription(MyHelperClass o0){ return null; }
	public MyHelperClass handle(Status o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, Object o1){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass getManager(){ return null; }
	public MyHelperClass delete(boolean o0, Object o1){ return null; }
	public MyHelperClass getProjectName(){ return null; }
	public MyHelperClass create(MyHelperClass o0){ return null; }
	public MyHelperClass create(IProjectDescription o0, Object o1){ return null; }
	public MyHelperClass open(Object o0){ return null; }}

class IJavaProject {

public MyHelperClass setOutputLocation(Path o0, Object o1){ return null; }
	public MyHelperClass setRawClasspath(MyHelperClass o0, Object o1){ return null; }}

class IProjectDescription {

public MyHelperClass newCommand(){ return null; }
	public MyHelperClass setNatureIds(MyHelperClass o0){ return null; }
	public MyHelperClass setLocation(Object o0){ return null; }
	public MyHelperClass setBuildSpec(ICommand[] o0){ return null; }}

class List {

public MyHelperClass toArray(IClasspathEntry[] o0){ return null; }
	public MyHelperClass size(){ return null; }}

class IClasspathEntry {

}

class ArrayList {

}

class ICommand {

public MyHelperClass setBuilderName(String o0){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, String o2, Exception o3){}}
