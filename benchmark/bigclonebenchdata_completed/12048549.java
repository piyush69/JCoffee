
import java.io.UncheckedIOException;


class c12048549 {
public static MyHelperClass DriverManager;
	public static MyHelperClass G;
	public static MyHelperClass conn;
//public MyHelperClass DriverManager;
//	public MyHelperClass conn;
//	public MyHelperClass G;

    public static void addImageDB(String pictogramsPath, String pictogramToAddPath, String language, String type, String word) {
        try {
            Class.forName("org.sqlite.JDBC");
            MyHelperClass File = new MyHelperClass();
            String fileName = pictogramsPath + File.separator + G.databaseName;
            File dataBase = new File(fileName);
            if (!(Boolean)(Object)dataBase.exists()) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "No se encuentra el fichero DB", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int idL = 0, idT = 0;
                MyHelperClass G = new MyHelperClass();
                G.conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
                Statement stat =(Statement)(Object) conn.createStatement();
                ResultSet rs =(ResultSet)(Object) stat.executeQuery("select id from language where name=\"" + language + "\"");
                while ((boolean)(Object)rs.next()) {
                    idL =(int)(Object) rs.getInt("id");
                }
                rs.close();
                stat.close();
                stat =(Statement)(Object) conn.createStatement();
                rs =(ResultSet)(Object) stat.executeQuery("select id from type where name=\"" + type + "\"");
                while ((boolean)(Object)rs.next()) {
                    idT =(int)(Object) rs.getInt("id");
                }
                rs.close();
                stat.close();
//                MyHelperClass File = new MyHelperClass();
                String id = pictogramToAddPath.substring(pictogramToAddPath.lastIndexOf((int)(Object)File.separator) + 1, pictogramToAddPath.length());
                String idOrig = id;
                String pathSrc = pictogramToAddPath;
//                MyHelperClass File = new MyHelperClass();
                String pathDst = pictogramsPath + File.separator + id.substring(0, 1).toUpperCase() + File.separator;
//                MyHelperClass File = new MyHelperClass();
                String folder = pictogramsPath + File.separator + id.substring(0, 1).toUpperCase();
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
                PreparedStatement stmt =(PreparedStatement)(Object) conn.prepareStatement("INSERT OR IGNORE INTO main (word, idL, idT, name, nameNN) VALUES (?,?,?,?,?)");
                stmt.setString(1, word.toLowerCase());
                stmt.setInt(2, idL);
                stmt.setInt(3, idT);
                stmt.setString(4, id);
                stmt.setString(5, idOrig);
                stmt.executeUpdate();
                stmt.close();
                conn.close();
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
public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

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
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}
