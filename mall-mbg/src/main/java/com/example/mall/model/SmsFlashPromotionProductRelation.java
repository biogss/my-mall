package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   商品限时购与商品关系表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_flash_promotion_product_relation
 */
public class SmsFlashPromotionProductRelation implements Serializable {
    @ApiModelProperty(value = "编号")
    private Long id;

    private Long flashPromotionId;

    @ApiModelProperty(value = "编号")
    private Long flashPromotionSessionId;

    private Long productId;

    @ApiModelProperty(value = "限时购价格")
    private BigDecimal flashPromotionPrice;

    @ApiModelProperty(value = "限时购数量")
    private Integer flashPromotionCount;

    @ApiModelProperty(value = "每人限购数量")
    private Integer flashPromotionLimit;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.id
     *
     * @return the value of sms_flash_promotion_product_relation.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.id
     *
     * @param id the value for sms_flash_promotion_product_relation.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @param flashPromotionId the value for sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @param flashPromotionSessionId the value for sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.product_id
     *
     * @return the value of sms_flash_promotion_product_relation.product_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.product_id
     *
     * @param productId the value for sms_flash_promotion_product_relation.product_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @param flashPromotionPrice the value for sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @param flashPromotionCount the value for sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @param flashPromotionLimit the value for sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.sort
     *
     * @return the value of sms_flash_promotion_product_relation.sort
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.sort
     *
     * @param sort the value for sms_flash_promotion_product_relation.sort
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
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
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", productId=").append(productId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}