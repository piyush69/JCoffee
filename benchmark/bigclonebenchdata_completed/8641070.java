


class c8641070 {

    public static void main(String[] args) {
        String email = "josh888@byu.net";
        String username = "josh8573";
        String password = "josh8573";
        String IDnumber = "3030";
        double[] apogee = { 1000 };
        double[] perigee = apogee;
        double[] inclination = { 58.0 };
        int[] trp_solmax = { 0, 1, 2 };
        double[] init_long_ascend = { 0 };
        double[] init_displ_ascend = { 0 };
        double[] displ_perigee_ascend = { 0 };
        double[] orbit_sect = null;
        boolean[] gtrn_weather = { false, true };
        boolean print_altitude = true;
        boolean print_inclination = false;
        boolean print_gtrn_weather = true;
        boolean print_ita = false;
        boolean print_ida = false;
        boolean print_dpa = false;
        ORBIT[] orbit_array;
        MyHelperClass ORBIT = new MyHelperClass();
        orbit_array =(ORBIT[])(Object) ORBIT.CreateOrbits(apogee, perigee, inclination, gtrn_weather, trp_solmax, init_long_ascend, init_displ_ascend, displ_perigee_ascend, orbit_sect, print_altitude, print_inclination, print_gtrn_weather, print_ita, print_ida, print_dpa);
        TRP[] trp_array = {};
        GTRN[] gtrn_array = {};
        if (orbit_array != null) {
            Vector trp_vector = new Vector();
            for (int i = 0; i < orbit_array.length; i++) {
                TRP temp_t =(TRP)(Object) orbit_array[i].getTRP();
                if (temp_t != null) {
                    trp_vector.add(temp_t);
                }
            }
            if ((int)(Object)trp_vector.size() != 0) {
                TRP[] trp_to_convert = new TRP[(int)(Object)trp_vector.size()];
                trp_array = (TRP[])(TRP[])(Object) trp_vector.toArray(trp_to_convert);
            }
            Vector gtrn_vector = new Vector();
            for (int i = 0; i < orbit_array.length; i++) {
                GTRN temp_g =(GTRN)(Object) orbit_array[i].getGTRN();
                if (temp_g != null) {
                    gtrn_vector.add(temp_g);
                }
            }
            if ((int)(Object)gtrn_vector.size() != 0) {
                GTRN[] gtrn_to_convert = new GTRN[(int)(Object)gtrn_vector.size()];
                gtrn_array = (GTRN[])(GTRN[])(Object) gtrn_vector.toArray(gtrn_to_convert);
            }
        }
        int[] flux_min_element = { 1 };
        int[] flux_max_element = { 92 };
        int[] weather_flux = { 00, 01, 11, 12, 13 };
        boolean print_weather = true;
        boolean print_min_elem = false;
        boolean print_max_elem = false;
        ORBIT[] orbit_array_into_flux = orbit_array;
        FLUX[] flux_array;
        MyHelperClass FLUX = new MyHelperClass();
        flux_array =(FLUX[])(Object) FLUX.CreateFLUX_URF(flux_min_element, flux_max_element, weather_flux, orbit_array_into_flux, print_weather, print_min_elem, print_max_elem);
        FLUX[] flx_objects_into_trans = flux_array;
        int[] units = { 1 };
        double[] thickness = { 100 };
        boolean print_shielding = false;
        TRANS[] trans_array;
        MyHelperClass TRANS = new MyHelperClass();
        trans_array =(TRANS[])(Object) TRANS.CreateTRANS_URF(flx_objects_into_trans, units, thickness, print_shielding);
        URFInterface[] input_files_for_letspec =(URFInterface[])(Object) trans_array;
        int[] letspec_min_element = { 2 };
        int[] letspec_max_element = { 0 };
        double[] min_energy_value = { .1 };
        boolean[] diff_spect = { false };
        boolean print_min_energy = false;
        LETSPEC[] letspec_array;
        MyHelperClass LETSPEC = new MyHelperClass();
        letspec_array =(LETSPEC[])(Object) LETSPEC.CreateLETSPEC_URF(input_files_for_letspec, letspec_min_element, letspec_max_element, min_energy_value, diff_spect, print_min_energy);
        URFInterface[] input_files_for_pup =(URFInterface[])(Object) trans_array;
        double[] pup_params = { 20, 4, 0.5, .0153 };
        PUP_Device[][] pup_device_array = { { new PUP_Device("sample", null, null, 50648448, 4, pup_params) } };
        boolean print_bits_in_device_pup = false;
        boolean print_weibull_onset_pup = false;
        boolean print_weibull_width_pup = false;
        boolean print_weibull_exponent_pup = false;
        boolean print_weibull_cross_sect_pup = false;
        PUP[] pup_array;
        MyHelperClass PUP = new MyHelperClass();
        pup_array =(PUP[])(Object) PUP.CreatePUP_URF(input_files_for_pup, pup_device_array, print_bits_in_device_pup, print_weibull_onset_pup, print_weibull_width_pup, print_weibull_exponent_pup, print_weibull_cross_sect_pup);
        LETSPEC[] let_objects_into_hup = letspec_array;
        double[][] weib_params = { { 9.74, 30.25, 2.5, 22600 }, { 9.74, 30.25, 2.5, 2260 }, { 9.74, 30.25, 2.5, 226 }, { 9.74, 30.25, 2.5, 22.6 }, { 9.74, 30.25, 2.5, 2.26 }, { 9.74, 30.25, 2.5, .226 }, { 9.74, 30.25, 2.5, .0226 } };
        HUP_Device[][] hup_device_array = new HUP_Device[7][1];
        double z_depth = (float) 0.01;
        for (int i = 0; i < 7; i++) {
            hup_device_array[i][0] = new HUP_Device("sample", null, null, 0, 0, (Math.sqrt(weib_params[i][3]) / 100), 0, (int) Math.pow(10, i), 4, weib_params[i]);
            z_depth += .01;
        }
        boolean print_label = false;
        boolean print_commenta = false;
        boolean print_commentb = false;
        boolean print_RPP_x = false;
        boolean print_RPP_y = false;
        boolean print_RPP_z = false;
        boolean print_funnel_length = false;
        boolean print_bits_in_device_hup = true;
        boolean print_weibull_onset_hup = false;
        boolean print_weibull_width_hup = false;
        boolean print_weibull_exponent_hup = false;
        boolean print_weibull_cross_sect_hup = false;
        HUP[] hup_array;
        MyHelperClass HUP = new MyHelperClass();
        hup_array =(HUP[])(Object) HUP.CreateHUP_URF(let_objects_into_hup, hup_device_array, print_label, print_commenta, print_commentb, print_RPP_x, print_RPP_y, print_RPP_z, print_funnel_length, print_bits_in_device_hup, print_weibull_onset_hup, print_weibull_width_hup, print_weibull_exponent_hup, print_weibull_cross_sect_hup);
        System.out.println("Finished creating User Request Files");
        int num_of_files = trp_array.length + gtrn_array.length + flux_array.length + trans_array.length + letspec_array.length + pup_array.length + hup_array.length;
        int index = 0;
        String[] files_to_upload = new String[num_of_files];
        for (int a = 0; a < trp_array.length; a++) {
            files_to_upload[index] =(String)(Object) trp_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < gtrn_array.length; a++) {
            files_to_upload[index] =(String)(Object) gtrn_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < flux_array.length; a++) {
            files_to_upload[index] =(String)(Object) flux_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < trans_array.length; a++) {
            files_to_upload[index] =(String)(Object) trans_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < letspec_array.length; a++) {
            files_to_upload[index] =(String)(Object) letspec_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < pup_array.length; a++) {
            files_to_upload[index] =(String)(Object) pup_array[a].getThisFileName();
            index++;
        }
        for (int a = 0; a < hup_array.length; a++) {
            files_to_upload[index] =(String)(Object) hup_array[a].getThisFileName();
            index++;
        }
        MyHelperClass Logger = new MyHelperClass();
        Logger log =(Logger)(Object) Logger.getLogger(CreateAStudy.class);
        String host = "creme96.nrl.navy.mil";
        String user = "anonymous";
        String ftppass = email;
        MyHelperClass Level = new MyHelperClass();
        Logger.setLevel(Level.ALL);
        FTPClient ftp = null;
        try {
            ftp = new FTPClient();
            ftp.setRemoteHost(host);
            FTPMessageCollector listener = new FTPMessageCollector();
            ftp.setMessageListener(listener);
            log.info("Connecting");
            ftp.connect();
            log.info("Logging in");
            ftp.login(user, ftppass);
            log.debug("Setting up passive, ASCII transfers");
            MyHelperClass FTPConnectMode = new MyHelperClass();
            ftp.setConnectMode(FTPConnectMode.ACTIVE);
            MyHelperClass FTPTransferType = new MyHelperClass();
            ftp.setType(FTPTransferType.BINARY);
            log.info("Putting file");
            for (int u = 0; u < files_to_upload.length; u++) {
                ftp.put(files_to_upload[u], files_to_upload[u]);
            }
            log.info("Quitting client");
            ftp.quit();
            log.debug("Listener log:");
            log.info("Test complete");
        } catch (Exception e) {
            log.error("Demo failed", e);
            e.printStackTrace();
        }
        System.out.println("Finished FTPing User Request Files to common directory");
        MyHelperClass Upload_Files = new MyHelperClass();
        Upload_Files.upload(files_to_upload, username, password, IDnumber);
        System.out.println("Finished transfering User Request Files to your CREME96 personal directory");
        MyHelperClass RunRoutines = new MyHelperClass();
        RunRoutines.routines(files_to_upload, username, password, IDnumber);
        System.out.println("Finished running all of your uploaded routines");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACTIVE;
	public MyHelperClass BINARY;
	public MyHelperClass ALL;
public MyHelperClass CreateOrbits(double[] o0, double[] o1, double[] o2, boolean[] o3, int[] o4, double[] o5, double[] o6, double[] o7, double[] o8, boolean o9, boolean o10, boolean o11, boolean o12, boolean o13, boolean o14){ return null; }
	public MyHelperClass CreateTRANS_URF(FLUX[] o0, int[] o1, double[] o2, boolean o3){ return null; }
	public MyHelperClass upload(String[] o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass CreatePUP_URF(URFInterface[] o0, PUP_Device[][] o1, boolean o2, boolean o3, boolean o4, boolean o5, boolean o6){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass CreateLETSPEC_URF(URFInterface[] o0, int[] o1, int[] o2, double[] o3, boolean[] o4, boolean o5){ return null; }
	public MyHelperClass getLogger(Class<CreateAStudy> o0){ return null; }
	public MyHelperClass CreateFLUX_URF(int[] o0, int[] o1, int[] o2, ORBIT[] o3, boolean o4, boolean o5, boolean o6){ return null; }
	public MyHelperClass CreateHUP_URF(LETSPEC[] o0, HUP_Device[][] o1, boolean o2, boolean o3, boolean o4, boolean o5, boolean o6, boolean o7, boolean o8, boolean o9, boolean o10, boolean o11, boolean o12, boolean o13){ return null; }
	public MyHelperClass routines(String[] o0, String o1, String o2, String o3){ return null; }}

class ORBIT {

public MyHelperClass getGTRN(){ return null; }
	public MyHelperClass getTRP(){ return null; }}

class TRP {

public MyHelperClass getThisFileName(){ return null; }}

class GTRN {

public MyHelperClass getThisFileName(){ return null; }}

class Vector {

public MyHelperClass toArray(TRP[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(TRP o0){ return null; }
	public MyHelperClass toArray(GTRN[] o0){ return null; }
	public MyHelperClass add(GTRN o0){ return null; }}

class FLUX {

public MyHelperClass getThisFileName(){ return null; }}

class TRANS {

public MyHelperClass getThisFileName(){ return null; }}

class URFInterface {

}

class LETSPEC {

public MyHelperClass getThisFileName(){ return null; }}

class PUP_Device {

PUP_Device(){}
	PUP_Device(String o0, Object o1, Object o2, int o3, int o4, double[] o5){}}

class PUP {

public MyHelperClass getThisFileName(){ return null; }}

class HUP_Device {

HUP_Device(){}
	HUP_Device(String o0, Object o1, Object o2, int o3, int o4, double o5, int o6, int o7, int o8, double[] o9){}}

class HUP {

public MyHelperClass getThisFileName(){ return null; }}

class Logger {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class CreateAStudy {

}

class FTPClient {

public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass setRemoteHost(String o0){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setMessageListener(FTPMessageCollector o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPMessageCollector {

}
