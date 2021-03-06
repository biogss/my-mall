package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   限时购场次表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_flash_promotion_session
 */
public class SmsFlashPromotionSession implements Serializable {
    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "场次名称")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    private Date startTime;

    @ApiModelProperty(value = "每日结束时间")
    private Date endTime;

    @ApiModelProperty(value = "启用状态：0->不启用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.id
     *
     * @return the value of sms_flash_promotion_session.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.id
     *
     * @param id the value for sms_flash_promotion_session.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.name
     *
     * @return the value of sms_flash_promotion_session.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.name
     *
     * @param name the value for sms_flash_promotion_session.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.start_time
     *
     * @return the value of sms_flash_promotion_session.start_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.start_time
     *
     * @param startTime the value for sms_flash_promotion_session.start_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.end_time
     *
     * @return the value of sms_flash_promotion_session.end_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.end_time
     *
     * @param endTime the value for sms_flash_promotion_session.end_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.status
     *
     * @return the value of sms_flash_promotion_session.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.status
     *
     * @param status the value for sms_flash_promotion_session.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.create_time
     *
     * @return the value of sms_flash_promotion_session.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.create_time
     *
     * @param createTime the value for sms_flash_promotion_session.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}