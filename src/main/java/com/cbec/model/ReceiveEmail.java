package com.cbec.model;

import java.util.Date;

public class ReceiveEmail {
    private String id;

    private String title;

    private String mailUid;

    private Short sourceLang;

    private Short targetLang;

    private String toEmail;

    private String ccEmail;

    private String bccEmail;

    private String sendUser;

    private String userId;

    private String sourceUrl;

    private String sourceJson;

    private String targetUrl;

    private Date targetFinshtime;

    private Long isTranslation;

    private Long isread;

    private String stateId;

    private Date createTime;

    private Integer distinctTranslate;

    private Integer reTranslate;

    private Date updateTime;

    private Integer notranslateReason;

    private String retranslateReason;

    private Date sentDate;

    private String antirubbishsuggest;

    private String emailtype;

    private String mailheadmd5;

    private Integer platforminfoId;

    private String replyemailmessageid;

    private String targettitle;

    private String attachmentUrl;

    private String emailcontent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMailUid() {
        return mailUid;
    }

    public void setMailUid(String mailUid) {
        this.mailUid = mailUid == null ? null : mailUid.trim();
    }

    public Short getSourceLang() {
        return sourceLang;
    }

    public void setSourceLang(Short sourceLang) {
        this.sourceLang = sourceLang;
    }

    public Short getTargetLang() {
        return targetLang;
    }

    public void setTargetLang(Short targetLang) {
        this.targetLang = targetLang;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail == null ? null : toEmail.trim();
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail == null ? null : ccEmail.trim();
    }

    public String getBccEmail() {
        return bccEmail;
    }

    public void setBccEmail(String bccEmail) {
        this.bccEmail = bccEmail == null ? null : bccEmail.trim();
    }

    public String getSendUser() {
        return sendUser;
    }

    public void setSendUser(String sendUser) {
        this.sendUser = sendUser == null ? null : sendUser.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getSourceJson() {
        return sourceJson;
    }

    public void setSourceJson(String sourceJson) {
        this.sourceJson = sourceJson == null ? null : sourceJson.trim();
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl == null ? null : targetUrl.trim();
    }

    public Date getTargetFinshtime() {
        return targetFinshtime;
    }

    public void setTargetFinshtime(Date targetFinshtime) {
        this.targetFinshtime = targetFinshtime;
    }

    public Long getIsTranslation() {
        return isTranslation;
    }

    public void setIsTranslation(Long isTranslation) {
        this.isTranslation = isTranslation;
    }

    public Long getIsread() {
        return isread;
    }

    public void setIsread(Long isread) {
        this.isread = isread;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId == null ? null : stateId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDistinctTranslate() {
        return distinctTranslate;
    }

    public void setDistinctTranslate(Integer distinctTranslate) {
        this.distinctTranslate = distinctTranslate;
    }

    public Integer getReTranslate() {
        return reTranslate;
    }

    public void setReTranslate(Integer reTranslate) {
        this.reTranslate = reTranslate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getNotranslateReason() {
        return notranslateReason;
    }

    public void setNotranslateReason(Integer notranslateReason) {
        this.notranslateReason = notranslateReason;
    }

    public String getRetranslateReason() {
        return retranslateReason;
    }

    public void setRetranslateReason(String retranslateReason) {
        this.retranslateReason = retranslateReason == null ? null : retranslateReason.trim();
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String getAntirubbishsuggest() {
        return antirubbishsuggest;
    }

    public void setAntirubbishsuggest(String antirubbishsuggest) {
        this.antirubbishsuggest = antirubbishsuggest == null ? null : antirubbishsuggest.trim();
    }

    public String getEmailtype() {
        return emailtype;
    }

    public void setEmailtype(String emailtype) {
        this.emailtype = emailtype == null ? null : emailtype.trim();
    }

    public String getMailheadmd5() {
        return mailheadmd5;
    }

    public void setMailheadmd5(String mailheadmd5) {
        this.mailheadmd5 = mailheadmd5 == null ? null : mailheadmd5.trim();
    }

    public Integer getPlatforminfoId() {
        return platforminfoId;
    }

    public void setPlatforminfoId(Integer platforminfoId) {
        this.platforminfoId = platforminfoId;
    }

    public String getReplyemailmessageid() {
        return replyemailmessageid;
    }

    public void setReplyemailmessageid(String replyemailmessageid) {
        this.replyemailmessageid = replyemailmessageid == null ? null : replyemailmessageid.trim();
    }

    public String getTargettitle() {
        return targettitle;
    }

    public void setTargettitle(String targettitle) {
        this.targettitle = targettitle == null ? null : targettitle.trim();
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl == null ? null : attachmentUrl.trim();
    }

    public String getEmailcontent() {
        return emailcontent;
    }

    public void setEmailcontent(String emailcontent) {
        this.emailcontent = emailcontent == null ? null : emailcontent.trim();
    }
}