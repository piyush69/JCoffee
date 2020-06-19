
import java.io.UncheckedIOException;


class c12048548 {
public static MyHelperClass DriverManager;
	public static MyHelperClass G;
	public static MyHelperClass conn;
//public MyHelperClass DriverManager;
//	public MyHelperClass conn;
//	public MyHelperClass G;

    public static void exportDB(String input, String output) {
        try {
            Class.forName("org.sqlite.JDBC");
            MyHelperClass File = new MyHelperClass();
            String fileName = input + File.separator + G.databaseName;
            File dataBase = new File(fileName);
            if (!(Boolean)(Object)dataBase.exists()) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "No se encuentra el fichero DB", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                MyHelperClass G = new MyHelperClass();
                G.conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
                HashMap languageIDs = new HashMap();
                HashMap typeIDs = new HashMap();
                long tiempoInicio = System.currentTimeMillis();
                Element dataBaseXML = new Element("database");
                Element languages = new Element("languages");
                Statement stat =(Statement)(Object) conn.createStatement();
                ResultSet rs =(ResultSet)(Object) stat.executeQuery("select * from language order by id");
                while ((boolean)(Object)rs.next()) {
                    int id =(int)(Object) rs.getInt("id");
                    String name =(String)(Object) rs.getString("name");
                    languageIDs.put(id, name);
                    Element language = new Element("language");
                    language.setText(name);
                    languages.addContent(language);
                }
                dataBaseXML.addContent(languages);
                rs =(ResultSet)(Object) stat.executeQuery("select * from type order by id");
                while ((boolean)(Object)rs.next()) {
                    int id =(int)(Object) rs.getInt("id");
                    String name =(String)(Object) rs.getString("name");
                    typeIDs.put(id, name);
                }
                rs =(ResultSet)(Object) stat.executeQuery("select distinct name from main order by name");
                while ((boolean)(Object)rs.next()) {
                    String name =(String)(Object) rs.getString("name");
                    Element image = new Element("image");
                    image.setAttribute("id", name);
                    Statement stat2 =(Statement)(Object) conn.createStatement();
                    ResultSet rs2 =(ResultSet)(Object) stat2.executeQuery("select distinct idL from main where name = \"" + name + "\" order by idL");
                    while ((boolean)(Object)rs2.next()) {
                        int idL =(int)(Object) rs2.getInt("idL");
                        Element language = new Element("language");
                        language.setAttribute("id",(String)(Object) languageIDs.get(idL));
                        Statement stat3 =(Statement)(Object) conn.createStatement();
                        ResultSet rs3 =(ResultSet)(Object) stat3.executeQuery("select * from main where name = \"" + name + "\" and idL = " + idL + " order by idT");
                        while ((boolean)(Object)rs3.next()) {
                            int idT =(int)(Object) rs3.getInt("idT");
                            String word =(String)(Object) rs3.getString("word");
                            Element wordE = new Element("word");
                            wordE.setAttribute("type",(String)(Object) typeIDs.get(idT));
                            wordE.setText(word);
                            language.addContent(wordE);
//                            MyHelperClass File = new MyHelperClass();
                            String pathSrc = input + File.separator + name.substring(0, 1).toUpperCase() + File.separator + name;
//                            MyHelperClass File = new MyHelperClass();
                            String pathDst = output + File.separator + name;
                            try {
                                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pathSrc).getChannel());
                                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(pathDst).getChannel());
                                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                                srcChannel.close();
                                dstChannel.close();
                            } catch (UncheckedIOException exc) {
                                System.out.println(exc.getMessage());
                                System.out.println(exc.toString());
                            }
                        }
                        rs3.close();
                        stat3.close();
                        image.addContent(language);
                    }
                    rs2.close();
                    stat2.close();
                    dataBaseXML.addContent(image);
                }
                rs.close();
                stat.close();
                MyHelperClass Format = new MyHelperClass();
                XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
//                MyHelperClass File = new MyHelperClass();
                FileOutputStream f = new FileOutputStream(output + File.separator + G.imagesName);
                out.output(dataBaseXML, f);
                f.flush();
                f.close();
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
public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getPrettyFormat(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class HashMap {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass put(int o0, String o1){ return null; }}

class Element {

Element(String o0){}
	Element(){}
	public MyHelperClass addContent(Element o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}

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
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XMLOutputter {

XMLOutputter(MyHelperClass o0){}
	XMLOutputter(){}
	public MyHelperClass output(Element o0, FileOutputStream o1){ return null; }}
