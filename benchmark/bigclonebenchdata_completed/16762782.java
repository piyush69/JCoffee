


class c16762782 {
public static MyHelperClass deploy(String o0){ return null; }
	public static MyHelperClass undeploy(String o0){ return null; }
//public MyHelperClass deploy(String o0){ return null; }
//	public MyHelperClass undeploy(String o0){ return null; }

    public static Test suite() throws Exception {
        java.net.URL url = ClassLoader.getSystemResource("host0.jndi.properties");
        java.util.Properties host0JndiProps = new java.util.Properties();
        host0JndiProps.load(url.openStream());
        java.util.Properties systemProps = System.getProperties();
        systemProps.putAll(host0JndiProps);
        System.setProperties(systemProps);
        TestSuite suite = new TestSuite();
        suite.addTest(new TestSuite(T05DTMInterpositionUnitTestCase.class));
        TestSetup wrapper =(TestSetup)(Object) new JBossTestSetup(suite) {

            protected void setUp() throws Exception {
                this.setUp();
                deploy("dtmpassthrough2dtm.jar");
            }

            protected void tearDown() throws Exception {
                undeploy("dtmpassthrough2dtm.jar");
                this.tearDown();
            }
        };
        return (Test)(Object)wrapper;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class TestSuite {

TestSuite(){}
	TestSuite(Class<T05DTMInterpositionUnitTestCase> o0){}
	public MyHelperClass addTest(TestSuite o0){ return null; }}

class T05DTMInterpositionUnitTestCase {

}

class TestSetup {

}

class JBossTestSetup {

JBossTestSetup(TestSuite o0){}
	JBossTestSetup(){}}
