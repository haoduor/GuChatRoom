package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LastSpeakChannelExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 8882409839320028172L;

    public LastSpeakChannelExample() {
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

        public Criteria andAtRoomIsNull() {
            addCriterion("at_room is null");
            return (Criteria) this;
        }

        public Criteria andAtRoomIsNotNull() {
            addCriterion("at_room is not null");
            return (Criteria) this;
        }

        public Criteria andAtRoomEqualTo(Integer value) {
            addCriterion("at_room =", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomNotEqualTo(Integer value) {
            addCriterion("at_room <>", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomGreaterThan(Integer value) {
            addCriterion("at_room >", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_room >=", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomLessThan(Integer value) {
            addCriterion("at_room <", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomLessThanOrEqualTo(Integer value) {
            addCriterion("at_room <=", value, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomIn(List<Integer> values) {
            addCriterion("at_room in", values, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomNotIn(List<Integer> values) {
            addCriterion("at_room not in", values, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomBetween(Integer value1, Integer value2) {
            addCriterion("at_room between", value1, value2, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("at_room not between", value1, value2, "atRoom");
            return (Criteria) this;
        }

        public Criteria andAtChannelIsNull() {
            addCriterion("at_channel is null");
            return (Criteria) this;
        }

        public Criteria andAtChannelIsNotNull() {
            addCriterion("at_channel is not null");
            return (Criteria) this;
        }

        public Criteria andAtChannelEqualTo(Integer value) {
            addCriterion("at_channel =", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelNotEqualTo(Integer value) {
            addCriterion("at_channel <>", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelGreaterThan(Integer value) {
            addCriterion("at_channel >", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_channel >=", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelLessThan(Integer value) {
            addCriterion("at_channel <", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelLessThanOrEqualTo(Integer value) {
            addCriterion("at_channel <=", value, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelIn(List<Integer> values) {
            addCriterion("at_channel in", values, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelNotIn(List<Integer> values) {
            addCriterion("at_channel not in", values, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelBetween(Integer value1, Integer value2) {
            addCriterion("at_channel between", value1, value2, "atChannel");
            return (Criteria) this;
        }

        public Criteria andAtChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("at_channel not between", value1, value2, "atChannel");
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