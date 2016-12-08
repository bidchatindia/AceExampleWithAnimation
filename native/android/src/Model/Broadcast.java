package com.rahulverlekar.nativelist.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Broadcast
{
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("profile_description")
    @Expose
    private String profileDescription;
    @SerializedName("nick_name")
    @Expose
    private String nickName;
    @SerializedName("cover_photo")
    @Expose
    private String coverPhoto;
    @SerializedName("profile_photo_thumb")
    @Expose
    private String profilePhotoThumb;
    @SerializedName("profile_photo")
    @Expose
    private String profilePhoto;
    @SerializedName("poi_follow_count")
    @Expose
    private String poiFollowCount;
    @SerializedName("poi_following_count")
    @Expose
    private String poiFollowingCount;
    @SerializedName("poi_profile_url")
    @Expose
    private String poiProfileUrl;
    @SerializedName("optional_url")
    @Expose
    private String optionalUrl;
    @SerializedName("verified")
    @Expose
    private String verified;
    @SerializedName("event_id")
    @Expose
    private String eventId;
    @SerializedName("is_online")
    @Expose
    private String isOnline;
    @SerializedName("hash_tag1")
    @Expose
    private String hashTag1;
    @SerializedName("hash_tag2")
    @Expose
    private String hashTag2;
    @SerializedName("viewers_count")
    @Expose
    private String viewersCount;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("take_caller")
    @Expose
    private String takeCaller;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("thumb_image_url")
    @Expose
    private String thumbImageUrl;
    @SerializedName("thumb_image_url_web")
    @Expose
    private String thumbImageUrlWeb;
    @SerializedName("event_comment")
    @Expose
    private String eventComment;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("poi_follows")
    @Expose
    private String poiFollows;
    @SerializedName("poi_influencer_score")
    @Expose
    private String poiInfluencerScore;
    @SerializedName("is_video")
    @Expose
    private String isVideo;
    @SerializedName("is_product")
    @Expose
    private String isProduct;
    @SerializedName("is_profile")
    @Expose
    private String isProfile;
    @SerializedName("is_featured")
    @Expose
    private String isFeatured;
    @SerializedName("is_spotlight")
    @Expose
    private String isSpotlight;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The profileDescription
     */
    public String getProfileDescription() {
        return profileDescription;
    }

    /**
     *
     * @param profileDescription
     * The profile_description
     */
    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    /**
     *
     * @return
     * The nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     *
     * @param nickName
     * The nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     *
     * @return
     * The coverPhoto
     */
    public String getCoverPhoto() {
        return coverPhoto;
    }

    /**
     *
     * @param coverPhoto
     * The cover_photo
     */
    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    /**
     *
     * @return
     * The profilePhotoThumb
     */
    public String getProfilePhotoThumb() {
        return profilePhotoThumb;
    }

    /**
     *
     * @param profilePhotoThumb
     * The profile_photo_thumb
     */
    public void setProfilePhotoThumb(String profilePhotoThumb) {
        this.profilePhotoThumb = profilePhotoThumb;
    }

    /**
     *
     * @return
     * The profilePhoto
     */
    public String getProfilePhoto() {
        return profilePhoto;
    }

    /**
     *
     * @param profilePhoto
     * The profile_photo
     */
    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    /**
     *
     * @return
     * The poiFollowCount
     */
    public String getPoiFollowCount() {
        return poiFollowCount;
    }

    /**
     *
     * @param poiFollowCount
     * The poi_follow_count
     */
    public void setPoiFollowCount(String poiFollowCount) {
        this.poiFollowCount = poiFollowCount;
    }

    /**
     *
     * @return
     * The poiFollowingCount
     */
    public String getPoiFollowingCount() {
        return poiFollowingCount;
    }

    /**
     *
     * @param poiFollowingCount
     * The poi_following_count
     */
    public void setPoiFollowingCount(String poiFollowingCount) {
        this.poiFollowingCount = poiFollowingCount;
    }

    /**
     *
     * @return
     * The poiProfileUrl
     */
    public String getPoiProfileUrl() {
        return poiProfileUrl;
    }

    /**
     *
     * @param poiProfileUrl
     * The poi_profile_url
     */
    public void setPoiProfileUrl(String poiProfileUrl) {
        this.poiProfileUrl = poiProfileUrl;
    }

    /**
     *
     * @return
     * The optionalUrl
     */
    public String getOptionalUrl() {
        return optionalUrl;
    }

    /**
     *
     * @param optionalUrl
     * The optional_url
     */
    public void setOptionalUrl(String optionalUrl) {
        this.optionalUrl = optionalUrl;
    }

    /**
     *
     * @return
     * The verified
     */
    public String getVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     * The verified
     */
    public void setVerified(String verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     * The eventId
     */
    public String getEventId() {
        return eventId;
    }

    /**
     *
     * @param eventId
     * The event_id
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     *
     * @return
     * The isOnline
     */
    public String getIsOnline() {
        return isOnline;
    }

    /**
     *
     * @param isOnline
     * The is_online
     */
    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    /**
     *
     * @return
     * The hashTag1
     */
    public String getHashTag1() {
        return hashTag1;
    }

    /**
     *
     * @param hashTag1
     * The hash_tag1
     */
    public void setHashTag1(String hashTag1) {
        this.hashTag1 = hashTag1;
    }

    /**
     *
     * @return
     * The hashTag2
     */
    public String getHashTag2() {
        return hashTag2;
    }

    /**
     *
     * @param hashTag2
     * The hash_tag2
     */
    public void setHashTag2(String hashTag2) {
        this.hashTag2 = hashTag2;
    }

    /**
     *
     * @return
     * The viewersCount
     */
    public String getViewersCount() {
        return viewersCount;
    }

    /**
     *
     * @param viewersCount
     * The viewers_count
     */
    public void setViewersCount(String viewersCount) {
        this.viewersCount = viewersCount;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The takeCaller
     */
    public String getTakeCaller() {
        return takeCaller;
    }

    /**
     *
     * @param takeCaller
     * The take_caller
     */
    public void setTakeCaller(String takeCaller) {
        this.takeCaller = takeCaller;
    }

    /**
     *
     * @return
     * The eventDate
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     *
     * @param eventDate
     * The event_date
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    /**
     *
     * @return
     * The thumbImageUrl
     */
    public String getThumbImageUrl() {
        return thumbImageUrl;
    }

    /**
     *
     * @param thumbImageUrl
     * The thumb_image_url
     */
    public void setThumbImageUrl(String thumbImageUrl) {
        this.thumbImageUrl = thumbImageUrl;
    }

    /**
     *
     * @return
     * The thumbImageUrlWeb
     */
    public String getThumbImageUrlWeb() {
        return thumbImageUrlWeb;
    }

    /**
     *
     * @param thumbImageUrlWeb
     * The thumb_image_url_web
     */
    public void setThumbImageUrlWeb(String thumbImageUrlWeb) {
        this.thumbImageUrlWeb = thumbImageUrlWeb;
    }

    /**
     *
     * @return
     * The eventComment
     */
    public String getEventComment() {
        return eventComment;
    }

    /**
     *
     * @param eventComment
     * The event_comment
     */
    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    /**
     *
     * @return
     * The likesCount
     */
    public String getLikesCount() {
        return likesCount;
    }

    /**
     *
     * @param likesCount
     * The likes_count
     */
    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    /**
     *
     * @return
     * The poiFollows
     */
    public String getPoiFollows() {
        return poiFollows;
    }

    /**
     *
     * @param poiFollows
     * The poi_follows
     */
    public void setPoiFollows(String poiFollows) {
        this.poiFollows = poiFollows;
    }

    /**
     *
     * @return
     * The poiInfluencerScore
     */
    public String getPoiInfluencerScore() {
        return poiInfluencerScore;
    }

    /**
     *
     * @param poiInfluencerScore
     * The poi_influencer_score
     */
    public void setPoiInfluencerScore(String poiInfluencerScore) {
        this.poiInfluencerScore = poiInfluencerScore;
    }

    /**
     *
     * @return
     * The isVideo
     */
    public String getIsVideo() {
        return isVideo;
    }

    /**
     *
     * @param isVideo
     * The is_video
     */
    public void setIsVideo(String isVideo) {
        this.isVideo = isVideo;
    }

    /**
     *
     * @return
     * The isProduct
     */
    public String getIsProduct() {
        return isProduct;
    }

    /**
     *
     * @param isProduct
     * The is_product
     */
    public void setIsProduct(String isProduct) {
        this.isProduct = isProduct;
    }

    /**
     *
     * @return
     * The isProfile
     */
    public String getIsProfile() {
        return isProfile;
    }

    /**
     *
     * @param isProfile
     * The is_profile
     */
    public void setIsProfile(String isProfile) {
        this.isProfile = isProfile;
    }

    /**
     *
     * @return
     * The isFeatured
     */
    public String getIsFeatured() {
        return isFeatured;
    }

    /**
     *
     * @param isFeatured
     * The is_featured
     */
    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     *
     * @return
     * The isSpotlight
     */
    public String getIsSpotlight() {
        return isSpotlight;
    }

    /**
     *
     * @param isSpotlight
     * The is_spotlight
     */
    public void setIsSpotlight(String isSpotlight) {
        this.isSpotlight = isSpotlight;
    }


}