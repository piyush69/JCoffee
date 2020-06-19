


class c14033995 {
public MyHelperClass notificationFactory;
	public MyHelperClass reporter;
	public MyHelperClass processMigrationSteps(Match o0, RestartInputStream o1, OutputCreator o2){ return null; }

    public void migrate(InputMetadata meta, InputStream input, OutputCreator outputCreator) throws IOException, ResourceMigrationException {
        RestartInputStream restartInput = new RestartInputStream(input);
        MyHelperClass resourceIdentifier = new MyHelperClass();
        Match match =(Match)(Object) resourceIdentifier.identifyResource(meta, restartInput);
        restartInput.restart();
        if (match != null) {
            MyHelperClass NotificationType = new MyHelperClass();
            reporter.reportNotification(notificationFactory.createLocalizedNotification(NotificationType.INFO, "migration-resource-migrating", new Object[] { meta.getURI(), match.getTypeName(), match.getVersionName() }));
            processMigrationSteps(match, restartInput, outputCreator);
        } else {
            MyHelperClass NotificationType = new MyHelperClass();
            reporter.reportNotification(notificationFactory.createLocalizedNotification(NotificationType.INFO, "migration-resource-copying", new Object[] { meta.getURI() }));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyAndClose(restartInput, outputCreator.createOutputStream());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass copyAndClose(RestartInputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass reportNotification(MyHelperClass o0){ return null; }
	public MyHelperClass identifyResource(InputMetadata o0, RestartInputStream o1){ return null; }
	public MyHelperClass createLocalizedNotification(MyHelperClass o0, String o1, Object[] o2){ return null; }}

class InputMetadata {

public MyHelperClass getURI(){ return null; }}

class InputStream {

}

class OutputCreator {

public MyHelperClass createOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ResourceMigrationException extends Exception{
	public ResourceMigrationException(String errorMessage) { super(errorMessage); }
}

class RestartInputStream {

RestartInputStream(InputStream o0){}
	RestartInputStream(){}
	public MyHelperClass restart(){ return null; }}

class Match {

public MyHelperClass getVersionName(){ return null; }
	public MyHelperClass getTypeName(){ return null; }}
