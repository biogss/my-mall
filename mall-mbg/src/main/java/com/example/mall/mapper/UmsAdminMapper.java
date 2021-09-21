package com.example.mall.mapper;

import com.example.mall.model.UmsAdmin;
import com.example.mall.model.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(UmsAdmin record);
}