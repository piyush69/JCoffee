import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3467482 {
public MyHelperClass writeFloat(MyHelperClass o0){ return null; }
	public MyHelperClass writeString(MyHelperClass o0){ return null; }
	public MyHelperClass writeByte(MyHelperClass o0){ return null; }
	public MyHelperClass writeDouble(MyHelperClass o0){ return null; }
	public MyHelperClass writeBytes(MyHelperClass o0){ return null; }
public MyHelperClass Constants;
	public MyHelperClass Message;
	public MyHelperClass DataType;
	public MyHelperClass Value;
	public MyHelperClass session;
	public MyHelperClass SysProperties;
	public MyHelperClass IOUtils;
	public MyHelperClass LOB_MAGIC;
	public MyHelperClass out;
	public MyHelperClass writeLong(long o0){ return null; }
	public MyHelperClass writeBoolean(boolean o0){ return null; }
	public MyHelperClass writeInt(int o0){ return null; }

    public void writeValue(Value v) throws Throwable, IOException, SQLException {
        int type =(int)(Object) v.getType();
        writeInt(type);
        switch(type) {
            case(int)(Object) Value.NULL:
                break;
            case(int)(Object) Value.BYTES:
            case(int)(Object) Value.JAVA_OBJECT:
                writeBytes(v.getBytesNoCopy());
                break;
            case(int)(Object) Value.UUID:
                {
                    ValueUuid uuid = (ValueUuid)(ValueUuid)(Object) v;
                    writeLong((long)(Object)uuid.getHigh());
                    writeLong((long)(Object)uuid.getLow());
                    break;
                }
            case(int)(Object) Value.BOOLEAN:
                writeBoolean((boolean)(Object)v.getBoolean().booleanValue());
                break;
            case(int)(Object) Value.BYTE:
                writeByte(v.getByte());
                break;
            case(int)(Object) Value.TIME:
                writeLong((long)(Object)v.getTimeNoCopy().getTime());
                break;
            case(int)(Object) Value.DATE:
                writeLong((long)(Object)v.getDateNoCopy().getTime());
                break;
            case(int)(Object) Value.TIMESTAMP:
                {
                    Timestamp ts =(Timestamp)(Object) v.getTimestampNoCopy();
                    writeLong((long)(Object)ts.getTime());
                    writeInt((int)(Object)ts.getNanos());
                    break;
                }
            case(int)(Object) Value.DECIMAL:
                writeString(v.getString());
                break;
            case(int)(Object) Value.DOUBLE:
                writeDouble(v.getDouble());
                break;
            case(int)(Object) Value.FLOAT:
                writeFloat(v.getFloat());
                break;
            case(int)(Object) Value.INT:
                writeInt((int)(Object)v.getInt());
                break;
            case(int)(Object) Value.LONG:
                writeLong((long)(Object)v.getLong());
                break;
            case(int)(Object) Value.SHORT:
                writeInt((int)(Object)v.getShort());
                break;
            case(int)(Object) Value.STRING:
            case(int)(Object) Value.STRING_IGNORECASE:
            case(int)(Object) Value.STRING_FIXED:
                writeString(v.getString());
                break;
            case(int)(Object) Value.BLOB:
                {
                    long length =(long)(Object) v.getPrecision();
                    if ((boolean)(Object)SysProperties.CHECK && length < 0) {
                        Message.throwInternalError("length: " + length);
                    }
                    writeLong(length);
                    InputStream in =(InputStream)(Object) v.getInputStream();
                    long written =(long)(Object) IOUtils.copyAndCloseInput(in, out);
                    if ((boolean)(Object)SysProperties.CHECK && written != length) {
                        Message.throwInternalError("length:" + length + " written:" + written);
                    }
                    writeInt((int)(Object)LOB_MAGIC);
                    break;
                }
            case(int)(Object) Value.CLOB:
                {
                    long length =(long)(Object) v.getPrecision();
                    if ((boolean)(Object)SysProperties.CHECK && length < 0) {
                        Message.throwInternalError("length: " + length);
                    }
                    writeLong(length);
                    Reader reader =(Reader)(Object) v.getReader();
                    java.io.OutputStream out2 = new java.io.FilterOutputStream((OutputStream)(Object)out) {

                        public void flush() {
                        }
                    };
                    Writer writer = new BufferedWriter(new OutputStreamWriter(out2,(String)(Object) Constants.UTF8));
                    long written =(long)(Object) IOUtils.copyAndCloseInput(reader, writer);
                    if ((boolean)(Object)SysProperties.CHECK && written != length) {
                        Message.throwInternalError("length:" + length + " written:" + written);
                    }
                    writer.flush();
                    writeInt((int)(Object)LOB_MAGIC);
                    break;
                }
            case(int)(Object) Value.ARRAY:
                {
                    Value[] list =(Value[])(Object) ((ValueArray)(ValueArray)(Object) v).getList();
                    writeInt(list.length);
                    for (Value value : list) {
                        writeValue(value);
                    }
                    break;
                }
            case(int)(Object) Value.RESULT_SET:
                {
                    ResultSet rs =(ResultSet)(Object) ((ValueResultSet)(ValueResultSet)(Object) v).getResultSet();
                    rs.beforeFirst();
                    ResultSetMetaData meta =(ResultSetMetaData)(Object) rs.getMetaData();
                    int columnCount =(int)(Object) meta.getColumnCount();
                    writeInt(columnCount);
                    for (int i = 0; i < columnCount; i++) {
                        writeString(meta.getColumnName(i + 1));
                        writeInt((int)(Object)meta.getColumnType(i + 1));
                        writeInt((int)(Object)meta.getPrecision(i + 1));
                        writeInt((int)(Object)meta.getScale(i + 1));
                    }
                    while ((boolean)(Object)rs.next()) {
                        writeBoolean(true);
                        for (int i = 0; i < columnCount; i++) {
                            int t =(int)(Object) DataType.convertSQLTypeToValueType(meta.getColumnType(i + 1));
                            Value val =(Value)(Object) DataType.readValue(session, rs, i + 1, t);
                            writeValue(val);
                        }
                    }
                    writeBoolean(false);
                    rs.beforeFirst();
                    break;
                }
            default:
                Message.throwInternalError("type=" + type);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STRING_FIXED;
	public MyHelperClass BYTES;
	public MyHelperClass FLOAT;
	public MyHelperClass BLOB;
	public MyHelperClass STRING_IGNORECASE;
	public MyHelperClass LONG;
	public MyHelperClass TIME;
	public MyHelperClass INT;
	public MyHelperClass UUID;
	public MyHelperClass RESULT_SET;
	public MyHelperClass JAVA_OBJECT;
	public MyHelperClass NULL;
	public MyHelperClass BOOLEAN;
	public MyHelperClass SHORT;
	public MyHelperClass DOUBLE;
	public MyHelperClass BYTE;
	public MyHelperClass TIMESTAMP;
	public MyHelperClass CLOB;
	public MyHelperClass ARRAY;
	public MyHelperClass UTF8;
	public MyHelperClass DECIMAL;
	public MyHelperClass STRING;
	public MyHelperClass DATE;
	public MyHelperClass CHECK;
public MyHelperClass readValue(MyHelperClass o0, ResultSet o1, int o2, int o3){ return null; }
	public MyHelperClass copyAndCloseInput(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass booleanValue(){ return null; }
	public MyHelperClass copyAndCloseInput(Reader o0, Writer o1){ return null; }
	public MyHelperClass convertSQLTypeToValueType(MyHelperClass o0){ return null; }
	public MyHelperClass throwInternalError(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }}

class Value {

public MyHelperClass getPrecision(){ return null; }
	public MyHelperClass getBoolean(){ return null; }
	public MyHelperClass getFloat(){ return null; }
	public MyHelperClass getByte(){ return null; }
	public MyHelperClass getString(){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getLong(){ return null; }
	public MyHelperClass getReader(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getTimestampNoCopy(){ return null; }
	public MyHelperClass getBytesNoCopy(){ return null; }
	public MyHelperClass getDouble(){ return null; }
	public MyHelperClass getTimeNoCopy(){ return null; }
	public MyHelperClass getDateNoCopy(){ return null; }
	public MyHelperClass getInt(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ValueUuid {

public MyHelperClass getLow(){ return null; }
	public MyHelperClass getHigh(){ return null; }}

class Timestamp {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass getNanos(){ return null; }}

class ValueArray {

public MyHelperClass getList(){ return null; }}

class ResultSet {

public MyHelperClass beforeFirst(){ return null; }
	public MyHelperClass getMetaData(){ return null; }
	public MyHelperClass next(){ return null; }}

class ValueResultSet {

public MyHelperClass getResultSet(){ return null; }}

class ResultSetMetaData {

public MyHelperClass getColumnName(int o0){ return null; }
	public MyHelperClass getScale(int o0){ return null; }
	public MyHelperClass getPrecision(int o0){ return null; }
	public MyHelperClass getColumnType(int o0){ return null; }
	public MyHelperClass getColumnCount(){ return null; }}
