


class c8702780 {

    final void saveProject(Project project, final File file) {
        MyHelperClass projectsList = new MyHelperClass();
        if ((boolean)(Object)projectsList.contains(project)) {
            MyHelperClass workspaceDirectory = new MyHelperClass();
            if ((boolean)(Object)project.isDirty() || !file.getParentFile().equals(workspaceDirectory)) {
                try {
                    if (!(Boolean)(Object)file.exists()) {
                        if (!(Boolean)(Object)file.createNewFile()) throw new IOException("cannot create file " + file.getAbsolutePath());
                    }
                    MyHelperClass File = new MyHelperClass();
                    File tmpFile =(File)(Object) File.createTempFile("JFPSM", ".tmp");
                    ZipOutputStream zoStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                    MyHelperClass ZipOutputStream = new MyHelperClass();
                    zoStream.setMethod(ZipOutputStream.DEFLATED);
                    ZipEntry projectXMLEntry = new ZipEntry("project.xml");
                    MyHelperClass ZipEntry = new MyHelperClass();
                    projectXMLEntry.setMethod(ZipEntry.DEFLATED);
                    zoStream.putNextEntry(projectXMLEntry);
                    CustomXMLEncoder encoder = new CustomXMLEncoder(new BufferedOutputStream(new FileOutputStream(tmpFile)));
                    encoder.writeObject(project);
                    encoder.close();
                    int bytesIn;
                    byte[] readBuffer = new byte[1024];
                    FileInputStream fis = new FileInputStream(tmpFile);
                    while ((bytesIn =(int)(Object) fis.read(readBuffer)) != -1) zoStream.write(readBuffer, 0, bytesIn);
                    fis.close();
                    ZipEntry entry;
                    String floorDirectory;
                    for (FloorSet floorSet :(FloorSet[])(Object) (Object[])(Object)project.getLevelSet().getFloorSetsList()) for (Floor floor :(Floor[])(Object) (Object[])(Object)floorSet.getFloorsList()) {
                        floorDirectory = "levelset/" + floorSet.getName() + "/" + floor.getName() + "/";
                        MyHelperClass MapType = new MyHelperClass();
                        for (MapType type :(MapType[])(Object) (Object[])(Object)MapType.values()) {
                            entry = new ZipEntry(floorDirectory + type.getFilename());
//                            MyHelperClass ZipEntry = new MyHelperClass();
                            entry.setMethod(ZipEntry.DEFLATED);
                            zoStream.putNextEntry(entry);
                            MyHelperClass ImageIO = new MyHelperClass();
                            ImageIO.write(floor.getMap(type).getImage(), "png", zoStream);
                        }
                    }
                    final String tileDirectory = "tileset/";
                    for (Tile tile :(Tile[])(Object) (Object[])(Object)project.getTileSet().getTilesList()) for (int textureIndex = 0; textureIndex < (int)(Object)tile.getMaxTextureCount(); textureIndex++) if (tile.getTexture(textureIndex) != null) {
                        entry = new ZipEntry(tileDirectory + tile.getName() + textureIndex + ".png");
//                        MyHelperClass ZipEntry = new MyHelperClass();
                        entry.setMethod(ZipEntry.DEFLATED);
                        zoStream.putNextEntry(entry);
                        MyHelperClass ImageIO = new MyHelperClass();
                        ImageIO.write(tile.getTexture(textureIndex), "png", zoStream);
                    }
                    zoStream.close();
                    tmpFile.delete();
                } catch (IOException ioe) {
                    throw new RuntimeException("The project " + project.getName() + " cannot be saved!", ioe);
                }
            }
        } else throw new IllegalArgumentException("The project " + project.getName() + " is not handled by this project set!");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass getImage(){ return null; }
	public MyHelperClass contains(Project o0){ return null; }
	public MyHelperClass getFloorSetsList(){ return null; }
	public MyHelperClass values(){ return null; }
	public MyHelperClass write(MyHelperClass o0, String o1, ZipOutputStream o2){ return null; }
	public MyHelperClass getTilesList(){ return null; }}

class Project {

public MyHelperClass getLevelSet(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTileSet(){ return null; }
	public MyHelperClass isDirty(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}

class CustomXMLEncoder {

CustomXMLEncoder(){}
	CustomXMLEncoder(BufferedOutputStream o0){}
	public MyHelperClass writeObject(Project o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FloorSet {

public MyHelperClass getFloorsList(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Floor {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getMap(MapType o0){ return null; }}

class Tile {

public MyHelperClass getMaxTextureCount(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTexture(int o0){ return null; }}

class MapType {

public MyHelperClass getFilename(){ return null; }}
