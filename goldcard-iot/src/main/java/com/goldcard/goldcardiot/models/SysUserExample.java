package com.goldcard.goldcardiot.models;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public SysUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
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

		public Criteria andNoIsNull() {
			addCriterion("no is null");
			return (Criteria) this;
		}

		public Criteria andNoIsNotNull() {
			addCriterion("no is not null");
			return (Criteria) this;
		}

		public Criteria andNoEqualTo(String value) {
			addCriterion("no =", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotEqualTo(String value) {
			addCriterion("no <>", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoGreaterThan(String value) {
			addCriterion("no >", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoGreaterThanOrEqualTo(String value) {
			addCriterion("no >=", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoLessThan(String value) {
			addCriterion("no <", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoLessThanOrEqualTo(String value) {
			addCriterion("no <=", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoLike(String value) {
			addCriterion("no like", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotLike(String value) {
			addCriterion("no not like", value, "no");
			return (Criteria) this;
		}

		public Criteria andNoIn(List<String> values) {
			addCriterion("no in", values, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotIn(List<String> values) {
			addCriterion("no not in", values, "no");
			return (Criteria) this;
		}

		public Criteria andNoBetween(String value1, String value2) {
			addCriterion("no between", value1, value2, "no");
			return (Criteria) this;
		}

		public Criteria andNoNotBetween(String value1, String value2) {
			addCriterion("no not between", value1, value2, "no");
			return (Criteria) this;
		}

		public Criteria andDeptidIsNull() {
			addCriterion("deptid is null");
			return (Criteria) this;
		}

		public Criteria andDeptidIsNotNull() {
			addCriterion("deptid is not null");
			return (Criteria) this;
		}

		public Criteria andDeptidEqualTo(Integer value) {
			addCriterion("deptid =", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotEqualTo(Integer value) {
			addCriterion("deptid <>", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidGreaterThan(Integer value) {
			addCriterion("deptid >", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
			addCriterion("deptid >=", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidLessThan(Integer value) {
			addCriterion("deptid <", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidLessThanOrEqualTo(Integer value) {
			addCriterion("deptid <=", value, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidIn(List<Integer> values) {
			addCriterion("deptid in", values, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotIn(List<Integer> values) {
			addCriterion("deptid not in", values, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidBetween(Integer value1, Integer value2) {
			addCriterion("deptid between", value1, value2, "deptid");
			return (Criteria) this;
		}

		public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
			addCriterion("deptid not between", value1, value2, "deptid");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNull() {
			addCriterion("loginname is null");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNotNull() {
			addCriterion("loginname is not null");
			return (Criteria) this;
		}

		public Criteria andLoginnameEqualTo(String value) {
			addCriterion("loginname =", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotEqualTo(String value) {
			addCriterion("loginname <>", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThan(String value) {
			addCriterion("loginname >", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
			addCriterion("loginname >=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThan(String value) {
			addCriterion("loginname <", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThanOrEqualTo(String value) {
			addCriterion("loginname <=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLike(String value) {
			addCriterion("loginname like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotLike(String value) {
			addCriterion("loginname not like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameIn(List<String> values) {
			addCriterion("loginname in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotIn(List<String> values) {
			addCriterion("loginname not in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameBetween(String value1, String value2) {
			addCriterion("loginname between", value1, value2, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotBetween(String value1, String value2) {
			addCriterion("loginname not between", value1, value2, "loginname");
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

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andTypeofworkIsNull() {
			addCriterion("typeofwork is null");
			return (Criteria) this;
		}

		public Criteria andTypeofworkIsNotNull() {
			addCriterion("typeofwork is not null");
			return (Criteria) this;
		}

		public Criteria andTypeofworkEqualTo(String value) {
			addCriterion("typeofwork =", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkNotEqualTo(String value) {
			addCriterion("typeofwork <>", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkGreaterThan(String value) {
			addCriterion("typeofwork >", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkGreaterThanOrEqualTo(String value) {
			addCriterion("typeofwork >=", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkLessThan(String value) {
			addCriterion("typeofwork <", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkLessThanOrEqualTo(String value) {
			addCriterion("typeofwork <=", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkLike(String value) {
			addCriterion("typeofwork like", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkNotLike(String value) {
			addCriterion("typeofwork not like", value, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkIn(List<String> values) {
			addCriterion("typeofwork in", values, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkNotIn(List<String> values) {
			addCriterion("typeofwork not in", values, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkBetween(String value1, String value2) {
			addCriterion("typeofwork between", value1, value2, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofworkNotBetween(String value1, String value2) {
			addCriterion("typeofwork not between", value1, value2, "typeofwork");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonIsNull() {
			addCriterion("typeofperson is null");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonIsNotNull() {
			addCriterion("typeofperson is not null");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonEqualTo(Integer value) {
			addCriterion("typeofperson =", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonNotEqualTo(Integer value) {
			addCriterion("typeofperson <>", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonGreaterThan(Integer value) {
			addCriterion("typeofperson >", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonGreaterThanOrEqualTo(Integer value) {
			addCriterion("typeofperson >=", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonLessThan(Integer value) {
			addCriterion("typeofperson <", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonLessThanOrEqualTo(Integer value) {
			addCriterion("typeofperson <=", value, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonIn(List<Integer> values) {
			addCriterion("typeofperson in", values, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonNotIn(List<Integer> values) {
			addCriterion("typeofperson not in", values, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonBetween(Integer value1, Integer value2) {
			addCriterion("typeofperson between", value1, value2, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andTypeofpersonNotBetween(Integer value1, Integer value2) {
			addCriterion("typeofperson not between", value1, value2, "typeofperson");
			return (Criteria) this;
		}

		public Criteria andIslockIsNull() {
			addCriterion("islock is null");
			return (Criteria) this;
		}

		public Criteria andIslockIsNotNull() {
			addCriterion("islock is not null");
			return (Criteria) this;
		}

		public Criteria andIslockEqualTo(String value) {
			addCriterion("islock =", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotEqualTo(String value) {
			addCriterion("islock <>", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockGreaterThan(String value) {
			addCriterion("islock >", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockGreaterThanOrEqualTo(String value) {
			addCriterion("islock >=", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockLessThan(String value) {
			addCriterion("islock <", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockLessThanOrEqualTo(String value) {
			addCriterion("islock <=", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockLike(String value) {
			addCriterion("islock like", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotLike(String value) {
			addCriterion("islock not like", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockIn(List<String> values) {
			addCriterion("islock in", values, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotIn(List<String> values) {
			addCriterion("islock not in", values, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockBetween(String value1, String value2) {
			addCriterion("islock between", value1, value2, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotBetween(String value1, String value2) {
			addCriterion("islock not between", value1, value2, "islock");
			return (Criteria) this;
		}

		public Criteria andIsdelIsNull() {
			addCriterion("isdel is null");
			return (Criteria) this;
		}

		public Criteria andIsdelIsNotNull() {
			addCriterion("isdel is not null");
			return (Criteria) this;
		}

		public Criteria andIsdelEqualTo(String value) {
			addCriterion("isdel =", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotEqualTo(String value) {
			addCriterion("isdel <>", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelGreaterThan(String value) {
			addCriterion("isdel >", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelGreaterThanOrEqualTo(String value) {
			addCriterion("isdel >=", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelLessThan(String value) {
			addCriterion("isdel <", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelLessThanOrEqualTo(String value) {
			addCriterion("isdel <=", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelLike(String value) {
			addCriterion("isdel like", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotLike(String value) {
			addCriterion("isdel not like", value, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelIn(List<String> values) {
			addCriterion("isdel in", values, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotIn(List<String> values) {
			addCriterion("isdel not in", values, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelBetween(String value1, String value2) {
			addCriterion("isdel between", value1, value2, "isdel");
			return (Criteria) this;
		}

		public Criteria andIsdelNotBetween(String value1, String value2) {
			addCriterion("isdel not between", value1, value2, "isdel");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public static class Criterion {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user
     *
     * @mbggenerated do_not_delete_during_merge Sat Feb 04 16:01:24 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}