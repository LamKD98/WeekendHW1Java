package members;

public class RaidLeader extends RaidMember {
    private String raidLeaderID;

    public RaidLeader(String name, String role, String raidLeaderID) {
        super(name, role);
        this.raidLeaderID = raidLeaderID;
    }

    public String getRaidLeaderID() {
        return raidLeaderID;
    }

    public void setRaidLeaderID(String raidLeaderID) {
        this.raidLeaderID = raidLeaderID;
    }

    public String leadRaid() {
        return "Leading the raid!";
    }
}

