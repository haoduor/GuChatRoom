package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1631207359601094642L;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlIsNull() {
            addCriterion("head_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlIsNotNull() {
            addCriterion("head_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlEqualTo(String value) {
            addCriterion("head_pic_url =", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlNotEqualTo(String value) {
            addCriterion("head_pic_url <>", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlGreaterThan(String value) {
            addCriterion("head_pic_url >", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic_url >=", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlLessThan(String value) {
            addCriterion("head_pic_url <", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlLessThanOrEqualTo(String value) {
            addCriterion("head_pic_url <=", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlLike(String value) {
            addCriterion("head_pic_url like", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlNotLike(String value) {
            addCriterion("head_pic_url not like", value, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlIn(List<String> values) {
            addCriterion("head_pic_url in", values, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlNotIn(List<String> values) {
            addCriterion("head_pic_url not in", values, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlBetween(String value1, String value2) {
            addCriterion("head_pic_url between", value1, value2, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPicUrlNotBetween(String value1, String value2) {
            addCriterion("head_pic_url not between", value1, value2, "headPicUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNull() {
            addCriterion("is_first_login is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIsNotNull() {
            addCriterion("is_first_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginEqualTo(Boolean value) {
            addCriterion("is_first_login =", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotEqualTo(Boolean value) {
            addCriterion("is_first_login <>", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThan(Boolean value) {
            addCriterion("is_first_login >", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login >=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThan(Boolean value) {
            addCriterion("is_first_login <", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_first_login <=", value, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginIn(List<Boolean> values) {
            addCriterion("is_first_login in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotIn(List<Boolean> values) {
            addCriterion("is_first_login not in", values, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andIsFirstLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_first_login not between", value1, value2, "isFirstLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIsNull() {
            addCriterion("last_logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIsNotNull() {
            addCriterion("last_logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeEqualTo(Date value) {
            addCriterion("last_logout_time =", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotEqualTo(Date value) {
            addCriterion("last_logout_time <>", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeGreaterThan(Date value) {
            addCriterion("last_logout_time >", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_logout_time >=", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeLessThan(Date value) {
            addCriterion("last_logout_time <", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_logout_time <=", value, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeIn(List<Date> values) {
            addCriterion("last_logout_time in", values, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotIn(List<Date> values) {
            addCriterion("last_logout_time not in", values, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeBetween(Date value1, Date value2) {
            addCriterion("last_logout_time between", value1, value2, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andLastLogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_logout_time not between", value1, value2, "lastLogoutTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNull() {
            addCriterion("is_hidden is null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNotNull() {
            addCriterion("is_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenEqualTo(Boolean value) {
            addCriterion("is_hidden =", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotEqualTo(Boolean value) {
            addCriterion("is_hidden <>", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThan(Boolean value) {
            addCriterion("is_hidden >", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hidden >=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThan(Boolean value) {
            addCriterion("is_hidden <", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hidden <=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIn(List<Boolean> values) {
            addCriterion("is_hidden in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotIn(List<Boolean> values) {
            addCriterion("is_hidden not in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hidden between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hidden not between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNull() {
            addCriterion("is_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNotNull() {
            addCriterion("is_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockedEqualTo(Boolean value) {
            addCriterion("is_locked =", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotEqualTo(Boolean value) {
            addCriterion("is_locked <>", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThan(Boolean value) {
            addCriterion("is_locked >", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_locked >=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThan(Boolean value) {
            addCriterion("is_locked <", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_locked <=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedIn(List<Boolean> values) {
            addCriterion("is_locked in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotIn(List<Boolean> values) {
            addCriterion("is_locked not in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_locked between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_locked not between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeIsNull() {
            addCriterion("last_speak_time is null");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeIsNotNull() {
            addCriterion("last_speak_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeEqualTo(Date value) {
            addCriterion("last_speak_time =", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeNotEqualTo(Date value) {
            addCriterion("last_speak_time <>", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeGreaterThan(Date value) {
            addCriterion("last_speak_time >", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_speak_time >=", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeLessThan(Date value) {
            addCriterion("last_speak_time <", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_speak_time <=", value, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeIn(List<Date> values) {
            addCriterion("last_speak_time in", values, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeNotIn(List<Date> values) {
            addCriterion("last_speak_time not in", values, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeBetween(Date value1, Date value2) {
            addCriterion("last_speak_time between", value1, value2, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andLastSpeakTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_speak_time not between", value1, value2, "lastSpeakTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeIsNull() {
            addCriterion("resigter_time is null");
            return (Criteria) this;
        }

        public Criteria andResigterTimeIsNotNull() {
            addCriterion("resigter_time is not null");
            return (Criteria) this;
        }

        public Criteria andResigterTimeEqualTo(Date value) {
            addCriterion("resigter_time =", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeNotEqualTo(Date value) {
            addCriterion("resigter_time <>", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeGreaterThan(Date value) {
            addCriterion("resigter_time >", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("resigter_time >=", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeLessThan(Date value) {
            addCriterion("resigter_time <", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeLessThanOrEqualTo(Date value) {
            addCriterion("resigter_time <=", value, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeIn(List<Date> values) {
            addCriterion("resigter_time in", values, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeNotIn(List<Date> values) {
            addCriterion("resigter_time not in", values, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeBetween(Date value1, Date value2) {
            addCriterion("resigter_time between", value1, value2, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andResigterTimeNotBetween(Date value1, Date value2) {
            addCriterion("resigter_time not between", value1, value2, "resigterTime");
            return (Criteria) this;
        }

        public Criteria andAllMessagesIsNull() {
            addCriterion("all_messages is null");
            return (Criteria) this;
        }

        public Criteria andAllMessagesIsNotNull() {
            addCriterion("all_messages is not null");
            return (Criteria) this;
        }

        public Criteria andAllMessagesEqualTo(Integer value) {
            addCriterion("all_messages =", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesNotEqualTo(Integer value) {
            addCriterion("all_messages <>", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesGreaterThan(Integer value) {
            addCriterion("all_messages >", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_messages >=", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesLessThan(Integer value) {
            addCriterion("all_messages <", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesLessThanOrEqualTo(Integer value) {
            addCriterion("all_messages <=", value, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesIn(List<Integer> values) {
            addCriterion("all_messages in", values, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesNotIn(List<Integer> values) {
            addCriterion("all_messages not in", values, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesBetween(Integer value1, Integer value2) {
            addCriterion("all_messages between", value1, value2, "allMessages");
            return (Criteria) this;
        }

        public Criteria andAllMessagesNotBetween(Integer value1, Integer value2) {
            addCriterion("all_messages not between", value1, value2, "allMessages");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}