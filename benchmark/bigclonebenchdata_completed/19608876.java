
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19608876 {
public MyHelperClass sqlCreateTableBegin(BoxModel o0){ return null; }
	public MyHelperClass sqlPrimaryKey(BoxModel o0){ return null; }
	public MyHelperClass sqlUniqueKey(BoxModel o0){ return null; }
	public MyHelperClass sqlCreateTableEnd(BoxModel o0, String o1){ return null; }
	public MyHelperClass genCreateForeignKeys(DiagramModel o0){ return null; }
	public MyHelperClass sqlForeignKeyColumns(BoxModel o0){ return null; }
	public MyHelperClass sqlColumn(ItemModel o0){ return null; }
public MyHelperClass stmt;
	public MyHelperClass con;
	public MyHelperClass Para;
	public MyHelperClass informUser(String o0){ return null; }

    public void genCreateSchema(DiagramModel diagramModel, String source) {
        try {
            MyHelperClass con = new MyHelperClass();
            con.setAutoCommit(false);
            MyHelperClass stmt = new MyHelperClass();
            stmt = con.createStatement();
            Collection boxes =(Collection)(Object) diagramModel.getBoxes();
            BoxModel box;
            ItemModel item;
            String sqlQuery;
            int counter = 0;
            for (Iterator x =(Iterator)(Object) boxes.iterator();(boolean)(Object) x.hasNext(); ) {
                box = (BoxModel)(BoxModel)(Object) x.next();
                if (!(Boolean)(Object)box.isAbstractDef()) {
                    sqlQuery =(String)(Object) sqlCreateTableBegin(box);
                    Collection items =(Collection)(Object) box.getItems();
                    for (Iterator y =(Iterator)(Object) items.iterator();(boolean)(Object) y.hasNext(); ) {
                        item = (ItemModel)(ItemModel)(Object) y.next();
                        sqlQuery = sqlQuery + sqlColumn(item);
                    }
                    sqlQuery = sqlQuery + sqlForeignKeyColumns(box);
                    sqlQuery = sqlQuery + sqlPrimaryKey(box);
                    sqlQuery = sqlQuery + sqlUniqueKey(box);
                    sqlQuery = sqlQuery + sqlCreateTableEnd(box, source);
                    System.out.println(sqlQuery);
                    try {
//                        MyHelperClass stmt = new MyHelperClass();
                        stmt.executeUpdate(sqlQuery);
                        counter++;
                    } catch (UncheckedIOException e) {
                        String tableName =(String)(Object) box.getName();
                        System.out.println("// Problem while creating table " + tableName + " : " + e.getMessage());
                        MyHelperClass Para = new MyHelperClass();
                        String msg = Para.getPara().getText("tableNotCreated") + " -- " + tableName;
                        this.informUser(msg);
                    }
                }
            }
            this.genCreateForeignKeys(diagramModel);
            con.commit();
            if (counter > 0) {
                String msg = Para.getPara().getText("schemaCreated") + " -- " + counter + " " + Para.getPara().getText("tables");
                this.informUser(msg);
            } else {
                this.informUser((String)(Object)Para.getPara().getText("schemaNotCreated"));
            }
        } catch (UncheckedIOException e) {
            System.out.println(e.getMessage() + " // Problem with the JDBC schema generation! ");
            try {
                con.rollback();
                this.informUser((String)(Object)Para.getPara().getText("schemaNotCreated"));
            } catch (UncheckedIOException e1) {
                System.out.println(e1.getMessage() + " // Problem with the connection rollback! ");
            }
        } finally {
            try {
                con.setAutoCommit(true);
                stmt.close();
            } catch (UncheckedIOException e) {
                System.out.println(e.getMessage() + " // Problem with the statement closing! ");
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

public MyHelperClass getItems(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isAbstractDef(){ return null; }}

class ItemModel {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
