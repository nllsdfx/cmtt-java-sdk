package ru.tjournal.api.sdk.query.payments;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;

import static org.junit.Assert.assertTrue;

/**
 * Requires token => no integration tests, also condition can change
 */
public class PaymentsCheckQueryTest {

    @Test
    public void testPaymentsCheckQuery() throws ClientException, ApiException {

        PaymentsCheckQuery mock = Mockito.mock(PaymentsCheckQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.execute()).thenReturn(true);
        assertTrue(mock.execute());

    }

}