create index IX_E65DF6BF on SB_NEWS_NewsEntry (companyId);
create index IX_E473C77D on SB_NEWS_NewsEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6A52093F on SB_NEWS_NewsEntry (uuid_[$COLUMN_LENGTH:75$], groupId);