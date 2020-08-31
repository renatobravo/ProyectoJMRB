-- USER SQL
CREATE USER proyecto IDENTIFIED BY "admin"  
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP";

-- QUOTAS

-- ROLES
GRANT "CONNECT" TO proyecto ;
GRANT "RESOURCE" TO proyecto ;

-- SYSTEM PRIVILEGES

