alter table PROJECT_CURRENCY add constraint FK_PROJECT_CURRENCY_ON_CURRENCY_EXCHANGE foreign key (CURRENCY_EXCHANGE_ID) references PROJECT_CURRENCY_EXCHANGE(ID);
create unique index IDX_PROJECT_CURRENCY_UNIQ_SHORTNAME on PROJECT_CURRENCY (SHORTNAME);
create unique index IDX_PROJECT_CURRENCY_UNIQ_NAME on PROJECT_CURRENCY (NAME);
create unique index IDX_PROJECT_CURRENCY_UNIQ_CODE on PROJECT_CURRENCY (CODE);
create index IDX_PROJECT_CURRENCY_ON_CURRENCY_EXCHANGE on PROJECT_CURRENCY (CURRENCY_EXCHANGE_ID);
