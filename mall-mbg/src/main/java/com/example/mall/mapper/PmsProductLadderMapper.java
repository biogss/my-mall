package com.example.mall.mapper;

import com.example.mall.model.PmsProductLadder;
import com.example.mall.model.PmsProductLadderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLadderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(PmsProductLadder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(PmsProductLadder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<PmsProductLadder> selectByExample(PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    PmsProductLadder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(PmsProductLadder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_ladder
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(PmsProductLadder record);
}