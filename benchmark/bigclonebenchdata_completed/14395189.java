


class c14395189 {

    public void test2() throws Exception {
        SpreadsheetDocument document = new SpreadsheetDocument();
        Sheet sheet = new Sheet("Planilha 1");
        sheet.setLandscape(true);
        Row row = new Row();
        row.setHeight(20);
        sheet.getMerges().add(new IntegerCellMerge(0, 0, 0, 5));
        MyHelperClass ImageType = new MyHelperClass();
        sheet.getImages().add((Row)(Object)new Image(new FileInputStream("D:/image001.jpg"), 0, 0, ImageType.JPEG, 80, 60));
        for (int i = 0; i < 10; i++) {
            Cell cell = new Cell();
            cell.setValue("Celula " + i);
            cell.setBackgroundColor(new Color(192, 192, 192));
            cell.setUnderline(true);
            cell.setBold(true);
            cell.setItalic(true);
            cell.setFont("Times New Roman");
            cell.setFontSize(10);
            cell.setFontColor(new Color(255, 0, 0));
            Border border = new Border();
            border.setWidth(1);
            border.setColor(new Color(0, 0, 0));
            cell.setLeftBorder(border);
            cell.setTopBorder(border);
            cell.setRightBorder(border);
            cell.setBottomBorder(border);
            row.getCells().add(cell);
            sheet.getColumnsWith().put(new Integer(i), new Integer(25));
        }
        sheet.getRows().add(row);
        document.getSheets().add(sheet);
        FileOutputStream fos = new FileOutputStream("D:/teste2.xls");
        MyHelperClass HSSFSpreadsheetDocumentWriter = new MyHelperClass();
        SpreadsheetDocumentWriter writer =(SpreadsheetDocumentWriter)(Object) HSSFSpreadsheetDocumentWriter.getInstance();
        writer.write(document, fos);
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JPEG;
public MyHelperClass getInstance(){ return null; }
	public MyHelperClass add(Row o0){ return null; }
	public MyHelperClass put(Integer o0, Integer o1){ return null; }
	public MyHelperClass add(Sheet o0){ return null; }
	public MyHelperClass add(Cell o0){ return null; }
	public MyHelperClass add(IntegerCellMerge o0){ return null; }}

class SpreadsheetDocument {

public MyHelperClass getSheets(){ return null; }}

class Sheet {

Sheet(){}
	Sheet(String o0){}
	public MyHelperClass getColumnsWith(){ return null; }
	public MyHelperClass getRows(){ return null; }
	public MyHelperClass getMerges(){ return null; }
	public MyHelperClass getImages(){ return null; }
	public MyHelperClass setLandscape(boolean o0){ return null; }}

class Row {

public MyHelperClass getCells(){ return null; }
	public MyHelperClass setHeight(int o0){ return null; }}

class IntegerCellMerge {

IntegerCellMerge(int o0, int o1, int o2, int o3){}
	IntegerCellMerge(){}}

class Image {

Image(FileInputStream o0, int o1, int o2, MyHelperClass o3, int o4, int o5){}
	Image(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(String o0){}}

class Cell {

public MyHelperClass setFont(String o0){ return null; }
	public MyHelperClass setLeftBorder(Border o0){ return null; }
	public MyHelperClass setValue(String o0){ return null; }
	public MyHelperClass setFontSize(int o0){ return null; }
	public MyHelperClass setItalic(boolean o0){ return null; }
	public MyHelperClass setUnderline(boolean o0){ return null; }
	public MyHelperClass setBackgroundColor(Color o0){ return null; }
	public MyHelperClass setBottomBorder(Border o0){ return null; }
	public MyHelperClass setRightBorder(Border o0){ return null; }
	public MyHelperClass setBold(boolean o0){ return null; }
	public MyHelperClass setFontColor(Color o0){ return null; }
	public MyHelperClass setTopBorder(Border o0){ return null; }}

class Color {

Color(){}
	Color(int o0, int o1, int o2){}}

class Border {

public MyHelperClass setWidth(int o0){ return null; }
	public MyHelperClass setColor(Color o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0){}
	public MyHelperClass close(){ return null; }}

class SpreadsheetDocumentWriter {

public MyHelperClass write(SpreadsheetDocument o0, FileOutputStream o1){ return null; }}
