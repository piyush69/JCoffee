


class c15577716 {
public MyHelperClass loadProps(MyHelperClass o0){ return null; }
	public MyHelperClass createXMLFile(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass xmlFileName;
	public MyHelperClass assertNotNull(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass removeChildCollection(Collection o0, String o1, CollectionManagementService o2){ return null; }

    public void setUp() throws Exception {
        MyHelperClass logger = new MyHelperClass();
        logger.finer("******************** set up ********************");
        Properties props;
        MyHelperClass XMLDBTestSuite = new MyHelperClass();
        if (XMLDBTestSuite.propertiesFileName == null) {
            String defaultPropsFileLocation = "test/xmldb/XMLDBTestSuite.properties";
            URL url =(URL)(Object) this.getClass().getClassLoader().getResource(defaultPropsFileLocation);
            if (url == null) {
                throw new Exception("failed to find default props file at " + defaultPropsFileLocation);
            }
            props =(Properties)(Object) loadProps(url.openConnection().getInputStream());
        } else {
//            MyHelperClass XMLDBTestSuite = new MyHelperClass();
            props =(Properties)(Object) loadProps(XMLDBTestSuite.propertiesFileName);
        }
        String driver =(String)(Object) props.getProperty("driverName");
        String collectionURI =(String)(Object) props.getProperty("URI");
        Database database = (Database) Class.forName(driver).newInstance();
        CollectionStorageHelper collectionStorageHelper;// = new CollectionStorageHelper();
        collectionStorageHelper = new CollectionStorageHelper(collectionURI);
        MyHelperClass rootCollectionName = new MyHelperClass();
        rootCollectionName = collectionStorageHelper.getCollectionName();
        Collection root =(Collection)(Object) database.getCollection(collectionURI, null, null);
        MyHelperClass CollectionManagementService = new MyHelperClass();
        CollectionManagementService service = (CollectionManagementService)(CollectionManagementService)(Object) root.getService(CollectionManagementService.SERVICE_NAME, "1.0");
        String childCollection = "child";
        removeChildCollection(root, childCollection, service);
        MyHelperClass col = new MyHelperClass();
        col = service.createCollection(childCollection);
//        MyHelperClass col = new MyHelperClass();
        assertNotNull("XMLDBTestCase.setUp() - Collection could not be created", col);
//        MyHelperClass col = new MyHelperClass();
        logger.info("created child collection '" + col.getName() + "' parent is '" + col.getParentCollection().getName() + "'");
//        MyHelperClass rootCollectionName = new MyHelperClass();
        assertEquals("Root collection name should match childs parent name", rootCollectionName, col.getParentCollection().getName());
        MyHelperClass document = new MyHelperClass();
        document = createXMLFile(xmlFileName);
//        MyHelperClass document = new MyHelperClass();
        assertNotNull("XMLDBTestCase.setUp() - failed to create XML file", document);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass propertiesFileName;
	public MyHelperClass SERVICE_NAME;
public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getCollectionName(){ return null; }
	public MyHelperClass getParentCollection(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Database {

public MyHelperClass getCollection(String o0, Object o1, Object o2){ return null; }}

class Collection {

public MyHelperClass getService(MyHelperClass o0, String o1){ return null; }}

class CollectionManagementService {

public MyHelperClass createCollection(String o0){ return null; }}

class CollectionStorageHelper {

CollectionStorageHelper(String o0){}
	CollectionStorageHelper(){}
	public MyHelperClass getCollectionName(){ return null; }}
