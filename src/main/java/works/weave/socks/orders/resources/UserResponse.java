package works.weave.socks.orders.resources;

public class UserResponse {
    String id;

    public UserResponse(){

    }

    public UserResponse(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
