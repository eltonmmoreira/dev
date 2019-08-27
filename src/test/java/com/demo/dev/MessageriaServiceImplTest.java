package com.demo.dev;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MessageriaServiceImplTest {

    @InjectMocks
    private MessageriaServiceImpl messageriaService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Message message;

    @Before
    public void setup() {
        this.message = new Message("elton", "elton", "content");
    }

    @Test
    public void sendTest() {
        MessageSendStatus send = messageriaService.send(message);
        assertEquals(Status.SEND, send.getStatus());
    }

    @Test
    public void sendTestException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("To not informed");
        messageriaService.send(new Message("elton", null, "content"));
    }

}
