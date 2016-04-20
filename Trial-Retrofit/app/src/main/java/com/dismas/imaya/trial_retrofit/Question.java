
        package com.dismas.imaya.trial_retrofit;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;


public class Question {

    @SerializedName("blocked_date")
    @Expose
    private String blockedDate;
    @SerializedName("media_name")
    @Expose
    private String mediaName;
    @SerializedName("media_bucket")
    @Expose
    private String mediaBucket;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("blocked_story")
    @Expose
    private Boolean blockedStory;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("intro")
    @Expose
    private String intro;
    @SerializedName("media_type")
    @Expose
    private String mediaType;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("story_id")
    @Expose
    private String storyId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("media_url")
    @Expose
    private String mediaUrl;

    /**
     *
     * @return
     * The blockedDate
     */
    public String getBlockedDate() {
        return blockedDate;
    }

    /**
     *
     * @param blockedDate
     * The blocked_date
     */
    public void setBlockedDate(String blockedDate) {
        this.blockedDate = blockedDate;
    }

    /**
     *
     * @return
     * The mediaName
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     *
     * @param mediaName
     * The media_name
     */
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    /**
     *
     * @return
     * The mediaBucket
     */
    public String getMediaBucket() {
        return mediaBucket;
    }

    /**
     *
     * @param mediaBucket
     * The media_bucket
     */
    public void setMediaBucket(String mediaBucket) {
        this.mediaBucket = mediaBucket;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     * The timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     * The blockedStory
     */
    public Boolean getBlockedStory() {
        return blockedStory;
    }

    /**
     *
     * @param blockedStory
     * The blocked_story
     */
    public void setBlockedStory(Boolean blockedStory) {
        this.blockedStory = blockedStory;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     *
     * @param sessionId
     * The session_id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     *
     * @return
     * The intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     *
     * @param intro
     * The intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     *
     * @return
     * The mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     *
     * @param mediaType
     * The media_type
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The storyId
     */
    public String getStoryId() {
        return storyId;
    }

    /**
     *
     * @param storyId
     * The story_id
     */
    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The Id
     */
    public String getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     *
     * @param shortUrl
     * The short_url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     *
     * @return
     * The resourceUri
     */
    public String getResourceUri() {
        return resourceUri;
    }

    /**
     *
     * @param resourceUri
     * The resource_uri
     */
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     *
     * @return
     * The mediaUrl
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     *
     * @param mediaUrl
     * The media_url
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                '}';
    }
}