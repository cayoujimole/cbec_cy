package com.cbec.dao;

import com.cbec.model.SendEmail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SendEmailMapper {
    @Delete({
        "delete from send_email",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into send_email (ID, title, ",
        "source_lang, target_lang, ",
        "client_type, to_email, ",
        "cc_email, bcc_email, ",
        "user_id, source_url, ",
        "source_json, target_url, ",
        "target_finshtime, nassoneshow, ",
        "state_id, create_time, ",
        "messageIdRead, message_id, ",
        "emailType)",
        "values (#{id,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{sourceLang,jdbcType=SMALLINT}, #{targetLang,jdbcType=SMALLINT}, ",
        "#{clientType,jdbcType=BIGINT}, #{toEmail,jdbcType=VARCHAR}, ",
        "#{ccEmail,jdbcType=VARCHAR}, #{bccEmail,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{sourceUrl,jdbcType=VARCHAR}, ",
        "#{sourceJson,jdbcType=VARCHAR}, #{targetUrl,jdbcType=VARCHAR}, ",
        "#{targetFinshtime,jdbcType=TIMESTAMP}, #{nassoneshow,jdbcType=BIGINT}, ",
        "#{stateId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{messageidread,jdbcType=BIGINT}, #{messageId,jdbcType=VARCHAR}, ",
        "#{emailtype,jdbcType=VARCHAR})"
    })
    int insert(SendEmail record);

    int insertSelective(SendEmail record);

    @Select({
        "select",
        "ID, title, source_lang, target_lang, client_type, to_email, cc_email, bcc_email, ",
        "user_id, source_url, source_json, target_url, target_finshtime, nassoneshow, ",
        "state_id, create_time, messageIdRead, message_id, emailType",
        "from send_email",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.cbec.dao.SendEmailMapper.BaseResultMap")
    SendEmail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SendEmail record);

    @Update({
        "update send_email",
        "set title = #{title,jdbcType=VARCHAR},",
          "source_lang = #{sourceLang,jdbcType=SMALLINT},",
          "target_lang = #{targetLang,jdbcType=SMALLINT},",
          "client_type = #{clientType,jdbcType=BIGINT},",
          "to_email = #{toEmail,jdbcType=VARCHAR},",
          "cc_email = #{ccEmail,jdbcType=VARCHAR},",
          "bcc_email = #{bccEmail,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "source_url = #{sourceUrl,jdbcType=VARCHAR},",
          "source_json = #{sourceJson,jdbcType=VARCHAR},",
          "target_url = #{targetUrl,jdbcType=VARCHAR},",
          "target_finshtime = #{targetFinshtime,jdbcType=TIMESTAMP},",
          "nassoneshow = #{nassoneshow,jdbcType=BIGINT},",
          "state_id = #{stateId,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "messageIdRead = #{messageidread,jdbcType=BIGINT},",
          "message_id = #{messageId,jdbcType=VARCHAR},",
          "emailType = #{emailtype,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SendEmail record);
}