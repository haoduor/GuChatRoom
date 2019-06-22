package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PremissionExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 4177758169578305167L;

    public PremissionExample() {
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

        public Criteria andPremissionNameIsNull() {
            addCriterion("premission_name is null");
            return (Criteria) this;
        }

        public Criteria andPremissionNameIsNotNull() {
            addCriterion("premission_name is not null");
            return (Criteria) this;
        }

        public Criteria andPremissionNameEqualTo(String value) {
            addCriterion("premission_name =", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameNotEqualTo(String value) {
            addCriterion("premission_name <>", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameGreaterThan(String value) {
            addCriterion("premission_name >", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("premission_name >=", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameLessThan(String value) {
            addCriterion("premission_name <", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameLessThanOrEqualTo(String value) {
            addCriterion("premission_name <=", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameLike(String value) {
            addCriterion("premission_name like", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameNotLike(String value) {
            addCriterion("premission_name not like", value, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameIn(List<String> values) {
            addCriterion("premission_name in", values, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameNotIn(List<String> values) {
            addCriterion("premission_name not in", values, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameBetween(String value1, String value2) {
            addCriterion("premission_name between", value1, value2, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionNameNotBetween(String value1, String value2) {
            addCriterion("premission_name not between", value1, value2, "premissionName");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionIsNull() {
            addCriterion("premission_description is null");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionIsNotNull() {
            addCriterion("premission_description is not null");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionEqualTo(String value) {
            addCriterion("premission_description =", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionNotEqualTo(String value) {
            addCriterion("premission_description <>", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionGreaterThan(String value) {
            addCriterion("premission_description >", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("premission_description >=", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionLessThan(String value) {
            addCriterion("premission_description <", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("premission_description <=", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionLike(String value) {
            addCriterion("premission_description like", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionNotLike(String value) {
            addCriterion("premission_description not like", value, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionIn(List<String> values) {
            addCriterion("premission_description in", values, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionNotIn(List<String> values) {
            addCriterion("premission_description not in", values, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionBetween(String value1, String value2) {
            addCriterion("premission_description between", value1, value2, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andPremissionDescriptionNotBetween(String value1, String value2) {
            addCriterion("premission_description not between", value1, value2, "premissionDescription");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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