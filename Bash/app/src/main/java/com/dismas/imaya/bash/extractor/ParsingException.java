package com.dismas.imaya.bash.extractor;

/**
 * Created by imaya on 5/5/16.
 */
public class ParsingException extends ExtractionException {
    public ParsingException(String message) {
        super(message);
    }
    public ParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}