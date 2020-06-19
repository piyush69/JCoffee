import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14038399 {
public MyHelperClass SEARCH_COMMAND;
	public MyHelperClass logger;
	public MyHelperClass PropertyConfigurator;
	public MyHelperClass getTasks(Object o0, TreeMap<TaskName,Class<Task o1, String o2){ return null; }
	public MyHelperClass getTasks(URL o0, TreeMap<TaskName,Class<Task o1, String o2){ return null; }

    private void run(String[] args) throws Throwable {
        ArgParser parser = new ArgParser("Run an experiment");
        parser.addOptions(this, true);
        MyHelperClass ArgParserOption = new MyHelperClass();
        args = parser.matchAllArgs(args, 0, ArgParserOption.EXIT_ON_ERROR, ArgParserOption.STOP_FIRST_UNMATCHED);
        MyHelperClass log4jFile = new MyHelperClass();
        if (log4jFile != null) {
//            MyHelperClass log4jFile = new MyHelperClass();
            logger.info("Using another log4j configuration: %s", log4jFile);
//            MyHelperClass log4jFile = new MyHelperClass();
            PropertyConfigurator.configure(log4jFile.getAbsolutePath());
        }
        MyHelperClass GenericHelper = new MyHelperClass();
        final TreeMap<TaskName, Class<Task>> tasks = GenericHelper.newTreeMap();
        MyHelperClass EXPERIMENT_PACKAGES = new MyHelperClass();
        final Enumeration<URL> e = About.class.getClassLoader().getResources(EXPERIMENT_PACKAGES);
        while (e.hasMoreElements()) {
            final URL url = e.nextElement();
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Got URL %s", url);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                String packageName = line;
                getTasks(url, tasks, packageName);
            }
        }
        getTasks(null, tasks, getClass().getPackage().getName());
        if (tasks.isEmpty()) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("I did not find any valid experiment (service bpiwowar.experiments.ExperimentListProvider)");
            System.exit(1);
        }
        if (args.length == 0 || args[0].equals("list")) {
            System.out.format("Available experiments:%n");
            MyHelperClass TreeMapArray = new MyHelperClass();
            TreeMapArray map = TreeMapArray.newInstance();
            for (Entry> entry : tasks.entrySet()) {
                TaskName task = entry.getKey();
                MyHelperClass showClassNames = new MyHelperClass();
                if ((boolean)(Object)showClassNames) map.add(task.packageName, String.format("%s (%s)", task.name, entry.getValue().toString())); else map.add(task.packageName, task.name);
            }
            Stack<PackageName> ancestors = new Stack<PackageName>();
            for (Entry> entry : map.entrySet()) {
                final PackageName key = entry.getKey();
                while (!ancestors.isEmpty() && key.commonPrefixLength(ancestors.peek()) != ancestors.peek().getLength()) ancestors.pop();
                int nbAncestors = ancestors.size();
                int c = nbAncestors > 0 ? ancestors.peek().getLength() : 0;
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < c; i++) s.append("|");
                for (int i = c; i < key.getLength(); i++) {
                    s.append("|");
                    ancestors.add(new PackageName(key, i + 1));
                    System.out.format("%s%n", s);
                    System.out.format("%s+ [%s]%n", s, ancestors.peek());
                    nbAncestors++;
                }
                String prefix = s.toString();
                for (String task : entry.getValue()) System.out.format("%s|- %s%n", prefix, task);
                ancestors.add(key);
            }
            return;
        MyHelperClass SEARCH_COMMAND = new MyHelperClass();
        } else if (args[0].equals(SEARCH_COMMAND)) {
            final class Options {

//                @OrderedArgument(required = true)
                String search;
            }
            Options options = new Options();
            MyHelperClass SEARCH_COMMAND = new MyHelperClass();
            ArgParser ap = new ArgParser(SEARCH_COMMAND);
            ap.addOptions(options);
            ap.matchAllArgs(args, 1);
            MyHelperClass logger = new MyHelperClass();
            logger.info("Searching for %s", options.search);
            for (Entry> entry : tasks.entrySet()) {
                TaskName taskname = entry.getKey();
                if (taskname.name.contains(options.search)) {
                    System.err.format("[*] %s - %s%n   %s%n", taskname, entry.getValue(), entry.getValue().getAnnotation(TaskDescription.class).description());
                }
            }
            return;
        }
        String taskName = args[0];
        args = Arrays.copyOfRange(args, 1, args.length);
//        MyHelperClass GenericHelper = new MyHelperClass();
        ArrayList<Class<Task>> matching = GenericHelper.newArrayList();
        for (Entry> entry : tasks.entrySet()) {
            if (entry.getKey().name.equals(taskName)) matching.add(entry.getValue());
        }
        if (matching.isEmpty()) {
            System.err.println("No task match " + taskName);
            System.exit(1);
        }
        if (matching.size() > 1) {
            System.err.println("Too many tasks match " + taskName);
            System.exit(1);
        }
        Class<Task> taskClass = matching.get(0);
        MyHelperClass logger = new MyHelperClass();
        logger.info("Running experiment " + taskClass.getCanonicalName());
        Task task = taskClass.newInstance();
        int errorCode = 0;
        try {
            task.init(args);
            MyHelperClass xstreamOutput = new MyHelperClass();
            if (xstreamOutput != null) {
                OutputStream out;
//                MyHelperClass xstreamOutput = new MyHelperClass();
                if (xstreamOutput.toString().equals("-")) out = System.out; else out = new FileOutputStream((String)(Object)xstreamOutput);
//                MyHelperClass xstreamOutput = new MyHelperClass();
                logger.info("Serializing the object into %s", xstreamOutput);
                new XStream().toXML(task, out);
                out.close();
            } else {
                errorCode = task.run();
            }
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Finished task");
        } catch (Throwable t) {
            if (t instanceof InvocationTargetException && t.getCause() != null) {
                t = t.getCause();
            }
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Exception thrown while executing the action:%n%s%n", t);
            errorCode = 2;
        }
        System.exit(errorCode);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STOP_FIRST_UNMATCHED;
	public MyHelperClass EXIT_ON_ERROR;
public MyHelperClass newTreeMap(){ return null; }
	public MyHelperClass debug(String o0, URL o1){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass info(String o0, String o1){ return null; }
	public MyHelperClass newArrayList(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass info(String o0, MyHelperClass o1){ return null; }}

class ArgParser {

ArgParser(MyHelperClass o0){}
	ArgParser(){}
	ArgParser(String o0){}
	public MyHelperClass addOptions(c14038399 o0, boolean o1){ return null; }
	public MyHelperClass addOptions(Options o0){ return null; }
	public MyHelperClass matchAllArgs(String[] o0, int o1){ return null; }}

class TaskName {
public MyHelperClass name;
}

class Task {

public MyHelperClass init(String[] o0){ return null; }
	public MyHelperClass run(){ return null; }}

class TreeMapArray {

}

class PackageName {

PackageName(PackageName o0, int o1){}
	PackageName(){}
	public MyHelperClass commonPrefixLength(PackageName o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Entry {

}

class OrderedArgument {

}

class TaskDescription {

}

class XStream {

public MyHelperClass toXML(Task o0, OutputStream o1){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class About {

}
