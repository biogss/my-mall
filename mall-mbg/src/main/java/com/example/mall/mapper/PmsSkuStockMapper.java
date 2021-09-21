package com.example.mall.mapper;

import com.example.mall.model.PmsSkuStock;
import com.example.mall.model.PmsSkuStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<PmsSkuStock> selectByExample(PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    PmsSkuStock selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(PmsSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_stock
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(PmsSkuStock record);
}