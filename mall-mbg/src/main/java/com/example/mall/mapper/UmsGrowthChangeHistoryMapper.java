package com.example.mall.mapper;

import com.example.mall.model.UmsGrowthChangeHistory;
import com.example.mall.model.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}