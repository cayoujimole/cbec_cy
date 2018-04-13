package com.cbec.model;

import java.util.Date;

public class UserInfo {
    private String id;

    private String smtpHost;

    private String smtpUsername;

    private String smtpPassword;

    private String smtpUseremail;

    private Short smtpPort;

    private Long smtpAuth;

    private Byte smtpUseSsl;

    private Short langId;

    private Date registerTime;

    private Date mailLasttime;

    private String pop3Host;

    private Integer pop3Port;

    private Long pop3UseSsl;

    private Long pop3Auth;

    private Long serverConnectivity;

    private Long activateState;

    private Date activateTime;

    private Long serviceState;

    private Byte receiveProtocal;

    private Long receiveMailtype;

    private Byte serverVerify;

    private String reservedField1;

    private String reservedField2;

    private String reservedField3;

    private String companyId;

    private String alarm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost == null ? null : smtpHost.trim();
    }

    public String getSmtpUsername() {
        return smtpUsername;
    }

    public void setSmtpUsername(String smtpUsername) {
        this.smtpUsername = smtpUsername == null ? null : smtpUsername.trim();
    }

    public String getSmtpPassword() {
        return smtpPassword;
    }

    public void setSmtpPassword(String smtpPassword) {
        this.smtpPassword = smtpPassword == null ? null : smtpPassword.trim();
    }

    public String getSmtpUseremail() {
        return smtpUseremail;
    }

    public void setSmtpUseremail(String smtpUseremail) {
        this.smtpUseremail = smtpUseremail == null ? null : smtpUseremail.trim();
    }

    public Short getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Short smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Long getSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(Long smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public Byte getSmtpUseSsl() {
        return smtpUseSsl;
    }

    public void setSmtpUseSsl(Byte smtpUseSsl) {
        this.smtpUseSsl = smtpUseSsl;
    }

    public Short getLangId() {
        return langId;
    }

    public void setLangId(Short langId) {
        this.langId = langId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getMailLasttime() {
        return mailLasttime;
    }

    public void setMailLasttime(Date mailLasttime) {
        this.mailLasttime = mailLasttime;
    }

    public String getPop3Host() {
        return pop3Host;
    }

    public void setPop3Host(String pop3Host) {
        this.pop3Host = pop3Host == null ? null : pop3Host.trim();
    }

    public Integer getPop3Port() {
        return pop3Port;
    }

    public void setPop3Port(Integer pop3Port) {
        this.pop3Port = pop3Port;
    }

    public Long getPop3UseSsl() {
        return pop3UseSsl;
    }

    public void setPop3UseSsl(Long pop3UseSsl) {
        this.pop3UseSsl = pop3UseSsl;
    }

    public Long getPop3Auth() {
        return pop3Auth;
    }

    public void setPop3Auth(Long pop3Auth) {
        this.pop3Auth = pop3Auth;
    }

    public Long getServerConnectivity() {
        return serverConnectivity;
    }

    public void setServerConnectivity(Long serverConnectivity) {
        this.serverConnectivity = serverConnectivity;
    }

    public Long getActivateState() {
        return activateState;
    }

    public void setActivateState(Long activateState) {
        this.activateState = activateState;
    }

    public Date getActivateTime() {
        return activateTime;
    }

    public void setActivateTime(Date activateTime) {
        this.activateTime = activateTime;
    }

    public Long getServiceState() {
        return serviceState;
    }

    public void setServiceState(Long serviceState) {
        this.serviceState = serviceState;
    }

    public Byte getReceiveProtocal() {
        return receiveProtocal;
    }

    public void setReceiveProtocal(Byte receiveProtocal) {
        this.receiveProtocal = receiveProtocal;
    }

    public Long getReceiveMailtype() {
        return receiveMailtype;
    }

    public void setReceiveMailtype(Long receiveMailtype) {
        this.receiveMailtype = receiveMailtype;
    }

    public Byte getServerVerify() {
        return serverVerify;
    }

    public void setServerVerify(Byte serverVerify) {
        this.serverVerify = serverVerify;
    }

    public String getReservedField1() {
        return reservedField1;
    }

    public void setReservedField1(String reservedField1) {
        this.reservedField1 = reservedField1 == null ? null : reservedField1.trim();
    }

    public String getReservedField2() {
        return reservedField2;
    }

    public void setReservedField2(String reservedField2) {
        this.reservedField2 = reservedField2 == null ? null : reservedField2.trim();
    }

    public String getReservedField3() {
        return reservedField3;
    }

    public void setReservedField3(String reservedField3) {
        this.reservedField3 = reservedField3 == null ? null : reservedField3.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm == null ? null : alarm.trim();
    }
}