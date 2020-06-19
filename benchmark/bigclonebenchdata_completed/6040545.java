


class c6040545 {
public MyHelperClass DeskTopFrame;
	public MyHelperClass JRXmlLoader;
	public MyHelperClass JasperFillManager;
public MyHelperClass JasperViewer;
	public MyHelperClass JasperCompileManager;

    public void generateListOfSubscriptions() {
        try {
            MyHelperClass NewGenLibDesktopRoot = new MyHelperClass();
            java.net.URL url = new java.net.URL(NewGenLibDesktopRoot.getInstance().getURLRoot() + "/NEWGEN_JR/ListOfSubscriptions.xml");
//            MyHelperClass NewGenLibDesktopRoot = new MyHelperClass();
            System.out.println(NewGenLibDesktopRoot.getRoot() + "/NEWGEN_JR/ListOfSubscriptions.xml");
            JasperDesign jd =(JasperDesign)(Object) JRXmlLoader.load((InputStream)(Object)url.openStream());
            MyHelperClass dtm = new MyHelperClass();
            System.out.println("in generate Report 30" + dtm.getRowCount());
            JasperReport jr =(JasperReport)(Object) JasperCompileManager.compileReport(jd);
//            MyHelperClass dtm = new MyHelperClass();
            System.out.println("in generate Report 32" + dtm.getRowCount());
            java.util.Map param = new java.util.HashMap();
            param.put("ReportTitle", "List of subscriptions");
            Class.forName("org.postgresql.Driver");
//            MyHelperClass dtm = new MyHelperClass();
            System.out.println("in generate Report 37" + dtm.getRowCount());
            JasperPrint jp =(JasperPrint)(Object) JasperFillManager.fillReport(jr,(Map)(Object) param, new JRTableModelDataSource(dtm));
//            MyHelperClass dtm = new MyHelperClass();
            System.out.println("in generate Report 39" + dtm.getRowCount());
            java.sql.Timestamp currentTime = new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis());
            if ((int)(Object)jp.getPages().size() != 0) JasperViewer.viewReport(jp, false); else javax.swing.JOptionPane.showMessageDialog((java.awt.Component)(Object)(Component)(Object)DeskTopFrame.getInstance(), "There are no records in the selected report option.");
//            MyHelperClass dtm = new MyHelperClass();
            System.out.println("in generate Report 43" + dtm.getRowCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass viewReport(JasperPrint o0, boolean o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getRowCount(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass fillReport(JasperReport o0, Map o1, JRTableModelDataSource o2){ return null; }
	public MyHelperClass getURLRoot(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass compileReport(JasperDesign o0){ return null; }}

class JasperDesign {

}

class JasperReport {

}

class JasperPrint {

public MyHelperClass getPages(){ return null; }}

class JRTableModelDataSource {

JRTableModelDataSource(MyHelperClass o0){}
	JRTableModelDataSource(){}}

class InputStream {

}

class Map {

}

class Component {

}
