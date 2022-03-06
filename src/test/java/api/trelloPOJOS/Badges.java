package api.trelloPOJOS;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Badges {

    private AttachmentsByType attachmentsByType;
    private Boolean location;
    private Integer votes;
    private Boolean viewingMemberVoted;
    private Boolean subscribed;
    private String fogbugz;
    private Integer checkItems;
    private Integer checkItemsChecked;
    private Object checkItemsEarliestDue;
    private Integer comments;
    private Integer attachments;
    private Boolean description;
    private Object due;
    private Boolean dueComplete;
    private Object start;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Badges() {
    }

    /**
     *
     * @param comments
     * @param attachments
     * @param attachmentsByType
     * @param dueComplete
     * @param start
     * @param description
     * @param checkItemsEarliestDue
     * @param subscribed
     * @param due
     * @param viewingMemberVoted
     * @param location
     * @param votes
     * @param fogbugz
     * @param checkItems
     * @param checkItemsChecked
     */
    public Badges(AttachmentsByType attachmentsByType, Boolean location, Integer votes, Boolean viewingMemberVoted, Boolean subscribed, String fogbugz, Integer checkItems, Integer checkItemsChecked, Object checkItemsEarliestDue, Integer comments, Integer attachments, Boolean description, Object due, Boolean dueComplete, Object start) {
        super();
        this.attachmentsByType = attachmentsByType;
        this.location = location;
        this.votes = votes;
        this.viewingMemberVoted = viewingMemberVoted;
        this.subscribed = subscribed;
        this.fogbugz = fogbugz;
        this.checkItems = checkItems;
        this.checkItemsChecked = checkItemsChecked;
        this.checkItemsEarliestDue = checkItemsEarliestDue;
        this.comments = comments;
        this.attachments = attachments;
        this.description = description;
        this.due = due;
        this.dueComplete = dueComplete;
        this.start = start;
    }

    public AttachmentsByType getAttachmentsByType() {
        return attachmentsByType;
    }

    public void setAttachmentsByType(AttachmentsByType attachmentsByType) {
        this.attachmentsByType = attachmentsByType;
    }

    public Boolean getLocation() {
        return location;
    }

    public void setLocation(Boolean location) {
        this.location = location;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Boolean getViewingMemberVoted() {
        return viewingMemberVoted;
    }

    public void setViewingMemberVoted(Boolean viewingMemberVoted) {
        this.viewingMemberVoted = viewingMemberVoted;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getFogbugz() {
        return fogbugz;
    }

    public void setFogbugz(String fogbugz) {
        this.fogbugz = fogbugz;
    }

    public Integer getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(Integer checkItems) {
        this.checkItems = checkItems;
    }

    public Integer getCheckItemsChecked() {
        return checkItemsChecked;
    }

    public void setCheckItemsChecked(Integer checkItemsChecked) {
        this.checkItemsChecked = checkItemsChecked;
    }

    public Object getCheckItemsEarliestDue() {
        return checkItemsEarliestDue;
    }

    public void setCheckItemsEarliestDue(Object checkItemsEarliestDue) {
        this.checkItemsEarliestDue = checkItemsEarliestDue;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getAttachments() {
        return attachments;
    }

    public void setAttachments(Integer attachments) {
        this.attachments = attachments;
    }

    public Boolean getDescription() {
        return description;
    }

    public void setDescription(Boolean description) {
        this.description = description;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Badges{" +
                "attachmentsByType=" + attachmentsByType +
                ", location=" + location +
                ", votes=" + votes +
                ", viewingMemberVoted=" + viewingMemberVoted +
                ", subscribed=" + subscribed +
                ", fogbugz='" + fogbugz + '\'' +
                ", checkItems=" + checkItems +
                ", checkItemsChecked=" + checkItemsChecked +
                ", checkItemsEarliestDue=" + checkItemsEarliestDue +
                ", comments=" + comments +
                ", attachments=" + attachments +
                ", description=" + description +
                ", due=" + due +
                ", dueComplete=" + dueComplete +
                ", start=" + start +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
