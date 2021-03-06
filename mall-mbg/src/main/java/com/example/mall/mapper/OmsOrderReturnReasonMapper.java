package com.example.mall.mapper;

import com.example.mall.model.OmsOrderReturnReason;
import com.example.mall.model.OmsOrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderReturnReasonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<OmsOrderReturnReason> selectByExample(OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    OmsOrderReturnReason selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_reason
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(OmsOrderReturnReason record);
}