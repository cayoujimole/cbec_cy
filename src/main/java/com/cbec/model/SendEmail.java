package com.cbec.model;

import java.util.Date;

public class SendEmail {
    private String id;

    private String title;

    private Short sourceLang;

    private Short targetLang;

    private Long clientType;

    private String toEmail;

    private String ccEmail;

    private String bccEmail;

    private String userId;

    private String sourceUrl;

    private String sourceJson;

    private String targetUrl;

    private Date targetFinshtime;

    private Long nassoneshow;

    private String stateId;

    private Date createTime;

    private Long messageidread;

    private String messageId;

    private String emailtype;

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

    public Long getClientType() {
        return clientType;
    }

    public void setClientType(Long clientType) {
        this.clientType = clientType;
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

    public Long getNassoneshow() {
        return nassoneshow;
    }

    public void setNassoneshow(Long nassoneshow) {
        this.nassoneshow = nassoneshow;
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

    public Long getMessageidread() {
        return messageidread;
    }

    public void setMessageidread(Long messageidread) {
        this.messageidread = messageidread;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getEmailtype() {
        return emailtype;
    }

    public void setEmailtype(String emailtype) {
        this.emailtype = emailtype == null ? null : emailtype.trim();
    }
}