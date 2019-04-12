package ru.tjournal.api.sdk.query.timeline;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FlashFolderGetQuery extends QueryBuilder<FlashFolderGetQuery, List<Entry>> {

    public FlashFolderGetQuery(TJApiClient client) {
        super(client, "getflashholdedentry", Utils.buildParametrizedType(List.class, Entry.class));
    }

    @Override
    protected FlashFolderGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
