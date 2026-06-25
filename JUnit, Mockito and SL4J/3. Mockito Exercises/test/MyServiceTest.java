//Exercise 1
package org.example;

import org.mockito.InOrder;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    //Exercise 2
    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }

    //Exercise 3
    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.sendData("Hello");

        verify(mockApi).sendData(eq("Hello"));
    }

    //Exercise 4
    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).sendData(anyString());

        MyService service = new MyService(mockApi);

        service.sendData("Test");

        verify(mockApi).sendData("Test");
    }

    //Exercise 5
    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());
        assertEquals("Third", service.fetchData());
    }

    //Exercise 6

    @Test
    void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();
        service.sendData("A");

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).getData();
        order.verify(mockApi).sendData("A");
    }

    //Exercise 7
    @Test
    void testVoidException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("API failed"))
                .when(mockApi).sendData("bad");

        MyService service = new MyService(mockApi);

        try {
            service.sendData("bad");
        } catch (RuntimeException e) {
            assertEquals("API failed", e.getMessage());
        }

        verify(mockApi).sendData("bad");
    }
}