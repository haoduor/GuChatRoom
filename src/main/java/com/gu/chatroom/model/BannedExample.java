package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannedExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 3983734739447421829L;

    public BannedExample() {
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

        public Criteria andBannedUserIdIsNull() {
            addCriterion("banned_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdIsNotNull() {
            addCriterion("banned_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdEqualTo(Integer value) {
            addCriterion("banned_user_id =", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdNotEqualTo(Integer value) {
            addCriterion("banned_user_id <>", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdGreaterThan(Integer value) {
            addCriterion("banned_user_id >", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_user_id >=", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdLessThan(Integer value) {
            addCriterion("banned_user_id <", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("banned_user_id <=", value, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdIn(List<Integer> values) {
            addCriterion("banned_user_id in", values, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdNotIn(List<Integer> values) {
            addCriterion("banned_user_id not in", values, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdBetween(Integer value1, Integer value2) {
            addCriterion("banned_user_id between", value1, value2, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_user_id not between", value1, value2, "bannedUserId");
            return (Criteria) this;
        }

        public Criteria andBannedLevelIsNull() {
            addCriterion("banned_level is null");
            return (Criteria) this;
        }

        public Criteria andBannedLevelIsNotNull() {
            addCriterion("banned_level is not null");
            return (Criteria) this;
        }

        public Criteria andBannedLevelEqualTo(Integer value) {
            addCriterion("banned_level =", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelNotEqualTo(Integer value) {
            addCriterion("banned_level <>", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelGreaterThan(Integer value) {
            addCriterion("banned_level >", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_level >=", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelLessThan(Integer value) {
            addCriterion("banned_level <", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelLessThanOrEqualTo(Integer value) {
            addCriterion("banned_level <=", value, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelIn(List<Integer> values) {
            addCriterion("banned_level in", values, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelNotIn(List<Integer> values) {
            addCriterion("banned_level not in", values, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelBetween(Integer value1, Integer value2) {
            addCriterion("banned_level between", value1, value2, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_level not between", value1, value2, "bannedLevel");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdIsNull() {
            addCriterion("banned_room_id is null");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdIsNotNull() {
            addCriterion("banned_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdEqualTo(Integer value) {
            addCriterion("banned_room_id =", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdNotEqualTo(Integer value) {
            addCriterion("banned_room_id <>", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdGreaterThan(Integer value) {
            addCriterion("banned_room_id >", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_room_id >=", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdLessThan(Integer value) {
            addCriterion("banned_room_id <", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("banned_room_id <=", value, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdIn(List<Integer> values) {
            addCriterion("banned_room_id in", values, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdNotIn(List<Integer> values) {
            addCriterion("banned_room_id not in", values, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("banned_room_id between", value1, value2, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_room_id not between", value1, value2, "bannedRoomId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdIsNull() {
            addCriterion("banned_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdIsNotNull() {
            addCriterion("banned_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdEqualTo(Integer value) {
            addCriterion("banned_channel_id =", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdNotEqualTo(Integer value) {
            addCriterion("banned_channel_id <>", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdGreaterThan(Integer value) {
            addCriterion("banned_channel_id >", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("banned_channel_id >=", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdLessThan(Integer value) {
            addCriterion("banned_channel_id <", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("banned_channel_id <=", value, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdIn(List<Integer> values) {
            addCriterion("banned_channel_id in", values, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdNotIn(List<Integer> values) {
            addCriterion("banned_channel_id not in", values, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("banned_channel_id between", value1, value2, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("banned_channel_id not between", value1, value2, "bannedChannelId");
            return (Criteria) this;
        }

        public Criteria andBannedTimeIsNull() {
            addCriterion("banned_time is null");
            return (Criteria) this;
        }

        public Criteria andBannedTimeIsNotNull() {
            addCriterion("banned_time is not null");
            return (Criteria) this;
        }

        public Criteria andBannedTimeEqualTo(Date value) {
            addCriterion("banned_time =", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeNotEqualTo(Date value) {
            addCriterion("banned_time <>", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeGreaterThan(Date value) {
            addCriterion("banned_time >", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("banned_time >=", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeLessThan(Date value) {
            addCriterion("banned_time <", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeLessThanOrEqualTo(Date value) {
            addCriterion("banned_time <=", value, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeIn(List<Date> values) {
            addCriterion("banned_time in", values, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeNotIn(List<Date> values) {
            addCriterion("banned_time not in", values, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeBetween(Date value1, Date value2) {
            addCriterion("banned_time between", value1, value2, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedTimeNotBetween(Date value1, Date value2) {
            addCriterion("banned_time not between", value1, value2, "bannedTime");
            return (Criteria) this;
        }

        public Criteria andBannedReasonIsNull() {
            addCriterion("banned_reason is null");
            return (Criteria) this;
        }

        public Criteria andBannedReasonIsNotNull() {
            addCriterion("banned_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBannedReasonEqualTo(String value) {
            addCriterion("banned_reason =", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonNotEqualTo(String value) {
            addCriterion("banned_reason <>", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonGreaterThan(String value) {
            addCriterion("banned_reason >", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("banned_reason >=", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonLessThan(String value) {
            addCriterion("banned_reason <", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonLessThanOrEqualTo(String value) {
            addCriterion("banned_reason <=", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonLike(String value) {
            addCriterion("banned_reason like", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonNotLike(String value) {
            addCriterion("banned_reason not like", value, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonIn(List<String> values) {
            addCriterion("banned_reason in", values, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonNotIn(List<String> values) {
            addCriterion("banned_reason not in", values, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonBetween(String value1, String value2) {
            addCriterion("banned_reason between", value1, value2, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andBannedReasonNotBetween(String value1, String value2) {
            addCriterion("banned_reason not between", value1, value2, "bannedReason");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedIsNull() {
            addCriterion("is_forever_banned is null");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedIsNotNull() {
            addCriterion("is_forever_banned is not null");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedEqualTo(Boolean value) {
            addCriterion("is_forever_banned =", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedNotEqualTo(Boolean value) {
            addCriterion("is_forever_banned <>", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedGreaterThan(Boolean value) {
            addCriterion("is_forever_banned >", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_forever_banned >=", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedLessThan(Boolean value) {
            addCriterion("is_forever_banned <", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_forever_banned <=", value, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedIn(List<Boolean> values) {
            addCriterion("is_forever_banned in", values, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedNotIn(List<Boolean> values) {
            addCriterion("is_forever_banned not in", values, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_forever_banned between", value1, value2, "isForeverBanned");
            return (Criteria) this;
        }

        public Criteria andIsForeverBannedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_forever_banned not between", value1, value2, "isForeverBanned");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeIsNull() {
            addCriterion("banned_to_time is null");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeIsNotNull() {
            addCriterion("banned_to_time is not null");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeEqualTo(Date value) {
            addCriterion("banned_to_time =", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeNotEqualTo(Date value) {
            addCriterion("banned_to_time <>", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeGreaterThan(Date value) {
            addCriterion("banned_to_time >", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("banned_to_time >=", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeLessThan(Date value) {
            addCriterion("banned_to_time <", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeLessThanOrEqualTo(Date value) {
            addCriterion("banned_to_time <=", value, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeIn(List<Date> values) {
            addCriterion("banned_to_time in", values, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeNotIn(List<Date> values) {
            addCriterion("banned_to_time not in", values, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeBetween(Date value1, Date value2) {
            addCriterion("banned_to_time between", value1, value2, "bannedToTime");
            return (Criteria) this;
        }

        public Criteria andBannedToTimeNotBetween(Date value1, Date value2) {
            addCriterion("banned_to_time not between", value1, value2, "bannedToTime");
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