package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   后台用户角色表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_role
 */
public class UmsRole implements Serializable {
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "后台用户数量")
    private Integer adminCount;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_role
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.id
     *
     * @return the value of ums_role.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.id
     *
     * @param id the value for ums_role.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.name
     *
     * @return the value of ums_role.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.name
     *
     * @param name the value for ums_role.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.description
     *
     * @return the value of ums_role.description
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.description
     *
     * @param description the value for ums_role.description
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.admin_count
     *
     * @return the value of ums_role.admin_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getAdminCount() {
        return adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.admin_count
     *
     * @param adminCount the value for ums_role.admin_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.create_time
     *
     * @return the value of ums_role.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.create_time
     *
     * @param createTime the value for ums_role.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.status
     *
     * @return the value of ums_role.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.status
     *
     * @param status the value for ums_role.status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_role.sort
     *
     * @return the value of ums_role.sort
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_role.sort
     *
     * @param sort the value for ums_role.sort
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
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
        sb.append(", description=").append(description);
        sb.append(", adminCount=").append(adminCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}