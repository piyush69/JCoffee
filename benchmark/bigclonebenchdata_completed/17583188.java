


class c17583188 {
public MyHelperClass DataElement;
	public MyHelperClass attributes;
	public MyHelperClass getAttributeValue(int o0){ return null; }

    byte[] toByteArray() throws IOException {
        MyHelperClass DataElement = new MyHelperClass();
        DataElement element = new DataElement(DataElement.DATSEQ);
        final boolean sort = true;
        if (sort) {
            MyHelperClass attributes = new MyHelperClass();
            int[] sortIDs = new int[(int)(Object)attributes.size()];
            int k = 0;
//            MyHelperClass attributes = new MyHelperClass();
            for (Enumeration e =(Enumeration)(Object) attributes.keys();(boolean)(Object) e.hasMoreElements(); ) {
                Integer key = (Integer)(Integer)(Object) e.nextElement();
                sortIDs[k] = key.intValue();
                k++;
            }
            for (int i = 0; i < sortIDs.length; i++) {
                for (int j = 0; j < sortIDs.length - i - 1; j++) {
                    if (sortIDs[j] > sortIDs[j + 1]) {
                        int temp = sortIDs[j];
                        sortIDs[j] = sortIDs[j + 1];
                        sortIDs[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < sortIDs.length; i++) {
//                MyHelperClass DataElement = new MyHelperClass();
                element.addElement(new DataElement(DataElement.U_INT_2, sortIDs[i]));
                element.addElement(getAttributeValue(sortIDs[i]));
            }
        } else {
            for (Enumeration e =(Enumeration)(Object) attributes.keys();(boolean)(Object) e.hasMoreElements(); ) {
                Integer key = (Integer)(Integer)(Object) e.nextElement();
                element.addElement(new DataElement(DataElement.U_INT_2, key.intValue()));
                element.addElement((DataElement)(DataElement)(Object) attributes.get(key));
            }
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        (new SDPOutputStream(out)).writeElement(element);
        return(byte[])(Object) out.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass U_INT_2;
	public MyHelperClass DATSEQ;
public MyHelperClass get(Integer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass keys(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DataElement {

DataElement(){}
	DataElement(MyHelperClass o0, int o1){}
	DataElement(MyHelperClass o0){}
	public MyHelperClass addElement(DataElement o0){ return null; }
	public MyHelperClass addElement(MyHelperClass o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class SDPOutputStream {

SDPOutputStream(){}
	SDPOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass writeElement(DataElement o0){ return null; }}
