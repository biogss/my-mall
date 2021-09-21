package com.example.mall.mapper;

import com.example.mall.model.SmsCoupon;
import com.example.mall.model.SmsCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<SmsCoupon> selectByExample(SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    SmsCoupon selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(SmsCoupon record);
}