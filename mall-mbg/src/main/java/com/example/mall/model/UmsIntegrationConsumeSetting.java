package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   积分消费设置
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_integration_consume_setting
 */
public class UmsIntegrationConsumeSetting implements Serializable {
    private Long id;

    @ApiModelProperty(value = "每一元需要抵扣的积分数量")
    private Integer deductionPerAmount;

    @ApiModelProperty(value = "每笔订单最高抵用百分比")
    private Integer maxPercentPerOrder;

    @ApiModelProperty(value = "每次使用积分最小单位100")
    private Integer useUnit;

    @ApiModelProperty(value = "是否可以和优惠券同用；0->不可以；1->可以")
    private Integer couponStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_integration_consume_setting
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_integration_consume_setting.id
     *
     * @return the value of ums_integration_consume_setting.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_integration_consume_setting.id
     *
     * @param id the value for ums_integration_consume_setting.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_integration_consume_setting.deduction_per_amount
     *
     * @return the value of ums_integration_consume_setting.deduction_per_amount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_integration_consume_setting.deduction_per_amount
     *
     * @param deductionPerAmount the value for ums_integration_consume_setting.deduction_per_amount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_integration_consume_setting.max_percent_per_order
     *
     * @return the value of ums_integration_consume_setting.max_percent_per_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_integration_consume_setting.max_percent_per_order
     *
     * @param maxPercentPerOrder the value for ums_integration_consume_setting.max_percent_per_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_integration_consume_setting.use_unit
     *
     * @return the value of ums_integration_consume_setting.use_unit
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getUseUnit() {
        return useUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_integration_consume_setting.use_unit
     *
     * @param useUnit the value for ums_integration_consume_setting.use_unit
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_integration_consume_setting.coupon_status
     *
     * @return the value of ums_integration_consume_setting.coupon_status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getCouponStatus() {
        return couponStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_integration_consume_setting.coupon_status
     *
     * @param couponStatus the value for ums_integration_consume_setting.coupon_status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_integration_consume_setting
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
        sb.append(", deductionPerAmount=").append(deductionPerAmount);
        sb.append(", maxPercentPerOrder=").append(maxPercentPerOrder);
        sb.append(", useUnit=").append(useUnit);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}