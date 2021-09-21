package com.example.mall.mapper;

import com.example.mall.model.CmsHelpCategory;
import com.example.mall.model.CmsHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}