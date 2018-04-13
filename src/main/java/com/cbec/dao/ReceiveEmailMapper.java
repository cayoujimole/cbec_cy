package com.cbec.dao;

import com.cbec.model.ReceiveEmail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ReceiveEmailMapper {
    @Delete({
        "delete from receive_email",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into receive_email (ID, title, ",
        "mail_uid, source_lang, ",
        "target_lang, to_email, ",
        "cc_email, bcc_email, ",
        "send_user, user_id, ",
        "source_url, source_json, ",
        "target_url, target_finshtime, ",
        "is_translation, isread, ",
        "state_id, create_time, ",
        "distinct_translate, re_translate, ",
        "update_time, notranslate_reason, ",
        "retranslate_reason, sent_date, ",
        "antiRubbishSuggest, emailType, ",
        "mailHeadMd5, platformInfo_id, ",
        "replyEmailMessageId, targetTitle, ",
        "attachment_url, emailContent)",
        "values (#{id,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{mailUid,jdbcType=VARCHAR}, #{sourceLang,jdbcType=SMALLINT}, ",
        "#{targetLang,jdbcType=SMALLINT}, #{toEmail,jdbcType=VARCHAR}, ",
        "#{ccEmail,jdbcType=VARCHAR}, #{bccEmail,jdbcType=VARCHAR}, ",
        "#{sendUser,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{sourceUrl,jdbcType=VARCHAR}, #{sourceJson,jdbcType=VARCHAR}, ",
        "#{targetUrl,jdbcType=VARCHAR}, #{targetFinshtime,jdbcType=TIMESTAMP}, ",
        "#{isTranslation,jdbcType=BIGINT}, #{isread,jdbcType=BIGINT}, ",
        "#{stateId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{distinctTranslate,jdbcType=INTEGER}, #{reTranslate,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{notranslateReason,jdbcType=INTEGER}, ",
        "#{retranslateReason,jdbcType=VARCHAR}, #{sentDate,jdbcType=TIMESTAMP}, ",
        "#{antirubbishsuggest,jdbcType=VARCHAR}, #{emailtype,jdbcType=VARCHAR}, ",
        "#{mailheadmd5,jdbcType=VARCHAR}, #{platforminfoId,jdbcType=INTEGER}, ",
        "#{replyemailmessageid,jdbcType=VARCHAR}, #{targettitle,jdbcType=VARCHAR}, ",
        "#{attachmentUrl,jdbcType=VARCHAR}, #{emailcontent,jdbcType=VARCHAR})"
    })
    int insert(ReceiveEmail record);

    int insertSelective(ReceiveEmail record);

    @Select({
        "select",
        "ID, title, mail_uid, source_lang, target_lang, to_email, cc_email, bcc_email, ",
        "send_user, user_id, source_url, source_json, target_url, target_finshtime, is_translation, ",
        "isread, state_id, create_time, distinct_translate, re_translate, update_time, ",
        "notranslate_reason, retranslate_reason, sent_date, antiRubbishSuggest, emailType, ",
        "mailHeadMd5, platformInfo_id, replyEmailMessageId, targetTitle, attachment_url, ",
        "emailContent",
        "from receive_email",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.cbec.dao.ReceiveEmailMapper.BaseResultMap")
    ReceiveEmail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ReceiveEmail record);

    @Update({
        "update receive_email",
        "set title = #{title,jdbcType=VARCHAR},",
          "mail_uid = #{mailUid,jdbcType=VARCHAR},",
          "source_lang = #{sourceLang,jdbcType=SMALLINT},",
          "target_lang = #{targetLang,jdbcType=SMALLINT},",
          "to_email = #{toEmail,jdbcType=VARCHAR},",
          "cc_email = #{ccEmail,jdbcType=VARCHAR},",
          "bcc_email = #{bccEmail,jdbcType=VARCHAR},",
          "send_user = #{sendUser,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "source_url = #{sourceUrl,jdbcType=VARCHAR},",
          "source_json = #{sourceJson,jdbcType=VARCHAR},",
          "target_url = #{targetUrl,jdbcType=VARCHAR},",
          "target_finshtime = #{targetFinshtime,jdbcType=TIMESTAMP},",
          "is_translation = #{isTranslation,jdbcType=BIGINT},",
          "isread = #{isread,jdbcType=BIGINT},",
          "state_id = #{stateId,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "distinct_translate = #{distinctTranslate,jdbcType=INTEGER},",
          "re_translate = #{reTranslate,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "notranslate_reason = #{notranslateReason,jdbcType=INTEGER},",
          "retranslate_reason = #{retranslateReason,jdbcType=VARCHAR},",
          "sent_date = #{sentDate,jdbcType=TIMESTAMP},",
          "antiRubbishSuggest = #{antirubbishsuggest,jdbcType=VARCHAR},",
          "emailType = #{emailtype,jdbcType=VARCHAR},",
          "mailHeadMd5 = #{mailheadmd5,jdbcType=VARCHAR},",
          "platformInfo_id = #{platforminfoId,jdbcType=INTEGER},",
          "replyEmailMessageId = #{replyemailmessageid,jdbcType=VARCHAR},",
          "targetTitle = #{targettitle,jdbcType=VARCHAR},",
          "attachment_url = #{attachmentUrl,jdbcType=VARCHAR},",
          "emailContent = #{emailcontent,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ReceiveEmail record);
}