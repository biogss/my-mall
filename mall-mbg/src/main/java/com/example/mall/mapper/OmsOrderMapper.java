package com.example.mall.mapper;

import com.example.mall.model.OmsOrder;
import com.example.mall.model.OmsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<OmsOrder> selectByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    OmsOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(OmsOrder record);
}