package onlymethod;

import org.junit.jupiter.api.Test;
import org.mockito.MockSettings;
import org.mockito.invocation.InvocationOnMock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MailTest {

    @Test
    void testToString() {
        var mail = spy(Mail.class);
        when(mail.getPrefix()).thenReturn("test: ");
        assertEquals("test: info@", mail.toString());
    }
}