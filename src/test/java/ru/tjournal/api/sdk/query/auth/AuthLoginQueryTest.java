package ru.tjournal.api.sdk.query.auth;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

import static org.junit.Assert.*;

public class AuthLoginQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void test() throws ClientException, ApiException {
        AuthLoginQuery mock = Mockito.mock(AuthLoginQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.username("user").password("pass").execute()).thenReturn(new UserGetResponse());
        UserGetResponse execute = mock.username("user").password("pass").execute();
        assertNotNull(execute);

        new AuthLoginQuery(new TJApiClient("tst")).execute();
    }

}