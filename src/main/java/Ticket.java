import java.util.ArrayList;
import java.util.HashMap;

public class Ticket {
    private String customerName; // Customer's name
    private String subject; // Subject of the ticket
    private String body; // Body of the ticket
    private HashMap<Integer, Attachment> attachments; // Attachments of the ticket using a HashMap

    // Default constructor
    public Ticket() {
        // Initialize attachments HashMap
        this.attachments = new HashMap<>();
    }

    // Constructor with all fields
    public Ticket(String customerName, String subject, String body, HashMap<Integer, Attachment> attachments) {
        this.customerName = customerName;
        this.subject = subject;
        this.body = body;
        this.attachments = attachments;
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // Setter for customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for body
    public String getBody() {
        return body;
    }

    // Setter for body
    public void setBody(String body) {
        this.body = body;
    }

    // Getter for attachments
    public HashMap<Integer, Attachment> getAttachments() {
        return attachments;
    }

    // Setter for attachments
    public void setAttachments(HashMap<Integer, Attachment> attachments) {
        this.attachments = attachments;
    }

    // Helper method to add an attachment to the ticket
    public void addAttachment(int index, Attachment attachment) {
        attachments.put(index, attachment);
    }

    // Helper method to get the number of attachments
    public int getNumberOfAttachments() {
        return attachments.size();
    }

    // Helper method to get a specific attachment by index
    public Attachment getAttachment(int index) {
        return attachments.get(index);
    }

    // Helper method to get all attachments as an ArrayList
    public ArrayList<Attachment> getAllAttachments() {
        return new ArrayList<>(attachments.values());
    }
}
