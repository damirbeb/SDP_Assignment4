package document_version_control_system;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(DocumentVersion version) {
        versions.add(version);
    }

    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public DocumentVersion getVersion(int index) {
        return versions.get(index);
    }
}