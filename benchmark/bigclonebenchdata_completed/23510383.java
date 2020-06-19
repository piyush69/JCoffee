import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23510383 {
public MyHelperClass saveObjectInXml(Balise3D o0, File o1){ return null; }
	public MyHelperClass saveObjectInXml(Balise2D o0, File o1){ return null; }
	public MyHelperClass saveObjectInXml(Airspace o0, File o1){ return null; }
	public MyHelperClass saveObjectInXml(Restorable o0, File o1){ return null; }
public MyHelperClass FileManager;
	public MyHelperClass PolygonEditorsManager;
	public MyHelperClass AIRSPACE_LAYER_NAME;
	public MyHelperClass wwd;
	public MyHelperClass BALISES3D_LAYER_NAME;
	public MyHelperClass BALISES2D_LAYER_NAME;
	public MyHelperClass ImageUtils;
	public MyHelperClass RENDERABLE_LAYER_NAME;
	public MyHelperClass getImages(){ return null; }

    public boolean saveProject(File file, Set<String> types, Set<String> images, Set<String> trajectories, boolean databasesIncluded, boolean onlyLinks) throws Throwable, IOException, SQLException {
        int index = file.getName().lastIndexOf(".");
        String name = file.getName().substring(0, index);
        DecimalFormat format = new DecimalFormat("####");
        format.setMinimumIntegerDigits(4);
        int count = 0;
        File main = new File(name);
        if (main.exists()) {
            throw new IOException(main.getAbsolutePath());
        }
        main.mkdir();
        File version = new File(main, "version");
        version.createNewFile();
        PrintWriter writer = new PrintWriter(version);
        MyHelperClass Videso3D = new MyHelperClass();
        writer.write((int)(Object)Videso3D.VERSION);
        writer.flush();
        writer.close();
        File xmlDir = new File(main.getAbsolutePath() + "/xml");
        xmlDir.mkdir();
        if (types != null && !types.isEmpty()) {
            File databases = new File(main.getAbsolutePath() + "/databases");
            databases.mkdir();
            for (String t : types) {
                MyHelperClass DatabaseManager = new MyHelperClass();
                Type type =(Type)(Object) DatabaseManager.stringToType(t);
                if (type != null) {
                    if (onlyLinks) {
                        if (databasesIncluded) {
//                            MyHelperClass DatabaseManager = new MyHelperClass();
                            String currentName =(String)(Object) DatabaseManager.getCurrentName(type);
                            File baseCopy = new File(databases, currentName + "." + type);
                            baseCopy.createNewFile();
                            FileChannel source = (FileChannel)(Object)new FileInputStream(new File(currentName)).getChannel();
                            FileChannel destination = (FileChannel)(Object)new FileOutputStream(baseCopy).getChannel();
                            destination.transferFrom(source, 0, source.size());
                            source.close();
                            destination.close();
                            List<String[]> clefs = new ArrayList<String[]>();
                            MyHelperClass Type = new MyHelperClass();
                            Statement st =(Statement)(Object) DatabaseManager.getCurrent(Type.Databases);
                            ResultSet rs =(ResultSet)(Object) st.executeQuery("select * from clefs where type='" + currentName + "'");
                            while ((boolean)(Object)rs.next()) {
                                clefs.add(new String[] {(String)(Object) rs.getString("name"),(String)(Object) rs.getString("value") });
                            }
                            st.close();
                            if (!clefs.isEmpty()) {
                                File clefsFile = new File(databases, currentName + "_clefs");
                                clefsFile.createNewFile();
                                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(clefsFile));
                                oos.writeObject(clefs);
                                oos.close();
                            }
                            File filesDir = new File(currentName + "_files");
                            if (filesDir.exists() && filesDir.isDirectory()) {
                                File baseFiles = new File(databases, currentName + "_files");
                                baseFiles.mkdirs();
                                for (File f : filesDir.listFiles()) {
                                    File copy = new File(baseFiles, f.getName());
                                    copy.createNewFile();
                                    source = (FileChannel)(Object)new FileInputStream(f).getChannel();
                                    destination = (FileChannel)(Object)new FileOutputStream(copy).getChannel();
                                    destination.transferFrom(source, 0, source.size());
                                    source.close();
                                    destination.close();
                                }
                            }
                        }
                        File selectedObjects = new File(databases, type.toString());
                        selectedObjects.createNewFile();
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(selectedObjects));
                        MyHelperClass objects = new MyHelperClass();
                        oos.writeObject(objects.get(type));
                        oos.close();
                    } else {
                        MyHelperClass DatasManager = new MyHelperClass();
                        for (Restorable r :(Restorable[])(Object) (Object[])(Object)DatasManager.getController(type).getSelectedObjects()) {
                            this.saveObjectInXml(r, new File(xmlDir, r.getClass().getName() + "-" + type + "-" + format.format(count++) + ".xml"));
                        }
                    }
                }
            }
        }
        File imagesDir = new File(main.getAbsolutePath() + "/images");
        imagesDir.mkdir();
        for (EditableSurfaceImage si :(EditableSurfaceImage[])(Object) (Object[])(Object)this.getImages()) {
            if (images.contains(si.getName())) {
                int idx =(int)(Object) si.getName().lastIndexOf(".");
                String newName =(String)(Object) si.getName();
                if (idx != -1) {
                    newName =(String)(Object) si.getName().substring(0, idx);
                }
                File img = new File(imagesDir, newName + ".gtif");
                ImageUtils.writeImageToFile(si.getSector(), (BufferedImage)(BufferedImage)(Object) si.getImageSource(), img);
            }
        }
        File trajectoDir = new File(main, "trajectory");
        trajectoDir.mkdirs();
        for (Layer l :(Layer[])(Object) (Object[])(Object)wwd.getModel().getLayers()) {
            if ((GEOTracksLayer)(Object)l instanceof GEOTracksLayer && trajectories.contains(l.getName())) {
                GEOWriter geoWriter = new GEOWriter(trajectoDir.getAbsolutePath() + "/" + l.getName(), true);
                for (VidesoTrack track : ((GEOTracksLayer)(GEOTracksLayer)(Object) (Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)l).getModel().getVisibleTracks()) {
                    geoWriter.writeTrack((GEOTrack)(GEOTrack)(Object) track);
                }
                geoWriter.close();
            }
        }
        if (types != null && types.contains("Autres objets affichés.")) {
            for (Layer l :(Layer[])(Object) (Object[])(Object)wwd.getModel().getLayers()) {
                if (l.getName().equals(AIRSPACE_LAYER_NAME)) {
                    for (Airspace r : ((AirspaceLayer)(AirspaceLayer)(Object) (Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)l).getAirspaces()) {
                        this.saveObjectInXml((Restorable)(Restorable)(Object) r, new File(xmlDir, r.getClass().getName() + "-" + format.format(count++) + ".xml"));
                    }
                } else if (l.getName().equals(RENDERABLE_LAYER_NAME)) {
                    for (Renderable r : ((RenderableLayer)(RenderableLayer)(Object) (Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)l).getRenderables()) {
                        if ((Restorable)(Object)r instanceof Restorable) {
                            this.saveObjectInXml((Restorable)(Restorable)(Object) r, new File(xmlDir, r.getClass().getName() + "-" + format.format(count++) + ".xml"));
                        }
                    }
                } else if (l.getName().equals(BALISES2D_LAYER_NAME)) {
                    for (Balise2D b : ((Balise2DLayer)(Balise2DLayer)(Object) (Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)l).getVisibleBalises()) {
                        this.saveObjectInXml(b, new File(xmlDir, b.getClass().getName() + "-" + format.format(count++) + ".xml"));
                    }
                } else if (l.getName().equals(BALISES3D_LAYER_NAME)) {
                    for (Balise3D b : ((Balise3DLayer)(Balise3DLayer)(Object) (Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)(Object[])(Object)l).getVisibleBalises()) {
                        this.saveObjectInXml(b, new File(xmlDir, b.getClass().getName() + "-" + format.format(count++) + ".xml"));
                    }
                }
            }
        }
        for (Airspace a :(Airspace[])(Object) (Object[])(Object)PolygonEditorsManager.getLayer().getAirspaces()) {
            if ((boolean)(Object)a.isVisible()) this.saveObjectInXml(a, new File(xmlDir, a.getClass().getName() + "-" + format.format(count++) + ".xml"));
        }
        this.saveObjectInXml((Balise3D)(Object)this.wwd.getView(), new File(main, "globe.xml"));
        FileManager.createZipFile(file, main);
        FileManager.deleteFile(main);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Databases;
	public MyHelperClass VERSION;
