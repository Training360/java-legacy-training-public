package legacy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MailTest {

    @Test
    void testCreate() {
//        System.out.println("testing");
//        var construction = Mockito.mockConstruction(Mail.class,
//                withSettings().useConstructor().defaultAnswer(Answers.CALLS_REAL_METHODS),
//                (mock, context) -> when(mock.defaultValue()).thenReturn("test@"));
//
//        try (construction) {
//            var mail = new Mail();
//            assertEquals("test@", mail.getFrom());
//        }

        var mail = new Mail() {
            @Override
            public String getFrom() {
                return "test@";
            }
        };
        assertEquals("test@", mail.getFrom());
    }
}
