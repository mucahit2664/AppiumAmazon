package api.trelloPOJOS;

public class FirstRequestPojo {

    private String idList;
    private String key;
    private String token;
    private String name;

    public FirstRequestPojo() {
    }

    public FirstRequestPojo(String idList, String key, String token, String name) {
        this.idList = idList;
        this.key = key;
        this.token = token;
        this.name = name;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "idList='" + idList + '\'' +
                ", key='" + key + '\'' +
                ", token='" + token + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
