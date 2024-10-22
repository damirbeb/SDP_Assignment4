package document_version_control_system;

public class Document {
    private String content;
    private DocumentVersion version;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocumentVersion saveVersion() {
        DocumentVersion version = new DocumentVersion(content);
        this.version = version;
        return version;
    }

    public void restoreVersion(DocumentVersion version) {
        this.content = version.getContent();
    }
}