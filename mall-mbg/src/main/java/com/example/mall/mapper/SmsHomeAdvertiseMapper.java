package com.example.mall.mapper;

import com.example.mall.model.SmsHomeAdvertise;
import com.example.mall.model.SmsHomeAdvertiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvertiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(SmsHomeAdvertise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(SmsHomeAdvertise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    SmsHomeAdvertise selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(SmsHomeAdvertise record);
}