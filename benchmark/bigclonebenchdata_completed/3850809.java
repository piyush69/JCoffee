


class c3850809 {
public MyHelperClass projectProcessDirSelector;
	public MyHelperClass xmlFile;
	public MyHelperClass targetProject;
	public MyHelperClass bundleFile;
	public MyHelperClass LogManager;
	public MyHelperClass MessageDialog;
	public MyHelperClass bpmoFile;
	public MyHelperClass IOUtils;
	public MyHelperClass sbpelFile;
	public MyHelperClass Activator;
	public MyHelperClass getBPMOFile(){ return null; }
	public MyHelperClass getWizard(){ return null; }
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass updateBundleUI(){ return null; }
	public MyHelperClass getBPEL4SWSFile(){ return null; }
	public MyHelperClass getSBPELFile(){ return null; }
	public MyHelperClass deleteBundleFile(){ return null; }

    private void buildBundle() {
        MyHelperClass targetProject = new MyHelperClass();
        if (targetProject == null) {
            MessageDialog.openError(getShell(), "Error", "No target SPAB project selected!");
            return;
        }
        if ((int)(Object)projectProcessDirSelector.getText().trim().length() == 0) {
            MessageDialog.openError(getShell(), "Error", "No process directory selected for project " + targetProject.getName() + "!");
            return;
        }
        deleteBundleFile();
        try {
            File projectDir =(File)(Object) targetProject.getLocation().toFile();
            File projectProcessesDir = new File(projectDir, projectProcessDirSelector.getText());
            boolean bpmoCopied =(boolean)(Object) IOUtils.copyProcessFilesSecure(getBPMOFile(), projectProcessesDir);
            boolean sbpelCopied =(boolean)(Object) IOUtils.copyProcessFilesSecure(getSBPELFile(), projectProcessesDir);
            boolean xmlCopied =(boolean)(Object) IOUtils.copyProcessFilesSecure(getBPEL4SWSFile(), projectProcessesDir);
            bundleFile = IOUtils.archiveBundle(projectDir, Activator.getDefault().getStateLocation().toFile());
            if (bpmoCopied) {
                new File(projectProcessesDir, getBPMOFile().getName()).delete();
            }
            if (sbpelCopied) {
                new File(projectProcessesDir, getSBPELFile().getName()).delete();
            }
            if (xmlCopied) {
                new File(projectProcessesDir, getBPEL4SWSFile().getName()).delete();
            }
        } catch (Throwable anyError) {
            LogManager.logError(anyError);
            MessageDialog.openError(getShell(), "Error", "Error building SPAB :\n" + anyError.getMessage());
            updateBundleUI();
            return;
        }
        bpmoFile = getBPMOFile();
        sbpelFile = getSBPELFile();
        xmlFile = getBPEL4SWSFile();
        updateBundleUI();
        getWizard().getContainer().updateButtons();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass updateButtons(){ return null; }
	public MyHelperClass archiveBundle(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass logError(Throwable o0){ return null; }
	public MyHelperClass toFile(){ return null; }
	public MyHelperClass getStateLocation(){ return null; }
	public MyHelperClass copyProcessFilesSecure(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass openError(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getContainer(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass delete(){ return null; }}
