
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1466343 {
public MyHelperClass handleError(MyHelperClass o0, IProject o1, String o2){ return null; }
public MyHelperClass DefaultFolderProperties;
	public MyHelperClass ResourcesPlugin;
	public MyHelperClass DEFAULT_SOURCE_FOLDER;
	public MyHelperClass copyLibrary(IProject o0){ return null; }
	public MyHelperClass copySamples(IProject o0){ return null; }
	public MyHelperClass createOutputFolder(IProject o0, MyHelperClass o1){ return null; }
	public MyHelperClass createClassPathEntries(IProject o0, IPath o1){ return null; }
public MyHelperClass getContainer(){ return null; }

    public boolean finish() {
        MyHelperClass projectName = new MyHelperClass();
        IProject project =(IProject)(Object) ResourcesPlugin.getWorkspace().getRoot().getProject(projectName.getText());
        try {
            project.create(null);
            project.open(null);
            IProjectDescription desc =(IProjectDescription)(Object) project.getDescription();
            MyHelperClass JavaCore = new MyHelperClass();
            desc.setNatureIds(new String[] {(String)(Object) JavaCore.NATURE_ID });
            project.setDescription(desc, null);
//            MyHelperClass JavaCore = new MyHelperClass();
            IJavaProject javaProject =(IJavaProject)(Object) JavaCore.create(project);
            MyHelperClass FIT_LIBRARY = new MyHelperClass();
            IPath fitLib =(IPath)(Object) project.getFullPath().append(FIT_LIBRARY);
            javaProject.setRawClasspath(createClassPathEntries(project, fitLib), null);
            copyLibrary(project);
            MyHelperClass DEFAULT_OUTPUT_FOLDER = new MyHelperClass();
            javaProject.setOutputLocation(createOutputFolder(project, DEFAULT_OUTPUT_FOLDER).getFullPath(), null);
            MyHelperClass fitTests = new MyHelperClass();
            createOutputFolder(project, fitTests.getText());
            MyHelperClass fitResults = new MyHelperClass();
            createOutputFolder(project, fitResults.getText());
//            MyHelperClass fitResults = new MyHelperClass();
            if (!DEFAULT_OUTPUT_FOLDER.equals(fitResults.getText())) {
//                MyHelperClass fitResults = new MyHelperClass();
                DefaultFolderProperties.setDefinedOutputLocation(project, fitResults.getText());
            }
            MyHelperClass fitFixtures = new MyHelperClass();
            if (!DEFAULT_SOURCE_FOLDER.equals(fitFixtures.getText())) {
//                MyHelperClass fitFixtures = new MyHelperClass();
                DefaultFolderProperties.setDefinedSourceLocation(project, fitFixtures.getText());
            }
            MyHelperClass includeExamplesCheck = new MyHelperClass();
            if ((boolean)(Object)includeExamplesCheck.getSelection()) {
                copySamples(project);
            }
        } catch (UncheckedIOException e) {
            handleError(getContainer().getShell(), project, "Could not create project:" + e.getMessage());
            return false;
        } catch (ArithmeticException e) {
            handleError(getContainer().getShell(), project, "Could not create project:" + e.getMessage());
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NATURE_ID;
public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass create(IProject o0){ return null; }
	public MyHelperClass getSelection(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass append(MyHelperClass o0){ return null; }
	public MyHelperClass getWorkspace(){ return null; }
	public MyHelperClass setDefinedOutputLocation(IProject o0, MyHelperClass o1){ return null; }
	public MyHelperClass setDefinedSourceLocation(IProject o0, MyHelperClass o1){ return null; }
	public MyHelperClass getProject(MyHelperClass o0){ return null; }}

class IProject {

public MyHelperClass getFullPath(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass create(Object o0){ return null; }
	public MyHelperClass open(Object o0){ return null; }
	public MyHelperClass setDescription(IProjectDescription o0, Object o1){ return null; }}

class IProjectDescription {

public MyHelperClass setNatureIds(String[] o0){ return null; }}

class IJavaProject {

public MyHelperClass setRawClasspath(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass setOutputLocation(MyHelperClass o0, Object o1){ return null; }}

class IPath {

}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
