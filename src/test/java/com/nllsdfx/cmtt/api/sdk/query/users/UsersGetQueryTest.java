package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.users.UserGetResponse;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class UsersGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testUserGetQuery() throws ClientException, ApiException {

        UsersGetQuery query = Mockito.mock(UsersGetQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(query.by("1").execute()).thenReturn(new UserGetResponse());

        UserGetResponse response = query.by("1").execute();

        assertNotNull(response);

        // must throw exception
        new UsersGetQuery(new TJApiClient("test")).execute();

    }

    @Test
    @Category(IntegrationTest.class)
    public void testUserGetQueryIntegration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test_token");

        UserGetResponse response = client.users().get().by("2").execute();

        assertNotNull(response);
        assertEquals("2", response.getId());
        assertEquals("Никита Лихачёв", response.getName());

    }

}