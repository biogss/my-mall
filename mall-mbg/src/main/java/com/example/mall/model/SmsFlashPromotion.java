package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   限时购表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_flash_promotion
 */
public class SmsFlashPromotion implements Serializable {
    private Long id;

    private String title;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "上下线状态")
    private Integer status;

    @ApiModelProperty(value = "秒杀时间段名称")
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_flash_promotion
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.id
     *
     * @return the value of sms_flash_promotion.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.id
     *
     * @param id the value for sms_flash_promotion.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.title
     *
     * @return the value of sms_flash_promotion.title
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.title
     *
     * @param title the value for sms_flash_promotion.title
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.start_date
     *
     * @return the value of sms_flash_promotion.start_date
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.start_date
     *
     * @param startDate the value for sms_flash_promotion.start_date
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.end_date
     *
     * @return the value of sms_flash_promotion.end_date
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.end_date
     *
     * @param endDate the value for sms_flash_promotion.end_date
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.status
     *
     * @return the value of sms_flash_promotion.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.status
     *
     * @param status the value for sms_flash_promotion.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion.create_time
     *
     * @return the value of sms_flash_promotion.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion.create_time
     *
     * @param createTime the value for sms_flash_promotion.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
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
        sb.append(", title=").append(title);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}