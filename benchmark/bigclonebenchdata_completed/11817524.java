


class c11817524 {
public MyHelperClass TAG_SERVICE;
	public MyHelperClass TAG_SERVICE_GROUP;
	public MyHelperClass DeploymentEngine;

    private void addServices(Bundle bundle) {
        MyHelperClass resolvedBundles = new MyHelperClass();
        if (!(Boolean)(Object)resolvedBundles.containsKey(bundle)) {
            Enumeration enumeration =(Enumeration)(Object) bundle.findEntries("META-INF", "*services.xml", false);
            int i = 0;
            List axisServiceGroupList = null;
            if (enumeration != null) {
                axisServiceGroupList =(List)(Object) new ArrayList();
            }
            while (enumeration != null && (boolean)(Object)enumeration.hasMoreElements()) {
                try {
                    URL url = (URL)(URL)(Object) enumeration.nextElement();
                    MyHelperClass configCtx = new MyHelperClass();
                    AxisServiceGroup serviceGroup = new AxisServiceGroup(configCtx.getAxisConfiguration());
                    serviceGroup.addParameter("last.updated", bundle.getLastModified());
                    ClassLoader loader =(ClassLoader)(Object) new BundleClassLoader(bundle, Registry.class.getClassLoader());
                    serviceGroup.setServiceGroupClassLoader(loader);
                    InputStream inputStream =(InputStream)(Object) url.openStream();
//                    MyHelperClass configCtx = new MyHelperClass();
                    DescriptionBuilder builder = new DescriptionBuilder(inputStream, configCtx);
                    OMElement rootElement =(OMElement)(Object) builder.buildOM();
                    String elementName =(String)(Object) rootElement.getLocalName();
                    Dictionary headers =(Dictionary)(Object) bundle.getHeaders();
                    String bundleSymbolicName = (String)(String)(Object) headers.get("Bundle-SymbolicName");
                    bundleSymbolicName = bundleSymbolicName + "_" + i;
                    serviceGroup.setServiceGroupName(bundleSymbolicName);
                    HashMap wsdlServicesMap = new HashMap();
                    if (TAG_SERVICE.equals(elementName)) {
                        AxisService axisService = new AxisService(bundleSymbolicName);
                        axisService.setParent(serviceGroup);
                        axisService.setClassLoader(loader);
//                        MyHelperClass configCtx = new MyHelperClass();
                        ServiceBuilder serviceBuilder =(ServiceBuilder)(Object) new OSGiServiceBuilder(configCtx, axisService);
                        serviceBuilder.setWsdlServiceMap(wsdlServicesMap);
                        AxisService service =(AxisService)(Object) serviceBuilder.populateService(rootElement);
                        ArrayList serviceList = new ArrayList();
                        serviceList.add(service);
//                        MyHelperClass configCtx = new MyHelperClass();
                        DeploymentEngine.addServiceGroup(serviceGroup, serviceList, null, null, configCtx.getAxisConfiguration());
                        MyHelperClass log = new MyHelperClass();
                        log.info("[Axis2/OSGi] Deployed axis2 service:" + service.getName() + " in Bundle: " + bundle.getSymbolicName());
                    } else if (TAG_SERVICE_GROUP.equals(elementName)) {
//                        MyHelperClass configCtx = new MyHelperClass();
                        ServiceGroupBuilder groupBuilder =(ServiceGroupBuilder)(Object) new OSGiServiceGroupBuilder(rootElement, wsdlServicesMap, configCtx);
                        ArrayList serviceList =(ArrayList)(Object) groupBuilder.populateServiceGroup(serviceGroup);
//                        MyHelperClass configCtx = new MyHelperClass();
                        DeploymentEngine.addServiceGroup(serviceGroup, serviceList, null, null, configCtx.getAxisConfiguration());
                        MyHelperClass log = new MyHelperClass();
                        log.info("[Axis2/OSGi] Deployed axis2 service group:" + serviceGroup.getServiceGroupName() + " in Bundle: " + bundle.getSymbolicName());
                    }
                    MyHelperClass OSGi_BUNDLE_ID = new MyHelperClass();
                    serviceGroup.addParameter(OSGi_BUNDLE_ID, bundle.getBundleId());
                    axisServiceGroupList.add(serviceGroup);
                    MyHelperClass unreslovedBundles = new MyHelperClass();
                    if ((boolean)(Object)unreslovedBundles.contains(bundle)) {
//                        MyHelperClass unreslovedBundles = new MyHelperClass();
                        unreslovedBundles.remove(bundle);
                    }
                    i++;
                } catch (Throwable e) {
                    String msg = "Error while reading from the bundle";
                    if (e instanceof DeploymentException) {
                        String message = e.getMessage();
                        if (message != null && message.length() != 0) {
                            MyHelperClass MODULE_NOT_FOUND_ERROR = new MyHelperClass();
                            if (message.indexOf((int)(Object)MODULE_NOT_FOUND_ERROR) > -1) {
                                MyHelperClass unreslovedBundles = new MyHelperClass();
                                if (!(Boolean)(Object)unreslovedBundles.contains(bundle)) {
                                    MyHelperClass log = new MyHelperClass();
                                    log.info("A service being found with unmeant module " + "dependency. Hence, moved it to UNRESOLVED state.");
//                                    MyHelperClass unreslovedBundles = new MyHelperClass();
                                    unreslovedBundles.add(bundle);
                                } else {
                                    MyHelperClass log = new MyHelperClass();
                                    log.info("A service being found in UNRESOLVED state.");
                                }
                            } else {
                                MyHelperClass log = new MyHelperClass();
                                log.error(msg, e);
                                break;
                            }
                        } else {
                            MyHelperClass log = new MyHelperClass();
                            log.error(msg, e);
                            break;
                        }
                    } else {
                        MyHelperClass log = new MyHelperClass();
                        log.error(msg, e);
                        break;
                    }
                }
            }
            if (axisServiceGroupList != null &&(int)(Object) axisServiceGroupList.size() > 0) {
//                MyHelperClass resolvedBundles = new MyHelperClass();
                resolvedBundles.put(bundle, axisServiceGroupList);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getAxisConfiguration(){ return null; }
	public MyHelperClass remove(Bundle o0){ return null; }
	public MyHelperClass addServiceGroup(AxisServiceGroup o0, ArrayList o1, Object o2, Object o3, MyHelperClass o4){ return null; }
	public MyHelperClass put(Bundle o0, List o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass containsKey(Bundle o0){ return null; }
	public MyHelperClass add(Bundle o0){ return null; }
	public MyHelperClass contains(Bundle o0){ return null; }}

class Bundle {

public MyHelperClass getSymbolicName(){ return null; }
	public MyHelperClass getHeaders(){ return null; }
	public MyHelperClass findEntries(String o0, String o1, boolean o2){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getBundleId(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class List {

public MyHelperClass add(AxisServiceGroup o0){ return null; }
	public MyHelperClass size(){ return null; }}

class AxisServiceGroup {

AxisServiceGroup(){}
	AxisServiceGroup(MyHelperClass o0){}
	public MyHelperClass addParameter(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getServiceGroupName(){ return null; }
	public MyHelperClass setServiceGroupClassLoader(ClassLoader o0){ return null; }
	public MyHelperClass setServiceGroupName(String o0){ return null; }
	public MyHelperClass addParameter(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ArrayList {

public MyHelperClass add(AxisService o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BundleClassLoader {

BundleClassLoader(Bundle o0, ClassLoader o1){}
	BundleClassLoader(){}}

class Registry {

}

class InputStream {

}

class DescriptionBuilder {

DescriptionBuilder(InputStream o0, MyHelperClass o1){}
	DescriptionBuilder(){}
	public MyHelperClass buildOM(){ return null; }}

class OMElement {

public MyHelperClass getLocalName(){ return null; }}

class Dictionary {

public MyHelperClass get(String o0){ return null; }}

class HashMap {

}

class AxisService {

AxisService(){}
	AxisService(String o0){}
	public MyHelperClass setParent(AxisServiceGroup o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setClassLoader(ClassLoader o0){ return null; }}

class ServiceBuilder {

public MyHelperClass setWsdlServiceMap(HashMap o0){ return null; }
	public MyHelperClass populateService(OMElement o0){ return null; }}

class OSGiServiceBuilder {

OSGiServiceBuilder(MyHelperClass o0, AxisService o1){}
	OSGiServiceBuilder(){}}

class ServiceGroupBuilder {

public MyHelperClass populateServiceGroup(AxisServiceGroup o0){ return null; }}

class OSGiServiceGroupBuilder {

OSGiServiceGroupBuilder(OMElement o0, HashMap o1, MyHelperClass o2){}
	OSGiServiceGroupBuilder(){}}

class DeploymentException extends Exception{
	public DeploymentException(String errorMessage) { super(errorMessage); }
}
