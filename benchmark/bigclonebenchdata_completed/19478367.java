import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19478367 {
public MyHelperClass addDefaultValuesToContext(VelocityContext o0){ return null; }
	public MyHelperClass printTemplate(VelocityContext o0, Reader o1, Writer o2){ return null; }
public MyHelperClass GPSDataProcessor;
	public MyHelperClass GPSFileDevice;
	public MyHelperClass GPSNetworkGpsdDevice;
	public MyHelperClass GPSSerialDevice;
	public MyHelperClass DEFAULT_TEMPLATE;
	public MyHelperClass ImageIO;
	public MyHelperClass printHelp(){ return null; }
	public MyHelperClass printHelpTemplate(){ return null; }

    public void init(String[] arguments)  throws Throwable {
        if (arguments.length < 1) {
            printHelp();
            return;
        }
        String[] valid_args = new String[] { "device*", "d*", "help", "h", "speed#", "s#", "file*", "f*", "gpsd*", "nmea", "n", "garmin", "g", "sirf", "i", "rawdata", "downloadtracks", "downloadwaypoints", "downloadroutes", "deviceinfo", "printposonce", "printpos", "p", "printalt", "printspeed", "printheading", "printsat", "template*", "outfile*", "screenshot*", "printdefaulttemplate", "helptemplate", "nmealogfile*", "l", "uploadtracks", "uploadroutes", "uploadwaypoints", "infile*" };
        CommandArguments args = null;
        try {
            args = new CommandArguments(arguments, valid_args);
        } catch (ArithmeticException cae) {
            System.err.println("Invalid arguments: " + cae.getMessage());
            printHelp();
            return;
        }
        String filename = null;
        String serial_port_name = null;
        boolean gpsd = false;
        String gpsd_host = "localhost";
        int gpsd_port = 2947;
        int serial_port_speed = -1;
        GPSDataProcessor gps_data_processor;
        String nmea_log_file = null;
        if ((Boolean)(Object)args.isSet("help") || (Boolean)(Object)(args.isSet("h"))) {
            printHelp();
            return;
        }
        if ((boolean)(Object)args.isSet("helptemplate")) {
            printHelpTemplate();
        }
        if ((boolean)(Object)args.isSet("printdefaulttemplate")) {
            System.out.println(DEFAULT_TEMPLATE);
        }
        if ((boolean)(Object)args.isSet("device")) {
            serial_port_name = (String)(String)(Object) args.getValue("device");
        } else if ((boolean)(Object)args.isSet("d")) {
            serial_port_name = (String)(String)(Object) args.getValue("d");
        }
        if ((boolean)(Object)args.isSet("speed")) {
            serial_port_speed = ((Integer)(Integer)(Object) args.getValue("speed")).intValue();
        } else if ((boolean)(Object)args.isSet("s")) {
            serial_port_speed = ((Integer)(Integer)(Object) args.getValue("s")).intValue();
        }
        if ((boolean)(Object)args.isSet("file")) {
            filename = (String)(String)(Object) args.getValue("file");
        } else if ((boolean)(Object)args.isSet("f")) {
            filename = (String)(String)(Object) args.getValue("f");
        }
        if ((boolean)(Object)args.isSet("gpsd")) {
            gpsd = true;
            String gpsd_host_port = (String)(String)(Object) args.getValue("gpsd");
            if (gpsd_host_port != null && gpsd_host_port.length() > 0) {
                String[] params = gpsd_host_port.split(":");
                gpsd_host = params[0];
                if (params.length > 0) {
                    gpsd_port = Integer.parseInt(params[1]);
                }
            }
        }
        if ((Boolean)(Object)args.isSet("garmin") || (Boolean)(Object)args.isSet("g")) {
            gps_data_processor =(GPSDataProcessor)(Object) new GPSGarminDataProcessor();
            serial_port_speed = 9600;
            if (filename != null) {
                System.err.println("ERROR: Cannot read garmin data from file, only serial port supported!");
                return;
            }
        } else if ((Boolean)(Object)args.isSet("sirf") || (Boolean)(Object)args.isSet("i")) {
            gps_data_processor =(GPSDataProcessor)(Object) new GPSSirfDataProcessor();
            serial_port_speed = 19200;
            if (filename != null) {
                System.err.println("ERROR: Cannot read sirf data from file, only serial port supported!");
                return;
            }
        } else {
            gps_data_processor =(GPSDataProcessor)(Object) new GPSNmeaDataProcessor();
            serial_port_speed = 4800;
        }
        if ((Boolean)(Object)args.isSet("nmealogfile") || (Boolean)(Object)(args.isSet("l"))) {
            if ((boolean)(Object)args.isSet("nmealogfile")) nmea_log_file =(String)(Object) args.getStringValue("nmealogfile"); else nmea_log_file =(String)(Object) args.getStringValue("l");
        }
        if ((boolean)(Object)args.isSet("rawdata")) {
            gps_data_processor.addGPSRawDataListener(new GPSRawDataListener() {

                public void gpsRawDataReceived(char[] data, int offset, int length) {
                    System.out.println("RAWLOG: " + new String(data, offset, length));
                }
            });
        }
        GPSDevice gps_device;
        Hashtable environment = new Hashtable();
        if (filename != null) {
            environment.put(GPSFileDevice.PATH_NAME_KEY, filename);
            gps_device =(GPSDevice)(Object) new GPSFileDevice();
        } else if (gpsd) {
            environment.put(GPSNetworkGpsdDevice.GPSD_HOST_KEY, gpsd_host);
            environment.put(GPSNetworkGpsdDevice.GPSD_PORT_KEY, new Integer(gpsd_port));
            gps_device =(GPSDevice)(Object) new GPSNetworkGpsdDevice();
        } else {
            if (serial_port_name != null) environment.put(GPSSerialDevice.PORT_NAME_KEY, serial_port_name);
            if (serial_port_speed > -1) environment.put(GPSSerialDevice.PORT_SPEED_KEY, new Integer(serial_port_speed));
            gps_device =(GPSDevice)(Object) new GPSSerialDevice();
        }
        try {
            gps_device.init(environment);
            gps_data_processor.setGPSDevice(gps_device);
            gps_data_processor.open();
            gps_data_processor.addProgressListener(this);
            if ((nmea_log_file != null) && (nmea_log_file.length() > 0)) {
                gps_data_processor.addGPSRawDataListener(new GPSRawDataFileLogger(nmea_log_file));
            }
            if ((boolean)(Object)args.isSet("deviceinfo")) {
                System.out.println("GPSInfo:");
                String[] infos =(String[])(Object) gps_data_processor.getGPSInfo();
                for (int index = 0; index < infos.length; index++) {
                    System.out.println(infos[index]);
                }
            }
            if ((boolean)(Object)args.isSet("screenshot")) {
                FileOutputStream out = new FileOutputStream((String)(String)(Object) args.getValue("screenshot"));
                BufferedImage image =(BufferedImage)(Object) gps_data_processor.getScreenShot();
                ImageIO.write(image, "PNG", out);
            }
            boolean print_waypoints =(boolean)(Object) args.isSet("downloadwaypoints");
            boolean print_routes =(boolean)(Object) args.isSet("downloadroutes");
            boolean print_tracks =(boolean)(Object) args.isSet("downloadtracks");
            if (print_waypoints || print_routes || print_tracks) {
                VelocityContext context = new VelocityContext();
                if (print_waypoints) {
                    List waypoints =(List)(Object) gps_data_processor.getWaypoints();
                    if (waypoints != null) context.put("waypoints", waypoints); else print_waypoints = false;
                }
                if (print_tracks) {
                    List tracks =(List)(Object) gps_data_processor.getTracks();
                    if (tracks != null) context.put("tracks", tracks); else print_tracks = false;
                }
                if (print_routes) {
                    List routes =(List)(Object) gps_data_processor.getRoutes();
                    if (routes != null) context.put("routes", routes); else print_routes = false;
                }
                context.put("printwaypoints", new Boolean(print_waypoints));
                context.put("printtracks", new Boolean(print_tracks));
                context.put("printroutes", new Boolean(print_routes));
                Writer writer;
                Reader reader;
                if ((boolean)(Object)args.isSet("template")) {
                    String template_file = (String)(String)(Object) args.getValue("template");
                    reader = new FileReader(template_file);
                } else {
                    reader = new StringReader((String)(Object)DEFAULT_TEMPLATE);
                }
                if ((boolean)(Object)args.isSet("outfile")) writer = new FileWriter((String)(String)(Object) args.getValue("outfile")); else writer = new OutputStreamWriter(System.out);
                addDefaultValuesToContext(context);
                boolean result =(boolean)(Object) printTemplate(context, reader, writer);
            }
            boolean read_waypoints = ((Boolean)(Object)args.isSet("uploadwaypoints") && (Boolean)(Object)args.isSet("infile"));
            boolean read_routes = ((Boolean)(Object)args.isSet("uploadroutes") && (Boolean)(Object)args.isSet("infile"));
            boolean read_tracks = ((Boolean)(Object)args.isSet("uploadtracks") && (Boolean)(Object)args.isSet("infile"));
            if (read_waypoints || read_routes || read_tracks) {
                ReadGPX reader = new ReadGPX();
                String in_file = (String)(String)(Object) args.getValue("infile");
                reader.parseFile(in_file);
                if (read_waypoints) gps_data_processor.setWaypoints(reader.getWaypoints());
                if (read_routes) gps_data_processor.setRoutes(reader.getRoutes());
                if (read_tracks) gps_data_processor.setTracks(reader.getTracks());
            }
            if ((boolean)(Object)args.isSet("printposonce")) {
                GPSPosition pos =(GPSPosition)(Object) gps_data_processor.getGPSPosition();
                System.out.println("Current Position: " + pos);
            }
            if ((Boolean)(Object)args.isSet("printpos") || (Boolean)(Object)args.isSet("p")) {
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.LOCATION, this);
            }
            if ((boolean)(Object)args.isSet("printalt")) {
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.ALTITUDE, this);
            }
            if ((boolean)(Object)args.isSet("printspeed")) {
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.SPEED, this);
            }
            if ((boolean)(Object)args.isSet("printheading")) {
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.HEADING, this);
            }
            if ((boolean)(Object)args.isSet("printsat")) {
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.NUMBER_SATELLITES, this);
                gps_data_processor.addGPSDataChangeListener(GPSDataProcessor.SATELLITE_INFO, this);
            }
            if ((Boolean)(Object)args.isSet("printpos") || (Boolean)(Object)args.isSet("p") || (boolean)(Object)args.isSet("printalt") || (boolean)(Object)args.isSet("printsat") || (boolean)(Object)args.isSet("printspeed") || (boolean)(Object)args.isSet("printheading")) {
                gps_data_processor.startSendPositionPeriodically(1000L);
                try {
                    System.in.read();
                } catch (IOException ignore) {
                }
            }
            gps_data_processor.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.err.println("ERROR: File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println("ERROR: I/O Error: " + ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ALTITUDE;
	public MyHelperClass HEADING;
	public MyHelperClass PORT_SPEED_KEY;
	public MyHelperClass GPSD_PORT_KEY;
	public MyHelperClass GPSD_HOST_KEY;
	public MyHelperClass SPEED;
	public MyHelperClass PATH_NAME_KEY;
	public MyHelperClass NUMBER_SATELLITES;
	public MyHelperClass SATELLITE_INFO;
	public MyHelperClass LOCATION;
	public MyHelperClass PORT_NAME_KEY;
public MyHelperClass write(BufferedImage o0, String o1, FileOutputStream o2){ return null; }}

