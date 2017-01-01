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

package com.tirthal.learning.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsEntryLocalService
 * @generated
 */
@ProviderType
public class NewsEntryLocalServiceWrapper implements NewsEntryLocalService,
	ServiceWrapper<NewsEntryLocalService> {
	public NewsEntryLocalServiceWrapper(
		NewsEntryLocalService newsEntryLocalService) {
		_newsEntryLocalService = newsEntryLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _newsEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsEntryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _newsEntryLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _newsEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the news entry to the database. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was added
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry addNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return _newsEntryLocalService.addNewsEntry(newsEntry);
	}

	/**
	* Creates a new news entry with the primary key. Does not add the news entry to the database.
	*
	* @param newsId the primary key for the new news entry
	* @return the new news entry
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry createNewsEntry(long newsId) {
		return _newsEntryLocalService.createNewsEntry(newsId);
	}

	/**
	* Deletes the news entry from the database. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was removed
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry deleteNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return _newsEntryLocalService.deleteNewsEntry(newsEntry);
	}

	/**
	* Deletes the news entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry that was removed
	* @throws PortalException if a news entry with the primary key could not be found
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry deleteNewsEntry(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsEntryLocalService.deleteNewsEntry(newsId);
	}

	@Override
	public com.tirthal.learning.model.NewsEntry fetchNewsEntry(long newsId) {
		return _newsEntryLocalService.fetchNewsEntry(newsId);
	}

	/**
	* Returns the news entry matching the UUID and group.
	*
	* @param uuid the news entry's UUID
	* @param groupId the primary key of the group
	* @return the matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry fetchNewsEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _newsEntryLocalService.fetchNewsEntryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the news entry with the primary key.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry
	* @throws PortalException if a news entry with the primary key could not be found
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry getNewsEntry(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsEntryLocalService.getNewsEntry(newsId);
	}

	/**
	* Returns the news entry matching the UUID and group.
	*
	* @param uuid the news entry's UUID
	* @param groupId the primary key of the group
	* @return the matching news entry
	* @throws PortalException if a matching news entry could not be found
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry getNewsEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsEntryLocalService.getNewsEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the news entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was updated
	*/
	@Override
	public com.tirthal.learning.model.NewsEntry updateNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return _newsEntryLocalService.updateNewsEntry(newsEntry);
	}

	/**
	* Returns the number of news entries.
	*
	* @return the number of news entries
	*/
	@Override
	public int getNewsEntriesCount() {
		return _newsEntryLocalService.getNewsEntriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _newsEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _newsEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tirthal.learning.model.impl.NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _newsEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tirthal.learning.model.impl.NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _newsEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the news entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tirthal.learning.model.impl.NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @return the range of news entries
	*/
	@Override
	public java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntries(
		int start, int end) {
		return _newsEntryLocalService.getNewsEntries(start, end);
	}

	/**
	* Returns all the news entries matching the UUID and company.
	*
	* @param uuid the UUID of the news entries
	* @param companyId the primary key of the company
	* @return the matching news entries, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _newsEntryLocalService.getNewsEntriesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of news entries matching the UUID and company.
	*
	* @param uuid the UUID of the news entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching news entries, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tirthal.learning.model.NewsEntry> orderByComparator) {
		return _newsEntryLocalService.getNewsEntriesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _newsEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _newsEntryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public NewsEntryLocalService getWrappedService() {
		return _newsEntryLocalService;
	}

	@Override
	public void setWrappedService(NewsEntryLocalService newsEntryLocalService) {
		_newsEntryLocalService = newsEntryLocalService;
	}

	private NewsEntryLocalService _newsEntryLocalService;
}