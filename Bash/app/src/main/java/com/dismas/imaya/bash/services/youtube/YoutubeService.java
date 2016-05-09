package com.dismas.imaya.bash.services.youtube;

import com.dismas.imaya.bash.extractor.Downloader;
import com.dismas.imaya.bash.extractor.ExtractionException;
import com.dismas.imaya.bash.extractor.SearchEngine;
import com.dismas.imaya.bash.extractor.StreamExtractor;
import com.dismas.imaya.bash.extractor.StreamUrlIdHandler;
import com.dismas.imaya.bash.extractor.StreamingService;

import java.io.IOException;

/**
 * Created by imaya on 5/10/16.
 */
public class YoutubeService extends StreamingService {

    public YoutubeService(int id) {
        super(id);
    }

    @Override
    public ServiceInfo getServiceInfo() {
        ServiceInfo serviceInfo = new ServiceInfo();
        serviceInfo.name = "Youtube";
        return serviceInfo;
    }
    @Override
    public StreamExtractor getExtractorInstance(String url, Downloader downloader)
            throws ExtractionException, IOException {
        StreamUrlIdHandler urlIdHandler = new YoutubeStreamUrlIdHandler();
        if(urlIdHandler.acceptUrl(url)) {
            return new YoutubeStreamExtractor(url, downloader, getServiceId());
        }
        else {
            throw new IllegalArgumentException("supplied String is not a valid Youtube URL");
        }
    }
    @Override
    public SearchEngine getSearchEngineInstance(Downloader downloader) {
        return new YoutubeSearchEngine(getUrlIdHandlerInstance(), getServiceId());
    }

    @Override
    public StreamUrlIdHandler getUrlIdHandlerInstance() {
        return new YoutubeStreamUrlIdHandler();
    }
}