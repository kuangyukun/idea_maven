package com.nnngu.entity;

import java.io.Serializable;
import java.util.Date;

public class Seckill implements Serializable {
    /* 主键ID*/
    private long seckillId;
    /*  秒杀商品名字 */
    private String name;
    /* 商品数量 */
    private int number;
    /* 开始秒杀的时间 */
    private Date startTime;
    /* 结束秒杀的时间 */
    private Date endTime;
    /* 创建的时间 */
    private Date createTime;

    public Seckill(long seckillId, String name, int number, Date startTime, Date endTime, Date createTime) {
        this.seckillId = seckillId;
        this.name = name;
        this.number = number;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
    }

    public Seckill() {
    }

    public long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
