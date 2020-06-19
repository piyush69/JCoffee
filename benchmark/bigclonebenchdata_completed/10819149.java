
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10819149 {
public MyHelperClass IOUtils;
	public MyHelperClass homeBuildingDao;
	public MyHelperClass homeBuilding;
	public MyHelperClass homeMapDao;
public MyHelperClass execute(){ return null; }

    public String insertBuilding() {
        MyHelperClass homeMap = new MyHelperClass();
        homeMap = homeMapDao.getHomeMapById(homeMap.getId());
//        MyHelperClass homeMap = new MyHelperClass();
        homeBuilding.setHomeMap(homeMap);
        MyHelperClass homeBuilding = new MyHelperClass();
        Integer id =(Integer)(Object) homeBuildingDao.saveHomeBuilding(homeBuilding);
        String dir = "E:\\ganymede_workspace\\training01\\web\\user_buildings\\";
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(dir + id);
            MyHelperClass imageFile = new MyHelperClass();
            IOUtils.copy(new FileInputStream(imageFile), fos);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fos);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return(String)(Object) execute();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getHomeMapById(MyHelperClass o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass saveHomeBuilding(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeMap(MyHelperClass o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
