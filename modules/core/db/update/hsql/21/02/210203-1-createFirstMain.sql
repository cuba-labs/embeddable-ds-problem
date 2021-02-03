create table EDP_FIRST_MAIN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMBEDDED_ENTITY_FIRST_ATTR varchar(255),
    EMBEDDED_ENTITY_SECOND_ATTR varchar(255),
    --
    primary key (ID)
);