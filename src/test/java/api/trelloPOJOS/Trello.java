package api.trelloPOJOS;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Trello {

    private Integer board;
    private Integer card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Trello() {
    }

    /**
     *
     * @param board
     * @param card
     */
    public Trello(Integer board, Integer card) {
        super();
        this.board = board;
        this.card = card;
    }

    public Integer getBoard() {
        return board;
    }

    public void setBoard(Integer board) {
        this.board = board;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Trello{" +
                "board=" + board +
                ", card=" + card +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
