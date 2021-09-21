package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_admin_permission_relation
 */
public class UmsAdminPermissionRelation implements Serializable {
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_admin_permission_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.id
     *
     * @return the value of ums_admin_permission_relation.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.id
     *
     * @param id the value for ums_admin_permission_relation.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.admin_id
     *
     * @return the value of ums_admin_permission_relation.admin_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.admin_id
     *
     * @param adminId the value for ums_admin_permission_relation.admin_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.permission_id
     *
     * @return the value of ums_admin_permission_relation.permission_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.permission_id
     *
     * @param permissionId the value for ums_admin_permission_relation.permission_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_permission_relation.type
     *
     * @return the value of ums_admin_permission_relation.type
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_permission_relation.type
     *
     * @param type the value for ums_admin_permission_relation.type
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_permission_relation
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
        sb.append(", permissionId=").append(permissionId);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}