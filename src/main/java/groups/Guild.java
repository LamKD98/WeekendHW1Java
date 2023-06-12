package groups;

public class Guild {
    private String guildType;
    private int memberCapacity;
    private int totalItemCapacity;

    public Guild(String guildType, int memberCapacity, int totalItemCapacity) {
        this.guildType = guildType;
        this.memberCapacity = memberCapacity;
        this.totalItemCapacity = totalItemCapacity;
    }

    public String getGuildType() {
        return guildType;
    }

    public void setGuildType(String guildType) {
        this.guildType = guildType;
    }

    public int getMemberCapacity() {
        return memberCapacity;
    }

    public void setMemberCapacity(int memberCapacity) {
        this.memberCapacity = memberCapacity;
    }

    public int getTotalItemCapacity() {
        return totalItemCapacity;
    }

    public void setTotalItemCapacity(int totalItemCapacity) {
        this.totalItemCapacity = totalItemCapacity;
    }

}

