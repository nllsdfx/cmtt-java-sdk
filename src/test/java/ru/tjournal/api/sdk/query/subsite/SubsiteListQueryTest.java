package ru.tjournal.api.sdk.query.subsite;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.Subsite;
import ru.tjournal.api.sdk.model.SubsiteType;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class SubsiteListQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Subsite> subsites = client.subsites().list().type(SubsiteType.SECTIONS).execute();
        assertNotNull(subsites);
        assertFalse(subsites.isEmpty());
    }

}