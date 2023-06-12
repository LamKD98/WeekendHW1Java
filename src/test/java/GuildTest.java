import groups.Guild;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuildTest {
    @Test
    public void testCreateGuild() {
        Guild guild = new Guild("RAID_GUILD", 10, 100);
        assertEquals("RAID_GUILD", guild.getGuildType());
        assertEquals(10, guild.getMemberCapacity());
        assertEquals(100, guild.getTotalItemCapacity());
    }
}
