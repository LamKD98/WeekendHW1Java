import members.RaidLeader;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RaidLeaderTest {
    @Test
    public void testCreateRaidLeader() {
        RaidLeader leader = new RaidLeader("Boss", "groups.Raid Leader", "ID123");
        assertEquals("Boss", leader.getName());
        assertEquals("groups.Raid Leader", leader.getRole());
        assertEquals("ID123", leader.getRaidLeaderID());
    }

    @Test
    public void testLeadRaid() {
        RaidLeader leader = new RaidLeader("Boss", "groups.Raid Leader", "ID123");
        assertEquals("Leading the raid!", leader.leadRaid());
    }
}

