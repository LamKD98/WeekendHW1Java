import groups.Guild;
import groups.Raid;
import members.GuildMember;
import members.RaidLeader;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RaidTest {
    private RaidLeader leader;
    private Guild guild;
    private Raid raid;

    @Before
    public void setup() {
        leader = new RaidLeader("Boss", "groups.Raid Leader", "ID123");
        guild = new Guild("RAID_GUILD", 10, 100);
        raid = new Raid(leader, guild, "RD756", "Orgrimmar", "10:00 AM");
    }

    @Test
    public void testCreateRaid() {
        assertEquals("RD756", raid.getRaidNumber());
        assertEquals("Orgrimmar", raid.getRaidLocation());
        assertEquals("10:00 AM", raid.getRaidTime());
        assertEquals(leader, raid.getLeader());
        assertEquals(guild, raid.getGuild());
    }

    @Test
    public void testRecruitMember() {
        GuildMember member = new GuildMember("John", 5);
        assertTrue(raid.recruitMember(member));
        assertEquals(9, raid.getAvailableSlots());
    }
}

