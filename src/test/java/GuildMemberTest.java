import members.GuildMember;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuildMemberTest {
    @Test
    public void testCreateGuildMember() {
        GuildMember member = new GuildMember("John", 5);
        assertEquals("John", member.getName());
        assertEquals(5, member.getNumberOfItems());
    }
}

