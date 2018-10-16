import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player mp3;

    @Before
    public void before(){
        mp3 = new MP3Player("LG", "musicBox");
    }

    @Test
    public void getMake() {
        assertEquals("LG", mp3.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("musicBox", mp3.getModel());
    }

    @Test
    public void getVolume(){
        assertEquals(5, mp3.getVolume());
    }

    @Test
    public void volumeUp(){
        mp3.volumeUp();
        assertEquals(6, mp3.getVolume());
    }

    @Test
    public void volumeDn(){
        mp3.volumeDn();
        assertEquals(4, mp3.getVolume());
    }
}
