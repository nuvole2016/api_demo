

Drop table TRADE;
CREATE TABLE IF NOT EXISTS TRADE (
    tradeTableId bigint auto_increment,
    tradeId VARCHAR,
    tradeVersion bigint,
    tradeDate DATE,
    accountId bigint
);
Drop table ACCOUNT;
CREATE TABLE IF NOT EXISTS ACCOUNT (
  accountId bigint auto_increment,
  userId VARCHAR,
  title VARCHAR
);
