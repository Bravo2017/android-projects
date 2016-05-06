package com.dismas.imaya.bash.extractor;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

/**
 * Created by imaya on 5/5/16.
 */
public class SearchResult {
    public static SearchResult getSearchResult(SearchEngine engine, String query,
                                               int page, String languageCode, Downloader dl)
            throws ExtractionException, IOException {

        SearchResult result = engine.search(query, page, languageCode, dl).getSearchResult();
        if(result.resultList.isEmpty()) {
            if(result.suggestion.isEmpty()) {
                throw new ExtractionException("Empty result despite no error");
            } else {
                // This is used as a fallback. Do not relay on it !!!
                throw new SearchEngine.NothingFoundException(result.suggestion);
            }
        }
        return result;
    }

    public String suggestion = "";
    public final List<StreamPreviewInfo> resultList = new Vector<>();
    public List<Exception> errors = new Vector<>();
}