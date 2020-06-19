import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2746011 {

//    @RequestMapping(value = "/privatefiles/{file_name}")
    public void getFile(@(Annotation)(Object) void PathVariable("file_name") String fileName, HttpServletResponse response, Principal principal)  throws Throwable {
        try {
            Boolean validUser = false;
            final String currentUser = principal.getName();
            MyHelperClass SecurityContextHolder = new MyHelperClass();
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (!auth.getPrincipal().equals(new String("anonymousUser"))) {
                MetabolightsUser metabolightsUser = (MetabolightsUser) auth.getPrincipal();
                if (metabolightsUser != null && metabolightsUser.isCurator()) validUser = true;
            }
            if (currentUser != null) {
                MyHelperClass studyService = new MyHelperClass();
                Study study = studyService.getBiiStudy(fileName, true);
                Collection<User> users = study.getUsers();
                Iterator<User> iter = users.iterator();
                while (iter.hasNext()) {
                    User user = iter.next();
                    if (user.getUserName().equals(currentUser)) {
                        validUser = true;
                        break;
                    }
                }
            }
            MyHelperClass PropertyLookup = new MyHelperClass();
            if (!validUser) throw new RuntimeException(PropertyLookup.getMessage("Entry.notAuthorised"));
            try {
                MyHelperClass privateFtpDirectory = new MyHelperClass();
                InputStream is = new FileInputStream(privateFtpDirectory + fileName + ".zip");
                response.setContentType("application/zip");
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, response.getOutputStream());
            } catch (Exception e) {
//                MyHelperClass PropertyLookup = new MyHelperClass();
                throw new RuntimeException(PropertyLookup.getMessage("Entry.fileMissing"));
            }
            response.flushBuffer();
        } catch (IOException ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.info("Error writing file to output stream. Filename was '" + fileName + "'");
            throw new RuntimeException("IOError writing file to output stream");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass getBiiStudy(String o0, boolean o1){ return null; }
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass flushBuffer(){ return null; }}

class PathVariable {

}

class RequestMapping {

}

class Authentication {

public MyHelperClass getPrincipal(){ return null; }}

class MetabolightsUser {

public MyHelperClass isCurator(){ return null; }}

class Study {

public MyHelperClass getUsers(){ return null; }}

class User {

public MyHelperClass getUserName(){ return null; }}
