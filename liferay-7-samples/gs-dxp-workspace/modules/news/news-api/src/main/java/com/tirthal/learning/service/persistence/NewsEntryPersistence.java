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

package com.tirthal.learning.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tirthal.learning.exception.NoSuchNewsEntryException;
import com.tirthal.learning.model.NewsEntry;

/**
 * The persistence interface for the news entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.tirthal.learning.service.persistence.impl.NewsEntryPersistenceImpl
 * @see NewsEntryUtil
 * @generated
 */
@ProviderType
public interface NewsEntryPersistence extends BasePersistence<NewsEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsEntryUtil} to access the news entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the news entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the news entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @return the range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the news entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns an ordered range of all the news entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first news entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the first news entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the last news entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the last news entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the news entries before and after the current news entry in the ordered set where uuid = &#63;.
	*
	* @param newsId the primary key of the current news entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next news entry
	* @throws NoSuchNewsEntryException if a news entry with the primary key could not be found
	*/
	public NewsEntry[] findByUuid_PrevAndNext(long newsId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Removes all the news entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of news entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching news entries
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the news entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchNewsEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchNewsEntryException;

	/**
	* Returns the news entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the news entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the news entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the news entry that was removed
	*/
	public NewsEntry removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchNewsEntryException;

	/**
	* Returns the number of news entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching news entries
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the news entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the news entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @return the range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the news entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns an ordered range of all the news entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first news entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the first news entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the last news entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the last news entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the news entries before and after the current news entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param newsId the primary key of the current news entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next news entry
	* @throws NoSuchNewsEntryException if a news entry with the primary key could not be found
	*/
	public NewsEntry[] findByUuid_C_PrevAndNext(long newsId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Removes all the news entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of news entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching news entries
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the news entries where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching news entries
	*/
	public java.util.List<NewsEntry> findByCompanyId(long companyId);

	/**
	* Returns a range of all the news entries where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @return the range of matching news entries
	*/
	public java.util.List<NewsEntry> findByCompanyId(long companyId, int start,
		int end);

	/**
	* Returns an ordered range of all the news entries where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns an ordered range of all the news entries where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching news entries
	*/
	public java.util.List<NewsEntry> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first news entry in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the first news entry in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the last news entry in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry
	* @throws NoSuchNewsEntryException if a matching news entry could not be found
	*/
	public NewsEntry findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Returns the last news entry in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching news entry, or <code>null</code> if a matching news entry could not be found
	*/
	public NewsEntry fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns the news entries before and after the current news entry in the ordered set where companyId = &#63;.
	*
	* @param newsId the primary key of the current news entry
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next news entry
	* @throws NoSuchNewsEntryException if a news entry with the primary key could not be found
	*/
	public NewsEntry[] findByCompanyId_PrevAndNext(long newsId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator)
		throws NoSuchNewsEntryException;

	/**
	* Removes all the news entries where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of news entries where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching news entries
	*/
	public int countByCompanyId(long companyId);

	/**
	* Caches the news entry in the entity cache if it is enabled.
	*
	* @param newsEntry the news entry
	*/
	public void cacheResult(NewsEntry newsEntry);

	/**
	* Caches the news entries in the entity cache if it is enabled.
	*
	* @param newsEntries the news entries
	*/
	public void cacheResult(java.util.List<NewsEntry> newsEntries);

	/**
	* Creates a new news entry with the primary key. Does not add the news entry to the database.
	*
	* @param newsId the primary key for the new news entry
	* @return the new news entry
	*/
	public NewsEntry create(long newsId);

	/**
	* Removes the news entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry that was removed
	* @throws NoSuchNewsEntryException if a news entry with the primary key could not be found
	*/
	public NewsEntry remove(long newsId) throws NoSuchNewsEntryException;

	public NewsEntry updateImpl(NewsEntry newsEntry);

	/**
	* Returns the news entry with the primary key or throws a {@link NoSuchNewsEntryException} if it could not be found.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry
	* @throws NoSuchNewsEntryException if a news entry with the primary key could not be found
	*/
	public NewsEntry findByPrimaryKey(long newsId)
		throws NoSuchNewsEntryException;

	/**
	* Returns the news entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param newsId the primary key of the news entry
	* @return the news entry, or <code>null</code> if a news entry with the primary key could not be found
	*/
	public NewsEntry fetchByPrimaryKey(long newsId);

	@Override
	public java.util.Map<java.io.Serializable, NewsEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the news entries.
	*
	* @return the news entries
	*/
	public java.util.List<NewsEntry> findAll();

	/**
	* Returns a range of all the news entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @return the range of news entries
	*/
	public java.util.List<NewsEntry> findAll(int start, int end);

	/**
	* Returns an ordered range of all the news entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of news entries
	*/
	public java.util.List<NewsEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator);

	/**
	* Returns an ordered range of all the news entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news entries
	* @param end the upper bound of the range of news entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of news entries
	*/
	public java.util.List<NewsEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the news entries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of news entries.
	*
	* @return the number of news entries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}