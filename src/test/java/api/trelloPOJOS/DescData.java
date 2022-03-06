package api.trelloPOJOS;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class DescData {

    private Emoji emoji;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public DescData() {
    }

    /**
     *
     * @param emoji
     */
    public DescData(Emoji emoji) {
        super();
        this.emoji = emoji;
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "DescData{" +
                "emoji=" + emoji +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
