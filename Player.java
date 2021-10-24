public class Player {
    private String name;
    private Role role;
    private int team;

    public Player(Role pRole,int pTeam){
        this.role=pRole;
        this.team = pTeam;
    }

    public Player(String pName){
        this.name=pName;
    }

    public Role getRole() {
        return role;
    }

    public int getTeam() {
        return team;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setTeam(int team) {
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
