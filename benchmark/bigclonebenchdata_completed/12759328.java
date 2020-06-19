


class c12759328 {
public MyHelperClass JOptionPane;
	public MyHelperClass importImageForSelectedMap(Floor o0, Map o1){ return null; }
public MyHelperClass addProject(String o0){ return null; }
	public MyHelperClass displayErrorMessage(Throwable o0, boolean o1){ return null; }

    final void importSelectedEntity() {
        MyHelperClass projectsTree = new MyHelperClass();
        TreePath path =(TreePath)(Object) projectsTree.getSelectionPath();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)(DefaultMutableTreeNode)(Object) path.getLastPathComponent();
        Object userObject = selectedNode.getUserObject();
        if (userObject instanceof ProjectSet) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setMultiSelectionEnabled(false);
            fileChooser.setFileFilter(new FileNameExtensionFilter("JFPSM Projects", "jfpsm.zip"));
            MyHelperClass mainWindow = new MyHelperClass();
            int result =(int)(Object) fileChooser.showOpenDialog(mainWindow.getApplicativeFrame());
            MyHelperClass JFileChooser = new MyHelperClass();
            if (result == (int)(Object)JFileChooser.APPROVE_OPTION) {
                String fullname =(String)(Object) fileChooser.getSelectedFile().getName();
                MyHelperClass Project = new MyHelperClass();
                String projectName = fullname.substring(0, fullname.length() - (int)(Object)Project.getFileExtension().length());
                ProjectSet workspace = (ProjectSet) userObject;
                boolean confirmLoad = true;
                MyHelperClass Arrays = new MyHelperClass();
                if ((boolean)(Object)Arrays.asList(workspace.getProjectNames()).contains(projectName)) {
//                    MyHelperClass mainWindow = new MyHelperClass();
                    confirmLoad = JOptionPane.showConfirmDialog(mainWindow.getApplicativeFrame(), "Overwrite project \"" + projectName + "\"" + "?", "Overwrite project", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION;
                    if (confirmLoad) {
                        final int count =(int)(Object) selectedNode.getChildCount();
                        DefaultMutableTreeNode projectNode = null;
                        for (int i = 0; i < count; i++) if (((Project)(Project)(Object) ((DefaultMutableTreeNode)(DefaultMutableTreeNode)(Object) selectedNode.getChildAt(i)).getUserObject()).getName().equals(projectName)) {
                            projectNode = (DefaultMutableTreeNode)(DefaultMutableTreeNode)(Object) selectedNode.getChildAt(i);
                            break;
                        }
                        Project project = (Project)(Project)(Object) projectNode.getUserObject();
//                        MyHelperClass mainWindow = new MyHelperClass();
                        for (FloorSet floorSet :(FloorSet[])(Object) (Object[])(Object)project.getLevelSet().getFloorSetsList()) for (Floor floor :(Floor[])(Object) (Object[])(Object)floorSet.getFloorsList()) mainWindow.getEntityViewer().closeEntityView((Tile)(Object)floor);
//                        MyHelperClass mainWindow = new MyHelperClass();
                        for (Tile tile :(Tile[])(Object) (Object[])(Object)project.getTileSet().getTilesList()) mainWindow.getEntityViewer().closeEntityView(tile);
                        workspace.removeProject(project);
//                        MyHelperClass projectsTree = new MyHelperClass();
                        ((DefaultTreeModel)(DefaultTreeModel)(Object) projectsTree.getModel()).removeNodeFromParent(projectNode);
                    }
                }
                if (confirmLoad) {
                    File projectFile = new File(workspace.createProjectPath(projectName));
                    boolean success = true;
                    try {
                        success =(boolean)(Object) projectFile.createNewFile();
                        if (success) {
                            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileChooser.getSelectedFile()));
                            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(projectFile));
                            byte[] buf = new byte[1024];
                            int len;
                            while ((len =(int)(Object) bis.read(buf)) > 0) bos.write(buf, 0, len);
                            bis.close();
                            bos.close();
                        }
                    } catch (Throwable throwable) {
                        displayErrorMessage(throwable, false);
                        success = false;
                    }
                    if (success) addProject(projectName);
                }
            }
        } else if (userObject instanceof Map) {
            Map map = (Map) userObject;
            Floor floor = (Floor)(Floor)(Object) ((DefaultMutableTreeNode)(DefaultMutableTreeNode)(Object) selectedNode.getParent()).getUserObject();
            importImageForSelectedMap(floor, map);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_OPTION;
	public MyHelperClass OK_CANCEL_OPTION;
	public MyHelperClass APPROVE_OPTION;
public MyHelperClass getApplicativeFrame(){ return null; }
	public MyHelperClass getFileExtension(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass showConfirmDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass getFloorSetsList(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass asList(MyHelperClass o0){ return null; }
	public MyHelperClass getTilesList(){ return null; }
	public MyHelperClass getSelectionPath(){ return null; }
	public MyHelperClass getEntityViewer(){ return null; }
	public MyHelperClass closeEntityView(Tile o0){ return null; }}

class TreePath {

public MyHelperClass getLastPathComponent(){ return null; }}

class DefaultMutableTreeNode {

public MyHelperClass getParent(){ return null; }
	public MyHelperClass getChildAt(int o0){ return null; }
	public MyHelperClass getChildCount(){ return null; }
	public MyHelperClass getUserObject(){ return null; }}

class ProjectSet {

public MyHelperClass getProjectNames(){ return null; }
	public MyHelperClass removeProject(Project o0){ return null; }
	public MyHelperClass createProjectPath(String o0){ return null; }}

class JFileChooser {

public MyHelperClass setFileFilter(FileNameExtensionFilter o0){ return null; }
	public MyHelperClass showOpenDialog(MyHelperClass o0){ return null; }
	public MyHelperClass setMultiSelectionEnabled(boolean o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class FileNameExtensionFilter {

FileNameExtensionFilter(String o0, String o1){}
	FileNameExtensionFilter(){}}

class Project {

public MyHelperClass getLevelSet(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTileSet(){ return null; }}

class FloorSet {

public MyHelperClass getFloorsList(){ return null; }}

class Floor {

}

class Tile {

}

class DefaultTreeModel {

public MyHelperClass removeNodeFromParent(DefaultMutableTreeNode o0){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Map {

}
