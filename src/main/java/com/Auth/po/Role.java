package com.Auth.po;

/**
 * Created by Jiangtenglong on 2016/7/23.
 */
public class Role {
    private int roleId;
    private String roleName;

    public Role() {
        super();
    }

    public Role(int roleId, String roleName) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
