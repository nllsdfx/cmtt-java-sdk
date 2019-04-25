package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Subsite;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UserGetMeRecommendedSubscriptionsQueryTest {

    @Test
    public void integration() throws ClientException, ApiException {

        UserGetMeRecommendedSubscriptionsQuery mock = Mockito.mock(UserGetMeRecommendedSubscriptionsQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(mock.execute()).thenReturn(Collections.singletonList(new Subsite()));

        List<Subsite> execute = mock.execute();
        assertNotNull(execute);
        assertFalse(execute.isEmpty());

    }

}