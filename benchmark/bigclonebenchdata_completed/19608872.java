
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19608872 {
public MyHelperClass sqlDropTable(BoxModel o0){ return null; }
	public MyHelperClass dropForeignKeys(BoxModel o0){ return null; }
public MyHelperClass stmt;
	public MyHelperClass con;
	public MyHelperClass Para;
	public MyHelperClass informUser(String o0){ return null; }

    public void genDropSchema(DiagramModel diagramModel, boolean foreignKeys) {
        try {
            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
            MyHelperClass stmt = new MyHelperClass();
            stmt = con.createStatement();
            Collection boxes =(Collection)(Object) diagramModel.getBoxes();
            BoxModel box;
            String sqlQuery;
            if (foreignKeys) {
                for (Iterator x =(Iterator)(Object) boxes.iterator();(boolean)(Object) x.hasNext(); ) {
                    box = (BoxModel)(BoxModel)(Object) x.next();
                    if (!(Boolean)(Object)box.isAbstractDef()) {
                        dropForeignKeys(box);
                    }
                }
            }
            int counter = 0;
            for (Iterator x =(Iterator)(Object) boxes.iterator();(boolean)(Object) x.hasNext(); ) {
                box = (BoxModel)(BoxModel)(Object) x.next();
                if (!(Boolean)(Object)box.isAbstractDef()) {
                    sqlQuery =(String)(Object) sqlDropTable(box);
                    System.out.println(sqlQuery);
                    try {
//                        MyHelperClass stmt = new MyHelperClass();
                        stmt.executeUpdate(sqlQuery);
                        counter++;
                    } catch (UncheckedIOException e) {
                        String tableName =(String)(Object) box.getName();
                        System.out.println("// Problem while dropping table " + tableName + " : " + e.getMessage());
                        MyHelperClass Para = new MyHelperClass();
                        String msg = Para.getPara().getText("tableNotDropped") + " -- " + tableName;
                        this.informUser(msg);
                    }
                }
            }
            con.commit();
            if (counter > 0) {
                String msg = Para.getPara().getText("schemaDropped") + " -- " + counter + " " + Para.getPara().getText("tables");
                this.informUser(msg);
            } else {
                this.informUser((String)(Object)Para.getPara().getText("schemaNotDropped"));
            }
        } catch (UncheckedIOException e) {
            System.out.println(e.getMessage() + " // Problem with the JDBC schema generation! ");
            try {
                con.rollback();
                this.informUser((String)(Object)Para.getPara().getText("schemaNotDropped"));
            } catch (UncheckedIOException e1) {
                System.out.println(e1.getMessage() + " // Problem with the connection rollback! ");
            }
        } finally {
            try {
                con.setAutoCommit(true);
                stmt.close();
            } catch (UncheckedIOException e1) {
                System.out.println(e1.getMessage() + " // Problem with the connection disconnect! ");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getPara(){ return null; }
	public MyHelperClass getText(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class DiagramModel {

public MyHelperClass getBoxes(){ return null; }}

class Collection {

public MyHelperClass iterator(){ return null; }}

class BoxModel {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isAbstractDef(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
