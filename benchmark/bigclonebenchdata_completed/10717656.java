import java.io.*;
import java.lang.*;
import java.util.*;



class c10717656 {
public MyHelperClass servers;
	public MyHelperClass MonitorServer;
	public MyHelperClass tasks;
public MyHelperClass resources;
	public MyHelperClass engine;
	public MyHelperClass Config;
	public MyHelperClass bindings;
	public MyHelperClass setPlain(MyHelperClass o0){ return null; }
	public MyHelperClass setBold(MyHelperClass o0){ return null; }

    public void run() {
        StringBuffer xml;
        String tabName;
        Element guiElement;
        MyHelperClass monitor = new MyHelperClass();
        setBold(monitor.getReading());
//        MyHelperClass monitor = new MyHelperClass();
        setBold(monitor.getReadingStatus());
//        MyHelperClass monitor = new MyHelperClass();
        monitor.getReadingStatus().setText("      Working");
        HttpMethod method = null;
        xml = new StringBuffer();
        MyHelperClass url = new MyHelperClass();
        File tempfile = new File((String)(Object)url);
        if (tempfile.exists()) {
            try {
                InputStream in = new FileInputStream(tempfile);
                int temp;
                while ((temp = in.read()) != -1) {
                    xml.append((char) temp);
                }
                in.close();
            } catch (IOException e) {
                System.out.println("Loading Monitor Failed, error while reading XML file from local file");
                e.printStackTrace(System.err);
                return;
            }
        } else {
            try {
                HttpClient client = new HttpClient();
//                MyHelperClass url = new MyHelperClass();
                method =(HttpMethod)(Object) new GetMethod(url);
                int response =(int)(Object) client.executeMethod(method);
                if (response == 200) {
                    InputStream in =(InputStream)(Object) method.getResponseBodyAsStream();
                    int temp;
                    while ((temp = in.read()) != -1) {
                        xml.append((char) temp);
                    }
                    in.close();
                } else {
                    if (method != null) {
                        method.releaseConnection();
                    }
                    System.out.println("Loading Monitor Failed. Incorrect response from HTTP Server " + response);
                    return;
                }
            } catch (IOException e) {
                if (method != null) {
                    method.releaseConnection();
                }
                System.out.println("Loading Monitor Failed, error while reading XML file from HTTP Server");
                e.printStackTrace(System.err);
                return;
            }
        }
//        MyHelperClass monitor = new MyHelperClass();
        setPlain(monitor.getReading());
//        MyHelperClass monitor = new MyHelperClass();
        setPlain(monitor.getReadingStatus());
//        MyHelperClass monitor = new MyHelperClass();
        monitor.getReadingStatus().setText("      Done");
//        MyHelperClass monitor = new MyHelperClass();
        setBold(monitor.getValidating());
//        MyHelperClass monitor = new MyHelperClass();
        setBold(monitor.getValidatingStatus());
//        MyHelperClass monitor = new MyHelperClass();
        monitor.getValidatingStatus().setText("      Working");
        DocumentBuilderFactoryImpl factory = new DocumentBuilderFactoryImpl();
        try {
            DocumentBuilder parser =(DocumentBuilder)(Object) factory.newDocumentBuilder();
            Document document =(Document)(Object) parser.parse(new ByteArrayInputStream(xml.toString().getBytes()));
            if (method != null) {
                method.releaseConnection();
            }
            Element root =(Element)(Object) document.getDocumentElement();
            NodeList temp =(NodeList)(Object) root.getElementsByTagName("resource");
            for (int j = 0; j < (int)(Object)temp.getLength(); j++) {
                Element resource = (Element)(Element)(Object) temp.item(j);
                MyHelperClass resources = new MyHelperClass();
                resources.add(new URL(resource.getAttribute("url")));
            }
            NodeList connections =(NodeList)(Object) root.getElementsByTagName("jmxserver");
            for (int j = 0; j < (int)(Object)connections.getLength(); j++) {
                Element connection = (Element)(Element)(Object) connections.item(j);
                String name =(String)(Object) connection.getAttribute("name");
                String tempUrl =(String)(Object) connection.getAttribute("url");
                if (tempUrl.indexOf("${host}") != -1) {
                    MyHelperClass Config = new MyHelperClass();
                    HostDialog dialog = new HostDialog(Config.getHosts());
                    String host =(String)(Object) dialog.showDialog();
                    if (host == null) {
                        System.out.println("Host can not be null, unable to create panel.");
                        return;
                    }
                    tempUrl = tempUrl.replaceAll("\\$\\{host\\}", host);
//                    MyHelperClass Config = new MyHelperClass();
                    Config.addHost(host);
                }
                JMXServiceURL jmxUrl = new JMXServiceURL(tempUrl);
                JmxServerGraph server = new JmxServerGraph(name, jmxUrl, new JmxWorker(false));
                MyHelperClass servers = new MyHelperClass();
                servers.put(name, server);
                NodeList listeners =(NodeList)(Object) connection.getElementsByTagName("listener");
                for (int i = 0; i < (int)(Object)listeners.getLength(); i++) {
                    Element attribute = (Element)(Element)(Object) listeners.item(i);
                    String taskname =(String)(Object) attribute.getAttribute("taskname");
                    MBean mbean = new MBean(attribute.getAttribute("mbean"), null);
                    String filtertype =(String)(Object) attribute.getAttribute("filterType");
                    TaskNotificationListener listener = new TaskNotificationListener();
                    NotificationFilterSupport filter = new NotificationFilterSupport();
                    if (filtertype == null || "".equals(filtertype)) {
                        filter = null;
                    } else {
                        filter.enableType(filtertype);
                    }
                    MyHelperClass Task = new MyHelperClass();
                    Task task = new Task(-1, Task.LISTEN, server);
                    task.setMbean(mbean);
                    task.setListener(listener);
                    task.setFilter(filter);
                    server.getWorker().addTask(task);
                    MyHelperClass tasks = new MyHelperClass();
                    if (tasks.get(taskname) != null) {
                        System.out.println("Task " + taskname + " already exists.");
                        return;
                    }
                    List<Task> hashTempList = new ArrayList<Task>();
                    hashTempList.add(task);
//                    MyHelperClass tasks = new MyHelperClass();
                    tasks.put(taskname, hashTempList);
                }
                NodeList attributes =(NodeList)(Object) connection.getElementsByTagName("attribute");
                for (int i = 0; i < (int)(Object)attributes.getLength(); i++) {
                    Element attribute = (Element)(Element)(Object) attributes.item(i);
                    String taskname =(String)(Object) attribute.getAttribute("taskname");
                    MBean mbean = new MBean(attribute.getAttribute("mbean"), null);
                    String attributename =(String)(Object) attribute.getAttribute("attributename");
                    String frequency =(String)(Object) attribute.getAttribute("frequency");
                    String onEvent =(String)(Object) attribute.getAttribute("onEvent");
                    if (frequency.equalsIgnoreCase("onchange")) {
                        TaskNotificationListener listener = new TaskNotificationListener();
                        AttributeChangeNotificationFilter filter = new AttributeChangeNotificationFilter();
                        filter.enableAttribute(attributename);
                        MyHelperClass Task = new MyHelperClass();
                        Task task = new Task(-1, Task.LISTEN, server);
                        MBeanAttribute att = new MBeanAttribute(mbean, attributename);
                        task.setAttribute(att);
                        task.setMbean(mbean);
                        task.setListener(listener);
                        task.setFilter(filter);
                        server.getWorker().addTask(task);
                        MyHelperClass tasks = new MyHelperClass();
                        if (tasks.get(taskname) != null) {
                            System.out.println("Task " + taskname + " already exists.");
                            return;
                        }
//                        MyHelperClass Task = new MyHelperClass();
                        Task task2 = new Task(-1, Task.GET_ATTRIBUTE, server);
                        task2.setAttribute(att);
                        task2.setMbean(mbean);
                        server.getWorker().addTask(task2);
                        List<Task> hashTempList = new ArrayList<Task>();
                        hashTempList.add(task);
                        hashTempList.add(task2);
//                        MyHelperClass tasks = new MyHelperClass();
                        tasks.put(taskname, hashTempList);
                    } else {
                        int frequency2 = Integer.parseInt(frequency);
                        MyHelperClass Task = new MyHelperClass();
                        Task task = new Task(frequency2, Task.GET_ATTRIBUTE, server);
                        MBeanAttribute att = new MBeanAttribute(mbean, attributename);
                        task.setAttribute(att);
                        task.setMbean(mbean);
                        MyHelperClass tasks = new MyHelperClass();
                        if (tasks.get(taskname) != null) {
                            System.out.println("Task " + taskname + " already exists.");
                            return;
                        }
                        List<Task> hashTempList = new ArrayList<Task>();
                        hashTempList.add(task);
//                        MyHelperClass tasks = new MyHelperClass();
                        tasks.put(taskname, hashTempList);
                        TaskNotificationListener listener = null;
                        if (onEvent != null && !"".equals(onEvent)) {
//                            MyHelperClass tasks = new MyHelperClass();
                            Task tempTask =(Task)(Object) tasks.get(onEvent).get((String)(Object)0);
                            if (tempTask == null) {
                                System.out.println(onEvent + " was not found.");
                                return;
                            } else {
                                listener = (TaskNotificationListener)(TaskNotificationListener)(Object) tempTask.getListener();
                            }
                        }
                        if (listener == null) {
                            server.getWorker().addTask(task);
                        } else {
                            listener.addTask(task);
                        }
                    }
                }
            }
            NodeList guiTemp =(NodeList)(Object) root.getElementsByTagName("gui");
            guiElement = (Element)(Element)(Object) guiTemp.item(0);
            tabName =(String)(Object) guiElement.getAttribute("name");
            MyHelperClass MonitorServer = new MyHelperClass();
            if ((boolean)(Object)MonitorServer.contains(tabName)) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "This panel is already open, stoping creating of panel.", "Panel already exists", JOptionPane.ERROR_MESSAGE);
                return;
            }
//            MyHelperClass monitor = new MyHelperClass();
            for (int i = 0; i < (int)(Object)monitor.getTab().getTabCount(); i++) {
//                MyHelperClass monitor = new MyHelperClass();
                if (monitor.getTab().getComponent(i).equals(monitor)) {
//                    MyHelperClass monitor = new MyHelperClass();
                    monitor.getTab().setTitleAt(i, tabName);
                    break;
                }
            }
            NodeList tempBindings =(NodeList)(Object) root.getElementsByTagName("binding");
            for (int i = 0; i < (int)(Object)tempBindings.getLength(); i++) {
                Element binding = (Element)(Element)(Object) tempBindings.item(i);
                String guiname =(String)(Object) binding.getAttribute("guiname");
                String tmethod =(String)(Object) binding.getAttribute("method");
                String taskname =(String)(Object) binding.getAttribute("taskname");
                String formater =(String)(Object) binding.getAttribute("formater");
                BindingContainer tempBinding;
                if (formater == null || (formater != null && formater.equals(""))) {
                    tempBinding = new BindingContainer(guiname, tmethod, taskname);
                } else {
                    tempBinding = new BindingContainer(guiname, tmethod, taskname, formater);
                }
                bindings.add(tempBinding);
            }
        } catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            System.out.println("Loading Monitor Failed, couldnt parse XML file.");
            e.printStackTrace(System.err);
            return;
        }
        setPlain(monitor.getValidating());
        setPlain(monitor.getValidatingStatus());
        monitor.getValidatingStatus().setText("      Done");
        setBold(monitor.getDownload());
        setBold(monitor.getDownloadStatus());
        monitor.getDownloadStatus().setText("      Working");
        List<File> jarFiles = new ArrayList<File>();
        File cacheDir = new File((String)(Object)Config.getCacheDir());
        if (!cacheDir.exists()) {
            cacheDir.mkdir();
        }
        for (URL resUrl :(URL[])(Object) (Object[])(Object)resources) {
            try {
                HttpClient client = new HttpClient();
                HttpMethod methodRes =(HttpMethod)(Object) new GetMethod((MyHelperClass)(Object)resUrl.toString());
                int response =(int)(Object) client.executeMethod(methodRes);
                if (response == 200) {
                    int index = resUrl.toString().lastIndexOf("/") + 1;
                    File file = new File(Config.getCacheDir() + resUrl.toString().substring(index));
                    FileOutputStream out = new FileOutputStream(file);
                    InputStream in =(InputStream)(Object) methodRes.getResponseBodyAsStream();
                    int readTemp = 0;
                    while ((readTemp = in.read()) != -1) {
                        out.write(readTemp);
                    }
                    System.out.println(file.getName() + " downloaded.");
                    methodRes.releaseConnection();
                    if (file.getName().endsWith(".jar")) {
                        jarFiles.add(file);
                    }
                } else {
                    methodRes.releaseConnection();
                    System.out.println("Loading Monitor Failed. Unable to get resource " + url);
                    return;
                }
            } catch (IOException e) {
                System.out.println("Loading Monitor Failed, error while reading resource file from HTTP Server");
                e.printStackTrace(System.err);
                return;
            }
        }
        URL[] urls = new URL[jarFiles.size()];
        try {
            for (int i = 0; i < jarFiles.size(); i++) {
                File file = jarFiles.get(i);
                File newFile = new File(Config.getCacheDir() + "/" + System.currentTimeMillis() + file.getName());
                FileInputStream in = new FileInputStream(file);
                FileOutputStream out = new FileOutputStream(newFile);
                int n = 0;
                byte[] buf = new byte[1024];
                while ((n = in.read(buf, 0, 1024)) > -1) {
                    out.write(buf, 0, n);
                }
                out.close();
                out.close();
                in.close();
                urls[i] = new URL("file:" + newFile.getAbsolutePath());
            }
        } catch (Exception e1) {
            System.out.println("Unable to load jar files.");
            e1.printStackTrace();
        }
        URLClassLoader loader = new URLClassLoader(urls);
        engine.setClassLoader(loader);
        setPlain(monitor.getDownload());
        setPlain(monitor.getDownloadStatus());
        monitor.getDownloadStatus().setText("      Done");
        setBold(monitor.getGui());
        setBold(monitor.getGuiStatus());
        monitor.getGuiStatus().setText("      Working");
        Container container;
        try {
            String tempXml = xml.toString();
            int start = tempXml.indexOf("<gui");
            start = tempXml.indexOf('>', start) + 1;
            int end = tempXml.indexOf("</gui>");
            container =(Container)(Object) engine.render(new StringReader(tempXml.substring(start, end)));
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.err.println("Exception msg: " + e.getMessage());
            System.out.println("Loading Monitor Failed, error creating gui.");
            return;
        }
        for (BindingContainer bcon :(BindingContainer[])(Object) (Object[])(Object)bindings) {
            for (Task task :(Task[])(Object) (Object[])(Object)tasks.get((String)(Object)bcon.getTask())) {
                if (task != null) {
                    Object comp = engine.find(bcon.getComponent());
                    if (comp != null) {
                        if (task.getTaskType() == Task.LISTEN &&(AttributeChangeNotificationFilter)(Object) task.getFilter() instanceof AttributeChangeNotificationFilter) {
                            TaskNotificationListener listener = (TaskNotificationListener)(TaskNotificationListener)(Object) task.getListener();
                            if (bcon.getFormater() == null) {
                                listener.addResultListener(new Binding(comp, bcon.getMethod()));
                            } else {
                                listener.addResultListener(new Binding(comp, bcon.getMethod(), bcon.getFormater(), loader));
                            }
                        } else {
                            if (bcon.getFormater() == null) {
                                task.addResultListener(new Binding(comp, bcon.getMethod()));
                            } else {
                                task.addResultListener(new Binding(comp, bcon.getMethod(), bcon.getFormater(), loader));
                            }
                        }
                    } else {
                        System.out.println("Refering to gui name, " + bcon.getComponent() + ", that doesnt exist. Unable to create monitor.");
                        return;
                    }
                } else {
                    System.out.println("Refering to task name, " + bcon.getTask() + ", that doesnt exist. Unable to create monitor.");
                    return;
                }
            }
        }
        for (int i = 0; i < (int)(Object)monitor.getTab().getTabCount(); i++) {
            if (monitor.getTab().getComponent(i).equals(monitor)) {
                monitor.getTab().setComponentAt(i, new MonitorContainerPanel(container, this));
                break;
            }
        }
        System.out.println("Connecting to server(s).");
        Enumeration<JmxServerGraph> e =(Enumeration<JmxServerGraph>)(Object) servers.elements();
        List<JmxWorker> list = new ArrayList<JmxWorker>();
        while (e.hasMoreElements()) {
            JmxWorker worker =(JmxWorker)(Object) e.nextElement().getWorker();
            worker.setRunning(true);
            worker.start();
            list.add(worker);
        }
        MonitorServer.add(tabName, list);
        Config.addUrl(url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LISTEN;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass GET_ATTRIBUTE;
public MyHelperClass put(String o0, List<Task> o1){ return null; }
	public MyHelperClass getDownloadStatus(){ return null; }
	public MyHelperClass getGui(){ return null; }
	public MyHelperClass addUrl(MyHelperClass o0){ return null; }
	public MyHelperClass put(String o0, JmxServerGraph o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getReading(){ return null; }
	public MyHelperClass getCacheDir(){ return null; }
	public MyHelperClass add(String o0, List<JmxWorker> o1){ return null; }
	public MyHelperClass getDownload(){ return null; }
	public MyHelperClass getValidating(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getGuiStatus(){ return null; }
	public MyHelperClass setTitleAt(int o0, String o1){ return null; }
	public MyHelperClass addTask(Task o0){ return null; }
	public MyHelperClass getComponent(int o0){ return null; }
	public MyHelperClass getReadingStatus(){ return null; }
	public MyHelperClass add(URL o0){ return null; }
	public MyHelperClass getHosts(){ return null; }
	public MyHelperClass add(BindingContainer o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setComponentAt(int o0, MonitorContainerPanel o1){ return null; }
	public MyHelperClass find(MyHelperClass o0){ return null; }
	public MyHelperClass render(StringReader o0){ return null; }
	public MyHelperClass addHost(String o0){ return null; }
	public MyHelperClass setClassLoader(URLClassLoader o0){ return null; }
	public MyHelperClass getTab(){ return null; }
	public MyHelperClass elements(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getValidatingStatus(){ return null; }
	public MyHelperClass getTabCount(){ return null; }}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class HttpMethod {

public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass releaseConnection(){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(HttpMethod o0){ return null; }}

class GetMethod {

GetMethod(){}
	GetMethod(MyHelperClass o0){}}

class DocumentBuilderFactoryImpl {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(ByteArrayInputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	URL(MyHelperClass o0){}}

class HostDialog {

HostDialog(){}
	HostDialog(MyHelperClass o0){}
	public MyHelperClass showDialog(){ return null; }}

class JMXServiceURL {

JMXServiceURL(){}
	JMXServiceURL(String o0){}}

class JmxServerGraph {

JmxServerGraph(String o0, JMXServiceURL o1, JmxWorker o2){}
	JmxServerGraph(){}
	public MyHelperClass getWorker(){ return null; }}

class JmxWorker {

JmxWorker(){}
	JmxWorker(boolean o0){}
	public MyHelperClass setRunning(boolean o0){ return null; }
	public MyHelperClass start(){ return null; }}

class MBean {

MBean(){}
	MBean(MyHelperClass o0, Object o1){}}

class TaskNotificationListener {

public MyHelperClass addResultListener(Binding o0){ return null; }
	public MyHelperClass addTask(Task o0){ return null; }}

class NotificationFilterSupport {

public MyHelperClass enableType(String o0){ return null; }}

class Task {
public static MyHelperClass LISTEN;
Task(int o0, MyHelperClass o1, JmxServerGraph o2){}
	Task(){}
	public MyHelperClass getFilter(){ return null; }
	public MyHelperClass setAttribute(MBeanAttribute o0){ return null; }
	public MyHelperClass addResultListener(Binding o0){ return null; }
	public MyHelperClass setFilter(AttributeChangeNotificationFilter o0){ return null; }
	public MyHelperClass setFilter(NotificationFilterSupport o0){ return null; }
	public MyHelperClass getTaskType(){ return null; }
	public MyHelperClass setListener(TaskNotificationListener o0){ return null; }
	public MyHelperClass getListener(){ return null; }
	public MyHelperClass setMbean(MBean o0){ return null; }}

class AttributeChangeNotificationFilter {

public MyHelperClass enableAttribute(String o0){ return null; }}

class MBeanAttribute {

MBeanAttribute(MBean o0, String o1){}
	MBeanAttribute(){}}

class BindingContainer {

BindingContainer(String o0, String o1, String o2, String o3){}
	BindingContainer(String o0, String o1, String o2){}
	BindingContainer(){}
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getFormater(){ return null; }
	public MyHelperClass getComponent(){ return null; }
	public MyHelperClass getTask(){ return null; }}

class URLClassLoader {

URLClassLoader(URL[] o0){}
	URLClassLoader(){}}

class Container {

}

class Binding {

Binding(Object o0, MyHelperClass o1){}
	Binding(Object o0, MyHelperClass o1, MyHelperClass o2, URLClassLoader o3){}
	Binding(){}}

class MonitorContainerPanel {

MonitorContainerPanel(Container o0, c10717656 o1){}
	MonitorContainerPanel(){}}
