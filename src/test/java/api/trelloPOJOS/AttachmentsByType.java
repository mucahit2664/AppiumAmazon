package api.trelloPOJOS;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class AttachmentsByType {

    private Trello trello;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public AttachmentsByType() {
    }

    /**
     *
     * @param trello
     */
    public AttachmentsByType(Trello trello) {
        super();
        this.trello = trello;
    }

    public Trello getTrello() {
        return trello;
    }

    public void setTrello(Trello trello) {
        this.trello = trello;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "AttachmentsByType{" +
                "trello=" + trello +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

