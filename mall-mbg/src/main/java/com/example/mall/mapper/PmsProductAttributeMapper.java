package com.example.mall.mapper;

import com.example.mall.model.PmsProductAttribute;
import com.example.mall.model.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(PmsProductAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(PmsProductAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    PmsProductAttribute selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(PmsProductAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(PmsProductAttribute record);
}