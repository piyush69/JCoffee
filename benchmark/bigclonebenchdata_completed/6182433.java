import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6182433 {
public MyHelperClass calculateScenarioMD5(Scenario o0){ return null; }
	public MyHelperClass getProjectMD5(ProjectComponent[] o0){ return null; }

    public String calculateProjectMD5(String scenarioName) throws Throwable, Exception {
        MyHelperClass ScenariosManager = new MyHelperClass();
        Scenario s =(Scenario)(Object) ScenariosManager.getInstance().getScenario(scenarioName);
        s.loadParametersAndValues();
        String scenarioMD5 =(String)(Object) calculateScenarioMD5(s);
        MyHelperClass ProjectComponent = new MyHelperClass();
        Map<ProjectComponent, String> map =(Map<ProjectComponent,String>)(Object) getProjectMD5(new ProjectComponent[] {(ProjectComponent)(Object) ProjectComponent.resources,(ProjectComponent)(Object) ProjectComponent.classes,(ProjectComponent)(Object) ProjectComponent.suts,(ProjectComponent)(Object) ProjectComponent.libs });
//        MyHelperClass ProjectComponent = new MyHelperClass();
        map.put((ProjectComponent)(Object)ProjectComponent.currentScenario, scenarioMD5);
        MessageDigest md = MessageDigest.getInstance("MD5");
        Iterator<String> iter = map.values().iterator();
        while (iter.hasNext()) {
            md.update(iter.next().getBytes());
        }
        byte[] hash = md.digest();
        BigInteger result = new BigInteger(hash);
        String rc = result.toString(16);
        return rc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass resources;
	public MyHelperClass currentScenario;
	public MyHelperClass suts;
	public MyHelperClass classes;
	public MyHelperClass libs;
public MyHelperClass getScenario(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Scenario {

public MyHelperClass loadParametersAndValues(){ return null; }}

class ProjectComponent {

}
