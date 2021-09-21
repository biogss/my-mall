package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   后台用户登录日志表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_admin_login_log
 */
public class UmsAdminLoginLog implements Serializable {
    private Long id;

    private Long adminId;

    private Date createTime;

    private String ip;

    private String address;

    @ApiModelProperty(value = "浏览器登录类型")
    private String userAgent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.id
     *
     * @return the value of ums_admin_login_log.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.id
     *
     * @param id the value for ums_admin_login_log.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.admin_id
     *
     * @return the value of ums_admin_login_log.admin_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.admin_id
     *
     * @param adminId the value for ums_admin_login_log.admin_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.create_time
     *
     * @return the value of ums_admin_login_log.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.create_time
     *
     * @param createTime the value for ums_admin_login_log.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.ip
     *
     * @return the value of ums_admin_login_log.ip
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.ip
     *
     * @param ip the value for ums_admin_login_log.ip
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.address
     *
     * @return the value of ums_admin_login_log.address
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.address
     *
     * @param address the value for ums_admin_login_log.address
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_login_log.user_agent
     *
     * @return the value of ums_admin_login_log.user_agent
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_login_log.user_agent
     *
     * @param userAgent the value for ums_admin_login_log.user_agent
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
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
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", address=").append(address);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}