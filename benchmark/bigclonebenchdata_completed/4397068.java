
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4397068 {
public MyHelperClass PostgreSQLStore;
	public MyHelperClass lobj;

    protected synchronized Long putModel(String table, String linkTable, String type, TupleBinding binding, LocatableModel model) {
        try {
            if (model.getId() != null && !"".equals(model.getId())) {
                MyHelperClass ps7 = new MyHelperClass();
                ps7.setInt(1, Integer.parseInt((String)(Object)model.getId()));
//                MyHelperClass ps7 = new MyHelperClass();
                ps7.execute();
                MyHelperClass ps6 = new MyHelperClass();
                ps6.setInt(1, Integer.parseInt((String)(Object)model.getId()));
//                MyHelperClass ps6 = new MyHelperClass();
                ps6.execute();
            }
            MyHelperClass persistenceMethod = new MyHelperClass();
            if (persistenceMethod == PostgreSQLStore.BYTEA) {
                MyHelperClass ps1 = new MyHelperClass();
                ps1.setString(1,(String)(Object) model.getContig());
//                MyHelperClass ps1 = new MyHelperClass();
                ps1.setInt(2,(int)(Object) model.getStartPosition());
//                MyHelperClass ps1 = new MyHelperClass();
                ps1.setInt(3,(int)(Object) model.getStopPosition());
//                MyHelperClass ps1 = new MyHelperClass();
                ps1.setString(4, type);
                DatabaseEntry objData = new DatabaseEntry();
                binding.objectToEntry(model, objData);
//                MyHelperClass ps1 = new MyHelperClass();
                ps1.setBytes(5, objData.getData());
//                MyHelperClass ps1 = new MyHelperClass();
                ps1.executeUpdate();
//            MyHelperClass persistenceMethod = new MyHelperClass();
            } else if (persistenceMethod == PostgreSQLStore.OID || persistenceMethod == PostgreSQLStore.FIELDS) {
                MyHelperClass ps1b = new MyHelperClass();
                ps1b.setString(1,(String)(Object) model.getContig());
//                MyHelperClass ps1b = new MyHelperClass();
                ps1b.setInt(2,(int)(Object) model.getStartPosition());
//                MyHelperClass ps1b = new MyHelperClass();
                ps1b.setInt(3,(int)(Object) model.getStopPosition());
//                MyHelperClass ps1b = new MyHelperClass();
                ps1b.setString(4, type);
                DatabaseEntry objData = new DatabaseEntry();
                binding.objectToEntry(model, objData);
                MyHelperClass LargeObjectManager = new MyHelperClass();
                int oid =(int)(Object) lobj.create((int)(Object)LargeObjectManager.READ | (int)(Object)LargeObjectManager.WRITE);
//                MyHelperClass LargeObjectManager = new MyHelperClass();
                LargeObject obj =(LargeObject)(Object) lobj.open(oid, LargeObjectManager.WRITE);
                obj.write(objData.getData());
                obj.close();
//                MyHelperClass ps1b = new MyHelperClass();
                ps1b.setInt(5, oid);
//                MyHelperClass ps1b = new MyHelperClass();
                ps1b.executeUpdate();
            }
            ResultSet rs = null;
            MyHelperClass conn = new MyHelperClass();
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("select currval('" + table + "_" + table + "_id_seq')");
            rs =(ResultSet)(Object) ps.executeQuery();
            int modelId = -1;
            if (rs != null) {
                if ((boolean)(Object)rs.next()) {
                    modelId =(int)(Object) rs.getInt(1);
                }
            }
            rs.close();
            ps.close();
            for (String key :(String[])(Object) (Object[])(Object)model.getTags().keySet()) {
                int tagId = -1;
                MyHelperClass tags = new MyHelperClass();
                if (tags.get(key) != null) {
//                    MyHelperClass tags = new MyHelperClass();
                    tagId =(int)(Object) tags.get(key);
                } else {
                    MyHelperClass ps2 = new MyHelperClass();
                    ps2.setString(1, key);
//                    MyHelperClass ps2 = new MyHelperClass();
                    rs =(ResultSet)(Object) ps2.executeQuery();
                    if (rs != null) {
                        while ((boolean)(Object)rs.next()) {
                            tagId =(int)(Object) rs.getInt(1);
                        }
                    }
                    rs.close();
                }
                if (tagId < 0) {
                    MyHelperClass ps3 = new MyHelperClass();
                    ps3.setString(1, key);
//                    MyHelperClass ps3 = new MyHelperClass();
                    ps3.setString(2,(String)(Object) model.getTags().get(key));
//                    MyHelperClass ps3 = new MyHelperClass();
                    ps3.executeUpdate();
                    MyHelperClass ps4 = new MyHelperClass();
                    rs =(ResultSet)(Object) ps4.executeQuery();
                    if (rs != null) {
                        if ((boolean)(Object)rs.next()) {
                            tagId =(int)(Object) rs.getInt(1);
//                            MyHelperClass tags = new MyHelperClass();
                            tags.put(key, tagId);
                        }
                    }
                    rs.close();
                }
                MyHelperClass ps5 = new MyHelperClass();
                ps5.setInt(1, tagId);
//                MyHelperClass ps5 = new MyHelperClass();
                ps5.executeUpdate();
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
            return (new Long(modelId));
        } catch (UncheckedIOException e) {
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (UncheckedIOException e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
            System.err.println(e.getMessage());
        } catch (Exception e) {
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (UncheckedIOException e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return (null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BYTEA;
	public MyHelperClass READ;
	public MyHelperClass OID;
	public MyHelperClass WRITE;
	public MyHelperClass FIELDS;
public MyHelperClass setBytes(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass create(int o0){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass open(int o0, MyHelperClass o1){ return null; }}

class TupleBinding {

public MyHelperClass objectToEntry(LocatableModel o0, DatabaseEntry o1){ return null; }}

class LocatableModel {

public MyHelperClass getStopPosition(){ return null; }
	public MyHelperClass getContig(){ return null; }
	public MyHelperClass getTags(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getStartPosition(){ return null; }}

class DatabaseEntry {

public MyHelperClass getData(){ return null; }}

class LargeObject {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
