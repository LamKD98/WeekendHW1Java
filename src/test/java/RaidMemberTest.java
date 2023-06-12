import members.RaidMember;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RaidMemberTest {
    @Test
    public void testCreateRaidMember() {
        RaidMember member = new RaidMember("Doe", "Healer");
        assertEquals("Doe", member.getName());
        assertEquals("Healer", member.getRole());
    }

    @Test
    public void testRelayStrategies() {
        RaidMember member = new RaidMember("Doe", "Healer");
        assertEquals("Strategy: Healer should stay at the back.", member.relayStrategies());
    }
}

