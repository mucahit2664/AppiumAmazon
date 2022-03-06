package api.trelloPOJOS;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Cover {

    private Object idAttachment;
    private Object color;
    private Object idUploadedBackground;
    private String size;
    private String brightness;
    private Object idPlugin;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Cover() {
    }

    /**
     *
     * @param idUploadedBackground
     * @param brightness
     * @param color
     * @param size
     * @param idAttachment
     * @param idPlugin
     */
    public Cover(Object idAttachment, Object color, Object idUploadedBackground, String size, String brightness, Object idPlugin) {
        super();
        this.idAttachment = idAttachment;
        this.color = color;
        this.idUploadedBackground = idUploadedBackground;
        this.size = size;
        this.brightness = brightness;
        this.idPlugin = idPlugin;
    }

    public Object getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Object idAttachment) {
        this.idAttachment = idAttachment;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public Object getIdUploadedBackground() {
        return idUploadedBackground;
    }

    public void setIdUploadedBackground(Object idUploadedBackground) {
        this.idUploadedBackground = idUploadedBackground;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public Object getIdPlugin() {
        return idPlugin;
    }

    public void setIdPlugin(Object idPlugin) {
        this.idPlugin = idPlugin;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Cover{" +
                "idAttachment=" + idAttachment +
                ", color=" + color +
                ", idUploadedBackground=" + idUploadedBackground +
                ", size='" + size + '\'' +
                ", brightness='" + brightness + '\'' +
                ", idPlugin=" + idPlugin +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
