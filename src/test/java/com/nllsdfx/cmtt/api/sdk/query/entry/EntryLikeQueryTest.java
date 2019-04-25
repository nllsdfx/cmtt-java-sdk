package com.nllsdfx.cmtt.api.sdk.query.entry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.LikeType;
import com.nllsdfx.cmtt.api.sdk.model.Likes;
import com.nllsdfx.cmtt.api.sdk.model.Sign;

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