package com.dismas.imaya.bash.extractor;

/**
 * Created by imaya on 5/5/16.
 */
public interface StreamUrlIdHandler {
    String getVideoUrl(String videoId);
    String getVideoId(String siteUrl) throws ParsingException;
    String cleanUrl(String siteUrl) throws ParsingException;

    /**When a VIEW_ACTION is caught this function will test if the url delivered within the calling
     Intent was meant to be watched with this Service.
     Return false if this service shall not allow to be called through ACTIONs.*/
    boolean acceptUrl(String videoUrl);
}
