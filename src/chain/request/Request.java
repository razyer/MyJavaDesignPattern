package chain.request;

/**
 * @author tanzhen
 * @date 2018/9/5
 */
public class Request {
    public static final String SPAM_TYPE = "SpamType";
    public static final String FAN_TYPE = "FanType";
    public static final String COMPLAINT_TYPE = "ComplaintType";
    public static final String NEW_LOCATION_TYPE = "NewLocationType";

    private String type;
    private String description;

    public Request(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
