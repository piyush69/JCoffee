import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1676011 {
public MyHelperClass getOptionalElementText(Node o0, MyHelperClass o1){ return null; }
	public MyHelperClass getMandatoryElementText(Node o0, MyHelperClass o1){ return null; }
	public MyHelperClass getOptionalURIElement(Node o0, MyHelperClass o1){ return null; }
public MyHelperClass XPathConstants;
	public MyHelperClass getToolDescriptionElement(Node o0){ return null; }
	public MyHelperClass getServiceProperties(Node o0){ return null; }
	public MyHelperClass getUniqueParameters(MigrationPaths o0){ return null; }
public MyHelperClass serviceProvider;
	public MyHelperClass canonicalServiceName;
	public MyHelperClass xPathFactory;
	public MyHelperClass configuration;
	public MyHelperClass MigrationPathConverter;
	public MyHelperClass ConfigurationFileTagsV1;

    ServiceDescription getServiceDescription() throws ConfigurationException {
        final XPath pathsXPath =(XPath)(Object) this.xPathFactory.newXPath();
        try {
            final Node serviceDescriptionNode = (Node)(Node)(Object) pathsXPath.evaluate(ConfigurationFileTagsV1.SERVICE_DESCRIPTION_ELEMENT_XPATH, this.configuration, XPathConstants.NODE);
            final String title =(String)(Object) getMandatoryElementText(serviceDescriptionNode, ConfigurationFileTagsV1.TITLE_ELEMENT);
            Builder builder = new Builder(title, Migrate.class.getCanonicalName());
            Property[] serviceProperties =(Property[])(Object) getServiceProperties(serviceDescriptionNode);
            builder.author(getMandatoryElementText(serviceDescriptionNode, ConfigurationFileTagsV1.CREATOR_ELEMENT));
            builder.classname(this.canonicalServiceName);
            builder.description(getOptionalElementText(serviceDescriptionNode, ConfigurationFileTagsV1.DESCRIPTION_ELEMENT));
            final String serviceVersion =(String)(Object) getOptionalElementText(serviceDescriptionNode, ConfigurationFileTagsV1.VERSION_ELEMENT);
            final Tool toolDescription =(Tool)(Object) getToolDescriptionElement(serviceDescriptionNode);
            String identifier =(String)(Object) getOptionalElementText(serviceDescriptionNode, ConfigurationFileTagsV1.IDENTIFIER_ELEMENT);
            if (identifier == null || "".equals(identifier)) {
                try {
                    final MessageDigest identDigest = MessageDigest.getInstance("MD5");
                    identDigest.update((byte)(Object)this.canonicalServiceName.getBytes());
                    final String versionInfo = (serviceVersion != null) ? serviceVersion : "";
                    identDigest.update(versionInfo.getBytes());
                    final URI toolIDURI =(URI)(Object) toolDescription.getIdentifier();
                    final String toolIdentifier = toolIDURI == null ? "" : toolIDURI.toString();
                    identDigest.update(toolIdentifier.getBytes());
                    final BigInteger md5hash = new BigInteger(identDigest.digest());
                    identifier = md5hash.toString(16);
                } catch (NoSuchAlgorithmException nsae) {
                    throw new RuntimeException(nsae);
                }
            }
            builder.identifier(identifier);
            builder.version(serviceVersion);
            builder.tool(toolDescription);
            builder.instructions(getOptionalElementText(serviceDescriptionNode, ConfigurationFileTagsV1.INSTRUCTIONS_ELEMENT));
            builder.furtherInfo(getOptionalURIElement(serviceDescriptionNode, ConfigurationFileTagsV1.FURTHER_INFO_ELEMENT));
            builder.logo(getOptionalURIElement(serviceDescriptionNode, ConfigurationFileTagsV1.LOGO_ELEMENT));
            builder.serviceProvider(this.serviceProvider);
            final DBMigrationPathFactory migrationPathFactory = new DBMigrationPathFactory(this.configuration);
            final MigrationPaths migrationPaths =(MigrationPaths)(Object) migrationPathFactory.getAllMigrationPaths();
            builder.paths(MigrationPathConverter.toPlanetsPaths(migrationPaths));
            builder.inputFormats(migrationPaths.getInputFormatURIs().toArray(new URI[0]));
            builder.parameters(getUniqueParameters(migrationPaths));
            builder.properties(serviceProperties);
            return(ServiceDescription)(Object) builder.build();
        } catch (ArithmeticException xPathExpressionException) {
            throw new ConfigurationException(String.format("Failed parsing the '%s' element in the '%s' element.", ConfigurationFileTagsV1.SERVICE_DESCRIPTION_ELEMENT_XPATH, this.configuration.getNodeName()),(NullPointerException)(Object) xPathExpressionException);
        } catch (NullPointerException nullPointerException) {
            throw new ConfigurationException(String.format("Failed parsing the '%s' element in the '%s' element.", ConfigurationFileTagsV1.SERVICE_DESCRIPTION_ELEMENT_XPATH, this.configuration.getNodeName()), nullPointerException);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INSTRUCTIONS_ELEMENT;
	public MyHelperClass TITLE_ELEMENT;
	public MyHelperClass LOGO_ELEMENT;
	public MyHelperClass CREATOR_ELEMENT;
	public MyHelperClass SERVICE_DESCRIPTION_ELEMENT_XPATH;
	public MyHelperClass DESCRIPTION_ELEMENT;
	public MyHelperClass FURTHER_INFO_ELEMENT;
	public MyHelperClass VERSION_ELEMENT;
	public MyHelperClass NODE;
	public MyHelperClass IDENTIFIER_ELEMENT;
public MyHelperClass toArray(URI[] o0){ return null; }
	public MyHelperClass toPlanetsPaths(MigrationPaths o0){ return null; }
	public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass newXPath(){ return null; }}

class ServiceDescription {

}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
	ConfigurationException(String o0, NullPointerException o1){}
	ConfigurationException(){}
	ConfigurationException(String o0, XPathExpressionException o1){}
}

class XPath {

public MyHelperClass evaluate(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class Node {

}

class Property {

}

class Tool {

public MyHelperClass getIdentifier(){ return null; }}

class DBMigrationPathFactory {

DBMigrationPathFactory(MyHelperClass o0){}
	DBMigrationPathFactory(){}
	public MyHelperClass getAllMigrationPaths(){ return null; }}

class MigrationPaths {

public MyHelperClass getInputFormatURIs(){ return null; }}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class Builder {

Builder(String o0, String o1){}
	Builder(){}
	public MyHelperClass description(MyHelperClass o0){ return null; }
	public MyHelperClass parameters(MyHelperClass o0){ return null; }
	public MyHelperClass author(MyHelperClass o0){ return null; }
	public MyHelperClass furtherInfo(MyHelperClass o0){ return null; }
	public MyHelperClass properties(Property[] o0){ return null; }
	public MyHelperClass inputFormats(MyHelperClass o0){ return null; }
	public MyHelperClass logo(MyHelperClass o0){ return null; }
	public MyHelperClass version(String o0){ return null; }
	public MyHelperClass identifier(String o0){ return null; }
	public MyHelperClass tool(Tool o0){ return null; }
	public MyHelperClass serviceProvider(MyHelperClass o0){ return null; }
	public MyHelperClass instructions(MyHelperClass o0){ return null; }
	public MyHelperClass build(){ return null; }
	public MyHelperClass classname(MyHelperClass o0){ return null; }
	public MyHelperClass paths(MyHelperClass o0){ return null; }}

class Migrate {

}
