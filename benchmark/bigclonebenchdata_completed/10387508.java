import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10387508 {
public static MyHelperClass readPOM(MavenDeployerGui o0){ return null; }
public static MyHelperClass JFrame;
	public static MyHelperClass findMavenExecutable(){ return null; }
//	public MyHelperClass readPOM(MavenDeployerGui o0){ return null; }
//public MyHelperClass JFrame;
//	public MyHelperClass findMavenExecutable(){ return null; }

    public static void main(String[] args)  throws Throwable {
        final MavenDeployerGui gui = new MavenDeployerGui();
        MyHelperClass JFileChooser = new MyHelperClass();
        final Chooser repositoryChooser = new Chooser(gui.formPanel, JFileChooser.DIRECTORIES_ONLY);
//        MyHelperClass JFileChooser = new MyHelperClass();
        final Chooser artifactChooser = new Chooser(gui.formPanel, JFileChooser.FILES_ONLY);
//        MyHelperClass JFileChooser = new MyHelperClass();
        final Chooser pomChooser = new Chooser(gui.formPanel, JFileChooser.FILES_ONLY, new POMFilter());
        gui.cancel.setEnabled(false);
        gui.cbDeployPOM.setVisible(false);
        gui.cbDeployPOM.setEnabled(false);
        gui.mavenBin.setText(findMavenExecutable());
        gui.repositoryBrowser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass currentDir = new MyHelperClass();
                File repo =(File)(Object) repositoryChooser.chooseFrom(currentDir);
                if (repo != null) {
//                    MyHelperClass currentDir = new MyHelperClass();
                    currentDir = repositoryChooser.currentFolder;
                    gui.repositoryURL.setText(repo.getAbsolutePath());
                }
            }
        });
        gui.artifactBrowser.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass currentDir = new MyHelperClass();
                File artifact =(File)(Object) artifactChooser.chooseFrom(currentDir);
                if (artifact != null) {
//                    MyHelperClass currentDir = new MyHelperClass();
                    currentDir = artifactChooser.currentFolder;
                    gui.artifactFile.setText(artifact.getAbsolutePath());
                }
            }
        });
        gui.deploy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass deployer = new MyHelperClass();
                MyHelperClass pom = new MyHelperClass();
                deployer = new Deployer(gui, pom);
//                MyHelperClass deployer = new MyHelperClass();
                deployer.execute();
            }
        });
        gui.clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                gui.console.setText("");
            }
        });
        gui.cancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass deployer = new MyHelperClass();
                if (deployer != null) {
//                    MyHelperClass deployer = new MyHelperClass();
                    deployer.stop();
//                    MyHelperClass deployer = new MyHelperClass();
                    deployer = null;
                }
            }
        });
        gui.cbDeployPOM.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                readPOM(gui);
            }
        });
        gui.loadPOM.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                MyHelperClass pom = new MyHelperClass();
                MyHelperClass currentDir = new MyHelperClass();
                pom = pomChooser.chooseFrom(currentDir);
//                MyHelperClass pom = new MyHelperClass();
                if (pom != null) {
//                    MyHelperClass currentDir = new MyHelperClass();
                    currentDir = pomChooser.currentFolder;
                    readPOM(gui);
//                    MyHelperClass pom = new MyHelperClass();
                    gui.cbDeployPOM.setText("Deploy also " + pom.getAbsolutePath());
                    gui.cbDeployPOM.setEnabled(true);
                    gui.cbDeployPOM.setVisible(true);
                }
            }
        });
        String version = "";
        try {
            URL url = Thread.currentThread().getContextClassLoader().getResource("META-INF/maven/com.mycila.maven/maven-deployer/pom.properties");
            Properties p = new Properties();
            p.load(url.openStream());
            version = " " + p.getProperty("version");
        } catch (Exception ignored) {
            version = " x.y";
        }
        JFrame frame = new JFrame("Maven Deployer" + version + " - By Mathieu Carbou (http://blog.mycila.com)");
        frame.setContentPane(gui.formPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILES_ONLY;
	public MyHelperClass DIRECTORIES_ONLY;
	public MyHelperClass EXIT_ON_CLOSE;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass addActionListener(){ return null; }
	public MyHelperClass addActionListener(<anonymous ActionListener> o0){ return null; }
	public MyHelperClass execute(){ return null; }
	public MyHelperClass stop(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setText(MyHelperClass o0){ return null; }}

class MavenDeployerGui {
public MyHelperClass cancel;
	public MyHelperClass loadPOM;
	public MyHelperClass deploy;
	public MyHelperClass repositoryURL;
	public MyHelperClass formPanel;
	public MyHelperClass cbDeployPOM;
	public MyHelperClass repositoryBrowser;
	public MyHelperClass artifactBrowser;
	public MyHelperClass artifactFile;
	public MyHelperClass console;
	public MyHelperClass clear;
	public MyHelperClass mavenBin;
}

class Chooser {
public MyHelperClass currentFolder;
Chooser(MyHelperClass o0, MyHelperClass o1, POMFilter o2){}
	Chooser(){}
	Chooser(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass chooseFrom(MyHelperClass o0){ return null; }}

class ActionListener {

}

class JFrame {

JFrame(){}
	JFrame(String o0){}
	public MyHelperClass setLocationByPlatform(boolean o0){ return null; }
	public MyHelperClass setContentPane(MyHelperClass o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass setLocationRelativeTo(Object o0){ return null; }
	public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }}

class POMFilter {

}

class ActionEvent {

}

class Deployer {

Deployer(){}
	Deployer(MavenDeployerGui o0, MyHelperClass o1){}}
