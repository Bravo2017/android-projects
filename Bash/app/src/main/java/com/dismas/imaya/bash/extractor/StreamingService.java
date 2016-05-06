package com.dismas.imaya.bash.extractor;

import java.io.IOException;

/**
 * Created by imaya on 5/5/16.
 */
public abstract class StreamingService {
    public class ServiceInfo {
        public String name = "";
    }

    private int serviceId;

    public StreamingService(int id) {
        serviceId = id;
    }

    public abstract ServiceInfo getServiceInfo();

    public abstract StreamExtractor getExtractorInstance(String url, Downloader downloader)
            throws IOException, ExtractionException;
    public abstract SearchEngine getSearchEngineInstance(Downloader downloader);
    public abstract StreamUrlIdHandler getUrlIdHandlerInstance();

    public final int getServiceId() {
        return serviceId;
    }
}