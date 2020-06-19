


class c6680022 {

        public ResourceMigratorBuilder createResourceMigratorBuilder(NotificationReporter reporter) {
            return new ResourceMigratorBuilder() {

                public ResourceMigrator getCompletedResourceMigrator() {
                    return new ResourceMigrator() {

                        public void migrate(InputMetadata meta, InputStream inputStream, OutputCreator outputCreator) throws IOException, ResourceMigrationException {
                            OutputStream outputStream =(OutputStream)(Object) outputCreator.createOutputStream();
                            MyHelperClass IOUtils = new MyHelperClass();
                            IOUtils.copy(inputStream, outputStream);
                        }
                    };
                }

                public void setTarget(Version version) {
                }

                public void startType(String typeName) {
                }

                public void setRegexpPathRecogniser(String re) {
                }

                public void setCustomPathRecogniser(PathRecogniser pathRecogniser) {
                }

                public void addRegexpContentRecogniser(Version version, String re) {
                }

                public void addCustomContentRecogniser(Version version, ContentRecogniser contentRecogniser) {
                }

                public XSLStreamMigratorBuilder createXSLStreamMigratorBuilder() {
                    return null;
                }

                public void addStep(Version inputVersion, Version outputVersion, StreamMigrator streamMigrator) {
                }

                public void endType() {
                }
            };
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class NotificationReporter {

}

class ResourceMigratorBuilder {

}

class ResourceMigrator {

}

class Version {

}

class PathRecogniser {

}

class ContentRecogniser {

}

class XSLStreamMigratorBuilder {

}

class StreamMigrator {

}

class InputMetadata {

}

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

class OutputStream {

}
