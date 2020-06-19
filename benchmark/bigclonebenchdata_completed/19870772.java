import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19870772 {

//    @RequestMapping(value = "/verdocumentoFisico.html", method = RequestMethod.GET)
    public String editFile(ModelMap model, @(Annotation)(Object) void RequestParam("id") int idAnexo)  throws Throwable {
        MyHelperClass anexoService = new MyHelperClass();
        Anexo anexo = anexoService.selectById(idAnexo);
        model.addAttribute("path", anexo.getAnexoCaminho());
        try {
            MyHelperClass config = new MyHelperClass();
            InputStream is = new FileInputStream(new File(config.baseDir + "/arquivos_upload_direto/" + anexo.getAnexoCaminho()));
//            MyHelperClass config = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(new File(config.baseDir + "/temp/" + anexo.getAnexoCaminho()));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
//            MyHelperClass config = new MyHelperClass();
            Runtime.getRuntime().exec("chmod 777 " + config.tempDir + anexo.getAnexoCaminho());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "verdocumentoFisico";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass tempDir;
	public MyHelperClass baseDir;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass selectById(int o0){ return null; }}

class ModelMap {

}

class RequestParam {

}

class RequestMapping {

}

class Anexo {

public MyHelperClass getAnexoCaminho(){ return null; }}
