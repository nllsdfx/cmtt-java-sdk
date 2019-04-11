package ru.tjournal.api.sdk.query.tweets;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.tweets.Tweet;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TweetsGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTweetsGetQueryTest() throws ClientException, ApiException {
        TweetsGetQuery mock = Mockito.mock(TweetsGetQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.mode("fresh").execute()).thenReturn(Collections.emptyList());
        List<Tweet> fresh = mock.mode("fresh").execute();
        assertNotNull(fresh);

        new TweetsGetQuery(new TJApiClient("test")).execute();
    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Tweet> tweets = client.tweets().get().mode("fresh").execute();
        assertNotNull(tweets);
        assertFalse(tweets.isEmpty());

        for (Tweet tweet : tweets) {
            assertNotNull(tweet.getId());
            assertNotNull(tweet.getText());
            assertNotNull(tweet.getUser());
        }
    }

}