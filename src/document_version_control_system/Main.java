package document_version_control_system;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content");
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1 content");
        versionControl.saveVersion(document.saveVersion());

        document.setContent("Version 2 content");
        versionControl.saveVersion(document.saveVersion());

        versionControl.listVersions();

        document.restoreVersion(versionControl.getVersion(0));
        System.out.println("Restored to version 1: " + document.getContent());
    }
}