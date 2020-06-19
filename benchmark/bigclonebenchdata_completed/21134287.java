


class c21134287 {
public MyHelperClass STATUS_INACTIVE;
	public MyHelperClass STATUS_PROCESSING;
	public MyHelperClass STATUS_ACTIVE;
	public MyHelperClass preAdd(Document o0, MyHelperClass o1){ return null; }
public MyHelperClass AppConstants;
	public MyHelperClass File;
	public MyHelperClass getParams(){ return null; }

    private List storeDocuments(List documents) {
        MyHelperClass HibernateUtil = new MyHelperClass();
        Session session =(Session)(Object) HibernateUtil.getSessionFactory().getCurrentSession();
        List newDocuments =(List)(Object) new ArrayList();
        try {
            session.beginTransaction();
            Preference preference =(Preference)(Object) new PreferenceModel();
            preference = (Preference)(Preference)(Object) preference.doList(preference).get(0);
            MyHelperClass Calendar = new MyHelperClass();
            Calendar calendar =(Calendar)(Object) Calendar.getInstance();
//            MyHelperClass Calendar = new MyHelperClass();
            int year =(int)(Object) calendar.get(Calendar.YEAR);
            if (documents != null && !(Boolean)(Object)documents.isEmpty()) {
                for (Iterator iter =(Iterator)(Object) documents.iterator();(boolean)(Object) iter.hasNext(); ) {
                    Document document =(Document)(Object) iter.next();
                    if (STATUS_ACTIVE.equals(document.getStatus())) {
                        try {
                            document = (Document)(Document)(Object) preAdd(document, getParams());
                            File fileIn = new File((int)(Object)preference.getScanLocation() + (int)(Object)File.separator + (int)(Object)document.getName());
                            File fileOut = new File((int)(Object)preference.getStoreLocation() + (int)(Object)File.separator + (int)(Object)document.getName());
                            FileInputStream in = new FileInputStream(fileIn);
                            FileOutputStream out = new FileOutputStream(fileOut);
                            int c;
                            while ((c =(int)(Object) in.read()) != -1) out.write(c);
                            in.close();
                            out.close();
                            document.doAdd(document);
                            boolean isDeleted =(boolean)(Object) fileIn.delete();
                            System.out.println("Deleted scan folder file: " + document.getName() + ":" + isDeleted);
                            if (isDeleted) {
                                document.setStatus(AppConstants.STATUS_PROCESSING);
                                int uploadCount = 0;
                                if (document.getUploadCount() != null) {
                                    uploadCount =(int)(Object) document.getUploadCount();
                                }
                                uploadCount++;
                                document.setUploadCount(uploadCount);
                                newDocuments.add(document);
                            }
                        } catch (Exception add_ex) {
                            add_ex.printStackTrace();
                        }
                    } else if (STATUS_PROCESSING.equals(document.getStatus())) {
                        int uploadCount =(int)(Object) document.getUploadCount();
                        if (uploadCount < 5) {
                            uploadCount++;
                            document.setUploadCount(uploadCount);
                            System.out.println("increase upload count: " + document.getName() + ":" + uploadCount);
                            newDocuments.add(document);
                        } else {
                            System.out.println("delete from documents list: " + document.getName());
                        }
                    } else if (STATUS_INACTIVE.equals(document.getStatus())) {
                        document.setFixFlag(AppConstants.FLAG_NO);
                        newDocuments.add(document);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return newDocuments;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass YEAR;
	public MyHelperClass STATUS_PROCESSING;
	public MyHelperClass FLAG_NO;
public MyHelperClass getCurrentSession(){ return null; }
	public MyHelperClass getSessionFactory(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass add(Document o0){ return null; }}

class Document {

public MyHelperClass getUploadCount(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setUploadCount(int o0){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass doAdd(Document o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setFixFlag(MyHelperClass o0){ return null; }}

class Session {

public MyHelperClass beginTransaction(){ return null; }}

class ArrayList {

}

class Preference {

public MyHelperClass getScanLocation(){ return null; }
	public MyHelperClass getStoreLocation(){ return null; }
	public MyHelperClass doList(Preference o0){ return null; }}

class PreferenceModel {

}

class Calendar {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
