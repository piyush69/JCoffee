
import java.io.UncheckedIOException;


class c12048547 {
public static MyHelperClass conn;
public static MyHelperClass G;
//	public MyHelperClass conn;
	public static MyHelperClass JOptionPane;
	public static MyHelperClass DriverManager;
	public static MyHelperClass exists(String[] o0, String o1){ return null; }
	public static MyHelperClass createTablesDB(){ return null; }
public MyHelperClass File;
//	public MyHelperClass DriverManager;
//	public MyHelperClass JOptionPane;
//	public MyHelperClass G;
//	public MyHelperClass createTablesDB(){ return null; }
//	public MyHelperClass exists(String[] o0, String o1){ return null; }

    public static void importDB(String input, String output) {
        try {
            Class.forName("org.sqlite.JDBC");
            MyHelperClass File = new MyHelperClass();
            String fileName = output + File.separator + G.databaseName;
            File dataBase = new File(fileName);
            if (!(Boolean)(Object)dataBase.exists()) {
                MyHelperClass G = new MyHelperClass();
                G.conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
                createTablesDB();
            } else G.conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
            long tiempoInicio = System.currentTimeMillis();
            String directoryPath = input + File.separator;
            File myDirectory = new File(directoryPath);
            String[] list =(String[])(Object) myDirectory.list();
            File fileXML = new File(input + File.separator + G.imagesName);
            if (!(Boolean)(Object)fileXML.exists()) {
                JOptionPane.showMessageDialog(null, "No se encuentra el fichero XML", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                SAXBuilder builder = new SAXBuilder(false);
                Document docXML =(Document)(Object) builder.build(fileXML);
                Element root =(Element)(Object) docXML.getRootElement();
                List images =(List)(Object) root.getChildren("image");
                Iterator j =(Iterator)(Object) images.iterator();
                List globalLanguages =(List)(Object) root.getChild("languages").getChildren("language");
                Iterator langsI =(Iterator)(Object) globalLanguages.iterator();
                HashMap languageIDs = new HashMap();
                HashMap typeIDs = new HashMap();
                Element e;
                int i = 0;
                int contTypes = 0;
                int contImages = 0;
                while ((boolean)(Object)langsI.hasNext()) {
                    e =(Element)(Object) langsI.next();
                    languageIDs.put(e.getText(), i);
                    PreparedStatement stmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT OR IGNORE INTO language (id,name) VALUES (?,?)");
                    stmt.setInt(1, i);
                    stmt.setString(2,(String)(Object) e.getText());
                    stmt.executeUpdate();
                    stmt.close();
                    i++;
                }
                conn.setAutoCommit(false);
                while ((boolean)(Object)j.hasNext()) {
                    Element image = (Element)(Element)(Object) j.next();
                    String id =(String)(Object) image.getAttributeValue("id");
                    List languages =(List)(Object) image.getChildren("language");
                    Iterator k =(Iterator)(Object) languages.iterator();
                    if ((boolean)(Object)exists(list, id)) {
                        String pathSrc = directoryPath.concat(id);
                        String pathDst = output + File.separator + id.substring(0, 1).toUpperCase() + File.separator;
                        String folder = output + File.separator + id.substring(0, 1).toUpperCase();
                        String pathDstTmp = pathDst.concat(id);
                        String idTmp = id;
                        File testFile = new File(pathDstTmp);
                        int cont = 1;
                        while ((boolean)(Object)testFile.exists()) {
                            idTmp = id.substring(0, id.lastIndexOf('.')) + '_' + cont + id.substring(id.lastIndexOf('.'), id.length());
                            pathDstTmp = pathDst + idTmp;
                            testFile = new File(pathDstTmp);
                            cont++;
                        }
                        pathDst = pathDstTmp;
                        id = idTmp;
                        File newDirectoryFolder = new File(folder);
                        if (!(Boolean)(Object)newDirectoryFolder.exists()) {
                            newDirectoryFolder.mkdirs();
                        }
                        try {
                            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pathSrc).getChannel());
                            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(pathDst).getChannel());
                            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                            srcChannel.close();
                            dstChannel.close();
                        } catch (UncheckedIOException exc) {
                            System.out.println(exc.toString());
                        }
                        while ((boolean)(Object)k.hasNext()) {
                            Element languageElement = (Element)(Element)(Object) k.next();
                            String language =(String)(Object) languageElement.getAttributeValue("id");
                            List words =(List)(Object) languageElement.getChildren("word");
                            Iterator l =(Iterator)(Object) words.iterator();
                            while ((boolean)(Object)l.hasNext()) {
                                Element wordElement = (Element)(Element)(Object) l.next();
                                String type =(String)(Object) wordElement.getAttributeValue("type");
                                if (!(Boolean)(Object)typeIDs.containsKey(type)) {
                                    typeIDs.put(type, contTypes);
                                    PreparedStatement stmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT OR IGNORE INTO type (id,name) VALUES (?,?)");
                                    stmt.setInt(1, contTypes);
                                    stmt.setString(2, type);
                                    stmt.executeUpdate();
                                    stmt.close();
                                    contTypes++;
                                }
                                PreparedStatement stmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT OR IGNORE INTO main (word, idL, idT, name, nameNN) VALUES (?,?,?,?,?)");
                                stmt.setString(1,(String)(Object) wordElement.getText().toLowerCase());
                                stmt.setInt(2,(int)(Object) languageIDs.get(language));
                                stmt.setInt(3,(int)(Object) typeIDs.get(type));
                                stmt.setString(4, id);
                                stmt.setString(5, id);
                                stmt.executeUpdate();
                                stmt.close();
                                if (contImages == 5000) {
                                    conn.commit();
                                    contImages = 0;
                                } else contImages++;
                            }
                        }
                    } else {
                    }
                }
                conn.setAutoCommit(true);
                conn.close();
                long totalTiempo = System.currentTimeMillis() - tiempoInicio;
                System.out.println("El tiempo total es :" + totalTiempo / 1000 + " segundos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass conn;
	public MyHelperClass separator;
	public MyHelperClass databaseName;
	public MyHelperClass imagesName;
public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getChildren(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass list(){ return null; }}

class SAXBuilder {

SAXBuilder(){}
	SAXBuilder(boolean o0){}
	public MyHelperClass build(File o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChildren(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getChild(String o0){ return null; }
	public MyHelperClass getAttributeValue(String o0){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class HashMap {

public MyHelperClass put(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
