import java.io.*;
import java.lang.*;
import java.util.*;



class c9118411 {
public MyHelperClass DbfEncodings;
	public MyHelperClass SHP;
	public MyHelperClass getDataFile(MyHelperClass o0){ return null; }
public MyHelperClass getName(){ return null; }
	public MyHelperClass reload(){ return null; }

    public void postProcess() throws StopWriterVisitorException {
        MyHelperClass shpWriter = new MyHelperClass();
        shpWriter.postProcess();
        try {
            MyHelperClass fTemp = new MyHelperClass();
            FileChannel fcinShp =(FileChannel)(Object) (new FileInputStream((String)(Object)fTemp).getChannel());
            MyHelperClass fileShp = new MyHelperClass();
            FileChannel fcoutShp =(FileChannel)(Object) (new FileOutputStream((String)(Object)fileShp).getChannel());
            MyHelperClass DriverUtilities = new MyHelperClass();
            DriverUtilities.copy(fcinShp, fcoutShp);
//            MyHelperClass fTemp = new MyHelperClass();
            File shxFile =(File)(Object) SHP.getShxFile(fTemp);
            FileChannel fcinShx =(FileChannel)(Object) (new FileInputStream(shxFile).getChannel());
//            MyHelperClass fileShp = new MyHelperClass();
            FileChannel fcoutShx =(FileChannel)(Object) (new FileOutputStream((String)(Object)SHP.getShxFile(fileShp)).getChannel());
//            MyHelperClass DriverUtilities = new MyHelperClass();
            DriverUtilities.copy(fcinShx, fcoutShx);
//            MyHelperClass fTemp = new MyHelperClass();
            File dbfFile =(File)(Object) getDataFile(fTemp);
//            MyHelperClass shpWriter = new MyHelperClass();
            short originalEncoding =(short)(Object) DbfEncodings.getInstance().getDbfIdForCharset(shpWriter.getCharset());
            RandomAccessFile fo = new RandomAccessFile(dbfFile, "rw");
            fo.seek(29);
            fo.writeByte(originalEncoding);
            fo.close();
            FileChannel fcinDbf =(FileChannel)(Object) (new FileInputStream(dbfFile).getChannel());
//            MyHelperClass fileShp = new MyHelperClass();
            FileChannel fcoutDbf =(FileChannel)(Object) (new FileOutputStream((String)(Object)getDataFile(fileShp)).getChannel());
//            MyHelperClass DriverUtilities = new MyHelperClass();
            DriverUtilities.copy(fcinDbf, fcoutDbf);
//            MyHelperClass fTemp = new MyHelperClass();
            fTemp.delete();
            shxFile.delete();
            dbfFile.delete();
            reload();
        } catch (FileNotFoundException e) {
            throw new StopWriterVisitorException(getName(), e);
        } catch (IOException e) {
            throw new StopWriterVisitorException(getName(), e);
        } catch (UncheckedIOException e) {
            throw new StopWriterVisitorException(getName(),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass postProcess(){ return null; }
	public MyHelperClass getShxFile(MyHelperClass o0){ return null; }
	public MyHelperClass getCharset(){ return null; }
	public MyHelperClass getDbfIdForCharset(MyHelperClass o0){ return null; }
	public MyHelperClass copy(FileChannel o0, FileChannel o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass delete(){ return null; }}

class StopWriterVisitorException extends Exception{
	public StopWriterVisitorException(String errorMessage) { super(errorMessage); }
	StopWriterVisitorException(MyHelperClass o0, IOException o1){}
	StopWriterVisitorException(MyHelperClass o0, ReloadDriverException o1){}
	StopWriterVisitorException(MyHelperClass o0, FileNotFoundException o1){}
	StopWriterVisitorException(){}
}

class FileChannel {

}

class ReloadDriverException extends Exception{
	public ReloadDriverException(String errorMessage) { super(errorMessage); }
}
