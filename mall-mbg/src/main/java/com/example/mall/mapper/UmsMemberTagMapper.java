package com.example.mall.mapper;

import com.example.mall.model.UmsMemberTag;
import com.example.mall.model.UmsMemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(UmsMemberTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(UmsMemberTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(UmsMemberTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(UmsMemberTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    UmsMemberTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(UmsMemberTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_tag
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(UmsMemberTag record);
}