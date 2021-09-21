package com.example.mall.mapper;

import com.example.mall.model.OmsCartItem;
import com.example.mall.model.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    OmsCartItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_cart_item
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(OmsCartItem record);
}