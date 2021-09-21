package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   用户标签表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_tag
 */
public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "自动打标签完成订单数量")
    private Integer finishOrderCount;

    @ApiModelProperty(value = "自动打标签完成订单金额")
    private BigDecimal finishOrderAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_tag.id
     *
     * @return the value of ums_member_tag.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_tag.id
     *
     * @param id the value for ums_member_tag.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_tag.name
     *
     * @return the value of ums_member_tag.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_tag.name
     *
     * @param name the value for ums_member_tag.name
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_tag.finish_order_count
     *
     * @return the value of ums_member_tag.finish_order_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_tag.finish_order_count
     *
     * @param finishOrderCount the value for ums_member_tag.finish_order_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_tag.finish_order_amount
     *
     * @return the value of ums_member_tag.finish_order_amount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_tag.finish_order_amount
     *
     * @param finishOrderAmount the value for ums_member_tag.finish_order_amount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
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
        sb.append(", finishOrderCount=").append(finishOrderCount);
        sb.append(", finishOrderAmount=").append(finishOrderAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}