public MyHelperClass getModel(){ return null; }
	public MyHelperClass getView(){ return null; }
	public MyHelperClass getVisibleTracks(){ return null; }
	public MyHelperClass getController(Type o0){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass getSelectedObjects(){ return null; }
	public MyHelperClass deleteFile(File o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass getCurrent(MyHelperClass o0){ return null; }
	public MyHelperClass getLayer(){ return null; }
	public MyHelperClass stringToType(String o0){ return null; }
	public MyHelperClass createZipFile(File o0, File o1){ return null; }
	public MyHelperClass get(Type o0){ return null; }
	public MyHelperClass getAirspaces(){ return null; }
	public MyHelperClass writeImageToFile(MyHelperClass o0, BufferedImage o1, File o2){ return null; }
	public MyHelperClass getLayers(){ return null; }
	public MyHelperClass getCurrentName(Type o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass format(int o0){ return null; }
	public MyHelperClass setMinimumIntegerDigits(int o0){ return null; }}

class Type {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class EditableSurfaceImage {

public MyHelperClass getSector(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getImageSource(){ return null; }}

class BufferedImage {

}

class Layer {

public MyHelperClass getName(){ return null; }}

class GEOTracksLayer {

public MyHelperClass getModel(){ return null; }}

class GEOWriter {

GEOWriter(){}
	GEOWriter(String o0, boolean o1){}
	public MyHelperClass writeTrack(GEOTrack o0){ return null; }
	public MyHelperClass close(){ return null; }}

class VidesoTrack {

}

class GEOTrack {

}

class AirspaceLayer {

public MyHelperClass getAirspaces(){ return null; }}

class Airspace {

public MyHelperClass isVisible(){ return null; }}

class Restorable {

}

class RenderableLayer {

public MyHelperClass getRenderables(){ return null; }}

class Renderable {

}

class Balise2DLayer {

public MyHelperClass getVisibleBalises(){ return null; }}

class Balise2D {

}

class Balise3DLayer {

public MyHelperClass getVisibleBalises(){ return null; }}

class Balise3D {

}
