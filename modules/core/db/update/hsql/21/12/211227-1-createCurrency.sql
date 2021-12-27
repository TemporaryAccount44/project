create table PROJECT_CURRENCY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHORTNAME varchar(255),
    CODE integer not null,
    CURRENCY_EXCHANGE_ID varchar(36),
    --
    primary key (ID)
);