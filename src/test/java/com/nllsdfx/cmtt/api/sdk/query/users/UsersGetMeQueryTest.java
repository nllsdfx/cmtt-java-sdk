package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.users.UserGetResponse;

import static org.junit.Assert.assertNotNull;

/**
 * Requires token so only unit test implemented
 */
public class UsersGetMeQueryTest {

    @Test
    public void testGetMe() throws ClientException, ApiException {

        UsersGetMeQuery mock = Mockito.mock(UsersGetMeQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.execute()).thenReturn(new UserGetResponse());
        UserGetResponse response = mock.execute();
        assertNotNull(response);

    }

}