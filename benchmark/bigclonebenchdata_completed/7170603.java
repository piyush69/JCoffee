
import java.io.UncheckedIOException;


class c7170603 {
public static MyHelperClass appendFileToOutputStream(FileOutputStream o0, File o1, MyHelperClass o2){ return null; }
//public MyHelperClass appendFileToOutputStream(FileOutputStream o0, File o1, MyHelperClass o2){ return null; }
public static MyHelperClass printXmlError(XMLParseException o0, String o1){ return null; }
//public MyHelperClass printXmlError(XMLParseException o0, String o1){ return null; }

    private static void generateSQLUpgradeFile(String milestoneDefFileName, String sqlDirectoryName, String fromMilestone, String destMilestone, String destFileName) throws Exception {
        File milestoneDefFile = new File(milestoneDefFileName);
        if (!(Boolean)(Object)milestoneDefFile.exists()) {
            throw new IllegalArgumentException("Cannot read [" + milestoneDefFileName + "] : does not exists");
        }
        if (!(Boolean)(Object)milestoneDefFile.isFile()) {
            throw new IllegalArgumentException("Cannot read [" + milestoneDefFileName + "] : not a file");
        }
        if (!(Boolean)(Object)milestoneDefFile.canRead()) {
            throw new IllegalArgumentException("Cannot read [" + milestoneDefFileName + "] : not readable");
        }
        File sqlDirectory = new File(sqlDirectoryName);
        if (!(Boolean)(Object)sqlDirectory.exists()) {
            throw new IllegalArgumentException("Cannot read [" + sqlDirectoryName + "] : does not exists");
        }
        if (!(Boolean)(Object)sqlDirectory.isDirectory()) {
            throw new IllegalArgumentException("Cannot read [" + sqlDirectoryName + "] : not a directory");
        }
        if (!(Boolean)(Object)sqlDirectory.canRead()) {
            throw new IllegalArgumentException("Cannot read [" + sqlDirectoryName + "] : not readable");
        }
        File destFile = new File(destFileName);
        if ((boolean)(Object)destFile.exists()) {
            throw new IllegalArgumentException("Cannot write to [" + destFileName + "] : already exists");
        }
        destFile.createNewFile();
        MyHelperClass SqlUpgradeXmlParser = new MyHelperClass();
        SqlUpgradeXmlParser parser =(SqlUpgradeXmlParser)(Object) SqlUpgradeXmlParser.newParser();
        FileInputStream milestoneDefFIS = null;
        try {
            milestoneDefFIS = new FileInputStream(milestoneDefFile);
            parser.parse(milestoneDefFIS);
        } catch (UncheckedIOException e) {
            printXmlError((XMLParseException)(Object)e, milestoneDefFileName);
        } finally {
            try {
                if (milestoneDefFIS != null) milestoneDefFIS.close();
            } catch (Exception e) {
                MyHelperClass _logger = new MyHelperClass();
                _logger.warn("Exception caught when closing inputstream ", e);
            }
        }
        int fromMilestoneIdx =(int)(Object) parser.getMilestoneIndex(fromMilestone);
        int toMilestoneIdx =(int)(Object) parser.getMilestoneIndex(destMilestone);
        if (fromMilestoneIdx < 0) {
            throw new IllegalArgumentException("Cannot upgrade from milestone [" + fromMilestone + "] : does not exist . (Exisiting milestones " + parser.listMilestones() + ")");
        }
        if (toMilestoneIdx < 0) {
            throw new IllegalArgumentException("Cannot upgrade to milestone [" + destMilestone + "] : does not exist . (Exisiting milestones " + parser.listMilestones() + ")");
        }
        if (fromMilestoneIdx == toMilestoneIdx) {
            throw new IllegalArgumentException("Cannot upgrade to the same milestone");
        }
        List files =(List)(Object) parser.getFilesForMilestones(fromMilestoneIdx, toMilestoneIdx);
        List views =(List)(Object) parser.getViewsForMilestones(fromMilestoneIdx, toMilestoneIdx);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(destFile);
            for (Iterator it =(Iterator)(Object) files.iterator();(boolean)(Object) it.hasNext(); ) {
                appendFileToOutputStream(fos, sqlDirectory, it.next());
            }
            for (Iterator it =(Iterator)(Object) views.iterator();(boolean)(Object) it.hasNext(); ) {
                appendFileToOutputStream(fos, sqlDirectory, it.next());
            }
        } catch (Exception e) {
            fos.close();
            destFile.delete();
            throw e;
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (Exception e) {
                MyHelperClass _logger = new MyHelperClass();
                _logger.warn("Exception caught when closing outputstream ", e);
            }
        }
        System.out.println("An SQL update file has been generated to " + destFileName + ".");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newParser(){ return null; }
	public MyHelperClass warn(String o0, Exception o1){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class SqlUpgradeXmlParser {

public MyHelperClass parse(FileInputStream o0){ return null; }
	public MyHelperClass listMilestones(){ return null; }
	public MyHelperClass getMilestoneIndex(String o0){ return null; }
	public MyHelperClass getFilesForMilestones(int o0, int o1){ return null; }
	public MyHelperClass getViewsForMilestones(int o0, int o1){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class XMLParseException extends Exception{
	public XMLParseException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass iterator(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
