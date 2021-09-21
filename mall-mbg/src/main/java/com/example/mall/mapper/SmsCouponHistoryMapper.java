package com.example.mall.mapper;

import com.example.mall.model.SmsCouponHistory;
import com.example.mall.model.SmsCouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    SmsCouponHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(SmsCouponHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(SmsCouponHistory record);
}