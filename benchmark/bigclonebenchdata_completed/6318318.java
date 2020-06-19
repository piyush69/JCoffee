


class c6318318 {

    public static void addReaderField(final String fieldName, final Document document, final Store store, final TermVector termVector, final Reader reader) throws Exception {
        if (fieldName == null || reader == null) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.warn("Field and reader can't be null : " + fieldName + ", " + reader);
            return;
        }
        Field field =(Field)(Object) document.getField(fieldName);
        if (field == null) {
            field = new Field(fieldName, reader, termVector);
            document.add(field);
        } else {
            Reader fieldReader =(Reader)(Object) field.readerValue();
            if (fieldReader == null) {
                fieldReader =(Reader)(Object) new StringReader(field.stringValue());
            }
            Reader finalReader = null;
            Writer writer = null;
            try {
                MyHelperClass IConstants = new MyHelperClass();
                File tempFile =(File)(Object) File.createTempFile(Long.toString(System.nanoTime()), IConstants.READER_FILE_SUFFIX);
                writer =(Writer)(Object) new FileWriter(tempFile, false);
                char[] chars = new char[1024];
                int read =(int)(Object) fieldReader.read(chars);
                while (read > -1) {
                    writer.write(chars, 0, read);
                    read =(int)(Object) fieldReader.read(chars);
                }
                read =(int)(Object) reader.read(chars);
                while (read > -1) {
                    writer.write(chars, 0, read);
                    read =(int)(Object) reader.read(chars);
                }
                finalReader =(Reader)(Object) new FileReader(tempFile);
                if ((boolean)(Object)store.isStored()) {
                    document.removeField(fieldName);
                    field = new Field(fieldName, finalReader, termVector);
                    document.add(field);
                } else {
                    field.setValue(finalReader);
                }
            } catch (Exception e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Exception writing the field value with the file writer : ", e);
            } finally {
                MyHelperClass FileUtilities = new MyHelperClass();
                FileUtilities.close(writer);
//                MyHelperClass FileUtilities = new MyHelperClass();
                FileUtilities.close(finalReader);
//                MyHelperClass FileUtilities = new MyHelperClass();
                FileUtilities.close(fieldReader);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READER_FILE_SUFFIX;
public MyHelperClass close(Reader o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass close(Writer o0){ return null; }}

class Document {

public MyHelperClass removeField(String o0){ return null; }
	public MyHelperClass getField(String o0){ return null; }
	public MyHelperClass add(Field o0){ return null; }}

class Store {

public MyHelperClass isStored(){ return null; }}

class TermVector {

}

class Reader {

public MyHelperClass read(char[] o0){ return null; }}

class Field {

Field(){}
	Field(String o0, Reader o1, TermVector o2){}
	public MyHelperClass setValue(Reader o0){ return null; }
	public MyHelperClass stringValue(){ return null; }
	public MyHelperClass readerValue(){ return null; }}

class StringReader {

StringReader(MyHelperClass o0){}
	StringReader(){}}

class Writer {

public MyHelperClass write(char[] o0, int o1, int o2){ return null; }}

class File {

public static MyHelperClass createTempFile(String o0, MyHelperClass o1){ return null; }}

class FileWriter {

FileWriter(File o0, boolean o1){}
	FileWriter(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
