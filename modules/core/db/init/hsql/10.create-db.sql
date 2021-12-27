-- begin PROJECT_COUNTERAGENTS
create table PROJECT_COUNTERAGENTS (
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
    JURADDRESS varchar(255),
    REQUISITES integer,
    --
    primary key (ID)
)^
-- end PROJECT_COUNTERAGENTS
-- begin PROJECT_SIMPLE_SPRAVOCHNIK
create table PROJECT_SIMPLE_SPRAVOCHNIK (
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
    CODE integer,
    --
    primary key (ID)
)^
-- end PROJECT_SIMPLE_SPRAVOCHNIK
-- begin PROJECT_BANKS
create table PROJECT_BANKS (
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
    JURADDRESS varchar(255),
    REQUISITES integer,
    --
    primary key (ID)
)^
-- end PROJECT_BANKS
-- begin PROJECT_CURRENCY_EXCHANGE
create table PROJECT_CURRENCY_EXCHANGE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_CURRENCY_ID varchar(36),
    COST_OF_FIRST_CURRENCY integer not null,
    SECOND_CURRENCY_ID varchar(36) not null,
    COST_OF_SECOND_CURRENCY integer not null,
    --
    primary key (ID)
)^
-- end PROJECT_CURRENCY_EXCHANGE
-- begin PROJECT_CURRENCY
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
)^
-- end PROJECT_CURRENCY
