package construct;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MailTest {

    @Test
    void getFrom() {
        try (var mocked = mockConstruction(Mail.class)) {
            var mail = new Mail();
            when(mail.getFrom()).thenReturn("test@");
            assertEquals("test@", mail.getFrom());
            verify(mail).getFrom();
        }
        assertEquals("info@", new Mail().getFrom());

    }
}