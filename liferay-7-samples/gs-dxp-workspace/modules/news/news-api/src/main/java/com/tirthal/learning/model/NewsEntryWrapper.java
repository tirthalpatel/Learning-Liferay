/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tirthal.learning.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link NewsEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsEntry
 * @generated
 */
@ProviderType
public class NewsEntryWrapper implements NewsEntry, ModelWrapper<NewsEntry> {
	public NewsEntryWrapper(NewsEntry newsEntry) {
		_newsEntry = newsEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return NewsEntry.class;
	}

	@Override
	public String getModelClassName() {
		return NewsEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("newsId", getNewsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long newsId = (Long)attributes.get("newsId");

		if (newsId != null) {
			setNewsId(newsId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public NewsEntry toEscapedModel() {
		return new NewsEntryWrapper(_newsEntry.toEscapedModel());
	}

	@Override
	public NewsEntry toUnescapedModel() {
		return new NewsEntryWrapper(_newsEntry.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _newsEntry.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _newsEntry.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _newsEntry.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _newsEntry.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<NewsEntry> toCacheModel() {
		return _newsEntry.toCacheModel();
	}

	@Override
	public int compareTo(NewsEntry newsEntry) {
		return _newsEntry.compareTo(newsEntry);
	}

	@Override
	public int hashCode() {
		return _newsEntry.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _newsEntry.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NewsEntryWrapper((NewsEntry)_newsEntry.clone());
	}

	/**
	* Returns the description of this news entry.
	*
	* @return the description of this news entry
	*/
	@Override
	public java.lang.String getDescription() {
		return _newsEntry.getDescription();
	}

	/**
	* Returns the title of this news entry.
	*
	* @return the title of this news entry
	*/
	@Override
	public java.lang.String getTitle() {
		return _newsEntry.getTitle();
	}

	/**
	* Returns the user name of this news entry.
	*
	* @return the user name of this news entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _newsEntry.getUserName();
	}

	/**
	* Returns the user uuid of this news entry.
	*
	* @return the user uuid of this news entry
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _newsEntry.getUserUuid();
	}

	/**
	* Returns the uuid of this news entry.
	*
	* @return the uuid of this news entry
	*/
	@Override
	public java.lang.String getUuid() {
		return _newsEntry.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _newsEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _newsEntry.toXmlString();
	}

	/**
	* Returns the create date of this news entry.
	*
	* @return the create date of this news entry
	*/
	@Override
	public Date getCreateDate() {
		return _newsEntry.getCreateDate();
	}

	/**
	* Returns the modified date of this news entry.
	*
	* @return the modified date of this news entry
	*/
	@Override
	public Date getModifiedDate() {
		return _newsEntry.getModifiedDate();
	}

	/**
	* Returns the company ID of this news entry.
	*
	* @return the company ID of this news entry
	*/
	@Override
	public long getCompanyId() {
		return _newsEntry.getCompanyId();
	}

	/**
	* Returns the group ID of this news entry.
	*
	* @return the group ID of this news entry
	*/
	@Override
	public long getGroupId() {
		return _newsEntry.getGroupId();
	}

	/**
	* Returns the news ID of this news entry.
	*
	* @return the news ID of this news entry
	*/
	@Override
	public long getNewsId() {
		return _newsEntry.getNewsId();
	}

	/**
	* Returns the primary key of this news entry.
	*
	* @return the primary key of this news entry
	*/
	@Override
	public long getPrimaryKey() {
		return _newsEntry.getPrimaryKey();
	}

	/**
	* Returns the user ID of this news entry.
	*
	* @return the user ID of this news entry
	*/
	@Override
	public long getUserId() {
		return _newsEntry.getUserId();
	}

	@Override
	public void persist() {
		_newsEntry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_newsEntry.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this news entry.
	*
	* @param companyId the company ID of this news entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_newsEntry.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this news entry.
	*
	* @param createDate the create date of this news entry
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_newsEntry.setCreateDate(createDate);
	}

	/**
	* Sets the description of this news entry.
	*
	* @param description the description of this news entry
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_newsEntry.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_newsEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_newsEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_newsEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this news entry.
	*
	* @param groupId the group ID of this news entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_newsEntry.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this news entry.
	*
	* @param modifiedDate the modified date of this news entry
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_newsEntry.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_newsEntry.setNew(n);
	}

	/**
	* Sets the news ID of this news entry.
	*
	* @param newsId the news ID of this news entry
	*/
	@Override
	public void setNewsId(long newsId) {
		_newsEntry.setNewsId(newsId);
	}

	/**
	* Sets the primary key of this news entry.
	*
	* @param primaryKey the primary key of this news entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_newsEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_newsEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this news entry.
	*
	* @param title the title of this news entry
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_newsEntry.setTitle(title);
	}

	/**
	* Sets the user ID of this news entry.
	*
	* @param userId the user ID of this news entry
	*/
	@Override
	public void setUserId(long userId) {
		_newsEntry.setUserId(userId);
	}

	/**
	* Sets the user name of this news entry.
	*
	* @param userName the user name of this news entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_newsEntry.setUserName(userName);
	}

	/**
	* Sets the user uuid of this news entry.
	*
	* @param userUuid the user uuid of this news entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_newsEntry.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this news entry.
	*
	* @param uuid the uuid of this news entry
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_newsEntry.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsEntryWrapper)) {
			return false;
		}

		NewsEntryWrapper newsEntryWrapper = (NewsEntryWrapper)obj;

		if (Objects.equals(_newsEntry, newsEntryWrapper._newsEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _newsEntry.getStagedModelType();
	}

	@Override
	public NewsEntry getWrappedModel() {
		return _newsEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _newsEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _newsEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_newsEntry.resetOriginalValues();
	}

	private final NewsEntry _newsEntry;
}