class CommandArguments {

CommandArguments(){}
	CommandArguments(String[] o0, String[] o1){}
	public MyHelperClass getStringValue(String o0){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass isSet(String o0){ return null; }}

class CommandArgumentException extends Exception{
	public CommandArgumentException(String errorMessage) { super(errorMessage); }
}

class GPSDataProcessor {

public MyHelperClass getRoutes(){ return null; }
	public MyHelperClass addProgressListener(c19478367 o0){ return null; }
	public MyHelperClass getScreenShot(){ return null; }
	public MyHelperClass getWaypoints(){ return null; }
	public MyHelperClass addGPSRawDataListener( GPSRawDataListener o0){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass setGPSDevice(GPSDevice o0){ return null; }
	public MyHelperClass getGPSInfo(){ return null; }
	public MyHelperClass addGPSRawDataListener(GPSRawDataFileLogger o0){ return null; }
	public MyHelperClass getTracks(){ return null; }
	public MyHelperClass setWaypoints(MyHelperClass o0){ return null; }
	public MyHelperClass setTracks(MyHelperClass o0){ return null; }
	public MyHelperClass addGPSDataChangeListener(MyHelperClass o0, c19478367 o1){ return null; }
	public MyHelperClass getGPSPosition(){ return null; }
	public MyHelperClass startSendPositionPeriodically(long o0){ return null; }
	public MyHelperClass setRoutes(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass addGPSRawDataListener(){ return null; }}

class GPSGarminDataProcessor {

}

class GPSSirfDataProcessor {

}

class GPSNmeaDataProcessor {

}

class GPSRawDataListener {

}

class GPSDevice {

public MyHelperClass init(Hashtable o0){ return null; }}

class GPSFileDevice {

}

class GPSNetworkGpsdDevice {

}

class GPSSerialDevice {

}

class GPSRawDataFileLogger {

GPSRawDataFileLogger(String o0){}
	GPSRawDataFileLogger(){}}

class BufferedImage {

}

class VelocityContext {

public MyHelperClass put(String o0, Boolean o1){ return null; }
	public MyHelperClass put(String o0, List o1){ return null; }}

class ReadGPX {

public MyHelperClass getRoutes(){ return null; }
	public MyHelperClass getWaypoints(){ return null; }
	public MyHelperClass getTracks(){ return null; }
	public MyHelperClass parseFile(String o0){ return null; }}

class GPSPosition {

}

class GPSException extends Exception{
	public GPSException(String errorMessage) { super(errorMessage); }
}
