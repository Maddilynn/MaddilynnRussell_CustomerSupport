//Maddilynn Russell
//April 1st 2023
//Module Four, INFO_1541_JA
public class Attachment {
    private String name; // Name of the attachment
    private byte[] contents; // Contents of the attachment as a byte array

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the contents
    public byte[] getContents() {
        return contents;
    }

    // Setter for the contents
    public void setContents(byte[] contents) {
        this.contents = contents;
    }
}
