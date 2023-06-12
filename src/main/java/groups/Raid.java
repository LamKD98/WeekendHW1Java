package groups;

import members.GuildMember;
import members.RaidLeader;
import members.RaidMember;

public class Raid {
    private RaidLeader leader;
    private RaidMember[] members;
    private GuildMember[] guildMembers;
    private Guild guild;
    private String raidNumber;
    private String raidLocation;
    private String raidTime;
    private int numberOfGuildMembers;

    public Raid(RaidLeader leader, Guild guild, String raidNumber, String raidLocation, String raidTime) {
        this.leader = leader;
        this.guild = guild;
        this.raidNumber = raidNumber;
        this.raidLocation = raidLocation;
        this.raidTime = raidTime;
        this.members = new RaidMember[10];
        this.guildMembers = new GuildMember[10];
        this.numberOfGuildMembers = 0;
    }

    public int getAvailableSlots() {
        return guild.getMemberCapacity() - numberOfGuildMembers;
    }

    public boolean recruitMember(GuildMember member) {
        if (getAvailableSlots() > 0 && numberOfGuildMembers < 10) {
            guildMembers[numberOfGuildMembers++] = member;
            return true;
        }
        return false;
    }

    public RaidLeader getLeader() {
        return leader;
    }

    public void setLeader(RaidLeader leader) {
        this.leader = leader;
    }

    public RaidMember[] getMembers() {
        return members;
    }

    public void setMembers(RaidMember[] members) {
        this.members = members;
    }

    public GuildMember[] getGuildMembers() {
        return guildMembers;
    }

    public void setGuildMembers(GuildMember[] guildMembers) {
        this.guildMembers = guildMembers;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public String getRaidNumber() {
        return raidNumber;
    }

    public void setRaidNumber(String raidNumber) {
        this.raidNumber = raidNumber;
    }

    public String getRaidLocation() {
        return raidLocation;
    }

    public void setRaidLocation(String raidLocation) {
        this.raidLocation = raidLocation;
    }

    public String getRaidTime() {
        return raidTime;
    }

    public void setRaidTime(String raidTime) {
        this.raidTime = raidTime;
    }

    public int getNumberOfGuildMembers() {
        return numberOfGuildMembers;
    }

    public void setNumberOfGuildMembers(int numberOfGuildMembers) {
        this.numberOfGuildMembers = numberOfGuildMembers;
    }
}
