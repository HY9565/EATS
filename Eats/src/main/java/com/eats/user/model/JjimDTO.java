package com.eats.user.model;

public class JjimDTO {
    private int user_idx;     // 사용자 ID
    private int store_idx;    // 매장 ID
    private String store_name; // 매장 이름
    private String store_addr; // 매장 주소
    private String store_tel;  // 매장 전화번호

    // 기본 생성자
    public JjimDTO() {}

    // 모든 필드를 포함하는 생성자
    public JjimDTO(int user_idx, int store_idx, String store_name, String store_addr, String store_tel) {
        this.user_idx = user_idx;
        this.store_idx = store_idx;
        this.store_name = store_name;
        this.store_addr = store_addr;
        this.store_tel = store_tel;
    }

    // Getter & Setter
    public int getUser_idx() {
        return user_idx;
    }

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public int getStore_idx() {
        return store_idx;
    }

    public void setStore_idx(int store_idx) {
        this.store_idx = store_idx;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_addr() {
        return store_addr;
    }

    public void setStore_addr(String store_addr) {
        this.store_addr = store_addr;
    }

    public String getStore_tel() {
        return store_tel;
    }

    public void setStore_tel(String store_tel) {
        this.store_tel = store_tel;
    }

}