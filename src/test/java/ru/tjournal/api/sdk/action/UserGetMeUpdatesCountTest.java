package ru.tjournal.api.sdk.action;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.Count;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserGetMeUpdatesCountTest {


    @Test
    public void testUserGetMeUpdatesCount() throws ClientException, ApiException {
        UserGetMeUpdatesCount mock = Mockito.mock(UserGetMeUpdatesCount.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.execute()).thenReturn(new Count());
        Count execute = mock.execute();
        assertNotNull(execute);
        assertEquals(0, execute.getCount());
    }
}