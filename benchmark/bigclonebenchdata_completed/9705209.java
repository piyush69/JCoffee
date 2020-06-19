


class c9705209 {

    public static void main(String[] args) throws Exception {
        PatternLayout pl = new PatternLayout("%d{ISO8601} %-5p %c: %m\n");
        ConsoleAppender ca = new ConsoleAppender(pl);
        MyHelperClass Logger = new MyHelperClass();
        Logger.getRoot().addAppender(ca);
        MyHelperClass Level = new MyHelperClass();
        Logger.getRoot().setLevel(Level.INFO);
        Options options = new Options();
        options.addOption("p", "put", false, "put a file in the DHT overlay");
        options.addOption("g", "get", false, "get a file from the DHT");
        options.addOption("r", "remove", false, "remove a file from the DHT");
        options.addOption("u", "update", false, "updates the lease");
        options.addOption("j", "join", false, "join the DHT overlay");
        options.addOption("c", "config", true, "the configuration file");
        options.addOption("k", "key", true, "the key to read a file from");
        options.addOption("f", "file", true, "the file to read or write");
        options.addOption("a", "app", true, "the application ID");
        options.addOption("s", "secret", true, "the secret used to hide data");
        options.addOption("t", "ttl", true, "how long in seconds data should persist");
        CommandLineParser parser =(CommandLineParser)(Object) new PosixParser();
        CommandLine cmd =(CommandLine)(Object) parser.parse(options, args);
        String configFile = null;
        String mode = null;
        String secretStr = null;
        int ttl = 9999;
        String keyStr = null;
        String file = null;
        int appId = 0;
        if ((boolean)(Object)cmd.hasOption("j")) {
            mode = "join";
        }
        if ((boolean)(Object)cmd.hasOption("p")) {
            mode = "put";
        }
        if ((boolean)(Object)cmd.hasOption("g")) {
            mode = "get";
        }
        if ((boolean)(Object)cmd.hasOption("r")) {
            mode = "remove";
        }
        if ((boolean)(Object)cmd.hasOption("u")) {
            mode = "update";
        }
        if ((boolean)(Object)cmd.hasOption("c")) {
            configFile =(String)(Object) cmd.getOptionValue("c");
        }
        if ((boolean)(Object)cmd.hasOption("k")) {
            keyStr =(String)(Object) cmd.getOptionValue("k");
        }
        if ((boolean)(Object)cmd.hasOption("f")) {
            file =(String)(Object) cmd.getOptionValue("f");
        }
        if ((boolean)(Object)cmd.hasOption("s")) {
            secretStr =(String)(Object) cmd.getOptionValue("s");
        }
        if ((boolean)(Object)cmd.hasOption("t")) {
            ttl = Integer.parseInt((String)(Object)cmd.getOptionValue("t"));
        }
        if ((boolean)(Object)cmd.hasOption("a")) {
            appId = Integer.parseInt((String)(Object)cmd.getOptionValue("a"));
        }
        if (mode == null) {
            System.err.println("ERROR: --put or --get or --remove or --join or --update is required");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("DHT", options);
            System.exit(1);
        }
        if (configFile == null) {
            System.err.println("ERROR: --config is required");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("DHT", options);
            System.exit(1);
        }
        Properties conf = new Properties();
        conf.load(new FileInputStream(configFile));
        DHT dht = new DHT(conf);
        if (mode.equals("join")) {
            dht.join();
        } else if (mode.equals("put")) {
            if (file == null) {
                System.err.println("ERROR: --file is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            if (keyStr == null) {
                System.err.println("ERROR: --key is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            if (secretStr == null) {
                System.err.println("ERROR: --secret is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info("putting file " + file);
            FileInputStream in = new FileInputStream(file);
            byte[] tmp = new byte[1000000];
            int num =(int)(Object) in.read(tmp);
            byte[] value = new byte[num];
            System.arraycopy(tmp, 0, value, 0, num);
            in.close();
            if ((int)(Object)dht.put((short) appId, keyStr.getBytes(), value, ttl, secretStr.getBytes()) < 0) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("There was an error while putting a key-value.");
                System.exit(0);
            }
            System.out.println("Ok!");
        } else if (mode.equals("get")) {
            if (file == null) {
                System.err.println("ERROR: --file is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            if (keyStr == null) {
                System.err.println("ERROR: --key is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info("getting file " + file);
            ArrayList values = new ArrayList();
            if ((int)(Object)dht.get((short) appId, keyStr.getBytes(), Integer.MAX_VALUE, values) < 0) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("There was an error while getting a value.");
                System.exit(0);
            }
            if ((int)(Object)values.size() == 0 || values == null) {
                System.out.println("No values returned.");
                System.exit(0);
            }
            FileOutputStream out = new FileOutputStream(file);
            System.out.println("Found " + values.size() + " values -- saving the first one only.");
            out.write(values.get(0));
            out.close();
            System.out.println("Ok!");
        } else if (mode.equals("remove")) {
            if (keyStr == null) {
                System.err.println("ERROR: --key is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            if (secretStr == null) {
                System.err.println("ERROR: --secret is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info("removing <key,value> for key=" + keyStr);
            if ((int)(Object)dht.remove((short) appId, keyStr.getBytes(), secretStr.getBytes()) < 0) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("There was an error while removing a key.");
                System.exit(0);
            }
            System.out.println("Ok!");
        } else if (mode.equals("update")) {
            if (keyStr == null) {
                System.err.println("ERROR: --key is required");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("DHT", options);
                System.exit(1);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info("updating <key,value> for key=" + keyStr);
            if ((int)(Object)dht.updateLease((short) appId, keyStr.getBytes(), ttl) < 0) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info("There was an error while updating data lease.");
                System.exit(0);
            }
            System.out.println("Ok!");
        }
        MyHelperClass DHT = new MyHelperClass();
        DHT.getInstance().stop();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass getRoot(){ return null; }
	public MyHelperClass stop(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass addAppender(ConsoleAppender o0){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class PatternLayout {

PatternLayout(String o0){}
	PatternLayout(){}}

class ConsoleAppender {

ConsoleAppender(PatternLayout o0){}
	ConsoleAppender(){}}

class Options {

public MyHelperClass addOption(String o0, String o1, boolean o2, String o3){ return null; }}

class CommandLineParser {

public MyHelperClass parse(Options o0, String[] o1){ return null; }}

class PosixParser {

}

class CommandLine {

public MyHelperClass hasOption(String o0){ return null; }
	public MyHelperClass getOptionValue(String o0){ return null; }}

class HelpFormatter {

public MyHelperClass printHelp(String o0, Options o1){ return null; }}

class Properties {

public MyHelperClass load(FileInputStream o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class DHT {

DHT(){}
	DHT(Properties o0){}
	public MyHelperClass get(short o0, byte[] o1, int o2, ArrayList o3){ return null; }
	public MyHelperClass put(short o0, byte[] o1, byte[] o2, int o3, byte[] o4){ return null; }
	public MyHelperClass join(){ return null; }
	public MyHelperClass remove(short o0, byte[] o1, byte[] o2){ return null; }
	public MyHelperClass updateLease(short o0, byte[] o1, int o2){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}
