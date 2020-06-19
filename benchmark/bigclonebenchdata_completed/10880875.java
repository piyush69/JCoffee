import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10880875 {
public MyHelperClass childObjects;
	public MyHelperClass childrenList;
	public MyHelperClass TableNameResolver;
	public MyHelperClass FieldHandler;
	public MyHelperClass log;
	public MyHelperClass childrenObjects;
	public MyHelperClass childList;
	public MyHelperClass relatedList;
	public MyHelperClass doValidations(boolean o0){ return null; }
	public MyHelperClass exists(){ return null; }

//    @Override
    public final boolean save() throws Throwable, RecordException, RecordValidationException, RecordValidationSyntax(Throwable)(Object) {
        MyHelperClass frozen = new MyHelperClass();
        if ((boolean)(Object)frozen) {
            throw new RecordException("The object is frozen.");
        }
        boolean toReturn = false;
        Class<? extends Record> actualClass =(Record>)(Object) this.getClass();
        MyHelperClass TableNameResolver = new MyHelperClass();
        HashMap<String, Integer> columns = getColumns(TableNameResolver.getTableName(actualClass));
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn = ConnectionManager.getConnection();
        LoggableStatement pStat = null;
        try {
            if ((boolean)(Object)exists()) {
                doValidations(true);
                StatementBuilder builder = new StatementBuilder("update " + TableNameResolver.getTableName(actualClass) + " set");
                String updates = "";
                for (String key : columns.keySet()) {
                    if (!key.equals("id")) {
                        Field f = null;
                        try {
                            f = FieldHandler.findField(actualClass, key);
                        } catch (FieldOrMethodNotFoundException e) {
                            throw new RecordException("Database column name >" + key + "< not found in class " + actualClass.getCanonicalName());
                        }
                        updates += key + " = :" + key + ", ";
                        builder.set(key, FieldHandler.getValue(f, this));
                    }
                }
                builder.append(updates.substring(0, updates.length() - 2));
                builder.append("where id = :id");
                builder.set(":id", FieldHandler.getValue(FieldHandler.findField(actualClass, "id"), this));
                pStat = builder.getPreparedStatement(conn);
                log.log(pStat.getQueryString());
                int i = pStat.executeUpdate();
                toReturn = i == 1;
            } else {
                doValidations(false);
                StatementBuilder builder = new StatementBuilder("insert into " + TableNameResolver.getTableName(actualClass) + " ");
                String names = "";
                String values = "";
                for (String key : columns.keySet()) {
                    Field f = null;
                    try {
                        f = FieldHandler.findField(actualClass, key);
                    } catch (FieldOrMethodNotFoundException e) {
                        throw new RecordException("Database column name >" + key + "< not found in class " + actualClass.getCanonicalName());
                    }
                    if (key.equals("id") && (Integer) FieldHandler.getValue(f, this) == 0) {
                        continue;
                    }
                    names += key + ", ";
                    values += ":" + key + ", ";
                    builder.set(key, f.get(this));
                }
                names = names.substring(0, names.length() - 2);
                values = values.substring(0, values.length() - 2);
                builder.append("(" + names + ")");
                builder.append("values");
                builder.append("(" + values + ")");
                pStat = builder.getPreparedStatement(conn);
                log.log(pStat.getQueryString());
                int i = pStat.executeUpdate();
                toReturn = i == 1;
            }
            if (childList != null) {
                if (childObjects == null) {
                    childObjects =(MyHelperClass)(Object) new HashMap<Class<? extends Record>, Record>();
                }
                for (Class<? extends Record> c : childList.keySet()) {
                    if (childObjects.get(c) != null) {
                        childObjects.get(c).save();
                    }
                }
            }
            if (childrenList != null) {
                if (childrenObjects == null) {
                    childrenObjects =(MyHelperClass)(Object) new HashMap<Class<? extends Record>, List<? extends Record>>();
                }
                for (Class<? extends Record> c : childrenList.keySet()) {
                    if (childrenObjects.get(c) != null) {
                        for (Record r : childrenObjects.get(c)) {
                            r.save();
                        }
                    }
                }
            }
            if (relatedList != null) {
                if (childrenObjects == null) {
                    childrenObjects =(MyHelperClass)(Object) new HashMap<Class<? extends Record>, List<? extends Record>>();
                }
                for (Class<? extends Record> c : relatedList.keySet()) {
                    if (childrenObjects.get(c) != null) {
                        for (Record r : childrenObjects.get(c)) {
                            r.save();
                        }
                    }
                }
            }
            return toReturn;
        } catch (Exception e) {
            if (e instanceof RecordValidationException) {
                throw (RecordValidationException) e;
            }
            if ((RecordValidationSyntax)(Object)e instanceof RecordValidationSyntax) {
                throw (RecordValidationSyntax)(RecordValidationSyntax)(Object) e;
            }
            try {
                conn.rollback();
            } catch (SQLException e1) {
                throw new RecordException("Error executing rollback");
            }
            throw new RecordException((String)(Object)e);
        } finally {
            try {
                if (pStat != null) {
                    pStat.close();
                }
                conn.commit();
                conn.close();
            } catch (SQLException e) {
                throw new RecordException("Error closing connection");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass findField(Class o0, String o1){ return null; }
	public MyHelperClass getValue(Field o0, c10880875 o1){ return null; }
	public MyHelperClass getTableName(Class o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass get(Class o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class RecordException extends Exception{
	public RecordException(String errorMessage) { super(errorMessage); }
}

class RecordValidationException extends Exception{
	public RecordValidationException(String errorMessage) { super(errorMessage); }
}

class RecordValidationSyntax {

}

class Record {

public MyHelperClass save(){ return null; }}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }}

class LoggableStatement {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class StatementBuilder {

public MyHelperClass append(String o0){ return null; }
	public MyHelperClass getPreparedStatement(Connection o0){ return null; }}

class Field {

public MyHelperClass get(c10880875 o0){ return null; }}

class FieldOrMethodNotFoundException extends Exception{
	public FieldOrMethodNotFoundException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
