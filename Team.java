import java.util.List;

//5C
public class Team {
    private int code;
    private List<Player> listplayer;
    
    public Team() {
        // no-arg constructor
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
}