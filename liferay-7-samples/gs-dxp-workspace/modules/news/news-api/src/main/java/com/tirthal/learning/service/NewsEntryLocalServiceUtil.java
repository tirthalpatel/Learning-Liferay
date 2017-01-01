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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for NewsEntry. This utility wraps
 * {@link com.tirthal.learning.service.impl.NewsEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NewsEntryLocalService
 * @see com.tirthal.learning.service.base.NewsEntryLocalServiceBaseImpl
 * @see com.tirthal.learning.service.impl.NewsEntryLocalServiceImpl
 * @generated
 */
@ProviderType
public class NewsEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.tirthal.learning.service.impl.NewsEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the news entry to the database. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was added
	*/
	public static com.tirthal.learning.model.NewsEntry addNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return getService().addNewsEntry(newsEntry);
	}

	/**
	* Creates a new news entry with the primary key. Does not add the news entry to the database.
	*
	* @param newsId the primary key for the new news entry
	* @return the new news entry
	*/
	public static com.tirthal.learning.model.NewsEntry createNewsEntry(
		long newsId) {
		return getService().createNewsEntry(newsId);
	}

	/**
	* Deletes the news entry from the database. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was removed
	*/
	public static com.tirthal.learning.model.NewsEntry deleteNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return getService().deleteNewsEntry(newsEntry);
	}

	/**
	* Deletes the news entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry that was removed
	* @throws PortalException if a news entry with the primary key could not be found
	*/
	public static com.tirthal.learning.model.NewsEntry deleteNewsEntry(
		long newsId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteNewsEntry(newsId);
	}

	public static com.tirthal.learning.model.NewsEntry fetchNewsEntry(
		long newsId) {
		return getService().fetchNewsEntry(newsId);
	}

	/**
	* Returns the news entry matching the UUID and group.
	*
	* @param uuid the news entry's UUID
	* @param groupId the primary key of the group
	* @return the matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public static com.tirthal.learning.model.NewsEntry fetchNewsEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchNewsEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the news entry with the primary key.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry
	* @throws PortalException if a news entry with the primary key could not be found
	*/
	public static com.tirthal.learning.model.NewsEntry getNewsEntry(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNewsEntry(newsId);
	}

	/**
	* Returns the news entry matching the UUID and group.
	*
	* @param uuid the news entry's UUID
	* @param groupId the primary key of the group
	* @return the matching news entry
	* @throws PortalException if a matching news entry could not be found
	*/
	public static com.tirthal.learning.model.NewsEntry getNewsEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNewsEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the news entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param newsEntry the news entry
	* @return the news entry that was updated
	*/
	public static com.tirthal.learning.model.NewsEntry updateNewsEntry(
		com.tirthal.learning.model.NewsEntry newsEntry) {
		return getService().updateNewsEntry(newsEntry);
	}

	/**
	* Returns the number of news entries.
	*
	* @return the number of news entries
	*/
	public static int getNewsEntriesCount() {
		return getService().getNewsEntriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntries(
		int start, int end) {
		return getService().getNewsEntries(start, end);
	}

	/**
	* Returns all the news entries matching the UUID and company.
	*
	* @param uuid the UUID of the news entries
	* @param companyId the primary key of the company
	* @return the matching news entries, or an empty list if no matches were found
	*/
	public static java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getNewsEntriesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.tirthal.learning.model.NewsEntry> getNewsEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tirthal.learning.model.NewsEntry> orderByComparator) {
		return getService()
				   .getNewsEntriesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static NewsEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NewsEntryLocalService, NewsEntryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(NewsEntryLocalService.class);
}