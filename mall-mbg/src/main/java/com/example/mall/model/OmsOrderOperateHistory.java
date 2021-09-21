package com.example.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   订单操作历史记录
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_operate_history
 */
public class OmsOrderOperateHistory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "操作人：用户；系统；后台管理员")
    private String operateMan;

    @ApiModelProperty(value = "操作时间")
    private Date createTime;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer orderStatus;

    @ApiModelProperty(value = "备注")
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.id
     *
     * @return the value of oms_order_operate_history.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.id
     *
     * @param id the value for oms_order_operate_history.id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.order_id
     *
     * @return the value of oms_order_operate_history.order_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.order_id
     *
     * @param orderId the value for oms_order_operate_history.order_id
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.operate_man
     *
     * @return the value of oms_order_operate_history.operate_man
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.operate_man
     *
     * @param operateMan the value for oms_order_operate_history.operate_man
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.create_time
     *
     * @return the value of oms_order_operate_history.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.create_time
     *
     * @param createTime the value for oms_order_operate_history.create_time
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.order_status
     *
     * @return the value of oms_order_operate_history.order_status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.order_status
     *
     * @param orderStatus the value for oms_order_operate_history.order_status
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.note
     *
     * @return the value of oms_order_operate_history.note
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.note
     *
     * @param note the value for oms_order_operate_history.note
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}