package com.cbec.dao;

import com.cbec.model.UserInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoMapper {
    @Delete({
        "delete from user_info",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into user_info (ID, smtp_host, ",
        "smtp_username, smtp_password, ",
        "smtp_useremail, smtp_port, ",
        "smtp_auth, smtp_use_ssl, ",
        "lang_id, register_time, ",
        "mail_lasttime, pop3_host, ",
        "pop3_port, pop3_use_ssl, ",
        "pop3_auth, server_connectivity, ",
        "activate_state, activate_time, ",
        "service_state, receive_protocal, ",
        "receive_mailType, server_verify, ",
        "reserved_field1, reserved_field2, ",
        "reserved_field3, company_id, ",
        "alarm)",
        "values (#{id,jdbcType=VARCHAR}, #{smtpHost,jdbcType=VARCHAR}, ",
        "#{smtpUsername,jdbcType=VARCHAR}, #{smtpPassword,jdbcType=VARCHAR}, ",
        "#{smtpUseremail,jdbcType=VARCHAR}, #{smtpPort,jdbcType=SMALLINT}, ",
        "#{smtpAuth,jdbcType=BIGINT}, #{smtpUseSsl,jdbcType=TINYINT}, ",
        "#{langId,jdbcType=SMALLINT}, #{registerTime,jdbcType=TIMESTAMP}, ",
        "#{mailLasttime,jdbcType=TIMESTAMP}, #{pop3Host,jdbcType=VARCHAR}, ",
        "#{pop3Port,jdbcType=INTEGER}, #{pop3UseSsl,jdbcType=BIGINT}, ",
        "#{pop3Auth,jdbcType=BIGINT}, #{serverConnectivity,jdbcType=BIGINT}, ",
        "#{activateState,jdbcType=BIGINT}, #{activateTime,jdbcType=TIMESTAMP}, ",
        "#{serviceState,jdbcType=BIGINT}, #{receiveProtocal,jdbcType=TINYINT}, ",
        "#{receiveMailtype,jdbcType=BIGINT}, #{serverVerify,jdbcType=TINYINT}, ",
        "#{reservedField1,jdbcType=VARCHAR}, #{reservedField2,jdbcType=VARCHAR}, ",
        "#{reservedField3,jdbcType=VARCHAR}, #{companyId,jdbcType=VARCHAR}, ",
        "#{alarm,jdbcType=VARCHAR})"
    })
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    @Select({
        "select",
        "ID, smtp_host, smtp_username, smtp_password, smtp_useremail, smtp_port, smtp_auth, ",
        "smtp_use_ssl, lang_id, register_time, mail_lasttime, pop3_host, pop3_port, pop3_use_ssl, ",
        "pop3_auth, server_connectivity, activate_state, activate_time, service_state, ",
        "receive_protocal, receive_mailType, server_verify, reserved_field1, reserved_field2, ",
        "reserved_field3, company_id, alarm",
        "from user_info",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.cbec.dao.UserInfoMapper.BaseResultMap")
    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update user_info",
        "set smtp_host = #{smtpHost,jdbcType=VARCHAR},",
          "smtp_username = #{smtpUsername,jdbcType=VARCHAR},",
          "smtp_password = #{smtpPassword,jdbcType=VARCHAR},",
          "smtp_useremail = #{smtpUseremail,jdbcType=VARCHAR},",
          "smtp_port = #{smtpPort,jdbcType=SMALLINT},",
          "smtp_auth = #{smtpAuth,jdbcType=BIGINT},",
          "smtp_use_ssl = #{smtpUseSsl,jdbcType=TINYINT},",
          "lang_id = #{langId,jdbcType=SMALLINT},",
          "register_time = #{registerTime,jdbcType=TIMESTAMP},",
          "mail_lasttime = #{mailLasttime,jdbcType=TIMESTAMP},",
          "pop3_host = #{pop3Host,jdbcType=VARCHAR},",
          "pop3_port = #{pop3Port,jdbcType=INTEGER},",
          "pop3_use_ssl = #{pop3UseSsl,jdbcType=BIGINT},",
          "pop3_auth = #{pop3Auth,jdbcType=BIGINT},",
          "server_connectivity = #{serverConnectivity,jdbcType=BIGINT},",
          "activate_state = #{activateState,jdbcType=BIGINT},",
          "activate_time = #{activateTime,jdbcType=TIMESTAMP},",
          "service_state = #{serviceState,jdbcType=BIGINT},",
          "receive_protocal = #{receiveProtocal,jdbcType=TINYINT},",
          "receive_mailType = #{receiveMailtype,jdbcType=BIGINT},",
          "server_verify = #{serverVerify,jdbcType=TINYINT},",
          "reserved_field1 = #{reservedField1,jdbcType=VARCHAR},",
          "reserved_field2 = #{reservedField2,jdbcType=VARCHAR},",
          "reserved_field3 = #{reservedField3,jdbcType=VARCHAR},",
          "company_id = #{companyId,jdbcType=VARCHAR},",
          "alarm = #{alarm,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserInfo record);
}