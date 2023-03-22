package staticmethod;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

class MailTest {

    @Test
    void createMail() {
        try (var mocked = mockStatic(Mail.class)) {

            mocked.when(Mail::createMail).thenReturn(new Mail("test@"));
            assertEquals("test@", Mail.createMail().getFrom());
            mocked.verify(Mail::createMail);
        }
        assertEquals("info@", Mail.createMail().getFrom());
    }
}