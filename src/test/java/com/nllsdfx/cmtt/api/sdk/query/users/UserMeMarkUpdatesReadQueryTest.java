package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Notification;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserMeMarkUpdatesReadQueryTest {

    @Test
    public void testUserMeMarkUpdatesReadQuery() throws ClientException, ApiException {

        UserMeMarkUpdatesReadQuery mock = Mockito.mock(UserMeMarkUpdatesReadQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.ids("1").execute()).thenReturn(Collections.singletonList(new Notification()));
        List<Notification> list = mock.ids("1").execute();
        assertNotNull(list);
        assertEquals(1, list.size());
    }

}