import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8195292 {
public MyHelperClass one(MyHelperClass o0){ return null; }
	public MyHelperClass will(MyHelperClass o0){ return null; }
public MyHelperClass assertThat(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass returnValue(URL o0){ return null; }
	public MyHelperClass assertThat(Date o0, MyHelperClass o1){ return null; }
	public MyHelperClass returnValue(Set<String> o0){ return null; }
public MyHelperClass WEB_INF_LIB_PATH;
	public MyHelperClass is(int o0){ return null; }
	public MyHelperClass is(Date o0){ return null; }

//    @Test
    public void testGetJarInformation() throws Throwable, Exception {
        final URL url1 = getClass().getResource("/fakejars/something");
        final URL url2 = getClass().getResource("/fakejars/something-else");
        final URL url3 = getClass().getResource("/fakejars/another-thing");
        final Map<String, Date> paths = new HashMap<String, Date>();
        MyHelperClass SOMETHING_JAR = new MyHelperClass();
        paths.put((String)(Object)SOMETHING_JAR, new Date(url1.openConnection().getLastModified()));
        MyHelperClass SOMETHING_ELSE_JAR = new MyHelperClass();
        paths.put((String)(Object)SOMETHING_ELSE_JAR, new Date(url2.openConnection().getLastModified()));
        MyHelperClass ANOTHER_THING_JAR = new MyHelperClass();
        paths.put((String)(Object)ANOTHER_THING_JAR, new Date(url3.openConnection().getLastModified()));
        MyHelperClass NOT_A_JAR = new MyHelperClass();
        paths.put((String)(Object)NOT_A_JAR, null);
        MyHelperClass context = new MyHelperClass();
        context.checking(new Expectations() {

            {
                MyHelperClass servletContext = new MyHelperClass();
                one(servletContext).getResourcePaths(WEB_INF_LIB_PATH);
                will(returnValue(paths.keySet()));
//                MyHelperClass servletContext = new MyHelperClass();
                one(servletContext).getResource(SOMETHING_JAR);
                will(returnValue(url1));
//                MyHelperClass servletContext = new MyHelperClass();
                one(servletContext).getResource(SOMETHING_ELSE_JAR);
                will(returnValue(url2));
//                MyHelperClass servletContext = new MyHelperClass();
                one(servletContext).getResource(ANOTHER_THING_JAR);
                will(returnValue(url3));
            }
        });
        MyHelperClass servletContext = new MyHelperClass();
        final Map<URL, Date> output = (Map<URL,Date>)(Object)new ModulesImpl(servletContext, null, new LoggerProvider()).getJarInformation();
        assertThat(output.size(), is(3));
        for (final URL url : output.keySet()) {
            final String jarName = url.toString();
            final String key = WEB_INF_LIB_PATH + jarName.substring(jarName.lastIndexOf("/") + 1) + ".jar";
            assertThat(output.get(url), is(paths.get(key)));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass checking( Expectations o0){ return null; }
	public MyHelperClass getResource(MyHelperClass o0){ return null; }
	public MyHelperClass checking(){ return null; }
	public MyHelperClass getResourcePaths(MyHelperClass o0){ return null; }}

class Test {

}

class Expectations {

}

class ModulesImpl {

ModulesImpl(MyHelperClass o0, Object o1, LoggerProvider o2){}
	ModulesImpl(){}
	public MyHelperClass getJarInformation(){ return null; }}

class LoggerProvider {

}
