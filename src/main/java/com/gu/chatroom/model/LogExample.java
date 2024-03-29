package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = -5447322106051141283L;

    public LogExample() {
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

        public Criteria andControlIpIsNull() {
            addCriterion("control_ip is null");
            return (Criteria) this;
        }

        public Criteria andControlIpIsNotNull() {
            addCriterion("control_ip is not null");
            return (Criteria) this;
        }

        public Criteria andControlIpEqualTo(String value) {
            addCriterion("control_ip =", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpNotEqualTo(String value) {
            addCriterion("control_ip <>", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpGreaterThan(String value) {
            addCriterion("control_ip >", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpGreaterThanOrEqualTo(String value) {
            addCriterion("control_ip >=", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpLessThan(String value) {
            addCriterion("control_ip <", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpLessThanOrEqualTo(String value) {
            addCriterion("control_ip <=", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpLike(String value) {
            addCriterion("control_ip like", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpNotLike(String value) {
            addCriterion("control_ip not like", value, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpIn(List<String> values) {
            addCriterion("control_ip in", values, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpNotIn(List<String> values) {
            addCriterion("control_ip not in", values, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpBetween(String value1, String value2) {
            addCriterion("control_ip between", value1, value2, "controlIp");
            return (Criteria) this;
        }

        public Criteria andControlIpNotBetween(String value1, String value2) {
            addCriterion("control_ip not between", value1, value2, "controlIp");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdIsNull() {
            addCriterion("premission_id is null");
            return (Criteria) this;
        }

        public Criteria andPremissionIdIsNotNull() {
            addCriterion("premission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPremissionIdEqualTo(Integer value) {
            addCriterion("premission_id =", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdNotEqualTo(Integer value) {
            addCriterion("premission_id <>", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdGreaterThan(Integer value) {
            addCriterion("premission_id >", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("premission_id >=", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdLessThan(Integer value) {
            addCriterion("premission_id <", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("premission_id <=", value, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdIn(List<Integer> values) {
            addCriterion("premission_id in", values, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdNotIn(List<Integer> values) {
            addCriterion("premission_id not in", values, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdBetween(Integer value1, Integer value2) {
            addCriterion("premission_id between", value1, value2, "premissionId");
            return (Criteria) this;
        }

        public Criteria andPremissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("premission_id not between", value1, value2, "premissionId");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionIsNull() {
            addCriterion("control_description is null");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionIsNotNull() {
            addCriterion("control_description is not null");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionEqualTo(String value) {
            addCriterion("control_description =", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionNotEqualTo(String value) {
            addCriterion("control_description <>", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionGreaterThan(String value) {
            addCriterion("control_description >", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("control_description >=", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionLessThan(String value) {
            addCriterion("control_description <", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionLessThanOrEqualTo(String value) {
            addCriterion("control_description <=", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionLike(String value) {
            addCriterion("control_description like", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionNotLike(String value) {
            addCriterion("control_description not like", value, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionIn(List<String> values) {
            addCriterion("control_description in", values, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionNotIn(List<String> values) {
            addCriterion("control_description not in", values, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionBetween(String value1, String value2) {
            addCriterion("control_description between", value1, value2, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlDescriptionNotBetween(String value1, String value2) {
            addCriterion("control_description not between", value1, value2, "controlDescription");
            return (Criteria) this;
        }

        public Criteria andControlTimeIsNull() {
            addCriterion("control_time is null");
            return (Criteria) this;
        }

        public Criteria andControlTimeIsNotNull() {
            addCriterion("control_time is not null");
            return (Criteria) this;
        }

        public Criteria andControlTimeEqualTo(Date value) {
            addCriterion("control_time =", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeNotEqualTo(Date value) {
            addCriterion("control_time <>", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeGreaterThan(Date value) {
            addCriterion("control_time >", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("control_time >=", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeLessThan(Date value) {
            addCriterion("control_time <", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeLessThanOrEqualTo(Date value) {
            addCriterion("control_time <=", value, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeIn(List<Date> values) {
            addCriterion("control_time in", values, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeNotIn(List<Date> values) {
            addCriterion("control_time not in", values, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeBetween(Date value1, Date value2) {
            addCriterion("control_time between", value1, value2, "controlTime");
            return (Criteria) this;
        }

        public Criteria andControlTimeNotBetween(Date value1, Date value2) {
            addCriterion("control_time not between", value1, value2, "controlTime");
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