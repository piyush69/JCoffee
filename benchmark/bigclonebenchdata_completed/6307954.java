
import java.io.UncheckedIOException;


class c6307954 {

//    @Override
    public List importSheets(INetxiliaSystem workbookProcessor, WorkbookId workbookName, URL url, IProcessingConsole console) throws ImportException {
        try {
            return importSheets(workbookProcessor, workbookName,(URL)(Object) url.openStream(), console);
        } catch (UncheckedIOException e) {
            throw new ImportException(url, "Cannot open workbook:" + e,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class INetxiliaSystem {

}

class WorkbookId {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IProcessingConsole {

}

class List {

}

class SheetFullName {

}

class ImportException extends Exception{
	public ImportException(String errorMessage) { super(errorMessage); }
	ImportException(URL o0, String o1, IOException o2){}
	ImportException(){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
