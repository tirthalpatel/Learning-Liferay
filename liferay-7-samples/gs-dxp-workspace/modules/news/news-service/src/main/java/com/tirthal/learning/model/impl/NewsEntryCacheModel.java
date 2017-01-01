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

package com.tirthal.learning.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tirthal.learning.model.NewsEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewsEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see NewsEntry
 * @generated
 */
@ProviderType
public class NewsEntryCacheModel implements CacheModel<NewsEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsEntryCacheModel)) {
			return false;
		}

		NewsEntryCacheModel newsEntryCacheModel = (NewsEntryCacheModel)obj;

		if (newsId == newsEntryCacheModel.newsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", newsId=");
		sb.append(newsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewsEntry toEntityModel() {
		NewsEntryImpl newsEntryImpl = new NewsEntryImpl();

		if (uuid == null) {
			newsEntryImpl.setUuid(StringPool.BLANK);
		}
		else {
			newsEntryImpl.setUuid(uuid);
		}

		newsEntryImpl.setNewsId(newsId);
		newsEntryImpl.setGroupId(groupId);
		newsEntryImpl.setCompanyId(companyId);
		newsEntryImpl.setUserId(userId);

		if (userName == null) {
			newsEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			newsEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			newsEntryImpl.setCreateDate(null);
		}
		else {
			newsEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			newsEntryImpl.setModifiedDate(null);
		}
		else {
			newsEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			newsEntryImpl.setTitle(StringPool.BLANK);
		}
		else {
			newsEntryImpl.setTitle(title);
		}

		if (description == null) {
			newsEntryImpl.setDescription(StringPool.BLANK);
		}
		else {
			newsEntryImpl.setDescription(description);
		}

		newsEntryImpl.resetOriginalValues();

		return newsEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		newsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(newsId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long newsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String description;
}