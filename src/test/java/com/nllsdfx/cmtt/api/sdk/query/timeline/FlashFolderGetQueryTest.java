package com.nllsdfx.cmtt.api.sdk.query.timeline;

import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FlashFolderGetQueryTest {

    @Test
    public void testFlashFolderGetQuery() throws ClientException, ApiException {
        FlashFolderGetQuery mock = Mockito.mock(FlashFolderGetQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.execute()).thenReturn(Collections.singletonList(new Entry()));
        List<Entry> list = mock.execute();
        assertNotNull(list);
        assertEquals(1, list.size());
    }

}