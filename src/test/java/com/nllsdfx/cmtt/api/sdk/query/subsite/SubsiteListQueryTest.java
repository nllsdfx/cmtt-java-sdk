package com.nllsdfx.cmtt.api.sdk.query.subsite;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Subsite;
import com.nllsdfx.cmtt.api.sdk.model.SubsiteType;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

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