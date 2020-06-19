


class c14710191 {
public MyHelperClass FETCH_DEPTH;
	public MyHelperClass PropertySetTestStruct;
	public MyHelperClass FETCH_GROUPS;
	public MyHelperClass fetchPropertySet(){ return null; }
	public MyHelperClass getPropertyManager(){ return null; }

    public void testImageDataField() {
        PropertySet propertySet =(PropertySet)(Object) fetchPropertySet();
        try {
            ImageDataField dataField =(ImageDataField)(Object) propertySet.getDataField(PropertySetTestStruct.TESTBLOCK_IMAGE, ImageDataField.class);
            URL url =(URL)(Object) getClass().getResource("JFire_Test.gif");
            if (url == null) return;
            InputStream in =(InputStream)(Object) url.openStream();
            try {
                dataField.loadStream(in, "JFire_Test.gif", "image/gif");
            } finally {
                in.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Setting image of ImageDataField failed", e);
        }
        try {
            propertySet.deflate();
            getPropertyManager().storePropertySet(propertySet, true, FETCH_GROUPS, FETCH_DEPTH);
        } catch (Exception e) {
            throw new RuntimeException("Storing PropertySet with ImageDataField failed", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TESTBLOCK_IMAGE;
public MyHelperClass storePropertySet(PropertySet o0, boolean o1, MyHelperClass o2, MyHelperClass o3){ return null; }}

class PropertySet {

public MyHelperClass getDataField(MyHelperClass o0, Class<ImageDataField> o1){ return null; }
	public MyHelperClass deflate(){ return null; }}

class ImageDataField {

public MyHelperClass loadStream(InputStream o0, String o1, String o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
