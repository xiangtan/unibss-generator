package com.ai.showing.entity;

import javax.persistence.*;

@Table(name = "t_love_partner")
public class Partner {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商家名称
     */
    private String name;

    /**
     * 商家地址
     */
    private String address;

    /**
     * 商家描述
     */
    private String descp;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商家名称
     *
     * @return name - 商家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商家名称
     *
     * @param name 商家名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商家地址
     *
     * @return address - 商家地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置商家地址
     *
     * @param address 商家地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取商家描述
     *
     * @return descp - 商家描述
     */
    public String getDescp() {
        return descp;
    }

    /**
     * 设置商家描述
     *
     * @param descp 商家描述
     */
    public void setDescp(String descp) {
        this.descp = descp;
    }
}