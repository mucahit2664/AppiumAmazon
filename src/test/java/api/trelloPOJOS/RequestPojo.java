package api.trelloPOJOS;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class RequestPojo {

    private List<Object> attachments = null;
    private String id;
    private Badges badges;
    private List<Object> checkItemStates = null;
    private Boolean closed;
    private Boolean dueComplete;
    private String dateLastActivity;
    private String desc;
    private DescData descData;
    private Object due;
    private Object dueReminder;
    private Object email;
    private String idBoard;
    private List<Object> idChecklists = null;
    private String idList;
    private List<Object> idMembers = null;
    private List<Object> idMembersVoted = null;
    private Integer idShort;
    private Object idAttachmentCover;
    private List<Object> labels = null;
    private List<Object> idLabels = null;
    private Boolean manualCoverAttachment;
    private String name;
    private Integer pos;
    private String shortLink;
    private String shortUrl;
    private Object start;
    private Boolean subscribed;
    private String url;
    private Cover cover;
    private Boolean isTemplate;
    private Object cardRole;
    private List<Object> stickers = null;
    private Limits limits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public RequestPojo() {
    }

    /**
     *
     * @param descData
     * @param attachments
     * @param idLabels
     * @param shortUrl
     * @param dueComplete
     * @param dateLastActivity
     * @param idList
     * @param idMembersVoted
     * @param shortLink
     * @param cover
     * @param dueReminder
     * @param subscribed
     * @param pos
     * @param idChecklists
     * @param stickers
     * @param id
     * @param email
     * @param limits
     * @param idBoard
     * @param cardRole
     * @param start
     * @param checkItemStates
     * @param url
     * @param labels
     * @param badges
     * @param idMembers
     * @param idShort
     * @param due
     * @param idAttachmentCover
     * @param isTemplate
     * @param name
     * @param closed
     * @param manualCoverAttachment
     * @param desc
     */
    public RequestPojo(List<Object> attachments, String id, Badges badges, List<Object> checkItemStates, Boolean closed, Boolean dueComplete, String dateLastActivity, String desc, DescData descData, Object due, Object dueReminder, Object email, String idBoard, List<Object> idChecklists, String idList, List<Object> idMembers, List<Object> idMembersVoted, Integer idShort, Object idAttachmentCover, List<Object> labels, List<Object> idLabels, Boolean manualCoverAttachment, String name, Integer pos, String shortLink, String shortUrl, Object start, Boolean subscribed, String url, Cover cover, Boolean isTemplate, Object cardRole, List<Object> stickers, Limits limits) {
        super();
        this.attachments = attachments;
        this.id = id;
        this.badges = badges;
        this.checkItemStates = checkItemStates;
        this.closed = closed;
        this.dueComplete = dueComplete;
        this.dateLastActivity = dateLastActivity;
        this.desc = desc;
        this.descData = descData;
        this.due = due;
        this.dueReminder = dueReminder;
        this.email = email;
        this.idBoard = idBoard;
        this.idChecklists = idChecklists;
        this.idList = idList;
        this.idMembers = idMembers;
        this.idMembersVoted = idMembersVoted;
        this.idShort = idShort;
        this.idAttachmentCover = idAttachmentCover;
        this.labels = labels;
        this.idLabels = idLabels;
        this.manualCoverAttachment = manualCoverAttachment;
        this.name = name;
        this.pos = pos;
        this.shortLink = shortLink;
        this.shortUrl = shortUrl;
        this.start = start;
        this.subscribed = subscribed;
        this.url = url;
        this.cover = cover;
        this.isTemplate = isTemplate;
        this.cardRole = cardRole;
        this.stickers = stickers;
        this.limits = limits;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DescData getDescData() {
        return descData;
    }

    public void setDescData(DescData descData) {
        this.descData = descData;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Object getDueReminder() {
        return dueReminder;
    }

    public void setDueReminder(Object dueReminder) {
        this.dueReminder = dueReminder;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public List<Object> getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(List<Object> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Object> getIdMembersVoted() {
        return idMembersVoted;
    }

    public void setIdMembersVoted(List<Object> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    public Integer getIdShort() {
        return idShort;
    }

    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    public Object getIdAttachmentCover() {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover(Object idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public List<Object> getIdLabels() {
        return idLabels;
    }

    public void setIdLabels(List<Object> idLabels) {
        this.idLabels = idLabels;
    }

    public Boolean getManualCoverAttachment() {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Object getCardRole() {
        return cardRole;
    }

    public void setCardRole(Object cardRole) {
        this.cardRole = cardRole;
    }

    public List<Object> getStickers() {
        return stickers;
    }

    public void setStickers(List<Object> stickers) {
        this.stickers = stickers;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "attachments=" + attachments +
                ", id='" + id + '\'' +
                ", badges=" + badges +
                ", checkItemStates=" + checkItemStates +
                ", closed=" + closed +
                ", dueComplete=" + dueComplete +
                ", dateLastActivity='" + dateLastActivity + '\'' +
                ", desc='" + desc + '\'' +
                ", descData=" + descData +
                ", due=" + due +
                ", dueReminder=" + dueReminder +
                ", email=" + email +
                ", idBoard='" + idBoard + '\'' +
                ", idChecklists=" + idChecklists +
                ", idList='" + idList + '\'' +
                ", idMembers=" + idMembers +
                ", idMembersVoted=" + idMembersVoted +
                ", idShort=" + idShort +
                ", idAttachmentCover=" + idAttachmentCover +
                ", labels=" + labels +
                ", idLabels=" + idLabels +
                ", manualCoverAttachment=" + manualCoverAttachment +
                ", name='" + name + '\'' +
                ", pos=" + pos +
                ", shortLink='" + shortLink + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", start=" + start +
                ", subscribed=" + subscribed +
                ", url='" + url + '\'' +
                ", cover=" + cover +
                ", isTemplate=" + isTemplate +
                ", cardRole=" + cardRole +
                ", stickers=" + stickers +
                ", limits=" + limits +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
