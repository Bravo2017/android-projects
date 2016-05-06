package com.dismas.imaya.bash.extractor;

/**
 * Created by imaya on 5/5/16.
 */
public interface StreamPreviewInfoExtractor {
    AbstractVideoInfo.StreamType getStreamType() throws ParsingException;
    String getWebPageUrl() throws ParsingException;
    String getTitle() throws ParsingException;
    int getDuration() throws ParsingException;
    String getUploader() throws ParsingException;
    String getUploadDate() throws ParsingException;
    long getViewCount() throws  ParsingException;
    String getThumbnailUrl() throws  ParsingException;
}
