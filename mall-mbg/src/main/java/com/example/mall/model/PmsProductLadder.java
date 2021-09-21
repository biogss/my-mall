package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   产品阶梯价格表(只针对同商品)
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_product_ladder
 */
public class PmsProductLadder implements Serializable {
    private Long id;

    private Long productId;

    @ApiModelProperty(value = "满足的商品数量")
    private Integer count;

    @ApiModelProperty(value = "折扣")
    private BigDecimal discount;

    @ApiModelProperty(value = "折后价格")
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_ladder.id
     *
     * @return the value of pms_product_ladder.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_ladder.id
     *
     * @param id the value for pms_product_ladder.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_ladder.product_id
     *
     * @return the value of pms_product_ladder.product_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_ladder.product_id
     *
     * @param productId the value for pms_product_ladder.product_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_ladder.count
     *
     * @return the value of pms_product_ladder.count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_ladder.count
     *
     * @param count the value for pms_product_ladder.count
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_ladder.discount
     *
     * @return the value of pms_product_ladder.discount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_ladder.discount
     *
     * @param discount the value for pms_product_ladder.discount
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_ladder.price
     *
     * @return the value of pms_product_ladder.price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_ladder.price
     *
     * @param price the value for pms_product_ladder.price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
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
        sb.append(", productId=").append(productId);
        sb.append(", count=").append(count);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}