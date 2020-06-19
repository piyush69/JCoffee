import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11940679 {
public MyHelperClass saveErrors(HttpServletRequest o0, ActionMessages o1){ return null; }
	public MyHelperClass saveMessages(HttpServletRequest o0, ActionMessages o1){ return null; }
public MyHelperClass ActionMessages;
	public MyHelperClass ServerLogger;
	public MyHelperClass ClientLogger;
	public MyHelperClass setCounts(Integer o0){ return null; }
	public MyHelperClass resetCounts(Integer o0){ return null; }

    public ActionForward uploadFile(ActionMapping mapping, ActionForm actForm, HttpServletRequest request, HttpServletResponse in_response)  throws Throwable {
        ActionMessages errors = new ActionMessages();
        ActionMessages messages = new ActionMessages();
        String returnPage = "submitPocketSampleInformationPage";
        UploadForm form = (UploadForm)(UploadForm)(Object) actForm;
        Integer shippingId = null;
        try {
            eHTPXXLSParser parser = new eHTPXXLSParser();
            String proposalCode;
            String proposalNumber;
            String proposalName;
            String uploadedFileName;
            String realXLSPath;
            if (request != null) {
                MyHelperClass Constants = new MyHelperClass();
                proposalCode = (String) request.getSession().getAttribute(Constants.PROPOSAL_CODE);
//                MyHelperClass Constants = new MyHelperClass();
                proposalNumber = String.valueOf(request.getSession().getAttribute(Constants.PROPOSAL_NUMBER));
                proposalName = proposalCode + proposalNumber.toString();
                uploadedFileName = form.getRequestFile().getFileName();
                String fileName = proposalName + "_" + uploadedFileName;
                realXLSPath = request.getRealPath("\\tmp\\") + "\\" + fileName;
                FormFile f =(FormFile)(Object) form.getRequestFile();
                InputStream in =(InputStream)(Object) f.getInputStream();
                File outputFile = new File(realXLSPath);
                if (outputFile.exists()) outputFile.delete();
                FileOutputStream out = new FileOutputStream(outputFile);
                while (in.available() != 0) {
                    out.write(in.read());
                    out.flush();
                }
                out.flush();
                out.close();
            } else {
                proposalCode = "ehtpx";
                proposalNumber = "1";
                proposalName = proposalCode + proposalNumber.toString();
                uploadedFileName = "ispyb-template41.xls";
                realXLSPath = "D:\\" + uploadedFileName;
            }
            FileInputStream inFile = new FileInputStream(realXLSPath);
            parser.retrieveShippingId(realXLSPath);
            shippingId =(Integer)(Object) parser.getShippingId();
            String requestShippingId =(String)(Object) form.getShippingId();
            if (requestShippingId != null && !requestShippingId.equals("")) {
                shippingId = new Integer(requestShippingId);
            }
            MyHelperClass ClientLogger = new MyHelperClass();
            ClientLogger.getInstance().debug("uploadFile for shippingId " + shippingId);
            if (shippingId != null) {
                MyHelperClass Log = new MyHelperClass();
                Log.debug(" ---[uploadFile] Upload for Existing Shipment (DewarTRacking): Deleting Samples from Shipment :");
                MyHelperClass DBAccess_EJB = new MyHelperClass();
                double nbSamplesContainers =(double)(Object) DBAccess_EJB.DeleteAllSamplesAndContainersForShipping(shippingId);
                if (nbSamplesContainers > 0) parser.getValidationWarnings().add(new XlsUploadException("Shipment contained Samples and/or Containers", "Previous Samples and/or Containers have been deleted and replaced by new ones.")); else parser.getValidationWarnings().add(new XlsUploadException("Shipment contained no Samples and no Containers", "Samples and Containers have been added."));
            }
            Hashtable<String, Hashtable<String, Integer>> listProteinAcronym_SampleName = new Hashtable<String, Hashtable<String, Integer>>();
            MyHelperClass ProposalFacadeUtil = new MyHelperClass();
            ProposalFacadeLocal proposal = ProposalFacadeUtil.getLocalHome().create();
            MyHelperClass ProteinFacadeUtil = new MyHelperClass();
            ProteinFacadeLocal protein = ProteinFacadeUtil.getLocalHome().create();
            MyHelperClass CrystalFacadeUtil = new MyHelperClass();
            CrystalFacadeLocal crystal = CrystalFacadeUtil.getLocalHome().create();
            ProposalLightValue targetProposal = (ProposalLightValue) (((ArrayList)(ArrayList)(Object) proposal.findByCodeAndNumber(proposalCode, new Integer(proposalNumber))).get(0));
            ArrayList listProteins = (ArrayList) protein.findByProposalId(targetProposal.getProposalId());
            for (int p = 0; p < listProteins.size(); p++) {
                ProteinValue prot = (ProteinValue) listProteins.get(p);
                Hashtable<String, Integer> listSampleName = new Hashtable<String, Integer>();
                CrystalLightValue listCrystals[] =(CrystalLightValue[])(Object) prot.getCrystals();
                for (int c = 0; c < listCrystals.length; c++) {
                    CrystalLightValue _xtal = (CrystalLightValue) listCrystals[c];
                    CrystalValue xtal = crystal.findByPrimaryKey(_xtal.getPrimaryKey());
                    BlsampleLightValue listSamples[] =(BlsampleLightValue[])(Object) xtal.getBlsamples();
                    for (int s = 0; s < listSamples.length; s++) {
                        BlsampleLightValue sample = listSamples[s];
                        listSampleName.put((String)(Object)sample.getName(), sample.getBlSampleId());
                    }
                }
                listProteinAcronym_SampleName.put((String)(Object)prot.getAcronym(), listSampleName);
            }
            parser.validate(inFile, listProteinAcronym_SampleName, targetProposal.getProposalId());
            List listErrors =(List)(Object) parser.getValidationErrors();
            List listWarnings =(List)(Object) parser.getValidationWarnings();
            if (listErrors.size() == 0) {
                parser.open(realXLSPath);
                if (parser.getCrystals().size() == 0) {
                    parser.getValidationErrors().add(new XlsUploadException("No crystals have been found", "Empty shipment"));
                }
            }
            Iterator errIt = listErrors.iterator();
            while (errIt.hasNext()) {
                XlsUploadException xlsEx = (XlsUploadException) errIt.next();
                MyHelperClass ActionMessages = new MyHelperClass();
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message.free", xlsEx.getMessage() + " ---> " + xlsEx.getSuggestedFix()));
            }
            try {
                saveErrors(request, errors);
            } catch (Exception e) {
            }
            Iterator warnIt = listWarnings.iterator();
            while (warnIt.hasNext()) {
                XlsUploadException xlsEx = (XlsUploadException) warnIt.next();
                MyHelperClass ActionMessages = new MyHelperClass();
                messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("message.free", xlsEx.getMessage() + " ---> " + xlsEx.getSuggestedFix()));
            }
            try {
                saveMessages(request, messages);
            } catch (Exception e) {
            }
            if (listErrors.size() > 0) {
                resetCounts(shippingId);
                return(ActionForward)(Object) mapping.findForward("submitPocketSampleInformationPage");
            }
            if (listWarnings.size() > 0) returnPage = "submitPocketSampleInformationPage";
            String crystalDetailsXML;
            XtalDetails xtalDetailsWebService = new XtalDetails();
            CrystalDetailsBuilder cDE = new CrystalDetailsBuilder();
            CrystalDetailsElement cd = cDE.createCrystalDetailsElement(proposalName, parser.getCrystals());
            cDE.validateJAXBObject(cd);
            crystalDetailsXML =(String)(Object) cDE.marshallJaxBObjToString(cd);
            xtalDetailsWebService.submitCrystalDetails(crystalDetailsXML);
            String diffractionPlan;
            DiffractionPlan diffractionPlanWebService = new DiffractionPlan();
            DiffractionPlanBuilder dPB = new DiffractionPlanBuilder();
            Iterator it = parser.getDiffractionPlans().iterator();
            while (it.hasNext()) {
                DiffractionPlanElement dpe = (DiffractionPlanElement) it.next();
                dpe.setProjectUUID(proposalName);
                diffractionPlan =(String)(Object) dPB.marshallJaxBObjToString(dpe);
                diffractionPlanWebService.submitDiffractionPlan(diffractionPlan);
            }
            String crystalShipping;
            Shipping shippingWebService = new Shipping();
            CrystalShippingBuilder cSB = new CrystalShippingBuilder();
            Person person =(Person)(Object) cSB.createPerson("XLS Upload", null, "ISPyB", null, null, "ISPyB", null, "ispyb@esrf.fr", "0000", "0000", null, null);
            Laboratory laboratory =(Laboratory)(Object) cSB.createLaboratory("Generic Laboratory", "ISPyB Lab", "Sandwich", "Somewhere", "UK", "ISPyB", "ispyb.esrf.fr", person);
            DeliveryAgent deliveryAgent =(DeliveryAgent)(Object) parser.getDeliveryAgent();
            CrystalShipping cs = cSB.createCrystalShipping(proposalName, laboratory, deliveryAgent, parser.getDewars());
            String shippingName;
            shippingName = uploadedFileName.substring(0, ((uploadedFileName.toLowerCase().lastIndexOf(".xls")) > 0) ? uploadedFileName.toLowerCase().lastIndexOf(".xls") : 0);
            if (shippingName.equalsIgnoreCase("")) shippingName = uploadedFileName.substring(0, ((uploadedFileName.toLowerCase().lastIndexOf(".xlt")) > 0) ? uploadedFileName.toLowerCase().lastIndexOf(".xlt") : 0);
            cs.setName(shippingName);
            crystalShipping =(String)(Object) cSB.marshallJaxBObjToString(cs);
            shippingWebService.submitCrystalShipping(crystalShipping, (ArrayList)(ArrayList)(Object) parser.getDiffractionPlans(), shippingId);
            ServerLogger.Log4Stat("XLS_UPLOAD", proposalName, uploadedFileName);
        } catch (XlsUploadException e) {
            resetCounts(shippingId);
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.detail", e.getMessage()));
            ClientLogger.getInstance().error(e.toString());
            saveErrors(request, errors);
            return(ActionForward)(Object) mapping.findForward("error");
        } catch (Exception e) {
            resetCounts(shippingId);
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.detail", e.toString()));
            ClientLogger.getInstance().error(e.toString());
            e.printStackTrace();
            saveErrors(request, errors);
            return(ActionForward)(Object) mapping.findForward("error");
        }
        setCounts(shippingId);
        return(ActionForward)(Object) mapping.findForward(returnPage);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROPOSAL_CODE;
	public MyHelperClass PROPOSAL_NUMBER;
	public MyHelperClass GLOBAL_MESSAGE;
public MyHelperClass create(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(XlsUploadException o0){ return null; }
	public MyHelperClass Log4Stat(String o0, String o1, String o2){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getLocalHome(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass DeleteAllSamplesAndContainersForShipping(Integer o0){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class ActionMessages {

public MyHelperClass add(MyHelperClass o0, ActionMessage o1){ return null; }}

class UploadForm {

public MyHelperClass getShippingId(){ return null; }
	public MyHelperClass getRequestFile(){ return null; }}

class eHTPXXLSParser {

public MyHelperClass validate(FileInputStream o0, Hashtable<String,Hashtable<String o1, Integer o2, MyHelperClass o3){ return null; }
	public MyHelperClass getShippingId(){ return null; }
	public MyHelperClass getDewars(){ return null; }
	public MyHelperClass getDiffractionPlans(){ return null; }
	public MyHelperClass getValidationErrors(){ return null; }
	public MyHelperClass retrieveShippingId(String o0){ return null; }
	public MyHelperClass getCrystals(){ return null; }
	public MyHelperClass getDeliveryAgent(){ return null; }
	public MyHelperClass getValidationWarnings(){ return null; }
	public MyHelperClass open(String o0){ return null; }}

class FormFile {

public MyHelperClass getInputStream(){ return null; }}

class XlsUploadException extends Exception{
	public XlsUploadException(String errorMessage) { super(errorMessage); }
	XlsUploadException(String o0, String o1){}
	XlsUploadException(){}
}

class ProposalFacadeLocal {

public MyHelperClass findByCodeAndNumber(String o0, Integer o1){ return null; }}

class ProteinFacadeLocal {

public MyHelperClass findByProposalId(MyHelperClass o0){ return null; }}

class CrystalFacadeLocal {

public MyHelperClass findByPrimaryKey(MyHelperClass o0){ return null; }}

class ProposalLightValue {

public MyHelperClass getProposalId(){ return null; }}

class ProteinValue {

public MyHelperClass getCrystals(){ return null; }
	public MyHelperClass getAcronym(){ return null; }}

class CrystalLightValue {

public MyHelperClass getPrimaryKey(){ return null; }}

class CrystalValue {

public MyHelperClass getBlsamples(){ return null; }}

class BlsampleLightValue {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getBlSampleId(){ return null; }}

class XtalDetails {

public MyHelperClass submitCrystalDetails(String o0){ return null; }}

class CrystalDetailsBuilder {

public MyHelperClass validateJAXBObject(CrystalDetailsElement o0){ return null; }
	public MyHelperClass createCrystalDetailsElement(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass marshallJaxBObjToString(CrystalDetailsElement o0){ return null; }}

class CrystalDetailsElement {

}

class DiffractionPlan {

public MyHelperClass submitDiffractionPlan(String o0){ return null; }}

class DiffractionPlanBuilder {

public MyHelperClass marshallJaxBObjToString(DiffractionPlanElement o0){ return null; }}

class DiffractionPlanElement {

public MyHelperClass setProjectUUID(String o0){ return null; }}

class Shipping {

public MyHelperClass submitCrystalShipping(String o0, ArrayList o1, Integer o2){ return null; }}

class CrystalShippingBuilder {

public MyHelperClass createLaboratory(String o0, String o1, String o2, String o3, String o4, String o5, String o6, Person o7){ return null; }
	public MyHelperClass marshallJaxBObjToString(CrystalShipping o0){ return null; }
	public MyHelperClass createPerson(String o0, Object o1, String o2, Object o3, Object o4, String o5, Object o6, String o7, String o8, String o9, Object o10, Object o11){ return null; }
	public MyHelperClass createCrystalShipping(String o0, Laboratory o1, DeliveryAgent o2, MyHelperClass o3){ return null; }}

class Person {

}

class Laboratory {

}

class DeliveryAgent {

}

class CrystalShipping {

public MyHelperClass setName(String o0){ return null; }}

class ActionMessage {

ActionMessage(String o0, String o1){}
	ActionMessage(){}}
