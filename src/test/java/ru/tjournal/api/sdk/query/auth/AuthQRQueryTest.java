package ru.tjournal.api.sdk.query.auth;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

import static org.junit.Assert.*;

public class AuthQRQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void test() throws ClientException, ApiException {

        AuthQRQuery mock = Mockito.mock(AuthQRQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(mock.token("1234").execute()).thenReturn(new UserGetResponse());

        UserGetResponse execute = mock.token("1234").execute();
        assertNotNull(execute);

        new AuthQRQuery(new TJApiClient("test")).execute();
    }

}