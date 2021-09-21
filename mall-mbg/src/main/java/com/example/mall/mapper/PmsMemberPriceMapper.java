package com.example.mall.mapper;

import com.example.mall.model.PmsMemberPrice;
import com.example.mall.model.PmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    PmsMemberPrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(PmsMemberPrice record);
}