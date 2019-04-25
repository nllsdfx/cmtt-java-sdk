package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Notification;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class UserGetMeUpdatesTest {

    @Test
    public void testUserGetMeUpdates() throws ClientException, ApiException {
        UserGetMeUpdates mock = Mockito.mock(UserGetMeUpdates.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.execute()).thenReturn(Collections.singletonList(new Notification()));
        List<Notification> execute = mock.execute();
        assertNotNull(execute);
        assertNotNull(execute.get(0));

    }


}