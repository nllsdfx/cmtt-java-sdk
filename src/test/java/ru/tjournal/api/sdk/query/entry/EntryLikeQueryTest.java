package ru.tjournal.api.sdk.query.entry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.LikeType;
import ru.tjournal.api.sdk.model.Likes;
import ru.tjournal.api.sdk.model.Sign;

public class EntryLikeQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEntryLikeQuery() throws ClientException, ApiException {
        EntryLikeQuery mock = Mockito.mock(EntryLikeQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.id("1").type(LikeType.CONTENT).sign(Sign.UP).execute()).thenReturn(new Likes());
        Likes likes = mock.id("1").type(LikeType.CONTENT).sign(Sign.UP).execute();
        Assert.assertNotNull(likes);

        new EntryLikeQuery(new TJApiClient("test")).execute();
    }

}